package kr.kro.fatcats.sdkversiontest

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.DialogFragment
import javax.annotation.OverridingMethodsMustInvokeSuper

open class BaseDialogFragment : DialogFragment() {

    /*
* Lifecycle
* */
    @OverridingMethodsMustInvokeSuper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("onCreate", javaClass.simpleName)
    }



    @OverridingMethodsMustInvokeSuper
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("onViewCreated", javaClass.simpleName)
    }

    @OverridingMethodsMustInvokeSuper
    override fun onStart() {
        super.onStart()
        Log.e("onStart", javaClass.simpleName)
    }

    @OverridingMethodsMustInvokeSuper
    override fun onResume() {
        super.onResume()
        Log.e("onResume", javaClass.simpleName)

    }

    @OverridingMethodsMustInvokeSuper
    override fun onPause() {
        super.onPause()
        Log.e("onPause", javaClass.simpleName)
    }

    @OverridingMethodsMustInvokeSuper
    override fun onStop() {
        super.onStop()
        Log.e("onStop", javaClass.simpleName)
    }

    @OverridingMethodsMustInvokeSuper
    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("onDestroyView", javaClass.simpleName)
    }

    @OverridingMethodsMustInvokeSuper
    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroy", javaClass.simpleName)
    }
}