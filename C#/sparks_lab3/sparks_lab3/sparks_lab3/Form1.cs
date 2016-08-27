using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace sparks_lab3
{
    public partial class Form1 : Form
    {
        private double total = 0;
        private int totalDrinks = 0;
        private int totalExtras = 0;

        public Form1()
        {
            InitializeComponent();
            radioButtonDefault.Visible = false;
            radioButtonDefault.Checked = true;
            radioButtonDefaultSizes.Visible = false;
            radioButtonDefaultSizes.Checked = true;
            label4.Text = "";
            
        }

        private void aboutToolStripMenuItem_Click(object sender, EventArgs e)
        {
            AboutBox1 aboutForm = new AboutBox1();
            aboutForm.Show();
        }

        private void addToOrderToolStripMenuItem_Click(object sender, EventArgs e)
        {

            if (radioButtonDefault.Checked)
            {
                MessageBox.Show("Please select a juice or smoothie.");
            }
            else if (radioButtonDefaultSizes.Checked)
            {
                MessageBox.Show("Please select a size.");
            }
            else {
                if (radioButtonTwelveOZ.Checked) {
                    total = total + 3.00;
                    if (checkBoxVitaminPack.Checked )
                    {
                        total = total + 2.50;
                        totalExtras += 1;
                    }
                    if (checkBoxEnergyBoost.Checked) {
                        total = total + 2.50;
                        totalExtras += 1;
                    }
                    if (checkBoxCoolDownRemedy.Checked)
                    {
                        total = total + 2.50;
                        totalExtras += 1;
                    }
                    totalDrinks += 1;
                    label4.Text = total.ToString("C");
                }
                else if (radioButtonSixteen.Checked)
                {
                    total = total + 3.50;
                    if (checkBoxVitaminPack.Checked)
                    {
                        total = total + 2.50;
                        totalExtras += 1;
                    }
                    if (checkBoxEnergyBoost.Checked)
                    {
                        total = total + 2.50;
                        totalExtras += 1;
                    }
                    if (checkBoxCoolDownRemedy.Checked)
                    {
                        total = total + 2.50;
                        totalExtras += 1;
                    }
                    totalDrinks += 1;
                    label4.Text = total.ToString("C");
                }
                else
                {
                    total = total + 4.00;
                    if (checkBoxVitaminPack.Checked)
                    {
                        total = total + 2.50;
                        totalExtras += 1;
                    }
                    if (checkBoxEnergyBoost.Checked)
                    {
                        total = total + 2.50;
                        totalExtras += 1;
                    }
                    if (checkBoxCoolDownRemedy.Checked)
                    {
                        total = total + 2.50;
                        totalExtras += 1;
                    }
                    totalDrinks += 1;
                    label4.Text = total.ToString("C");
                }
                radioButtonDefaultSizes.Checked = true;
                radioButtonDefault.Checked = true;
                checkBoxCoolDownRemedy.Checked = false;
                checkBoxEnergyBoost.Checked = false;
                checkBoxVitaminPack.Checked = false;
            }
        }

        private void orderCompleteToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (radioButtonDefault.Checked == false && radioButtonDefaultSizes.Checked == false)
            {
                if (radioButtonTwelveOZ.Checked)
                {
                    total = total + 3.00;
                    if (checkBoxVitaminPack.Checked)
                    {
                        total = total + 2.50;
                        totalExtras += 1;
                    }
                    if (checkBoxEnergyBoost.Checked)
                    {
                        total = total + 2.50;
                        totalExtras += 1;
                    }
                    if (checkBoxCoolDownRemedy.Checked)
                    {
                        total = total + 2.50;
                        totalExtras += 1;
                    }
                    totalDrinks += 1;
                    label4.Text = total.ToString("C");
                }
                else if (radioButtonSixteen.Checked)
                {
                    total = total + 3.50;
                    if (checkBoxVitaminPack.Checked)
                    {
                        total = total + 2.50;
                        totalExtras += 1;
                    }
                    if (checkBoxEnergyBoost.Checked)
                    {
                        total = total + 2.50;
                        totalExtras += 1;
                    }
                    if (checkBoxCoolDownRemedy.Checked)
                    {
                        total = total + 2.50;
                        totalExtras += 1;
                    }
                    totalDrinks += 1;
                    label4.Text = total.ToString("C");
                }
                else
                {
                    total = total + 4.00;
                    if (checkBoxVitaminPack.Checked)
                    {
                        total = total + 2.50;
                        totalExtras += 1;
                    }
                    if (checkBoxEnergyBoost.Checked)
                    {
                        total = total + 2.50;
                        totalExtras += 1;
                    }
                    if (checkBoxCoolDownRemedy.Checked)
                    {
                        total = total + 2.50;
                        totalExtras += 1;
                    }
                    totalDrinks += 1;
                    label4.Text = total.ToString("C");
                }
            }
            MessageBox.Show("Drinks Ordered: " + totalDrinks.ToString() +
                            "\nExtras Ordered:" + totalExtras.ToString() +
                            "\nTotal: " + total.ToString("C"));
            label4.Text = "";
            total = 0;
            totalDrinks = 0;
            totalExtras = 0;
            radioButtonDefaultSizes.Checked = true;
            radioButtonDefault.Checked = true;
            checkBoxCoolDownRemedy.Checked = false;
            checkBoxEnergyBoost.Checked = false;
            checkBoxVitaminPack.Checked = false;
        }
        private void summaryToolStripMenuItem_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Drinks Ordered: " + totalDrinks.ToString() +
                            "\nExtras Ordered:" + totalExtras.ToString() +
                            "\nTotal: " + total.ToString("C"));
        }
        private void exitToolStripMenuItem_Click(object sender, EventArgs e)
        {
            this.Close();
        }
        private void fontToolStripMenuItem_Click(object sender, EventArgs e)
        {
            FontDialog dialogBox = new FontDialog();
            dialogBox.MaxSize = 12;

            DialogResult result = dialogBox.ShowDialog();

            if (result == DialogResult.OK)
            {
                Font font = dialogBox.Font;

                this.Font = font;
                groupOptions.Font = font;
                groupBoxSizes.Font = font;
                groupBoxJuiceSelection.Font = font;
                groupBoxExtras.Font = font;
            }
        }

        private void backgroundToolStripMenuItem_Click(object sender, EventArgs e)
        {
            ColorDialog colorDialog = new ColorDialog();
            DialogResult result = colorDialog.ShowDialog();

            if (result == DialogResult.OK)
            {
                Color color = colorDialog.Color;

                this.BackColor = color;
                groupBoxExtras.BackColor = color;
                groupBoxJuiceSelection.BackColor = color;
                groupBoxSizes.BackColor = color;
                groupOptions.BackColor = color;
            }
        }

        private void textToolStripMenuItem_Click(object sender, EventArgs e)
        {
            ColorDialog colorDialog = new ColorDialog();
            DialogResult result = colorDialog.ShowDialog();

            if (result == DialogResult.OK)
            {
                Color color = colorDialog.Color;

                this.ForeColor = color;
                groupBoxExtras.ForeColor = color;
                groupBoxJuiceSelection.ForeColor = color;
                groupBoxSizes.ForeColor = color;
                groupOptions.ForeColor = color;
            }
        }
    }
}
