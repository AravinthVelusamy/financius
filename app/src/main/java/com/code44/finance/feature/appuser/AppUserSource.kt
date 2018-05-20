package com.code44.finance.feature.appuser

import com.code44.finance.models.AppUser
import com.mvcoding.mvp.DataSource
import com.mvcoding.mvp.data.memoryDataSource
import io.reactivex.Observable

class AppUserSource(getAppUser: () -> Observable<AppUser>) : DataSource<AppUser> {

    private val dataSource = getAppUser().memoryDataSource()

    override fun data(): Observable<AppUser> = dataSource.data()
}