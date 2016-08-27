using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace lab5
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            Thread t = new Thread(new ThreadStart(SplashStart));
            t.Start();
            Thread.Sleep(5000);
            InitializeComponent();
            labelTotal.Text = "";
            t.Abort();
        }
        public void SplashStart() {
            Application.Run(new SplashScreen());
        }
        private void clearToolStripMenuItem_Click(object sender, EventArgs e)
        {
            AboutBox1 about = new AboutBox1();
            about.Show();
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void findPriceToolStripMenuItem_Click(object sender, EventArgs e)
        {
            double[,] priceArray = new double[,] { { 3.6, 3.9, 4.25 }, 
                                                   { 6.00, 6.00, 8.00 }, 
                                                   { 10.00, 11.00, 15.00 }};
            String[] sizeArray = new String[] {"1/4","1/2","1"};
            int selectedSize = (int) comboBoxSizes.SelectedIndex;
            int selectedCoffee = 4;
            double selectedPrice = 4;

            if (regularRadio.Checked)
            {
                selectedCoffee = 0;
            }
            else if (decafRadio.Checked)
            {
                selectedCoffee = 1;
            }
            else if (specialRadio.Checked)
            {
                selectedCoffee = 2;
            }
            else {
                selectedCoffee = 4;
            }

            if (selectedCoffee == 4)
            {
                MessageBox.Show("Select a type of coffee.");
            }
            else if (selectedSize == 0 || selectedSize == 1 || selectedSize == 2) {
                selectedPrice = priceArray[selectedCoffee, selectedSize];
                labelTotal.Text = "" + selectedPrice.ToString("C");
            }
            else {
                MessageBox.Show("Select a size.");
            }

        }

        private void exitToolStripMenuItem1_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void exitToolStripMenuItem_Click(object sender, EventArgs e)
        {
            defaultRadio.Checked = true;
            comboBoxSizes.SelectedIndex = -1;
            comboBoxSizes.Text = "Size";
            labelTotal.Text = "";
        }
    }
}
