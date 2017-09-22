Ext.define('bidsList.view.BidListView', {
    extend: 'Ext.panel.Panel',
    width: 500,
    height: 360,
    padding: 10,
    alias: 'widget.bidListView',
    layout: 'border',
    title: 'Bids List',
    items: [
        {
            xtype: 'bidGridView',
            region: 'center'
        },
        {
            xtype: 'searchBidView',
            title: 'Search',
            region: 'south',
            width: 300,
            collapsible: true,
            collapsed: true
        }
    ],
    renderTo: Ext.getBody()
});