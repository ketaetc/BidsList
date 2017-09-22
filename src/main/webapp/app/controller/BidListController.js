Ext.define('bidsList.controller.BidListController', {
    extend: 'Ext.app.Controller',

    refs: [
        {selector: 'bidGridView',
            ref: 'bidGridView'},
        {selector: 'bidGridView button[action="add"]',
            ref: 'bidGridAdd'},
        {selector: 'bidGridView button[action="delete"]',
            ref: 'bidGridDelete'},
        {selector: 'searchBidView button[action="search"]',
            ref: 'searchBid'},
        {selector: 'addBidFormView',
            ref: 'addBidFormView'},
        {selector: 'bidListView',
            ref: 'bidListView'},
        {selector: 'addBidFormView textfield[name=id] ',
            ref: 'addBidFormId'},
        {selector: 'addBidFormView textfield[name=name]',
            ref: 'addBidFormName'},
        {selector: 'addBidFormView button[action=save]',
            ref: 'addBidFormSave'}
    ],

    init: function () {
        this.control({
            'bidGridView  button[action=add]': {
                click: this.onAddBid
            },
            'bidGridView  button[action=delete]': {
                click: this.onDelBid
            },
            'searchBidView  textfield[name="search"]': {
                change: this.onChangeText
            },
            'bidGridView': {
                cellclick: this.onLineGrid
            },
            'addBidFormView  button[action=save]': {
                click: this.onSaveBid
            },
            'addBidFormView  textfield[name=id]': {
                change: this.onValidation
            },
            'addBidFormView  textfield[name=name]': {
                change: this.onValidation
            }
        });
    },

    onSaveBid: function (button) {
        var me = this;
        var bidModel = Ext.create('bidsList.model.BidListModel');
        bidModel.set(this.getAddBidFormView().down('form').getValues());
        bidModel.save({
            success: function (operation, response) {
                var objAjax = operation.data;
                Ext.getStore('BidListStore').add(objAjax);
                me.getAddBidFormView().close();
            },
//            failure: function (dummy, result) {
//                Ext.MessageBox.show({
//                    title: 'Duplicate found!',
//                    msg: 'Object with same id found!',
//                    buttons: Ext.Msg.OK,
//                    icon: Ext.Msg.ERROR
//                });
//            }

        });
    },

    onAddBid: function () {
        Ext.widget('addBidFormView');
    },

    onDelBid: function () {
        var sm = this.getBidGridView().getSelectionModel();
        var rs = sm.getSelection();

        this.getBidGridView().store.remove(rs[0]);
        this.getBidGridView().store.commitChanges();
        this.getBidGridDelete().disable();
    },

    onChangeText: function () {
        Ext.getStore('BidListStore').load({
            params: {
                search: this.getBidListView().down('searchBidView').getValues()
            }
        });
    },

    onLineGrid: function () {
        this.getBidGridDelete().enable();
    },

    onValidation: function () {
        if (/*this.getAddBidFormId().validate() && */this.getAddBidFormName().validate()) {
            this.getAddBidFormSave().enable();
        } else {
            this.getAddBidFormSave().disable();
        }
    }

});