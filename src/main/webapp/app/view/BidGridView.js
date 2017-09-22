Ext.define('bidsList.view.BidGridView', {
    extend: 'Ext.grid.Panel',
    alias: 'widget.bidGridView',
    width: 400,
    height: 300,
    frame: true,
    store: 'BidListStore',
    iconCls: 'icon-user',
    viewConfig:{
        markDirty:false
    },
    columns: [
        {
            text: 'ID',
            flex: 1,
            sortable: true,
            dataIndex: 'id',
            /*editor: {
                xtype:'textfield',
                allowBlank: false,
                regex: /^([0-9]{1,20})*$/,
                regexText: 'The identifier must consist of digits!',
                blankText: 'This field must not be empty'
            }*/
        },
        {
            flex: 2,
            text: 'Name',
            sortable: true,
            dataIndex: 'name',
            editor: {
                xtype:'textfield',
                allowBlank: false,
                blankText: 'This field must not be empty'
            }
        }
    ],
    plugins: [
        Ext.create('Ext.grid.plugin.RowEditing', {
            clicksToEdit: 2,
            saveBtnText: 'Save',
            cancelBtnText: 'Cancel'
        })
    ],
    selType: 'rowmodel',
    dockedItems: [
        {
            xtype: 'toolbar',
            items: [
                {
                    text: 'Add',
                    action: 'add',
                    iconCls: 'icon-add'
                },
                '-',
                {
                    text: 'Remove',
                    action: 'delete',
                    iconCls: 'icon-delete',
                    disabled: true
                }
            ]
        }
    ]
});