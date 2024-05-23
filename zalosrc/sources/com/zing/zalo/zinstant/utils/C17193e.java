package com.zing.zalo.zinstant.utils;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;

/* renamed from: com.zing.zalo.zinstant.utils.e */
/* loaded from: classes7.dex */
public final class C17193e {

    /* renamed from: a */
    public static final C17193e f87755a = new C17193e();

    private C17193e() {
    }

    /* renamed from: a */
    public final void m91802a(View view) {
        AbstractC19074t.m100208f(view, "view");
        try {
            view.clearFocus();
            Object systemService = view.getContext().getSystemService("input_method");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            if (view.getWindowToken() != null) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        } catch (Throwable th2) {
            AbstractC20110a.f98889a.m104564x("ZinstantKeyboard").mo104552e(th2);
        }
    }

    /* renamed from: b */
    public final void m91803b(View view) {
        AbstractC19074t.m100208f(view, "view");
        try {
            view.requestFocus();
            Object systemService = view.getContext().getSystemService("input_method");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput(view, 1);
        } catch (Throwable th2) {
            AbstractC20110a.f98889a.m104564x("ZinstantKeyboard").mo104552e(th2);
        }
    }
}
