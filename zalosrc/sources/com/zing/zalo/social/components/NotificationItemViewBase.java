package com.zing.zalo.social.components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.zdesign.component.Avatar;
import l30.AbstractC22055v0;
import p266jg.AbstractC21244b;
import p354n3.C23528a;
import p716zh.C32078q7;
import v20.C27484l;
import vg.C28203u6;

/* loaded from: classes5.dex */
public abstract class NotificationItemViewBase extends FrameLayout {

    /* renamed from: p */
    public TextView f54751p;

    /* renamed from: q */
    public Avatar f54752q;

    /* renamed from: r */
    C23528a f54753r;

    /* renamed from: s */
    C27484l.a f54754s;

    public NotificationItemViewBase(Context context) {
        super(context);
        this.f54753r = new C23528a(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m56286a(C32078q7 c32078q7) {
        try {
            if (this.f54752q != null) {
                String m154744G = c32078q7.m154744G();
                if (c32078q7.m154751N()) {
                    this.f54752q.m90482y(AbstractC22055v0.m115116F(m154744G, AbstractC21244b.m110054d(getContext())), AbstractC22055v0.m115115E(m154744G, AbstractC21244b.m110054d(getContext())));
                } else {
                    this.f54752q.m90482y(false, false);
                }
                ContactProfile m141809c = C28203u6.f131407a.m141809c(m154744G);
                if (m141809c != null) {
                    ContactProfile m40356w = ContactProfile.m40356w(m141809c);
                    String m154764u = c32078q7.m154764u();
                    m40356w.f42446v = m154764u;
                    this.f54752q.m90479n(m154764u);
                    return;
                }
                if (!TextUtils.isEmpty(c32078q7.m154764u())) {
                    this.f54752q.m90479n(c32078q7.m154764u());
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void m56287b(C32078q7 c32078q7) {
        try {
            if (this.f54751p != null) {
                CharSequence m154765v = c32078q7.m154765v();
                if (m154765v.length() > 0) {
                    this.f54751p.setVisibility(0);
                    this.f54751p.setText(m154765v);
                } else {
                    this.f54751p.setVisibility(8);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c */
    public void mo56288c() {
    }

    public void setNotiEventListener(C27484l.a aVar) {
        this.f54754s = aVar;
    }
}
