package com.zing.zalo.feed.components;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import ao.InterfaceC2259a;
import bo.C3000l0;
import bo.C3020p0;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;

/* loaded from: classes4.dex */
public class FeedItemAsyncFail extends LinearLayout {

    /* renamed from: p */
    private RobotoTextView f44265p;

    public FeedItemAsyncFail(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m43654b(context);
    }

    /* renamed from: b */
    private void m43654b(Context context) {
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(AbstractC7409c0.feed_item_async_fail_content, this);
        this.f44265p = (RobotoTextView) findViewById(AbstractC6918a0.tvFail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m43655c(InterfaceC2259a interfaceC2259a, C3000l0 c3000l0, View view) {
        if (interfaceC2259a != null) {
            try {
                C3020p0 m14322a0 = c3000l0.m14322a0();
                Bundle bundle = new Bundle();
                bundle.putString("fid", m14322a0.f12057p);
                bundle.putString("ownerId", m14322a0.f12022B.f12280b);
                bundle.putInt("fromSrc", 10);
                bundle.putBoolean("specialToShowPassCodeScreen", true);
                interfaceC2259a.mo11937Tu(bundle);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    public void m43656d(final C3000l0 c3000l0, final InterfaceC2259a interfaceC2259a) {
        this.f44265p.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedItemAsyncFail.m43655c(InterfaceC2259a.this, c3000l0, view);
            }
        });
    }
}
