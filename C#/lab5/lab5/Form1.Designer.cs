namespace lab5
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
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.fileToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.menuToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.exitToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.clearToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.findPriceToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.comboBoxSizes = new System.Windows.Forms.ComboBox();
            this.regularRadio = new System.Windows.Forms.RadioButton();
            this.decafRadio = new System.Windows.Forms.RadioButton();
            this.specialRadio = new System.Windows.Forms.RadioButton();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.labelPrice = new System.Windows.Forms.Label();
            this.labelTotal = new System.Windows.Forms.Label();
            this.exitToolStripMenuItem1 = new System.Windows.Forms.ToolStripMenuItem();
            this.defaultRadio = new System.Windows.Forms.RadioButton();
            this.menuStrip1.SuspendLayout();
            this.groupBox1.SuspendLayout();
            this.SuspendLayout();
            // 
            // menuStrip1
            // 
            this.menuStrip1.ImageScalingSize = new System.Drawing.Size(28, 28);
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.fileToolStripMenuItem,
            this.menuToolStripMenuItem});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Size = new System.Drawing.Size(421, 38);
            this.menuStrip1.TabIndex = 0;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // fileToolStripMenuItem
            // 
            this.fileToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.exitToolStripMenuItem,
            this.clearToolStripMenuItem,
            this.exitToolStripMenuItem1});
            this.fileToolStripMenuItem.Name = "fileToolStripMenuItem";
            this.fileToolStripMenuItem.Size = new System.Drawing.Size(56, 34);
            this.fileToolStripMenuItem.Text = "File";
            // 
            // menuToolStripMenuItem
            // 
            this.menuToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.findPriceToolStripMenuItem});
            this.menuToolStripMenuItem.Name = "menuToolStripMenuItem";
            this.menuToolStripMenuItem.Size = new System.Drawing.Size(79, 34);
            this.menuToolStripMenuItem.Text = "Menu";
            // 
            // exitToolStripMenuItem
            // 
            this.exitToolStripMenuItem.Name = "exitToolStripMenuItem";
            this.exitToolStripMenuItem.Size = new System.Drawing.Size(240, 34);
            this.exitToolStripMenuItem.Text = "Clear";
            this.exitToolStripMenuItem.Click += new System.EventHandler(this.exitToolStripMenuItem_Click);
            // 
            // clearToolStripMenuItem
            // 
            this.clearToolStripMenuItem.Name = "clearToolStripMenuItem";
            this.clearToolStripMenuItem.Size = new System.Drawing.Size(240, 34);
            this.clearToolStripMenuItem.Text = "About";
            this.clearToolStripMenuItem.Click += new System.EventHandler(this.clearToolStripMenuItem_Click);
            // 
            // findPriceToolStripMenuItem
            // 
            this.findPriceToolStripMenuItem.Name = "findPriceToolStripMenuItem";
            this.findPriceToolStripMenuItem.Size = new System.Drawing.Size(240, 34);
            this.findPriceToolStripMenuItem.Text = "Find Price";
            this.findPriceToolStripMenuItem.Click += new System.EventHandler(this.findPriceToolStripMenuItem_Click);
            // 
            // comboBoxSizes
            // 
            this.comboBoxSizes.FormattingEnabled = true;
            this.comboBoxSizes.Items.AddRange(new object[] {
            "1/4 Pound",
            "1/2 Pound",
            "1 Pound"});
            this.comboBoxSizes.Location = new System.Drawing.Point(161, 33);
            this.comboBoxSizes.Name = "comboBoxSizes";
            this.comboBoxSizes.Size = new System.Drawing.Size(144, 32);
            this.comboBoxSizes.TabIndex = 1;
            this.comboBoxSizes.Text = "Size";
            this.comboBoxSizes.SelectedIndexChanged += new System.EventHandler(this.comboBox1_SelectedIndexChanged);
            // 
            // regularRadio
            // 
            this.regularRadio.AutoSize = true;
            this.regularRadio.Location = new System.Drawing.Point(6, 33);
            this.regularRadio.Name = "regularRadio";
            this.regularRadio.Size = new System.Drawing.Size(104, 29);
            this.regularRadio.TabIndex = 2;
            this.regularRadio.TabStop = true;
            this.regularRadio.Text = "Regular";
            this.regularRadio.UseVisualStyleBackColor = true;
            // 
            // decafRadio
            // 
            this.decafRadio.AutoSize = true;
            this.decafRadio.Location = new System.Drawing.Point(6, 69);
            this.decafRadio.Name = "decafRadio";
            this.decafRadio.Size = new System.Drawing.Size(88, 29);
            this.decafRadio.TabIndex = 3;
            this.decafRadio.TabStop = true;
            this.decafRadio.Text = "Decaf";
            this.decafRadio.UseVisualStyleBackColor = true;
            // 
            // specialRadio
            // 
            this.specialRadio.AutoSize = true;
            this.specialRadio.Location = new System.Drawing.Point(6, 105);
            this.specialRadio.Name = "specialRadio";
            this.specialRadio.Size = new System.Drawing.Size(157, 29);
            this.specialRadio.TabIndex = 4;
            this.specialRadio.TabStop = true;
            this.specialRadio.Text = "Special Blend";
            this.specialRadio.UseVisualStyleBackColor = true;
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.defaultRadio);
            this.groupBox1.Controls.Add(this.decafRadio);
            this.groupBox1.Controls.Add(this.specialRadio);
            this.groupBox1.Controls.Add(this.comboBoxSizes);
            this.groupBox1.Controls.Add(this.regularRadio);
            this.groupBox1.Location = new System.Drawing.Point(40, 79);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(321, 159);
            this.groupBox1.TabIndex = 5;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "Choose Your Coffee";
            // 
            // labelPrice
            // 
            this.labelPrice.AutoSize = true;
            this.labelPrice.Location = new System.Drawing.Point(128, 312);
            this.labelPrice.Name = "labelPrice";
            this.labelPrice.Size = new System.Drawing.Size(62, 25);
            this.labelPrice.TabIndex = 6;
            this.labelPrice.Text = "Price:";
            // 
            // labelTotal
            // 
            this.labelTotal.AutoSize = true;
            this.labelTotal.Location = new System.Drawing.Point(196, 312);
            this.labelTotal.Name = "labelTotal";
            this.labelTotal.Size = new System.Drawing.Size(97, 25);
            this.labelTotal.TabIndex = 7;
            this.labelTotal.Text = "labelTotal";
            // 
            // exitToolStripMenuItem1
            // 
            this.exitToolStripMenuItem1.Name = "exitToolStripMenuItem1";
            this.exitToolStripMenuItem1.Size = new System.Drawing.Size(240, 34);
            this.exitToolStripMenuItem1.Text = "Exit";
            this.exitToolStripMenuItem1.Click += new System.EventHandler(this.exitToolStripMenuItem1_Click);
            // 
            // defaultRadio
            // 
            this.defaultRadio.AutoSize = true;
            this.defaultRadio.Location = new System.Drawing.Point(5, 140);
            this.defaultRadio.Name = "defaultRadio";
            this.defaultRadio.Size = new System.Drawing.Size(145, 29);
            this.defaultRadio.TabIndex = 8;
            this.defaultRadio.TabStop = true;
            this.defaultRadio.Text = "defaultRadio";
            this.defaultRadio.UseVisualStyleBackColor = true;
            this.defaultRadio.Visible = false;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(11F, 24F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(421, 379);
            this.Controls.Add(this.labelTotal);
            this.Controls.Add(this.labelPrice);
            this.Controls.Add(this.groupBox1);
            this.Controls.Add(this.menuStrip1);
            this.MainMenuStrip = this.menuStrip1;
            this.Name = "Form1";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Form1";
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem fileToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem exitToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem clearToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem menuToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem findPriceToolStripMenuItem;
        private System.Windows.Forms.ComboBox comboBoxSizes;
        private System.Windows.Forms.RadioButton regularRadio;
        private System.Windows.Forms.RadioButton decafRadio;
        private System.Windows.Forms.RadioButton specialRadio;
        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.Label labelPrice;
        private System.Windows.Forms.Label labelTotal;
        private System.Windows.Forms.ToolStripMenuItem exitToolStripMenuItem1;
        private System.Windows.Forms.RadioButton defaultRadio;
    }
}

