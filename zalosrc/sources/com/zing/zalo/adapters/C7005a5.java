package com.zing.zalo.adapters;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.AbstractC1602t;
import androidx.recyclerview.widget.RecyclerView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactMask;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23268y2;
import p461qu.AbstractC25495a;
import vg.C28203u6;

/* renamed from: com.zing.zalo.adapters.a5 */
/* loaded from: classes3.dex */
public class C7005a5 extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private List f38318r;

    /* renamed from: s */
    private String f38319s = "";

    /* renamed from: t */
    public boolean f38320t = false;

    /* renamed from: u */
    public boolean f38321u = false;

    /* renamed from: com.zing.zalo.adapters.a5$a */
    /* loaded from: classes3.dex */
    public interface a {
    }

    /* renamed from: com.zing.zalo.adapters.a5$b */
    /* loaded from: classes3.dex */
    public class b extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        public GroupAvatarView f38322I;

        /* renamed from: J */
        public RecyclingImageView f38323J;

        /* renamed from: K */
        public RecyclingImageView f38324K;

        /* renamed from: L */
        public RecyclingImageView f38325L;

        /* renamed from: M */
        public RecyclingImageView f38326M;

        public b(FrameLayout frameLayout) {
            super(frameLayout);
            int i11;
            int i12;
            Context context = frameLayout.getContext();
            GroupAvatarView groupAvatarView = new GroupAvatarView(context);
            this.f38322I = groupAvatarView;
            groupAvatarView.setImageDrawable(AbstractC23136l9.m118665N(context, AbstractC16803z.default_avatar2));
            RecyclingImageView recyclingImageView = new RecyclingImageView(context);
            this.f38323J = recyclingImageView;
            recyclingImageView.setImageDrawable(AbstractC23136l9.m118665N(context, AbstractC16803z.default_avatar2));
            if (C7005a5.this.f38320t) {
                i11 = 36;
            } else {
                i11 = 48;
            }
            int m118742r = AbstractC23136l9.m118742r(i11 + 3);
            float f11 = i11;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m118742r, AbstractC23136l9.m118742r(f11));
            layoutParams.rightMargin = AbstractC23136l9.m118742r(12.0f);
            frameLayout.setLayoutParams(layoutParams);
            frameLayout.addView(this.f38322I, new FrameLayout.LayoutParams(AbstractC23136l9.m118742r(f11), AbstractC23136l9.m118742r(f11)));
            frameLayout.addView(this.f38323J, new FrameLayout.LayoutParams(AbstractC23136l9.m118742r(f11), AbstractC23136l9.m118742r(f11)));
            RecyclingImageView recyclingImageView2 = new RecyclingImageView(frameLayout.getContext());
            this.f38326M = recyclingImageView2;
            recyclingImageView2.setVisibility(8);
            if (C7005a5.this.f38320t) {
                i12 = 12;
            } else {
                i12 = 16;
            }
            float f12 = i12;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(AbstractC23136l9.m118742r(f12), AbstractC23136l9.m118742r(f12));
            layoutParams2.gravity = AbstractC1602t.m8182b(8388613, frameLayout.getLayoutDirection()) | 80;
            frameLayout.addView(this.f38326M, layoutParams2);
            this.f38324K = new RecyclingImageView(context);
            ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(AbstractC23136l9.m118742r(f11), AbstractC23136l9.m118742r(f11));
            this.f38324K.setImageResource(AbstractC16803z.roundedcorneredview_bbv_avt_selected);
            this.f38324K.setVisibility(8);
            frameLayout.addView(this.f38324K, layoutParams3);
            this.f38325L = new RecyclingImageView(context);
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(AbstractC23136l9.m118742r(18.0f), AbstractC23136l9.m118742r(18.0f));
            layoutParams4.gravity = 53;
            this.f38325L.setImageDrawable(AbstractC23136l9.m118665N(context, AbstractC16803z.icn_remove));
            this.f38325L.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            this.f38325L.setVisibility(C7005a5.this.f38321u ? 0 : 8);
            frameLayout.addView(this.f38325L, layoutParams4);
            if (C7005a5.this.f38321u) {
                C7005a5.m35845L(C7005a5.this);
            }
        }
    }

    /* renamed from: L */
    static /* bridge */ /* synthetic */ a m35845L(C7005a5 c7005a5) {
        c7005a5.getClass();
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        b bVar = (b) abstractC1876c0;
        InviteContactProfile inviteContactProfile = (InviteContactProfile) this.f38318r.get(i11);
        if (!inviteContactProfile.m40374K0() && TextUtils.isEmpty(inviteContactProfile.f42446v)) {
            bVar.f38322I.setVisibility(8);
            bVar.f38323J.setVisibility(0);
            inviteContactProfile.m40486v1(bVar.f38323J);
        } else {
            bVar.f38322I.setVisibility(0);
            bVar.f38323J.setVisibility(8);
            InviteContactMask inviteContactMask = inviteContactProfile.f42540d2;
            if (inviteContactMask != null && inviteContactMask.f42537s == 3) {
                bVar.f38322I.setImageResource(AbstractC16803z.default_avatar2);
            } else {
                AbstractC23268y2.m120027a(bVar.f38322I, inviteContactProfile, false);
            }
        }
        if (!TextUtils.isEmpty(this.f38319s) && (TextUtils.equals(this.f38319s, inviteContactProfile.f42434r) || TextUtils.equals(this.f38319s, inviteContactProfile.f42455y))) {
            bVar.f38324K.setVisibility(0);
        } else {
            bVar.f38324K.setVisibility(8);
        }
        ContactProfile m141811g = C28203u6.f131407a.m141811g(inviteContactProfile.f42434r);
        if ((m141811g == null || !m141811g.m40359B0()) && !AbstractC25495a.m132078c(inviteContactProfile.f42434r) && !AbstractC25495a.m132086k(inviteContactProfile.f42434r)) {
            bVar.f38326M.setVisibility(8);
        } else {
            bVar.f38326M.setImageResource(AbstractC16803z.ic_oa_verify);
            bVar.f38326M.setVisibility(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        return new b(new FrameLayout(viewGroup.getContext()));
    }

    /* renamed from: M */
    public void m35846M(List list) {
        this.f38318r = new ArrayList(list);
    }

    /* renamed from: N */
    public void m35847N(String str) {
        this.f38319s = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        List list = this.f38318r;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
