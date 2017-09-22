Ext.application({
    name: 'bidsList',

    views: [
        'AddBidFormView',
        'BidListView',
        'BidGridView',
        'SearchBidView'
    ],

    controllers : [
        'BidListController'
    ],

    stores : [
        'BidListStore'
    ],

    launch: function () {
        Ext.create('Ext.container.Viewport', {
            layout: 'fit',
            items: {
                xtype  : 'bidListView'
            }
        });
    }
});