package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import au.C2343e;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.uicontrol.CircleImage;
import dj.C17945a0;
import me0.AbstractC23028c0;
import me0.C23278z2;
import p348mi.C23302b;
import p354n3.C23528a;
import vg.C28203u6;

/* loaded from: classes6.dex */
public class StickyNotiLiveStreamingBar extends RelativeLayout {

    /* renamed from: p */
    private CircleImage f69763p;

    /* renamed from: q */
    private RobotoTextView f69764q;

    /* renamed from: r */
    private RobotoTextView f69765r;

    /* renamed from: s */
    private C23528a f69766s;

    public StickyNotiLiveStreamingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m75933b(context);
    }

    /* renamed from: b */
    private void m75933b(Context context) {
        try {
            LayoutInflater.from(context).inflate(AbstractC7409c0.sticky_noti_live_streaming_bar, this);
            this.f69766s = new C23528a(context);
            this.f69763p = (CircleImage) findViewById(AbstractC6918a0.imvAvatar);
            this.f69764q = (RobotoTextView) findViewById(AbstractC6918a0.tv_name);
            this.f69765r = (RobotoTextView) findViewById(AbstractC6918a0.btn_join);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m75934a(C17945a0 c17945a0, View.OnClickListener onClickListener) {
        if (c17945a0 == null) {
            return;
        }
        try {
            ContactProfile m141809c = C28203u6.f131407a.m141809c(c17945a0.m94862C4());
            String str = m141809c.f42446v;
            if (!TextUtils.isEmpty(str) && !str.equalsIgnoreCase("null")) {
                if (C23302b.f113247a.m120523d(str)) {
                    int m12307a = C2343e.m12307a(m141809c.f42434r, false);
                    this.f69763p.setImageDrawable(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(m141809c.m40383Q(true, false)), m12307a));
                } else {
                    ((C23528a) this.f69766s.m123612r(this.f69763p)).m123618x(str, C23278z2.m120145o());
                }
            }
            String m40383Q = m141809c.m40383Q(true, false);
            RobotoTextView robotoTextView = this.f69764q;
            if (robotoTextView != null) {
                robotoTextView.setText(m40383Q);
            }
            this.f69765r.setOnClickListener(onClickListener);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
