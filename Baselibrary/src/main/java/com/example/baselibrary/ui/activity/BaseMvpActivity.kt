package com.example.baselibrary.ui.activity

import com.example.baselibrary.presenter.BasePresenter
import com.example.baselibrary.presenter.view.BaseView

class BaseMvpActivity<presenter : BasePresenter<*>> : BaseActivity(), BaseView {
    override fun showLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}