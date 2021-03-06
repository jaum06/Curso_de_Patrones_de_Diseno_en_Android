package com.cristianvillamil.platziwallet.ui.home

interface HomeContract {

    interface view {
        fun showLoader()
        fun hideLoader()
        fun showFavoriteTransfers(favoriteTransfer: List<FavoriteTransfer>)
    }

    interface presenter {
        fun retrieveFavoriteTransfer()
    }

    interface onResponseCallback {
        fun onResponse(favoriteList: List<FavoriteTransfer>)
    }
}