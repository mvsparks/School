using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace lab4
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void buttonSubmit_Click(object sender, EventArgs e)
        {
            char[] keyArray = {'B', 'D', 'A', 'A',
                                   'C', 'A', 'B', 'A',
                                   'C', 'D', 'B', 'C',
                                   'D', 'A', 'D', 'C',
                                   'C', 'B', 'D', 'A'};
            char[] answersArray = new char[20];

            int correctAnswers = 0, i = 0;
            String incorrectAnswers = null;
            String result;
            Boolean isTrue = false;
            String pattern = @"[A-D]";
            
            foreach (Control c in this.groupBox1.Controls){
                if (c is TextBox){
                    if (Regex.IsMatch(c.Text.ToUpper(), pattern)){
                        answersArray[i] = char.Parse(c.Text.ToUpper());
                        i++;
                        isTrue = true;
                    }
                    else {
                        MessageBox.Show("Please enter valid answer. (A,B,C, or D)");
                        isTrue = false;
                        break;
                    }
                }
            }
            if (isTrue == true) {
                for (i = 0; i < 20; i++)
                {
                    if (keyArray[i].Equals(answersArray[i]))
                    {
                        correctAnswers++;
                    }
                    else
                    {
                        incorrectAnswers = incorrectAnswers + " " + (i+1);
                    }
                }

                if (correctAnswers >= 15)
                {
                    result = "Passed";
                }
                else
                {
                    result = "Failed";
                }
                MessageBox.Show("Results:\n\n" + result + "\n" + correctAnswers + "/20\n" + "Incorrect answers: " + incorrectAnswers);

            }
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void buttonReset_Click(object sender, EventArgs e){
            foreach (Control c in this.groupBox1.Controls){
                if (c is TextBox){
                    c.Text = "";
                }
            }
        }
    }
}
