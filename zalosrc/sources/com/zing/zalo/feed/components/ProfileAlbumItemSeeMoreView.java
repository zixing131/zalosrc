package com.zing.zalo.feed.components;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import p649xl.C30150z6;

/* loaded from: classes4.dex */
public final class ProfileAlbumItemSeeMoreView extends FrameLayout {

    /* renamed from: p */
    public C30150z6 f45089p;

    /* renamed from: q */
    private InterfaceC8215a f45090q;

    /* renamed from: com.zing.zalo.feed.components.ProfileAlbumItemSeeMoreView$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8215a {

        /* renamed from: com.zing.zalo.feed.components.ProfileAlbumItemSeeMoreView$a$a */
        /* loaded from: classes4.dex */
        public static final class a {
            /* renamed from: a */
            public static void m44472a(InterfaceC8215a interfaceC8215a) {
            }
        }

        /* renamed from: l0 */
        void mo43429l0();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileAlbumItemSeeMoreView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        m44471d(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m44469c(ProfileAlbumItemSeeMoreView profileAlbumItemSeeMoreView, View view) {
        AbstractC19074t.m100208f(profileAlbumItemSeeMoreView, "this$0");
        InterfaceC8215a interfaceC8215a = profileAlbumItemSeeMoreView.f45090q;
        if (interfaceC8215a != null) {
            interfaceC8215a.mo43429l0();
        }
    }

    /* renamed from: b */
    public final void m44470b() {
        try {
            setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.c7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProfileAlbumItemSeeMoreView.m44469c(ProfileAlbumItemSeeMoreView.this, view);
                }
            });
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: d */
    public final void m44471d(Context context) {
        AbstractC19074t.m100208f(context, "context");
        try {
            C30150z6 m148775b = C30150z6.m148775b(LayoutInflater.from(context), this);
            AbstractC19074t.m100207e(m148775b, "inflate(...)");
            setBinding(m148775b);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    public final C30150z6 getBinding() {
        C30150z6 c30150z6 = this.f45089p;
        if (c30150z6 != null) {
            return c30150z6;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    public final InterfaceC8215a getProfileAlbumItemSeeMoreViewListener() {
        return this.f45090q;
    }

    public final void setBinding(C30150z6 c30150z6) {
        AbstractC19074t.m100208f(c30150z6, "<set-?>");
        this.f45089p = c30150z6;
    }

    public final void setProfileAlbumItemSeeMoreViewListener(InterfaceC8215a interfaceC8215a) {
        this.f45090q = interfaceC8215a;
    }
}
