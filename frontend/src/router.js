
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderManager from "./components/listers/OrderCards"
import OrderDetail from "./components/listers/OrderDetail"

import OrderspecView from "./components/OrderspecView"
import OrderspecViewDetail from "./components/OrderspecViewDetail"
import PaymentManager from "./components/listers/PaymentCards"
import PaymentDetail from "./components/listers/PaymentDetail"


import OrderprocessManager from "./components/listers/OrderprocessCards"
import OrderprocessDetail from "./components/listers/OrderprocessDetail"

import DeliveryManager from "./components/listers/DeliveryCards"
import DeliveryDetail from "./components/listers/DeliveryDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orders',
                name: 'OrderManager',
                component: OrderManager
            },
            {
                path: '/orders/:id',
                name: 'OrderDetail',
                component: OrderDetail
            },

            {
                path: '/orderspecs',
                name: 'OrderspecView',
                component: OrderspecView
            },
            {
                path: '/orderspecs/:id',
                name: 'OrderspecViewDetail',
                component: OrderspecViewDetail
            },
            {
                path: '/payments',
                name: 'PaymentManager',
                component: PaymentManager
            },
            {
                path: '/payments/:id',
                name: 'PaymentDetail',
                component: PaymentDetail
            },


            {
                path: '/orderprocesses',
                name: 'OrderprocessManager',
                component: OrderprocessManager
            },
            {
                path: '/orderprocesses/:id',
                name: 'OrderprocessDetail',
                component: OrderprocessDetail
            },

            {
                path: '/deliveries',
                name: 'DeliveryManager',
                component: DeliveryManager
            },
            {
                path: '/deliveries/:id',
                name: 'DeliveryDetail',
                component: DeliveryDetail
            },



    ]
})
