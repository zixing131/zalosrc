package com.zing.zalo.feed.mvp.album;

import ae.C0766k;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.C1923p;
import androidx.recyclerview.widget.RecyclerView;
import bo.C2974g;
import bo.C2989j;
import bo.C2999l;
import bo.C3004m;
import bo.C3054x;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.feed.mvp.album.ProfileAlbumThemePickerControl;
import com.zing.zalo.feed.mvp.profile.model.ProfileAlbumThemeCollection;
import com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem;
import com.zing.zalo.feed.mvp.profile.model.theme.ThemeItem;
import com.zing.zalo.feed.uicontrols.FeedRecyclerView;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import com.zing.zalo.zview.animation.AnimationTarget;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23222t7;
import me0.C23250w4;
import org.json.JSONObject;
import p187gk.C19464a;
import p489rn.C25845a;
import p649xl.C30119x9;

/* loaded from: classes4.dex */
public final class ProfileAlbumThemePickerControl extends RelativeLayout {

    /* renamed from: A */
    private boolean f46112A;

    /* renamed from: B */
    private boolean f46113B;

    /* renamed from: p */
    private NoPredictiveItemAnimLinearLayoutMngr f46114p;

    /* renamed from: q */
    private boolean f46115q;

    /* renamed from: r */
    private final Handler f46116r;

    /* renamed from: s */
    private C25845a f46117s;

    /* renamed from: t */
    private C30119x9 f46118t;

    /* renamed from: u */
    private final List f46119u;

    /* renamed from: v */
    private ThemeItem f46120v;

    /* renamed from: w */
    private InterfaceC8525a f46121w;

    /* renamed from: x */
    private String f46122x;

    /* renamed from: y */
    private boolean f46123y;

    /* renamed from: z */
    private ProfileAlbumThemeCollection f46124z;

    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumThemePickerControl$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8525a {

        /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumThemePickerControl$a$a */
        /* loaded from: classes4.dex */
        public static final class a {
            /* renamed from: a */
            public static void m45432a(InterfaceC8525a interfaceC8525a) {
            }
        }

        /* renamed from: L1 */
        void mo45407L1();

        /* renamed from: N2 */
        void mo45408N2(ThemeItem themeItem);

        /* renamed from: V0 */
        void mo45409V0(ThemeItem themeItem);

        /* renamed from: g2 */
        void mo45410g2(ThemeItem themeItem);

        /* renamed from: v */
        void mo45411v(boolean z11);
    }

    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumThemePickerControl$b */
    /* loaded from: classes4.dex */
    public static final class C8526b implements InterfaceC20094a {
        C8526b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m45434d(ProfileAlbumThemePickerControl profileAlbumThemePickerControl) {
            AbstractC19074t.m100208f(profileAlbumThemePickerControl, "this$0");
            if (profileAlbumThemePickerControl.getRandomPickTheme()) {
                profileAlbumThemePickerControl.m45424e(profileAlbumThemePickerControl.getProfileAlbumThemeCollection().randomizeTheme());
            } else {
                profileAlbumThemePickerControl.m45424e(profileAlbumThemePickerControl.getProfileAlbumThemeCollection().getTheme(profileAlbumThemePickerControl.getSelectedTheme().getId()));
            }
            InterfaceC8525a themePickerCallback = profileAlbumThemePickerControl.getThemePickerCallback();
            if (themePickerCallback != null) {
                themePickerCallback.mo45409V0(profileAlbumThemePickerControl.getSelectedTheme());
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "p0");
            ProfileAlbumThemePickerControl.this.setGettingListTheme(false);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "p0");
            ProfileAlbumThemePickerControl.this.setGettingListTheme(false);
            JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
            if (optJSONObject != null) {
                final ProfileAlbumThemePickerControl profileAlbumThemePickerControl = ProfileAlbumThemePickerControl.this;
                String userId = profileAlbumThemePickerControl.getUserId();
                String jSONObject = optJSONObject.toString();
                AbstractC19074t.m100207e(jSONObject, "toString(...)");
                C19464a.m101789h(userId, jSONObject, 5);
                ProfileAlbumThemeCollection.C8667a c8667a = ProfileAlbumThemeCollection.Companion;
                String jSONObject2 = optJSONObject.toString();
                AbstractC19074t.m100207e(jSONObject2, "toString(...)");
                profileAlbumThemePickerControl.setProfileAlbumThemeCollection(c8667a.m46314b(jSONObject2));
                profileAlbumThemePickerControl.getHandlerUI().post(new Runnable() { // from class: co.f0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ProfileAlbumThemePickerControl.C8526b.m45434d(ProfileAlbumThemePickerControl.this);
                    }
                });
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumThemePickerControl$c */
    /* loaded from: classes4.dex */
    public static final class C8527c implements C25845a.a {
        C8527c() {
        }

