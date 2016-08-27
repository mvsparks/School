namespace lab7
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.textBoxPassengerName = new System.Windows.Forms.TextBox();
            this.labelPassengerName = new System.Windows.Forms.Label();
            this.textBoxSeatNumber = new System.Windows.Forms.TextBox();
            this.labelSeatNumber = new System.Windows.Forms.Label();
            this.buttonSubmit = new System.Windows.Forms.Button();
            this.buttonReset = new System.Windows.Forms.Button();
            this.groupBoxSelection = new System.Windows.Forms.GroupBox();
            this.buttonA1 = new System.Windows.Forms.Button();
            this.buttonA2 = new System.Windows.Forms.Button();
            this.buttonA3 = new System.Windows.Forms.Button();
            this.buttonA4 = new System.Windows.Forms.Button();
            this.buttonA7 = new System.Windows.Forms.Button();
            this.buttonA6 = new System.Windows.Forms.Button();
            this.buttonA5 = new System.Windows.Forms.Button();
            this.buttonB7 = new System.Windows.Forms.Button();
            this.buttonB6 = new System.Windows.Forms.Button();
            this.buttonB5 = new System.Windows.Forms.Button();
            this.buttonB4 = new System.Windows.Forms.Button();
            this.buttonB3 = new System.Windows.Forms.Button();
            this.buttonB2 = new System.Windows.Forms.Button();
            this.buttonB1 = new System.Windows.Forms.Button();
            this.buttonC7 = new System.Windows.Forms.Button();
            this.buttonC6 = new System.Windows.Forms.Button();
            this.buttonC5 = new System.Windows.Forms.Button();
            this.buttonC4 = new System.Windows.Forms.Button();
            this.buttonC3 = new System.Windows.Forms.Button();
            this.buttonC2 = new System.Windows.Forms.Button();
            this.buttonC1 = new System.Windows.Forms.Button();
            this.buttonD7 = new System.Windows.Forms.Button();
            this.buttonD6 = new System.Windows.Forms.Button();
            this.buttonD5 = new System.Windows.Forms.Button();
            this.buttonD4 = new System.Windows.Forms.Button();
            this.buttonD3 = new System.Windows.Forms.Button();
            this.buttonD2 = new System.Windows.Forms.Button();
            this.buttonD1 = new System.Windows.Forms.Button();
            this.labelTotal = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.groupBoxSelection.SuspendLayout();
            this.SuspendLayout();
            // 
            // textBoxPassengerName
            // 
            this.textBoxPassengerName.Location = new System.Drawing.Point(76, 35);
            this.textBoxPassengerName.Name = "textBoxPassengerName";
            this.textBoxPassengerName.Size = new System.Drawing.Size(298, 29);
            this.textBoxPassengerName.TabIndex = 0;
            this.textBoxPassengerName.TextChanged += new System.EventHandler(this.textBox1_TextChanged);
            // 
            // labelPassengerName
            // 
            this.labelPassengerName.AutoSize = true;
            this.labelPassengerName.Location = new System.Drawing.Point(6, 35);
            this.labelPassengerName.Name = "labelPassengerName";
            this.labelPassengerName.Size = new System.Drawing.Size(64, 25);
            this.labelPassengerName.TabIndex = 1;
            this.labelPassengerName.Text = "Name";
            // 
            // textBoxSeatNumber
            // 
            this.textBoxSeatNumber.Location = new System.Drawing.Point(76, 69);
            this.textBoxSeatNumber.Name = "textBoxSeatNumber";
            this.textBoxSeatNumber.ReadOnly = true;
            this.textBoxSeatNumber.ScrollBars = System.Windows.Forms.ScrollBars.Horizontal;
            this.textBoxSeatNumber.Size = new System.Drawing.Size(298, 29);
            this.textBoxSeatNumber.TabIndex = 2;
            // 
            // labelSeatNumber
            // 
            this.labelSeatNumber.AutoSize = true;
            this.labelSeatNumber.Location = new System.Drawing.Point(17, 69);
            this.labelSeatNumber.Name = "labelSeatNumber";
            this.labelSeatNumber.Size = new System.Drawing.Size(53, 25);
            this.labelSeatNumber.TabIndex = 3;
            this.labelSeatNumber.Text = "Seat";
            // 
            // buttonSubmit
            // 
            this.buttonSubmit.Location = new System.Drawing.Point(111, 157);
            this.buttonSubmit.Name = "buttonSubmit";
            this.buttonSubmit.Size = new System.Drawing.Size(86, 41);
            this.buttonSubmit.TabIndex = 4;
            this.buttonSubmit.Text = "Submit";
            this.buttonSubmit.UseVisualStyleBackColor = true;
            this.buttonSubmit.Click += new System.EventHandler(this.buttonSubmit_Click);
            // 
            // buttonReset
            // 
            this.buttonReset.Location = new System.Drawing.Point(203, 157);
            this.buttonReset.Name = "buttonReset";
            this.buttonReset.Size = new System.Drawing.Size(88, 41);
            this.buttonReset.TabIndex = 6;
            this.buttonReset.Text = "Reset";
            this.buttonReset.UseVisualStyleBackColor = true;
            this.buttonReset.Click += new System.EventHandler(this.buttonReset_Click);
            // 
            // groupBoxSelection
            // 
            this.groupBoxSelection.Controls.Add(this.label1);
            this.groupBoxSelection.Controls.Add(this.labelTotal);
            this.groupBoxSelection.Controls.Add(this.buttonReset);
            this.groupBoxSelection.Controls.Add(this.buttonSubmit);
            this.groupBoxSelection.Controls.Add(this.labelSeatNumber);
            this.groupBoxSelection.Controls.Add(this.textBoxSeatNumber);
            this.groupBoxSelection.Controls.Add(this.labelPassengerName);
            this.groupBoxSelection.Controls.Add(this.textBoxPassengerName);
            this.groupBoxSelection.Location = new System.Drawing.Point(99, 342);
            this.groupBoxSelection.Name = "groupBoxSelection";
            this.groupBoxSelection.Size = new System.Drawing.Size(394, 204);
            this.groupBoxSelection.TabIndex = 8;
            this.groupBoxSelection.TabStop = false;
            this.groupBoxSelection.Text = "Seat Selection";
            // 
            // buttonA1
            // 
            this.buttonA1.Location = new System.Drawing.Point(146, 24);
            this.buttonA1.Name = "buttonA1";
            this.buttonA1.Size = new System.Drawing.Size(58, 37);
            this.buttonA1.TabIndex = 9;
            this.buttonA1.Text = "A1";
            this.buttonA1.UseVisualStyleBackColor = true;
            this.buttonA1.Click += new System.EventHandler(this.buttonA1_Click);
            // 
            // buttonA2
            // 
            this.buttonA2.Location = new System.Drawing.Point(146, 67);
            this.buttonA2.Name = "buttonA2";
            this.buttonA2.Size = new System.Drawing.Size(58, 37);
            this.buttonA2.TabIndex = 10;
            this.buttonA2.Text = "A2";
            this.buttonA2.UseVisualStyleBackColor = true;
            this.buttonA2.Click += new System.EventHandler(this.buttonA2_Click);
            // 
            // buttonA3
            // 
            this.buttonA3.Location = new System.Drawing.Point(146, 110);
            this.buttonA3.Name = "buttonA3";
            this.buttonA3.Size = new System.Drawing.Size(58, 37);
            this.buttonA3.TabIndex = 11;
            this.buttonA3.Text = "A3";
            this.buttonA3.UseVisualStyleBackColor = true;
            this.buttonA3.Click += new System.EventHandler(this.buttonA3_Click);
            // 
            // buttonA4
            // 
            this.buttonA4.Location = new System.Drawing.Point(146, 153);
            this.buttonA4.Name = "buttonA4";
            this.buttonA4.Size = new System.Drawing.Size(58, 37);
            this.buttonA4.TabIndex = 12;
            this.buttonA4.Text = "A4";
            this.buttonA4.UseVisualStyleBackColor = true;
            this.buttonA4.Click += new System.EventHandler(this.buttonA4_Click);
            // 
            // buttonA7
            // 
            this.buttonA7.Location = new System.Drawing.Point(146, 282);
            this.buttonA7.Name = "buttonA7";
            this.buttonA7.Size = new System.Drawing.Size(58, 37);
            this.buttonA7.TabIndex = 15;
            this.buttonA7.Text = "A7";
            this.buttonA7.UseVisualStyleBackColor = true;
            this.buttonA7.Click += new System.EventHandler(this.buttonA7_Click);
            // 
            // buttonA6
            // 
            this.buttonA6.Location = new System.Drawing.Point(146, 239);
            this.buttonA6.Name = "buttonA6";
            this.buttonA6.Size = new System.Drawing.Size(58, 37);
            this.buttonA6.TabIndex = 14;
            this.buttonA6.Text = "A6";
            this.buttonA6.UseVisualStyleBackColor = true;
            this.buttonA6.Click += new System.EventHandler(this.buttonA6_Click);
            // 
            // buttonA5
            // 
            this.buttonA5.Location = new System.Drawing.Point(146, 196);
            this.buttonA5.Name = "buttonA5";
            this.buttonA5.Size = new System.Drawing.Size(58, 37);
            this.buttonA5.TabIndex = 13;
            this.buttonA5.Text = "A5";
            this.buttonA5.UseVisualStyleBackColor = true;
            this.buttonA5.Click += new System.EventHandler(this.buttonA5_Click);
            // 
            // buttonB7
            // 
            this.buttonB7.Location = new System.Drawing.Point(210, 282);
            this.buttonB7.Name = "buttonB7";
            this.buttonB7.Size = new System.Drawing.Size(58, 37);
            this.buttonB7.TabIndex = 22;
            this.buttonB7.Text = "B7";
            this.buttonB7.UseVisualStyleBackColor = true;
            this.buttonB7.Click += new System.EventHandler(this.buttonB7_Click);
            // 
            // buttonB6
            // 
            this.buttonB6.Location = new System.Drawing.Point(210, 239);
            this.buttonB6.Name = "buttonB6";
            this.buttonB6.Size = new System.Drawing.Size(58, 37);
            this.buttonB6.TabIndex = 21;
            this.buttonB6.Text = "B6";
            this.buttonB6.UseVisualStyleBackColor = true;
            this.buttonB6.Click += new System.EventHandler(this.buttonB6_Click);
            // 
            // buttonB5
            // 
            this.buttonB5.Location = new System.Drawing.Point(210, 196);
            this.buttonB5.Name = "buttonB5";
            this.buttonB5.Size = new System.Drawing.Size(58, 37);
            this.buttonB5.TabIndex = 20;
            this.buttonB5.Text = "B5";
            this.buttonB5.UseVisualStyleBackColor = true;
            this.buttonB5.Click += new System.EventHandler(this.buttonB5_Click);
            // 
            // buttonB4
            // 
            this.buttonB4.Location = new System.Drawing.Point(210, 153);
            this.buttonB4.Name = "buttonB4";
            this.buttonB4.Size = new System.Drawing.Size(58, 37);
            this.buttonB4.TabIndex = 19;
            this.buttonB4.Text = "B4";
            this.buttonB4.UseVisualStyleBackColor = true;
            this.buttonB4.Click += new System.EventHandler(this.buttonB4_Click);
            // 
            // buttonB3
            // 
            this.buttonB3.Location = new System.Drawing.Point(210, 110);
            this.buttonB3.Name = "buttonB3";
            this.buttonB3.Size = new System.Drawing.Size(58, 37);
            this.buttonB3.TabIndex = 18;
            this.buttonB3.Text = "B3";
            this.buttonB3.UseVisualStyleBackColor = true;
            this.buttonB3.Click += new System.EventHandler(this.buttonB3_Click);
            // 
            // buttonB2
            // 
            this.buttonB2.Location = new System.Drawing.Point(210, 67);
            this.buttonB2.Name = "buttonB2";
            this.buttonB2.Size = new System.Drawing.Size(58, 37);
            this.buttonB2.TabIndex = 17;
            this.buttonB2.Text = "B2";
            this.buttonB2.UseVisualStyleBackColor = true;
            this.buttonB2.Click += new System.EventHandler(this.buttonB2_Click);
            // 
            // buttonB1
            // 
            this.buttonB1.Location = new System.Drawing.Point(210, 24);
            this.buttonB1.Name = "buttonB1";
            this.buttonB1.Size = new System.Drawing.Size(58, 37);
            this.buttonB1.TabIndex = 16;
            this.buttonB1.Text = "B1";
            this.buttonB1.UseVisualStyleBackColor = true;
            this.buttonB1.Click += new System.EventHandler(this.buttonB1_Click);
            // 
            // buttonC7
            // 
            this.buttonC7.Location = new System.Drawing.Point(323, 282);
            this.buttonC7.Name = "buttonC7";
            this.buttonC7.Size = new System.Drawing.Size(58, 37);
            this.buttonC7.TabIndex = 29;
            this.buttonC7.Text = "C7";
            this.buttonC7.UseVisualStyleBackColor = true;
            this.buttonC7.Click += new System.EventHandler(this.buttonC7_Click);
            // 
            // buttonC6
            // 
            this.buttonC6.Location = new System.Drawing.Point(323, 239);
            this.buttonC6.Name = "buttonC6";
            this.buttonC6.Size = new System.Drawing.Size(58, 37);
            this.buttonC6.TabIndex = 28;
            this.buttonC6.Text = "C6";
            this.buttonC6.UseVisualStyleBackColor = true;
            this.buttonC6.Click += new System.EventHandler(this.buttonC6_Click);
            // 
            // buttonC5
            // 
            this.buttonC5.Location = new System.Drawing.Point(323, 196);
            this.buttonC5.Name = "buttonC5";
            this.buttonC5.Size = new System.Drawing.Size(58, 37);
            this.buttonC5.TabIndex = 27;
            this.buttonC5.Text = "C5";
            this.buttonC5.UseVisualStyleBackColor = true;
            this.buttonC5.Click += new System.EventHandler(this.buttonC5_Click);
            // 
            // buttonC4
            // 
            this.buttonC4.Location = new System.Drawing.Point(323, 153);
            this.buttonC4.Name = "buttonC4";
            this.buttonC4.Size = new System.Drawing.Size(58, 37);
            this.buttonC4.TabIndex = 26;
            this.buttonC4.Text = "C4";
            this.buttonC4.UseVisualStyleBackColor = true;
            this.buttonC4.Click += new System.EventHandler(this.buttonC4_Click);
            // 
            // buttonC3
            // 
            this.buttonC3.Location = new System.Drawing.Point(323, 110);
            this.buttonC3.Name = "buttonC3";
            this.buttonC3.Size = new System.Drawing.Size(58, 37);
            this.buttonC3.TabIndex = 25;
            this.buttonC3.Text = "C3";
            this.buttonC3.UseVisualStyleBackColor = true;
            this.buttonC3.Click += new System.EventHandler(this.buttonC3_Click);
            // 
            // buttonC2
            // 
            this.buttonC2.Location = new System.Drawing.Point(323, 67);
            this.buttonC2.Name = "buttonC2";
            this.buttonC2.Size = new System.Drawing.Size(58, 37);
            this.buttonC2.TabIndex = 24;
            this.buttonC2.Text = "C2";
            this.buttonC2.UseVisualStyleBackColor = true;
            this.buttonC2.Click += new System.EventHandler(this.buttonC2_Click);
            // 
            // buttonC1
            // 
            this.buttonC1.Location = new System.Drawing.Point(323, 24);
            this.buttonC1.Name = "buttonC1";
            this.buttonC1.Size = new System.Drawing.Size(58, 37);
            this.buttonC1.TabIndex = 23;
            this.buttonC1.Text = "C1";
            this.buttonC1.UseVisualStyleBackColor = true;
            this.buttonC1.Click += new System.EventHandler(this.buttonC1_Click);
            // 
            // buttonD7
            // 
            this.buttonD7.Location = new System.Drawing.Point(387, 282);
            this.buttonD7.Name = "buttonD7";
            this.buttonD7.Size = new System.Drawing.Size(58, 37);
            this.buttonD7.TabIndex = 36;
            this.buttonD7.Text = "D7";
            this.buttonD7.UseVisualStyleBackColor = true;
            this.buttonD7.Click += new System.EventHandler(this.buttonD7_Click);
            // 
            // buttonD6
            // 
            this.buttonD6.Location = new System.Drawing.Point(387, 239);
            this.buttonD6.Name = "buttonD6";
            this.buttonD6.Size = new System.Drawing.Size(58, 37);
            this.buttonD6.TabIndex = 35;
            this.buttonD6.Text = "D6";
            this.buttonD6.UseVisualStyleBackColor = true;
            this.buttonD6.Click += new System.EventHandler(this.buttonD6_Click);
            // 
            // buttonD5
            // 
            this.buttonD5.Location = new System.Drawing.Point(387, 196);
            this.buttonD5.Name = "buttonD5";
            this.buttonD5.Size = new System.Drawing.Size(58, 37);
            this.buttonD5.TabIndex = 34;
            this.buttonD5.Text = "D5";
            this.buttonD5.UseVisualStyleBackColor = true;
            this.buttonD5.Click += new System.EventHandler(this.buttonD5_Click);
            // 
            // buttonD4
            // 
            this.buttonD4.Location = new System.Drawing.Point(387, 153);
            this.buttonD4.Name = "buttonD4";
            this.buttonD4.Size = new System.Drawing.Size(58, 37);
            this.buttonD4.TabIndex = 33;
            this.buttonD4.Text = "D4";
            this.buttonD4.UseVisualStyleBackColor = true;
            this.buttonD4.Click += new System.EventHandler(this.buttonD4_Click);
            // 
            // buttonD3
            // 
            this.buttonD3.Location = new System.Drawing.Point(387, 110);
            this.buttonD3.Name = "buttonD3";
            this.buttonD3.Size = new System.Drawing.Size(58, 37);
            this.buttonD3.TabIndex = 32;
            this.buttonD3.Text = "D3";
            this.buttonD3.UseVisualStyleBackColor = true;
            this.buttonD3.Click += new System.EventHandler(this.buttonD3_Click);
            // 
            // buttonD2
            // 
            this.buttonD2.Location = new System.Drawing.Point(387, 67);
            this.buttonD2.Name = "buttonD2";
            this.buttonD2.Size = new System.Drawing.Size(58, 37);
            this.buttonD2.TabIndex = 31;
            this.buttonD2.Text = "D2";
            this.buttonD2.UseVisualStyleBackColor = true;
            this.buttonD2.Click += new System.EventHandler(this.buttonD2_Click);
            // 
            // buttonD1
            // 
            this.buttonD1.Location = new System.Drawing.Point(387, 24);
            this.buttonD1.Name = "buttonD1";
            this.buttonD1.Size = new System.Drawing.Size(58, 37);
            this.buttonD1.TabIndex = 30;
            this.buttonD1.Text = "D1";
            this.buttonD1.UseVisualStyleBackColor = true;
            this.buttonD1.Click += new System.EventHandler(this.buttonD1_Click);
            // 
            // labelTotal
            // 
            this.labelTotal.AutoSize = true;
            this.labelTotal.Location = new System.Drawing.Point(130, 117);
            this.labelTotal.Name = "labelTotal";
            this.labelTotal.Size = new System.Drawing.Size(67, 25);
            this.labelTotal.TabIndex = 7;
            this.labelTotal.Text = "Total: ";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(203, 117);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(64, 25);
            this.label1.TabIndex = 8;
            this.label1.Text = "label1";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(11F, 24F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(584, 558);
            this.Controls.Add(this.buttonD7);
            this.Controls.Add(this.buttonD6);
            this.Controls.Add(this.buttonD5);
            this.Controls.Add(this.buttonD4);
            this.Controls.Add(this.buttonD3);
            this.Controls.Add(this.buttonD2);
            this.Controls.Add(this.buttonD1);
            this.Controls.Add(this.buttonC7);
            this.Controls.Add(this.buttonC6);
            this.Controls.Add(this.buttonC5);
            this.Controls.Add(this.buttonC4);
            this.Controls.Add(this.buttonC3);
            this.Controls.Add(this.buttonC2);
            this.Controls.Add(this.buttonC1);
            this.Controls.Add(this.buttonB7);
            this.Controls.Add(this.buttonB6);
            this.Controls.Add(this.buttonB5);
            this.Controls.Add(this.buttonB4);
            this.Controls.Add(this.buttonB3);
            this.Controls.Add(this.buttonB2);
            this.Controls.Add(this.buttonB1);
            this.Controls.Add(this.buttonA7);
            this.Controls.Add(this.buttonA6);
            this.Controls.Add(this.buttonA5);
            this.Controls.Add(this.buttonA4);
            this.Controls.Add(this.buttonA3);
            this.Controls.Add(this.buttonA2);
            this.Controls.Add(this.buttonA1);
            this.Controls.Add(this.groupBoxSelection);
            this.Name = "Form1";
            this.Text = "Form1";
            this.groupBoxSelection.ResumeLayout(false);
            this.groupBoxSelection.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.TextBox textBoxPassengerName;
        private System.Windows.Forms.Label labelPassengerName;
        private System.Windows.Forms.TextBox textBoxSeatNumber;
        private System.Windows.Forms.Label labelSeatNumber;
        private System.Windows.Forms.Button buttonSubmit;
        private System.Windows.Forms.Button buttonReset;
        private System.Windows.Forms.GroupBox groupBoxSelection;
        private System.Windows.Forms.Button buttonA1;
        private System.Windows.Forms.Button buttonA2;
        private System.Windows.Forms.Button buttonA3;
        private System.Windows.Forms.Button buttonA4;
        private System.Windows.Forms.Button buttonA7;
        private System.Windows.Forms.Button buttonA6;
        private System.Windows.Forms.Button buttonA5;
        private System.Windows.Forms.Button buttonB7;
        private System.Windows.Forms.Button buttonB6;
        private System.Windows.Forms.Button buttonB5;
        private System.Windows.Forms.Button buttonB4;
        private System.Windows.Forms.Button buttonB3;
        private System.Windows.Forms.Button buttonB2;
        private System.Windows.Forms.Button buttonB1;
        private System.Windows.Forms.Button buttonC7;
        private System.Windows.Forms.Button buttonC6;
        private System.Windows.Forms.Button buttonC5;
        private System.Windows.Forms.Button buttonC4;
        private System.Windows.Forms.Button buttonC3;
        private System.Windows.Forms.Button buttonC2;
        private System.Windows.Forms.Button buttonC1;
        private System.Windows.Forms.Button buttonD7;
        private System.Windows.Forms.Button buttonD6;
        private System.Windows.Forms.Button buttonD5;
        private System.Windows.Forms.Button buttonD4;
        private System.Windows.Forms.Button buttonD3;
        private System.Windows.Forms.Button buttonD2;
        private System.Windows.Forms.Button buttonD1;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label labelTotal;
    }
}

