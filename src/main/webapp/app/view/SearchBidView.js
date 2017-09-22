Ext.define('bidsList.view.SearchBidView', {
    extend: 'Ext.form.Panel',
    alias: 'widget.searchBidView',
    bodyPadding: 10,
    items: [
        {
            xtype: 'textfield',
            name: 'search',
            fieldLabel: 'Enter id',
            regex: /^([0-9]{1,20})*$/,
            regexText: 'The identifier must consist of digits!',
            maxLength: 200
        }
    ]
});
