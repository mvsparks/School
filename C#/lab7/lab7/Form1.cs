using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace lab7
{
    public partial class Form1 : Form
    {
        private double total;

        public Form1()
        {
            total = 0;
            InitializeComponent();
            label1.Text = "0";
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void listView1_SelectedIndexChanged(object sender, EventArgs e)
        {
       
        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void buttonA1_Click(object sender, EventArgs e)
        {
            if(buttonA1.BackColor == Color.LightGreen || buttonA1.BackColor == Color.Red)
            {
                MessageBox.Show("Please choose another seat.");
            }
            else { 
                buttonA1.BackColor = Color.LightGreen;
                textBoxSeatNumber.Text = textBoxSeatNumber.Text + buttonA1.Text + ' ';
                total = int.Parse(label1.Text);
                total = total + 250;
                label1.Text = total.ToString();
            }
        }

        private void buttonB1_Click(object sender, EventArgs e)
        {
            if (buttonB1.BackColor == Color.LightGreen || buttonB1.BackColor == Color.Red)
            {
                MessageBox.Show("Please choose another seat.");
            }
            else
            {
                buttonB1.BackColor = Color.LightGreen;
                textBoxSeatNumber.Text = textBoxSeatNumber.Text + buttonB1.Text + ' ';
                total = int.Parse(label1.Text);
                total = total + 250;
                label1.Text = total.ToString();
            }
        }

        private void buttonC1_Click(object sender, EventArgs e)
        {
            if (buttonC1.BackColor == Color.LightGreen || buttonC1.BackColor == Color.Red)
            {
                MessageBox.Show("Please choose another seat.");
            }
            else
            {
                double total;
                buttonC1.BackColor = Color.LightGreen;
                textBoxSeatNumber.Text = textBoxSeatNumber.Text + buttonC1.Text + ' ';
                total = int.Parse(label1.Text);
                total = total + 250;
                label1.Text = total.ToString();
            }
        }

        private void buttonD1_Click(object sender, EventArgs e)
        {
            if (buttonD1.BackColor == Color.LightGreen || buttonD1.BackColor == Color.Red)
            {
                MessageBox.Show("Please choose another seat.");
            }
            else
            {
                buttonD1.BackColor = Color.LightGreen;
                textBoxSeatNumber.Text = textBoxSeatNumber.Text + buttonD1.Text + ' ';
                total = int.Parse(label1.Text);
                total = total + 250;
                label1.Text = total.ToString();
            }
        }

        private void buttonA2_Click(object sender, EventArgs e)
        {
            if (buttonA2.BackColor == Color.LightGreen || buttonA2.BackColor == Color.Red)
            {
                MessageBox.Show("Please choose another seat.");
            }
            else
            {
                buttonA2.BackColor = Color.LightGreen;
                textBoxSeatNumber.Text = textBoxSeatNumber.Text + buttonA2.Text + ' ';
                total = int.Parse(label1.Text);
                total = total + 250;
                label1.Text = total.ToString();
            }
        }

        private void buttonB2_Click(object sender, EventArgs e)
        {
            if (buttonB2.BackColor == Color.LightGreen || buttonB2.BackColor == Color.Red)
            {
                MessageBox.Show("Please choose another seat.");
            }
            else
            {
                buttonB2.BackColor = Color.LightGreen;
                textBoxSeatNumber.Text = textBoxSeatNumber.Text + buttonB2.Text + ' ';
                total = int.Parse(label1.Text);
                total = total + 250;
                label1.Text = total.ToString();
            }
        }

        private void buttonC2_Click(object sender, EventArgs e)
        {
            if (buttonC2.BackColor == Color.LightGreen || buttonC2.BackColor == Color.Red)
            {
                MessageBox.Show("Please choose another seat.");
            }
            else
            {
                buttonC2.BackColor = Color.LightGreen;
                textBoxSeatNumber.Text = textBoxSeatNumber.Text + buttonC2.Text + ' ';
                total = int.Parse(label1.Text);
                total = total + 250;
                label1.Text = total.ToString();
            }
        }

        private void buttonD2_Click(object sender, EventArgs e)
        {
            if (buttonD2.BackColor == Color.LightGreen || buttonD2.BackColor == Color.Red)
            {
                MessageBox.Show("Please choose another seat.");
            }
            else
            {
                buttonD2.BackColor = Color.LightGreen;
                textBoxSeatNumber.Text = textBoxSeatNumber.Text + buttonD2.Text + ' ';
                total = int.Parse(label1.Text);
                total = total + 250;
                label1.Text = total.ToString();
            }
        }

        private void buttonA3_Click(object sender, EventArgs e)
        {
            if (buttonA3.BackColor == Color.LightGreen || buttonA3.BackColor == Color.Red)
            {
                MessageBox.Show("Please choose another seat.");
            }
            else
            {
                buttonA3.BackColor = Color.LightGreen;
                textBoxSeatNumber.Text = textBoxSeatNumber.Text + buttonA3.Text + ' ';
                total = int.Parse(label1.Text);
                total = total + 250;
                label1.Text = total.ToString();
            }
        }

        private void buttonB3_Click(object sender, EventArgs e)
        {
            if (buttonB3.BackColor == Color.LightGreen || buttonB3.BackColor == Color.Red)
            {
                MessageBox.Show("Please choose another seat.");
            }
            else
            {
                buttonB3.BackColor = Color.LightGreen;
                textBoxSeatNumber.Text = textBoxSeatNumber.Text + buttonB3.Text + ' ';
                total = int.Parse(label1.Text);
                total = total + 250;
                label1.Text = total.ToString();
            }
        }

        private void buttonC3_Click(object sender, EventArgs e)
        {
            if (buttonC3.BackColor == Color.LightGreen || buttonC3.BackColor == Color.Red)
            {
                MessageBox.Show("Please choose another seat.");
            }
            else
            {
                buttonC3.BackColor = Color.LightGreen;
                textBoxSeatNumber.Text = textBoxSeatNumber.Text + buttonC3.Text + ' ';
                total = int.Parse(label1.Text);
                total = total + 250;
                label1.Text = total.ToString();
            }
        }

        private void buttonD3_Click(object sender, EventArgs e)
        {
            if (buttonD3.BackColor == Color.LightGreen || buttonD3.BackColor == Color.Red)
            {
                MessageBox.Show("Please choose another seat.");
            }
            else
            {
                buttonD3.BackColor = Color.LightGreen;
                textBoxSeatNumber.Text = textBoxSeatNumber.Text + buttonD3.Text + ' ';
                total = int.Parse(label1.Text);
                total = total + 250;
                label1.Text = total.ToString();
            }
        }

        private void buttonA4_Click(object sender, EventArgs e)
        {
            if (buttonA4.BackColor == Color.LightGreen || buttonA4.BackColor == Color.Red)
            {
                MessageBox.Show("Please choose another seat.");
            }
            else
            {
                buttonA4.BackColor = Color.LightGreen;
                textBoxSeatNumber.Text = textBoxSeatNumber.Text + buttonA4.Text + ' ';
                total = int.Parse(label1.Text);
                total = total + 250;
                label1.Text = total.ToString();
            }
        }

        private void buttonB4_Click(object sender, EventArgs e)
        {
            if (buttonB4.BackColor == Color.LightGreen || buttonB4.BackColor == Color.Red)
            {
                MessageBox.Show("Please choose another seat.");
            }
            else
            {
                buttonB4.BackColor = Color.LightGreen;
                textBoxSeatNumber.Text = textBoxSeatNumber.Text + buttonB4.Text + ' ';
                total = int.Parse(label1.Text);
                total = total + 250;
                label1.Text = total.ToString();
            }
        }

        private void buttonC4_Click(object sender, EventArgs e)
        {
            if (buttonC4.BackColor == Color.LightGreen || buttonC4.BackColor == Color.Red)
            {
                MessageBox.Show("Please choose another seat.");
            }
            else
            {
                buttonC4.BackColor = Color.LightGreen;
                textBoxSeatNumber.Text = textBoxSeatNumber.Text + buttonC4.Text + ' ';
                total = int.Parse(label1.Text);
                total = total + 250;
                label1.Text = total.ToString();
            }
        }

        private void buttonD4_Click(object sender, EventArgs e)
        {
            if (buttonD4.BackColor == Color.LightGreen || buttonD4.BackColor == Color.Red)
            {
                MessageBox.Show("Please choose another seat.");
            }
            else
            {
                buttonD4.BackColor = Color.LightGreen;
                textBoxSeatNumber.Text = textBoxSeatNumber.Text + buttonD4.Text + ' ';
                total = int.Parse(label1.Text);
                total = total + 250;
                label1.Text = total.ToString();
            }
        }

        private void buttonA5_Click(object sender, EventArgs e)
        {
            if (buttonA5.BackColor == Color.LightGreen || buttonA5.BackColor == Color.Red)
            {
                MessageBox.Show("Please choose another seat.");
            }
            else
            {
                buttonA5.BackColor = Color.LightGreen;
                textBoxSeatNumber.Text = textBoxSeatNumber.Text + buttonA5.Text + ' ';
                total = int.Parse(label1.Text);
                total = total + 250;
                label1.Text = total.ToString();
            }
        }

        private void buttonB5_Click(object sender, EventArgs e)
        {
            if (buttonB5.BackColor == Color.LightGreen || buttonB5.BackColor == Color.Red)
            {
                MessageBox.Show("Please choose another seat.");
            }
            else
            {
                buttonB5.BackColor = Color.LightGreen;
                textBoxSeatNumber.Text = textBoxSeatNumber.Text + buttonB5.Text + ' ';
                total = int.Parse(label1.Text);
                total = total + 250;
                label1.Text = total.ToString();
            }
        }

        private void buttonC5_Click(object sender, EventArgs e)
        {
            if (buttonC5.BackColor == Color.LightGreen || buttonC5.BackColor == Color.Red)
            {
                MessageBox.Show("Please choose another seat.");
            }
            else
            {
                buttonC5.BackColor = Color.LightGreen;
                textBoxSeatNumber.Text = textBoxSeatNumber.Text + buttonC5.Text + ' ';
                total = int.Parse(label1.Text);
                total = total + 250;
                label1.Text = total.ToString();
            }
        }

        private void buttonD5_Click(object sender, EventArgs e)
        {
            if (buttonD5.BackColor == Color.LightGreen || buttonD5.BackColor == Color.Red)
            {
                MessageBox.Show("Please choose another seat.");
            }
            else
            {
                buttonD5.BackColor = Color.LightGreen;
                textBoxSeatNumber.Text = textBoxSeatNumber.Text + buttonD5.Text + ' ';
                total = int.Parse(label1.Text);
                total = total + 250;
                label1.Text = total.ToString();
            }
        }

        private void buttonA6_Click(object sender, EventArgs e)
        {
            if (buttonA6.BackColor == Color.LightGreen || buttonA6.BackColor == Color.Red)
            {
                MessageBox.Show("Please choose another seat.");
            }
            else
            {
                buttonA6.BackColor = Color.LightGreen;
                textBoxSeatNumber.Text = textBoxSeatNumber.Text + buttonA6.Text + ' ';
                total = int.Parse(label1.Text);
                total = total + 189;
                label1.Text = total.ToString();
            }
        }

        private void buttonB6_Click(object sender, EventArgs e)
        {
            if (buttonB6.BackColor == Color.LightGreen || buttonB6.BackColor == Color.Red)
            {
                MessageBox.Show("Please choose another seat.");
            }
            else
            {
                buttonB6.BackColor = Color.LightGreen;
                textBoxSeatNumber.Text = textBoxSeatNumber.Text + buttonB6.Text + ' ';
                total = int.Parse(label1.Text);
                total = total + 189;
                label1.Text = total.ToString();
            }
        }

        private void buttonC6_Click(object sender, EventArgs e)
        {
            if (buttonC6.BackColor == Color.LightGreen || buttonC6.BackColor == Color.Red)
            {
                MessageBox.Show("Please choose another seat.");
            }
            else
            {
                buttonC6.BackColor = Color.LightGreen;
                textBoxSeatNumber.Text = textBoxSeatNumber.Text + buttonC6.Text + ' ';
                total = int.Parse(label1.Text);
                total = total + 189;
                label1.Text = total.ToString();
            }
        }

        private void buttonD6_Click(object sender, EventArgs e)
        {
            if (buttonD6.BackColor == Color.LightGreen || buttonD6.BackColor == Color.Red)
            {
                MessageBox.Show("Please choose another seat.");
            }
            else
            {
                buttonD6.BackColor = Color.LightGreen;
                textBoxSeatNumber.Text = textBoxSeatNumber.Text + buttonD6.Text + ' ';
                total = int.Parse(label1.Text);
                total = total + 189;
                label1.Text = total.ToString();
            }
        }

        private void buttonA7_Click(object sender, EventArgs e)
        {
            if (buttonA7.BackColor == Color.LightGreen || buttonA7.BackColor == Color.Red)
            {
                MessageBox.Show("Please choose another seat.");
            }
            else
            {
                buttonA7.BackColor = Color.LightGreen;
                textBoxSeatNumber.Text = textBoxSeatNumber.Text + buttonA7.Text + ' ';
                total = int.Parse(label1.Text);
                total = total + 189;
                label1.Text = total.ToString();
            }
        }

        private void buttonB7_Click(object sender, EventArgs e)
        {
            if (buttonB7.BackColor == Color.LightGreen || buttonB7.BackColor == Color.Red)
            {
                MessageBox.Show("Please choose another seat.");
            }
            else
            {
                buttonB7.BackColor = Color.LightGreen;
                textBoxSeatNumber.Text = textBoxSeatNumber.Text + buttonB7.Text + ' ';
                total = int.Parse(label1.Text);
                total = total + 189;
                label1.Text = total.ToString();
            }
        }

        private void buttonC7_Click(object sender, EventArgs e)
        {
            if (buttonC7.BackColor == Color.LightGreen || buttonC7.BackColor == Color.Red)
            {
                MessageBox.Show("Please choose another seat.");
            }
            else
            {
                buttonC7.BackColor = Color.LightGreen;
                textBoxSeatNumber.Text = textBoxSeatNumber.Text + buttonC7.Text + ' ';
                total = int.Parse(label1.Text);
                total = total + 189;
                label1.Text = total.ToString();
            }
        }

        private void buttonD7_Click(object sender, EventArgs e)
        {
            if (buttonD7.BackColor == Color.LightGreen || buttonD7.BackColor == Color.Red)
            {
                MessageBox.Show("Please choose another seat.");
            }
            else
            {
                buttonD7.BackColor = Color.LightGreen;
                textBoxSeatNumber.Text = textBoxSeatNumber.Text + buttonD7.Text + ' ';
                total = int.Parse(label1.Text);
                total = total + 189;
                label1.Text = total.ToString();
            }
        }

        private void buttonSubmit_Click(object sender, EventArgs e)
        {
            if (textBoxPassengerName.Text == "") {
                MessageBox.Show("Please Enter Your Name.");
            }
            else if(textBoxSeatNumber.Text == "")
            {
                MessageBox.Show("Please Choose A Seat.");
            }
            else
            {
                foreach (Button b in Controls.OfType<Button>()) {
                     if(b.BackColor == Color.LightGreen)
                    {
                        b.BackColor = Color.Red;
                    }
                }
                label1.Text = "0";
                textBoxPassengerName.Text = "";
                textBoxSeatNumber.Text = "";
            }
        }

        private void buttonReset_Click(object sender, EventArgs e)
        {
            foreach (Button b in Controls.OfType<Button>())
            {
                if (b.BackColor == Color.LightGreen)
                {
                    b.BackColor = Color.LightGray;
                }
            }
            label1.Text = "0";
            textBoxPassengerName.Text = "";
            textBoxSeatNumber.Text = "";
        }
    }
}
