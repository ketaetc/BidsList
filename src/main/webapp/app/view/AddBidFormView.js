Ext.define('bidsList.view.AddBidFormView', {
    extend: 'Ext.window.Window',
    alias: 'widget.addBidFormView',
    autoShow: true,
    layout: 'fit',
    modal: true,
    items: [
        {
            bodyPadding: 10,
            xtype: 'form',
            items: [
//                {
//                    xtype: 'textfield',
//                    name: 'id',
//                    fieldLabel: 'ID',
//                    allowBlank: false,
//                    regex: /^([0-9]{1,20})*$/,
//                    regexText: 'The identifier must consist of digits!',
//                    blankText: 'This field must not be empty'
//                },
                {
                    xtype: 'textfield',
                    name: 'name',
                    fieldLabel: 'Name',
                    allowBlank: false,
                    blankText: 'This field must not be empty'
                }
            ]
        }
    ],

    buttons: [
        {
            text: 'Save',
            action: 'save',
            disabled: true
        },
        {
            text: 'Cancel',
            handler: function () {
                this.up('window').close();
            }

        }
    ]
});