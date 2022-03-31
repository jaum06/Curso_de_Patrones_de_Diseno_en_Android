package com.cristianvillamil.platziwallet.ui.home

import androidx.lifecycle.LiveData

interface HomeContract {

    interface view {
        fun showLoader()
        fun hideLoader()
        fun showFavoriteTransfers(favoriteTransfer: List<FavoriteTransfer>)
    }

    interface presenter {
        fun retrieveFavoriteTransfer()
        fun getPercentageLivedata(): LiveData<String>
    }

    interface onResponseCallback {
        fun onResponse(favoriteList: List<FavoriteTransfer>)
    }
}