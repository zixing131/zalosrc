package com.zing.zalo.connection.state;

import android.content.Context;
import android.util.AttributeSet;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p363nh.C23744a;
import p609wh.AbstractC28998a;
import p681yh.C30981a;
import p681yh.C30983c;
import p681yh.EnumC30982b;

/* loaded from: classes3.dex */
public class ConnectionStateViewForTesting extends RobotoTextView implements C23744a.c, Runnable {
    public ConnectionStateViewForTesting(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public boolean callOnClick() {
        if (C30981a.m150598f().m150606e().f142944a == EnumC30982b.CONNECT_LIMITED) {
            AbstractC28998a.m144876e(getContext());
        }
        return super.callOnClick();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C23744a.m124114c().m124115b(this, 73);
        setEnabled(true);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C23744a.m124114c().m124117e(this, 73);
    }

    @Override // java.lang.Runnable
    public void run() {
        C30983c m150606e = C30981a.m150598f().m150606e();
        if (m150606e.f142944a == EnumC30982b.CONNECTED) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
        setText(m150606e.f142944a.name());
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 != 73) {
            return;
        }
        if (getVisibility() != 0) {
            postDelayed(this, 2000L);
        } else {
            post(this);
        }
    }

    public ConnectionStateViewForTesting(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
