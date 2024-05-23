package com.zing.zalo.adapters;

import am.AbstractC0906d0;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import au.C2343e;
import com.zing.p058v4.view.AbstractC6881a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.ContentMessagePopup;
import com.zing.zalo.p077ui.MessagePopupActivity;
import com.zing.zalo.p077ui.widget.AvatarImageView;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalocore.CoreUtility;
import java.util.ArrayList;
import me0.AbstractC23028c0;
import me0.AbstractC23152n3;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23304d;
import p348mi.C23302b;
import p354n3.C23528a;
import p716zh.C31901e8;
import v50.C27870vb;

/* renamed from: com.zing.zalo.adapters.i5 */
/* loaded from: classes3.dex */
public class C7096i5 extends AbstractC6881a {

    /* renamed from: r */
    ArrayList f38788r;

    /* renamed from: s */
    public Activity f38789s;

    /* renamed from: t */
    public LayoutInflater f38790t;

    /* renamed from: u */
    C23528a f38791u;

    /* renamed from: com.zing.zalo.adapters.i5$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public AvatarImageView f38792a;

        /* renamed from: b */
        public TextView f38793b;

        /* renamed from: c */
        public TextView f38794c;

        /* renamed from: d */
        public TextView f38795d;

        /* renamed from: e */
        public RelativeLayout f38796e;
    }

    public C7096i5(Activity activity, ArrayList arrayList, C23528a c23528a) {
        this.f38789s = activity;
        this.f38791u = c23528a;
        this.f38788r = new ArrayList(arrayList);
        this.f38790t = (LayoutInflater) activity.getSystemService("layout_inflater");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m36176x(ContentMessagePopup contentMessagePopup, View view) {
        ContactProfile contactProfile = new ContactProfile(contentMessagePopup.f42518p);
        contactProfile.f42437s = contentMessagePopup.f42519q;
        contactProfile.f42446v = contentMessagePopup.f42522t;
        contactProfile.m40421o1(contentMessagePopup.f42521s);
        contactProfile.m40401d1(contentMessagePopup.f42520r);
        if (TextUtils.isEmpty(contentMessagePopup.f42518p)) {
            MessagePopupActivity.m56884o5(false);
            AbstractC23304d.f113350Y0 = System.currentTimeMillis();
            this.f38789s.finish();
        } else {
            Bundle m140776b = new C27870vb(contactProfile.mo2478b()).m140780g(contactProfile).m140776b();
            MessagePopupActivity.m56884o5(false);
            AbstractC23304d.f113350Y0 = System.currentTimeMillis();
            this.f38789s.startActivity(AbstractC23152n3.m119002J(m140776b));
            this.f38789s.finish();
        }
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: d */
    public void mo35332d(ViewGroup viewGroup, int i11, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: g */
    public int mo35335g() {
        ArrayList arrayList = this.f38788r;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: k */
    public Object mo35339k(ViewGroup viewGroup, int i11) {
        String m114542i;
        View view = null;
        try {
            a aVar = new a();
            view = this.f38790t.inflate(AbstractC7409c0.popupmsg_suggest_item, (ViewGroup) null);
            aVar.f38796e = (RelativeLayout) view.findViewById(AbstractC6918a0.layoutPopupMsg);
            aVar.f38792a = (AvatarImageView) view.findViewById(AbstractC6918a0.buddy_dp);
            aVar.f38795d = (TextView) view.findViewById(AbstractC6918a0.phone_number);
            aVar.f38793b = (TextView) view.findViewById(AbstractC6918a0.contentMessage);
            aVar.f38794c = (TextView) view.findViewById(AbstractC6918a0.name);
            view.setTag(aVar);
            aVar.f38792a.setImageResource(AbstractC16803z.avatar_grpinvite);
            final ContentMessagePopup contentMessagePopup = (ContentMessagePopup) this.f38788r.get(i11);
            if (contentMessagePopup != null) {
                if (contentMessagePopup.f42528z) {
                    C31901e8 m2800f = AbstractC0906d0.m2800f(MainApplication.getAppContext(), contentMessagePopup.f42526x);
                    if (m2800f != null && !TextUtils.isEmpty(m2800f.m153295h())) {
                        m114542i = m2800f.m153295h();
                    } else {
                        m114542i = contentMessagePopup.f42519q;
                    }
                } else {
                    m114542i = AbstractC21935u.m114542i(contentMessagePopup.f42518p, contentMessagePopup.f42519q);
                }
                if (!TextUtils.isEmpty(contentMessagePopup.f42522t)) {
                    if (C23302b.f113247a.m120523d(contentMessagePopup.f42522t) && !CoreUtility.f89233i.equals(contentMessagePopup.f42518p)) {
                        aVar.f38792a.setImageDrawable(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(m114542i), C2343e.m12307a(contentMessagePopup.f42518p, false)));
                    } else {
                        ((C23528a) this.f38791u.m123612r(aVar.f38792a)).m123618x(contentMessagePopup.f42522t, C23278z2.m120143n());
                    }
                }
                aVar.f38794c.setText(m114542i);
                aVar.f38795d.setText(this.f38789s.getString(AbstractC8020f0.find_friend_by_phone_number) + contentMessagePopup.f42526x);
                aVar.f38793b.setText(contentMessagePopup.f42520r);
                aVar.f38796e.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.h5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C7096i5.this.m36176x(contentMessagePopup, view2);
                    }
                });
                viewGroup.addView(view, -1, -1);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("", e11);
        }
        return view;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: l */
    public boolean mo35340l(View view, Object obj) {
        return view == obj;
    }

    /* renamed from: y */
    public void m36177y(ArrayList arrayList) {
        this.f38788r = new ArrayList(arrayList);
    }
}
