Ext.define('bidsList.store.BidListStore', {
    extend: 'Ext.data.Store',
    requires : [
        'bidsList.model.BidListModel'
    ],
    model: 'bidsList.model.BidListModel',
    autoLoad: true,
    autoSync: true,
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
            writeAllFields: true
        }

    }
});