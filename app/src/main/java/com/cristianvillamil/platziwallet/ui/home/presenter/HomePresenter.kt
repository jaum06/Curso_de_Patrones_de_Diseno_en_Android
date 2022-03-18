package com.cristianvillamil.platziwallet.ui.home.presenter

import com.cristianvillamil.platziwallet.UserSingleton
import com.cristianvillamil.platziwallet.ui.home.FavoriteTransfer
import com.cristianvillamil.platziwallet.ui.home.HomeContract
import com.cristianvillamil.platziwallet.ui.home.data.HomeInteractor

class HomePresenter(private val view:HomeContract.view): HomeContract.presenter {

    private val homeInteractor:HomeInteractor = HomeInteractor()

    override fun retrieveFavoriteTransfer(){
        view.showLoader()
        homeInteractor.retrieveFavoriteTransferFromCache(object: HomeContract.onResponseCallback{
            override fun onResponse(favoriteList: List<FavoriteTransfer>) {
                UserSingleton.getInstance().userName
                view.hideLoader()
                view.showFavoriteTransfers(favoriteList)
            }

        })
    }


}