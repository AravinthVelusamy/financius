package com.code44.finance.feature.splash

import com.code44.finance.models.Error
import com.mvcoding.mvp.Presenter
import com.mvcoding.mvp.behaviors.InitializationBehavior
import io.reactivex.Single

class SplashPresenter(
        getSplashModel: () -> Single<SplashModel>) : Presenter<SplashPresenter.View>(
        InitializationBehavior(getSplashModel, { it. })) {

    interface View : Presenter.View, InitializationBehavior.View<Unit, Unit, Error>
}