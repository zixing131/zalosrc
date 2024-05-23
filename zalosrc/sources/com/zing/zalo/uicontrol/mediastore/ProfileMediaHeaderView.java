package com.zing.zalo.uicontrol.mediastore;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import au.EnumC2369r;
import bo.C3065z2;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import me0.C23212s8;
import me0.C23250w4;
import p262jb.AbstractC21196a;
import p716zh.AbstractC32173x4;

/* loaded from: classes4.dex */
public class ProfileMediaHeaderView extends LinearLayout {

    /* renamed from: p */
    EnumC2369r f83835p;

    /* renamed from: q */
    RobotoTextView f83836q;

    /* renamed from: r */
    public boolean f83837r;

    /* renamed from: s */
    AbstractC32173x4 f83838s;

    public ProfileMediaHeaderView(Context context) {
        super(context);
        this.f83837r = true;
        m88381a(context);
    }

    /* renamed from: a */
    void m88381a(Context context) {
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(AbstractC7409c0.layout_profile_media_photo_header, this);
        this.f83836q = (RobotoTextView) findViewById(AbstractC6918a0.tv_day);
    }

    /* renamed from: b */
    public void m88382b(AbstractC32173x4 abstractC32173x4, boolean z11, C3065z2 c3065z2) {
        int m119607o;
        if (abstractC32173x4 != null) {
            try {
                if (abstractC32173x4.m155148g() != null) {
                    this.f83838s = abstractC32173x4;
                    RobotoTextView robotoTextView = this.f83836q;
                    if (robotoTextView != null) {
                        if (c3065z2 != null) {
                            m119607o = c3065z2.m14739a();
                        } else {
                            m119607o = C23212s8.m119607o(robotoTextView.getContext(), AbstractC21196a.TextColor1);
                        }
                        this.f83836q.setTextColor(m119607o);
                        if (this.f83837r && !TextUtils.isEmpty(abstractC32173x4.m155148g().m155160f())) {
                            this.f83836q.setText(abstractC32173x4.m155148g().m155160f());
                        } else {
                            this.f83836q.setText(C23250w4.m119785D(abstractC32173x4.m155148g().m155156b(), this.f83835p, true));
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public void setHeaderMode(EnumC2369r enumC2369r) {
        this.f83835p = enumC2369r;
    }

    public ProfileMediaHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f83837r = true;
        m88381a(context);
    }
}