        @Override // com.zing.zalo.feed.components.AlbumRowInputDescView.InterfaceC8062a
        /* renamed from: V3 */
        public void mo43421V3(String str) {
            C25845a.a.C32968a.m133307i(this, str);
        }

        @Override // com.zing.zalo.feed.components.ProfileAlbumItemCreateSquareView.InterfaceC8214a
        /* renamed from: X0 */
        public void mo43422X0() {
            C25845a.a.C32968a.m133303e(this);
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewThemeView.InterfaceC8069a
        /* renamed from: a */
        public void mo43423a(C2999l c2999l) {
            AbstractC19074t.m100208f(c2999l, "albumRowPreviewThemeData");
            C25845a.a.C32968a.m133300b(this, c2999l);
            ProfileAlbumThemePickerControl profileAlbumThemePickerControl = ProfileAlbumThemePickerControl.this;
            profileAlbumThemePickerControl.m45424e(profileAlbumThemePickerControl.getProfileAlbumThemeCollection().getTheme(c2999l.m14237a()));
            InterfaceC8525a themePickerCallback = ProfileAlbumThemePickerControl.this.getThemePickerCallback();
            if (themePickerCallback != null) {
                themePickerCallback.mo45410g2(ProfileAlbumThemePickerControl.this.getSelectedTheme());
            }
            InterfaceC8525a themePickerCallback2 = ProfileAlbumThemePickerControl.this.getThemePickerCallback();
            if (themePickerCallback2 != null) {
                themePickerCallback2.mo45409V0(ProfileAlbumThemePickerControl.this.getSelectedTheme());
            }
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewAlbumView.InterfaceC8066a
        /* renamed from: b */
        public void mo43424b(C2989j c2989j) {
            C25845a.a.C32968a.m133299a(this, c2989j);
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewGridView.InterfaceC8067a
        /* renamed from: c */
        public void mo43425c(AnimationTarget animationTarget, ItemAlbumMobile itemAlbumMobile, int i11) {
            C25845a.a.C32968a.m133309k(this, animationTarget, itemAlbumMobile, i11);
        }

        @Override // com.zing.zalo.feed.components.AlbumRowSelectInfoView.InterfaceC8070a
        /* renamed from: d */
        public void mo43426d(C3004m c3004m) {
            C25845a.a.C32968a.m133301c(this, c3004m);
        }

        @Override // com.zing.zalo.feed.components.AlbumItemSquareView.InterfaceC8052a
        /* renamed from: f */
        public void mo43406f(ProfilePreviewAlbumItem profilePreviewAlbumItem) {
            C25845a.a.C32968a.m133311m(this, profilePreviewAlbumItem);
        }

        @Override // com.zing.zalo.feed.components.AlbumItemSquareView.InterfaceC8052a
        /* renamed from: g */
        public void mo43407g(ProfilePreviewAlbumItem profilePreviewAlbumItem) {
            C25845a.a.C32968a.m133306h(this, profilePreviewAlbumItem);
        }

        @Override // com.zing.zalo.feed.components.AlbumRowCreateAlbumView.InterfaceC8061a
        /* renamed from: h */
        public void mo43427h() {
            C25845a.a.C32968a.m133302d(this);
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewGridView.InterfaceC8067a
        /* renamed from: i */
        public void mo43428i(int i11) {
            C25845a.a.C32968a.m133312n(this, i11);
        }

        @Override // com.zing.zalo.feed.components.ProfileAlbumItemSeeMoreView.InterfaceC8215a
        /* renamed from: l0 */
        public void mo43429l0() {
            C25845a.a.C32968a.m133305g(this);
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewGridView.InterfaceC8067a
        /* renamed from: n1 */
        public void mo43430n1() {
            C25845a.a.C32968a.m133304f(this);
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewGridView.InterfaceC8067a
        /* renamed from: r2 */
        public void mo43431r2() {
            C25845a.a.C32968a.m133310l(this);
        }

        @Override // com.zing.zalo.feed.components.EmptyContentView.InterfaceC8078a
        /* renamed from: s */
        public void mo43432s(C3054x c3054x) {
            AbstractC19074t.m100208f(c3054x, "emptyContentData");
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewGridView.InterfaceC8067a
        /* renamed from: x1 */
        public void mo43433x1() {
            C25845a.a.C32968a.m133313o(this);
        }

        @Override // com.zing.zalo.feed.components.AlbumRowInputTitleView.InterfaceC8064a
        /* renamed from: z2 */
        public void mo43434z2(String str) {
            C25845a.a.C32968a.m133308j(this, str);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumThemePickerControl$d */
    /* loaded from: classes4.dex */
    public static final class C8528d extends RecyclerView.AbstractC1887n {

        /* renamed from: a */
        final /* synthetic */ C30119x9 f46127a;

        C8528d(C30119x9 c30119x9) {
            this.f46127a = c30119x9;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            super.mo10066g(rect, view, recyclerView, c1899z);
            if (this.f46127a.f139931u.m9817A0(view) == 0) {
                int i11 = AbstractC23222t7.f112586t;
                rect.left = i11;
                rect.right = i11;
                return;
            }
            rect.right = AbstractC23222t7.f112586t;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumThemePickerControl$e */
    /* loaded from: classes4.dex */
    public static final class C8529e implements FeedRecyclerView.InterfaceC8863b {
        C8529e() {
        }

        @Override // com.zing.zalo.feed.uicontrols.FeedRecyclerView.InterfaceC8863b
        /* renamed from: a */
        public void mo43265a() {
            InterfaceC8525a themePickerCallback = ProfileAlbumThemePickerControl.this.getThemePickerCallback();
            if (themePickerCallback != null) {
                themePickerCallback.mo45411v(false);
            }
        }

        @Override // com.zing.zalo.feed.uicontrols.FeedRecyclerView.InterfaceC8863b
        /* renamed from: b */
        public void mo43266b() {
            InterfaceC8525a themePickerCallback = ProfileAlbumThemePickerControl.this.getThemePickerCallback();
            if (themePickerCallback != null) {
                themePickerCallback.mo45411v(true);
            }
        }

        @Override // com.zing.zalo.feed.uicontrols.FeedRecyclerView.InterfaceC8863b
        /* renamed from: c */
        public void mo43267c() {
            InterfaceC8525a themePickerCallback = ProfileAlbumThemePickerControl.this.getThemePickerCallback();
            if (themePickerCallback != null) {
                themePickerCallback.mo45411v(true);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumThemePickerControl$f */
    /* loaded from: classes4.dex */
    public static final class C8530f extends C1923p {
        C8530f(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C1923p
        /* renamed from: B */
        protected int mo10618B() {
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.C1923p
        /* renamed from: x */
        public int mo10624x(int i11) {
            return 70;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileAlbumThemePickerControl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f46116r = new Handler(Looper.getMainLooper());
        this.f46119u = new ArrayList();
        this.f46120v = ThemeItem.Companion.m46365a();
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        this.f46122x = str;
        this.f46124z = ProfileAlbumThemeCollection.Companion.m46313a();
        m45428l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m45417f(ProfileAlbumThemePickerControl profileAlbumThemePickerControl) {
        AbstractC19074t.m100208f(profileAlbumThemePickerControl, "this$0");
        profileAlbumThemePickerControl.m45425g();
    }

    /* renamed from: i */
    private final void m45418i(List list) {
        C25845a c25845a = this.f46117s;
        C25845a c25845a2 = null;
        if (c25845a == null) {
            AbstractC19074t.m100223u("adapter");
            c25845a = null;
        }
        c25845a.m133297O(list);
        C25845a c25845a3 = this.f46117s;
        if (c25845a3 == null) {
            AbstractC19074t.m100223u("adapter");
        } else {
            c25845a2 = c25845a3;
        }
        c25845a2.m10008p();
    }

    /* renamed from: k */
    private final void m45419k() {
        this.f46119u.clear();
        Iterator it = this.f46124z.getThemes().iterator();
        while (it.hasNext()) {
            this.f46119u.add(C2974g.a.Companion.m14108i(m45426h((ThemeItem) it.next())));
        }
        m45418i(this.f46119u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m45420m(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final void m45421n(ProfileAlbumThemePickerControl profileAlbumThemePickerControl, View view) {
        AbstractC19074t.m100208f(profileAlbumThemePickerControl, "this$0");
        InterfaceC8525a interfaceC8525a = profileAlbumThemePickerControl.f46121w;
        if (interfaceC8525a != null) {
            interfaceC8525a.mo45407L1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final void m45422p(ProfileAlbumThemePickerControl profileAlbumThemePickerControl, View view) {
        AbstractC19074t.m100208f(profileAlbumThemePickerControl, "this$0");
        InterfaceC8525a interfaceC8525a = profileAlbumThemePickerControl.f46121w;
        if (interfaceC8525a != null) {
            interfaceC8525a.mo45408N2(profileAlbumThemePickerControl.f46120v);
        }
    }

    /* renamed from: u */
    private final void m45423u(int i11) {
        C8530f c8530f = new C8530f(getContext());
        c8530f.m10244p(i11);
        NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = this.f46114p;
        if (noPredictiveItemAnimLinearLayoutMngr == null) {
            AbstractC19074t.m100223u("linearLayoutManager");
            noPredictiveItemAnimLinearLayoutMngr = null;
        }
        noPredictiveItemAnimLinearLayoutMngr.m10090H1(c8530f);
    }

    /* renamed from: e */
    public final void m45424e(ThemeItem themeItem) {
        AbstractC19074t.m100208f(themeItem, "theme");
        this.f46120v = themeItem;
        m45419k();
        this.f46116r.postDelayed(new Runnable() { // from class: co.b0
            @Override // java.lang.Runnable
            public final void run() {
                ProfileAlbumThemePickerControl.m45417f(ProfileAlbumThemePickerControl.this);
            }
        }, 200L);
    }

    /* renamed from: g */
    public final void m45425g() {
        try {
            if (!this.f46123y) {
                NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = this.f46114p;
                NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr2 = null;
                if (noPredictiveItemAnimLinearLayoutMngr == null) {
                    AbstractC19074t.m100223u("linearLayoutManager");
                    noPredictiveItemAnimLinearLayoutMngr = null;
                }
                int m9737T1 = noPredictiveItemAnimLinearLayoutMngr.m9737T1();
                NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr3 = this.f46114p;
                if (noPredictiveItemAnimLinearLayoutMngr3 == null) {
                    AbstractC19074t.m100223u("linearLayoutManager");
                } else {
                    noPredictiveItemAnimLinearLayoutMngr2 = noPredictiveItemAnimLinearLayoutMngr3;
                }
                int m9741Z1 = noPredictiveItemAnimLinearLayoutMngr2.m9741Z1();
                int indexOf = this.f46124z.getThemes().indexOf(this.f46120v);
                if (indexOf <= m9737T1) {
                    m45423u(indexOf - 1);
                } else if (indexOf >= m9741Z1) {
                    m45423u(indexOf + 1);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    public final Handler getHandlerUI() {
        return this.f46116r;
    }

    public final ProfileAlbumThemeCollection getProfileAlbumThemeCollection() {
        return this.f46124z;
    }

    public final boolean getRandomPickTheme() {
        return this.f46115q;
    }

    public final ThemeItem getSelectedTheme() {
        return this.f46120v;
    }

    public final InterfaceC8525a getThemePickerCallback() {
        return this.f46121w;
    }

    public final String getUserId() {
        return this.f46122x;
    }

    /* renamed from: h */
    public final C2999l m45426h(ThemeItem themeItem) {
        boolean z11;
        AbstractC19074t.m100208f(themeItem, "theme");
        int id2 = themeItem.getId();
        String thumb = themeItem.getContent().getThumb();
        String title = themeItem.getContent().getTitle();
        if (AbstractC19074t.m100209g(themeItem.getId(), this.f46120v.getId()) == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        return new C2999l(id2, thumb, title, z11);
    }

    /* renamed from: j */
    public final void m45427j() {
        if (this.f46112A) {
            return;
        }
        this.f46112A = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C8526b());
        c0766k.m1817K(0, 40, C23250w4.m119786E());
    }

    /* renamed from: l */
    public final void m45428l() {
        C30119x9 m148696c = C30119x9.m148696c(LayoutInflater.from(getContext()), this, true);
        AbstractC19074t.m100207e(m148696c, "inflate(...)");
        this.f46118t = m148696c;
        C25845a c25845a = null;
        if (m148696c == null) {
            AbstractC19074t.m100223u("binding");
            m148696c = null;
        }
        m148696c.f139928r.setOnClickListener(new View.OnClickListener() { // from class: co.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileAlbumThemePickerControl.m45420m(view);
            }
        });
        m148696c.f139930t.setOnClickListener(new View.OnClickListener() { // from class: co.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileAlbumThemePickerControl.m45421n(ProfileAlbumThemePickerControl.this, view);
            }
        });
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        C25845a c25845a2 = new C25845a(context);
        this.f46117s = c25845a2;
        c25845a2.m133298P(new C8527c());
        NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(getContext());
        this.f46114p = noPredictiveItemAnimLinearLayoutMngr;
        noPredictiveItemAnimLinearLayoutMngr.m9723C2(0);
        FeedRecyclerView feedRecyclerView = m148696c.f139931u;
        NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr2 = this.f46114p;
        if (noPredictiveItemAnimLinearLayoutMngr2 == null) {
            AbstractC19074t.m100223u("linearLayoutManager");
            noPredictiveItemAnimLinearLayoutMngr2 = null;
        }
        feedRecyclerView.setLayoutManager(noPredictiveItemAnimLinearLayoutMngr2);
        FeedRecyclerView feedRecyclerView2 = m148696c.f139931u;
        C25845a c25845a3 = this.f46117s;
        if (c25845a3 == null) {
            AbstractC19074t.m100223u("adapter");
        } else {
            c25845a = c25845a3;
        }
        feedRecyclerView2.setAdapter(c25845a);
        m148696c.f139931u.m9816A(new C8528d(m148696c));
        m148696c.f139931u.setCatchTouchEventListener(new C8529e());
        m148696c.f139927q.setOnClickListener(new View.OnClickListener() { // from class: co.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileAlbumThemePickerControl.m45422p(ProfileAlbumThemePickerControl.this, view);
            }
        });
        m45429q();
        m45427j();
    }

    /* renamed from: q */
    public final void m45429q() {
        String m101783b = C19464a.m101783b(this.f46122x, 5);
        if (m101783b != null) {
            this.f46124z = ProfileAlbumThemeCollection.Companion.m46314b(m101783b);
            m45419k();
        }
    }

    /* renamed from: r */
    public final void m45430r() {
        this.f46113B = false;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationY", getTranslationY(), 0.0f);
        ofFloat.setDuration(200L);
        ofFloat.start();
    }

    /* renamed from: s */
    public final void m45431s() {
        if (!this.f46113B) {
            C30119x9 c30119x9 = this.f46118t;
            C30119x9 c30119x92 = null;
            if (c30119x9 == null) {
                AbstractC19074t.m100223u("binding");
                c30119x9 = null;
            }
            int height = c30119x9.f139928r.getHeight();
            C30119x9 c30119x93 = this.f46118t;
            if (c30119x93 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c30119x92 = c30119x93;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationY", 0.0f, height - c30119x92.f139931u.getTop());
            ofFloat.setDuration(200L);
            ofFloat.start();
            this.f46113B = true;
        }
    }

    public final void setCloseButtonVisibility(boolean z11) {
        int i11;
        C30119x9 c30119x9 = this.f46118t;
        if (c30119x9 == null) {
            AbstractC19074t.m100223u("binding");
            c30119x9 = null;
        }
        RecyclingImageView recyclingImageView = c30119x9.f139930t;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        recyclingImageView.setVisibility(i11);
    }

    public final void setGettingListTheme(boolean z11) {
        this.f46112A = z11;
    }

    public final void setMinimizing(boolean z11) {
        this.f46113B = z11;
    }

    public final void setProfileAlbumThemeCollection(ProfileAlbumThemeCollection profileAlbumThemeCollection) {
        AbstractC19074t.m100208f(profileAlbumThemeCollection, "<set-?>");
        this.f46124z = profileAlbumThemeCollection;
    }

    public final void setRandomPickTheme(boolean z11) {
        this.f46115q = z11;
    }

    public final void setScrolling(boolean z11) {
        this.f46123y = z11;
    }

    public final void setSelectedTheme(ThemeItem themeItem) {
        AbstractC19074t.m100208f(themeItem, "<set-?>");
        this.f46120v = themeItem;
    }

    public final void setThemePickerCallback(InterfaceC8525a interfaceC8525a) {
        this.f46121w = interfaceC8525a;
    }

    public final void setUserId(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f46122x = str;
    }
}
