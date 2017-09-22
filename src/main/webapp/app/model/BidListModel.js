Ext.define('bidsList.model.BidListModel', {
    extend: 'Ext.data.Model',
    fields: ['id', 'name'],
    proxy: {
        type: 'rest',
        api: {
            create: 'bid',
            read: 'bid',
            destroy: 'bid',
            update: 'bid'
        },
        reader: {
            type: 'json',
            rootProperty: 'data',
            successProperty: 'success'
        },
        writer: {
            type: 'json',
            writeAllFields: true,
            writeRecordId: false
        }

    }
});