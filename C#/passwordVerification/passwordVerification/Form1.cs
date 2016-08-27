using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace passwordVerification
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void buttonValidate_Click(object sender, EventArgs e)
        {
            String password = textBoxPassword.Text;
            Boolean correctFormat = false;
            int uppercase = 0, lowercase = 0, spaces = 0, digits = 0;

            if (password.IndexOf(" ") == -1 && password.Length >= 8)
            {
                spaces = 0;
            }
            else {
                spaces++;
            }
            foreach (char c in password) {
                if (Char.IsUpper(c))
                {
                    uppercase++;
                }
                if (Char.IsLower(c)) {
                    lowercase++;
                }
                if (Char.IsDigit(c)) {
                    digits++;
                }
            }
            if (spaces == 0 && uppercase > 0 && lowercase > 0 && digits > 0)
            {
                MessageBox.Show("Correct Format");
            }
            else {
                MessageBox.Show("Must contain at least one uppercase, lowercase and number. Cannot contain any spaces.");
            }
 
        }
    }
}
