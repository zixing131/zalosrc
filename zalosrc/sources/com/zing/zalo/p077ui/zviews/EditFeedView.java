package com.zing.zalo.p077ui.zviews;

import ac.C0708i;
import ac.C0732w;
import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.C0815e1;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.AbstractC1785o;
import au.AbstractC2379w;
import bo.AbstractC2959d;
import bo.C2949b;
import bo.C2954c;
import bo.C3000l0;
import bo.C3003l3;
import bo.C3020p0;
import bo.C3023p3;
import bo.C3025q0;
import bo.C3063z0;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.LinkAttachment;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.feed.components.ComposeSongItemView;
import com.zing.zalo.feed.components.FeedItemZInstantLifecycleHelper;
import com.zing.zalo.feed.components.FeedMemoryPreview;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.models.SongInfo;
import com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.p077ui.picker.QuickPickerView;
import com.zing.zalo.p077ui.widget.CustomSwitch;
import com.zing.zalo.p077ui.zviews.EditFeedView;
import com.zing.zalo.social.controls.LikeContactItem;
import com.zing.zalo.social.widget.StatusComposeEditText;
import com.zing.zalo.uicomponents.reddot.RedDotImageButton;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zinstant.C17244x0;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import fn0.AbstractC19044c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gq.C19587j;
import hf0.C20043e;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import hn0.AbstractC20104d;
import ho0.AbstractC20110a;
import is.AbstractC20826v0;
import is.AbstractC20828w0;
import is.C20791e;
import is.C20834z0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lk0.InterfaceC22508f;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mm0.AbstractC23350e;
import mp.C23418f;
import nb0.C23672c;
import nh0.C23793c;
import org.json.JSONArray;
import org.json.JSONObject;
import p107dq.C18054j;
import p133ek.C18460c;
import p216hq.C20112a;
import p304ks.AbstractC21935u;
import p348mi.C23307g;
import p361nb.C23648e;
import p471r3.C25630b;
import p559uv.C27373c;
import p588vw.C28644j;
import p716zh.C31845ac;
import p716zh.C31890dc;
import p716zh.C32002l4;
import p716zh.C32017m4;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import tn.C26767v;
import tr.C26878b;
import vg.C28227x3;

/* loaded from: classes6.dex */
public final class EditFeedView extends UpdateStatusView {
    public static final C14229b Companion = new C14229b(null);

    /* renamed from: I4 */
    private FeedMemoryPreview f73176I4;

    /* renamed from: J4 */
    private int f73177J4;

    /* renamed from: M4 */
    private int f73180M4;

    /* renamed from: O4 */
    private boolean f73182O4;

    /* renamed from: P4 */
    private boolean f73183P4;

    /* renamed from: Q4 */
    private boolean f73184Q4;

    /* renamed from: F4 */
    private String f73173F4 = "";

    /* renamed from: G4 */
    private C3020p0 f73174G4 = new C3020p0();

    /* renamed from: H4 */
    private C3000l0 f73175H4 = new C3000l0();

    /* renamed from: K4 */
    private CharSequence f73178K4 = "";

    /* renamed from: L4 */
    private PrivacyInfo f73179L4 = new PrivacyInfo();

    /* renamed from: N4 */
    private String f73181N4 = "";

    /* renamed from: com.zing.zalo.ui.zviews.EditFeedView$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC14228a {
        /* renamed from: a */
        void mo79426a();

        void onError(int i11);
    }

    /* renamed from: com.zing.zalo.ui.zviews.EditFeedView$b */
    /* loaded from: classes6.dex */
    public static final class C14229b {
        private C14229b() {
        }

        public /* synthetic */ C14229b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C3000l0 m79427a(Intent intent) {
            if (intent != null) {
                try {
                    String stringExtra = intent.getStringExtra("EXTRA_NEW_FEED_RESULTS");
                    if (stringExtra != null && stringExtra.length() != 0) {
                        return AbstractC20826v0.m108750B0(new JSONObject(stringExtra));
                    }
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
            }
            return null;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.EditFeedView$c */
    /* loaded from: classes6.dex */
    public static final class C14230c implements InterfaceC14228a {
        C14230c() {
        }

        @Override // com.zing.zalo.p077ui.zviews.EditFeedView.InterfaceC14228a
        /* renamed from: a */
        public void mo79426a() {
            if (EditFeedView.this.f73174G4.f12058q != 22) {
                EditFeedView.super.mo79421pR();
            } else {
                EditFeedView.this.m85823BR();
            }
        }

        @Override // com.zing.zalo.p077ui.zviews.EditFeedView.InterfaceC14228a
        public void onError(int i11) {
            String m118743r0;
            if (i11 == 50001) {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG);
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.unknown_error);
            }
            AbstractC19074t.m100205c(m118743r0);
            ToastUtils.showMess(m118743r0);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.EditFeedView$d */
    /* loaded from: classes6.dex */
    public static final class C14231d implements C23418f.a {

        /* renamed from: b */
        final /* synthetic */ InterfaceC14228a f73187b;

        C14231d(InterfaceC14228a interfaceC14228a) {
            this.f73187b = interfaceC14228a;
        }

        /* renamed from: d */
        public static final void m79429d(EditFeedView editFeedView) {
            AbstractC19074t.m100208f(editFeedView, "this$0");
            editFeedView.m85856LR();
        }

        @Override // mp.C23418f.a
        /* renamed from: a */
        public void mo79430a(PrivacyInfo privacyInfo) {
            AbstractC19074t.m100208f(privacyInfo, "privacyInfo");
            EditFeedView editFeedView = EditFeedView.this;
            editFeedView.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.sc
                public /* synthetic */ RunnableC16126sc() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EditFeedView.C14231d.m79429d(EditFeedView.this);
                }
            });
            EditFeedView.this.m85968rO(privacyInfo);
            this.f73187b.mo79426a();
        }

        @Override // mp.C23418f.a
        /* renamed from: b */
        public void mo79431b(boolean z11) {
        }

        @Override // mp.C23418f.a
        public void onError(int i11) {
            this.f73187b.onError(i11);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.EditFeedView$e */
    /* loaded from: classes6.dex */
    public static final class C14232e implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ InterfaceC14228a f73189b;

        C14232e(InterfaceC14228a interfaceC14228a) {
            this.f73189b = interfaceC14228a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:            if (r5 == null) goto L31;     */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:            return;     */
        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo926a(C20096c c20096c) {
            int i11 = -1;
            try {
                try {
                    EditFeedView.this.mo78960q3();
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                    EditFeedView.this.m79390JU(false);
                }
            } finally {
                EditFeedView.this.m79390JU(false);
                if (c20096c != null) {
                    i11 = c20096c.m104491c();
                }
                this.f73189b.onError(i11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                try {
                    JSONArray jSONArray = ((JSONObject) obj).getJSONObject("data").getJSONArray("list");
                    ArrayList arrayList = new ArrayList();
                    if (jSONArray.length() > 0) {
                        int length = jSONArray.length();
                        for (int i11 = 0; i11 < length; i11++) {
                            Object obj2 = jSONArray.get(i11);
                            AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                            JSONObject jSONObject = (JSONObject) obj2;
                            String string = jSONObject.getString("uid");
                            String string2 = jSONObject.getString("avt");
                            String string3 = jSONObject.getString("dispname");
                            if (AbstractC21935u.m114558y(string)) {
                                arrayList.add(new LikeContactItem(string, AbstractC21935u.m114542i(string, string3), string2));
                            }
                        }
                    }
                    PrivacyInfo privacyInfo = EditFeedView.this.f78744c1;
                    int i12 = privacyInfo.f45973p;
                    if (i12 == 0) {
                        privacyInfo.f45977t = 40;
                    } else if (i12 == 1) {
                        privacyInfo.f45977t = 50;
                    } else if (i12 == 3) {
                        privacyInfo.f45977t = 90;
                    } else {
                        List list = PrivacyInfo.f45971u;
                        if (list != null && !list.isEmpty()) {
                            Iterator it = PrivacyInfo.f45971u.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    PrivacyInfo privacyInfo2 = (PrivacyInfo) it.next();
                                    ArrayList arrayList2 = privacyInfo2.f45974q;
                                    if (arrayList2 != null && !arrayList2.isEmpty() && arrayList2.size() == arrayList.size()) {
                                        int size = arrayList2.size();
                                        int i13 = 0;
                                        while (true) {
                                            if (i13 < size) {
                                                if (arrayList2.get(i13) == null || AbstractC19074t.m100204b(((LikeContactItem) arrayList2.get(i13)).m56333d(), ((LikeContactItem) arrayList.get(i13)).m56333d())) {
                                                    i13++;
                                                }
                                            } else {
                                                int i14 = privacyInfo2.f45973p;
                                                PrivacyInfo privacyInfo3 = EditFeedView.this.f78744c1;
                                                if (i14 == privacyInfo3.f45973p) {
                                                    privacyInfo3.f45977t = privacyInfo2.f45977t;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    ArrayList arrayList3 = new ArrayList();
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        LikeContactItem likeContactItem = (LikeContactItem) it2.next();
                                        arrayList3.add(new InviteContactProfile(likeContactItem.m56333d(), likeContactItem.m56330a(), likeContactItem.m56331b()));
                                    }
                                    EditFeedView.this.f78744c1.f45977t = PrivacyInfo.m45129a(arrayList3);
                                }
                            }
                        }
                    }
                    EditFeedView.this.f78744c1.m45136H(arrayList);
                    EditFeedView.this.mo78960q3();
                    this.f73189b.mo79426a();
                } catch (Exception e11) {
                    this.f73189b.onError(-1);
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
                EditFeedView.this.m79390JU(false);
            } catch (Throwable th2) {
                EditFeedView.this.m79390JU(false);
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.EditFeedView$f */
    /* loaded from: classes6.dex */
    public static final class C14233f implements InterfaceC14228a {
        C14233f() {
        }

        /* renamed from: c */
        public static final void m79433c(EditFeedView editFeedView) {
            AbstractC19074t.m100208f(editFeedView, "this$0");
            EditFeedView.super.mo79425yR();
        }

        @Override // com.zing.zalo.p077ui.zviews.EditFeedView.InterfaceC14228a
        /* renamed from: a */
        public void mo79426a() {
            EditFeedView editFeedView = EditFeedView.this;
            editFeedView.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.tc
                public /* synthetic */ RunnableC16186tc() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EditFeedView.C14233f.m79433c(EditFeedView.this);
                }
            });
        }

        @Override // com.zing.zalo.p077ui.zviews.EditFeedView.InterfaceC14228a
        public void onError(int i11) {
            String m118743r0;
            if (i11 == 50001) {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG);
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.unknown_error);
            }
            AbstractC19074t.m100205c(m118743r0);
            ToastUtils.showMess(m118743r0);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.EditFeedView$g */
    /* loaded from: classes6.dex */
    public static final class C14234g implements InterfaceC14228a {
        C14234g() {
        }

        /* renamed from: d */
        public static final void m79436d(EditFeedView editFeedView) {
            AbstractC19074t.m100208f(editFeedView, "this$0");
            try {
                editFeedView.m85856LR();
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }

        /* renamed from: e */
        public static final void m79437e(EditFeedView editFeedView) {
            AbstractC19074t.m100208f(editFeedView, "this$0");
            try {
                editFeedView.m85856LR();
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }

        @Override // com.zing.zalo.p077ui.zviews.EditFeedView.InterfaceC14228a
        /* renamed from: a */
        public void mo79426a() {
            EditFeedView editFeedView = EditFeedView.this;
            editFeedView.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.uc
                public /* synthetic */ RunnableC16223uc() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EditFeedView.C14234g.m79437e(EditFeedView.this);
                }
            });
        }

        @Override // com.zing.zalo.p077ui.zviews.EditFeedView.InterfaceC14228a
        public void onError(int i11) {
            EditFeedView editFeedView = EditFeedView.this;
            editFeedView.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.vc
                public /* synthetic */ RunnableC16260vc() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EditFeedView.C14234g.m79436d(EditFeedView.this);
                }
            });
        }
    }

    /* renamed from: AU */
    public static final void m79321AU(InterfaceC22508f interfaceC22508f, EditFeedView editFeedView, C3025q0 c3025q0) {
        AbstractC19074t.m100208f(editFeedView, "this$0");
        AbstractC19074t.m100208f(c3025q0, "$content");
        FeedMemoryPreview feedMemoryPreview = null;
        if (interfaceC22508f != null) {
            FeedMemoryPreview feedMemoryPreview2 = editFeedView.f73176I4;
            if (feedMemoryPreview2 == null) {
                AbstractC19074t.m100223u("feedMemoryPreview");
                feedMemoryPreview2 = null;
            }
            feedMemoryPreview2.setVisibility(0);
            FeedMemoryPreview feedMemoryPreview3 = editFeedView.f73176I4;
            if (feedMemoryPreview3 == null) {
                AbstractC19074t.m100223u("feedMemoryPreview");
                feedMemoryPreview3 = null;
            }
            feedMemoryPreview3.setFeedMemoryId(c3025q0.f12101J);
            FeedMemoryPreview feedMemoryPreview4 = editFeedView.f73176I4;
            if (feedMemoryPreview4 == null) {
                AbstractC19074t.m100223u("feedMemoryPreview");
                feedMemoryPreview4 = null;
            }
            feedMemoryPreview4.setLayoutRatio(c3025q0.f12103L);
            FeedMemoryPreview feedMemoryPreview5 = editFeedView.f73176I4;
            if (feedMemoryPreview5 == null) {
                AbstractC19074t.m100223u("feedMemoryPreview");
            } else {
                feedMemoryPreview = feedMemoryPreview5;
            }
            feedMemoryPreview.m44401h(interfaceC22508f);
            return;
        }
        FeedMemoryPreview feedMemoryPreview6 = editFeedView.f73176I4;
        if (feedMemoryPreview6 == null) {
            AbstractC19074t.m100223u("feedMemoryPreview");
        } else {
            feedMemoryPreview = feedMemoryPreview6;
        }
        feedMemoryPreview.setVisibility(8);
    }

    /* renamed from: BU */
    public static final void m79323BU(EditFeedView editFeedView) {
        AbstractC19074t.m100208f(editFeedView, "this$0");
        FeedMemoryPreview feedMemoryPreview = editFeedView.f73176I4;
        if (feedMemoryPreview == null) {
            AbstractC19074t.m100223u("feedMemoryPreview");
            feedMemoryPreview = null;
        }
        feedMemoryPreview.setVisibility(8);
    }

    /* renamed from: CU */
    private final void m79325CU(C3020p0 c3020p0) {
        C3025q0 c3025q0 = c3020p0.f12023C;
        if (c3025q0 != null) {
            int i11 = c3020p0.f12058q;
            if (i11 != 2 && i11 != 3) {
                if (i11 != 17) {
                    if (i11 == 23 && c3025q0.f12107P != null) {
                        if (c3020p0.m14508h0()) {
                            m79350UT(AbstractC20826v0.m108787U(c3020p0, 0), c3020p0.f12023C.f12094C);
                            return;
                        }
                        ArrayList m108825o = AbstractC20826v0.m108825o(c3025q0.f12107P);
                        AbstractC19074t.m100207e(m108825o, "convertAlbumItemsToPhotos(...)");
                        m79347RT(m108825o, c3025q0.f12119j);
                        return;
                    }
                    return;
                }
                m79350UT(AbstractC20826v0.m108789V(c3020p0), c3020p0.f12023C.f12094C);
                return;
            }
            ArrayList arrayList = c3025q0.f12118i;
            if (arrayList != null) {
                AbstractC19074t.m100207e(arrayList, "listPhotos");
                m79347RT(arrayList, c3025q0.f12119j);
            }
        }
    }

    /* renamed from: DU */
    private final void m79327DU(C3020p0 c3020p0) {
        PrivacyInfo.m45121B(false);
        this.f78744c1 = new PrivacyInfo(c3020p0.f12042V);
        m79358cU(new C14234g(), true, false);
        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.fc
            public /* synthetic */ RunnableC15620fc() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                EditFeedView.m79329EU(EditFeedView.this);
            }
        });
    }

    /* renamed from: EU */
    public static final void m79329EU(EditFeedView editFeedView) {
        AbstractC19074t.m100208f(editFeedView, "this$0");
        editFeedView.m85856LR();
    }

    /* renamed from: FU */
    private final void m79331FU(C3020p0 c3020p0) {
        if (c3020p0.f12023C != null && c3020p0.f12058q == 6) {
            C25630b m143290W = C28644j.m143233Y().m143290W(String.valueOf(c3020p0.f12023C.f12132w));
            AbstractC19074t.m100207e(m143290W, "getAnimationInfo(...)");
            mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.pc

                /* renamed from: q */
                public final /* synthetic */ C25630b f81582q;

                public /* synthetic */ RunnableC16014pc(C25630b m143290W2) {
                    r2 = m143290W2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EditFeedView.m79333GU(EditFeedView.this, r2);
                }
            });
        }
    }

    /* renamed from: GU */
    public static final void m79333GU(EditFeedView editFeedView, C25630b c25630b) {
        AbstractC19074t.m100208f(editFeedView, "this$0");
        AbstractC19074t.m100208f(c25630b, "$gifInfo");
        editFeedView.m85869PP(c25630b);
        editFeedView.m85894WN();
    }

    /* renamed from: HU */
    private final void m79335HU(C3020p0 c3020p0) {
        LinkedHashMap linkedHashMap;
        C3063z0 c3063z0;
        C3003l3 c3003l3 = c3020p0.f12059r;
        if (c3003l3 != null) {
            m79354YT(c3003l3);
        }
        if (c3020p0.m14477G()) {
            C3025q0 c3025q0 = c3020p0.f12023C;
            if (c3025q0 != null) {
                c3063z0 = c3025q0.f12111b;
            } else {
                c3063z0 = null;
            }
            this.f78745c2 = c3063z0;
        }
        if (c3020p0.m14477G() || ((linkedHashMap = this.f78736a1) != null && !linkedHashMap.isEmpty())) {
            mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.gc
                public /* synthetic */ RunnableC15657gc() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EditFeedView.m79337IU(EditFeedView.this);
                }
            });
        }
    }

    /* renamed from: IU */
    public static final void m79337IU(EditFeedView editFeedView) {
        AbstractC19074t.m100208f(editFeedView, "this$0");
        editFeedView.m85870PR();
    }

    /* renamed from: KU */
    private final void m79340KU(C3020p0 c3020p0) {
        CustomSwitch customSwitch = this.f78711T3;
        if (customSwitch != null) {
            customSwitch.setVisibility(8);
        }
        RedDotImageButton redDotImageButton = this.f78788n1;
        if (redDotImageButton != null) {
            redDotImageButton.setEnabled(false);
        }
        RedDotImageButton redDotImageButton2 = this.f78659E1;
        if (redDotImageButton2 != null) {
            redDotImageButton2.setEnabled(false);
        }
        RedDotImageButton redDotImageButton3 = this.f78697Q1;
        if (redDotImageButton3 != null) {
            redDotImageButton3.setEnabled(false);
        }
        int i11 = c3020p0.f12058q;
        if (i11 != 2 && i11 != 3) {
            if (i11 != 7) {
                if (i11 != 17) {
                    switch (i11) {
                        case 22:
                            RedDotImageButton redDotImageButton4 = this.f78788n1;
                            if (redDotImageButton4 != null) {
                                redDotImageButton4.setVisibility(8);
                            }
                            RedDotImageButton redDotImageButton5 = this.f78659E1;
                            if (redDotImageButton5 != null) {
                                redDotImageButton5.setVisibility(8);
                            }
                            RedDotImageButton redDotImageButton6 = this.f78697Q1;
                            if (redDotImageButton6 != null) {
                                redDotImageButton6.setVisibility(8);
                                break;
                            }
                            break;
                        case 23:
                            if (c3020p0.m14508h0()) {
                                RedDotImageButton redDotImageButton7 = this.f78659E1;
                                if (redDotImageButton7 != null) {
                                    redDotImageButton7.setEnabled(true);
                                    break;
                                }
                            } else {
                                RedDotImageButton redDotImageButton8 = this.f78788n1;
                                if (redDotImageButton8 != null) {
                                    redDotImageButton8.setEnabled(true);
                                    break;
                                }
                            }
                            break;
                        case 24:
                            RedDotImageButton redDotImageButton9 = this.f78697Q1;
                            if (redDotImageButton9 != null) {
                                redDotImageButton9.setEnabled(true);
                                break;
                            }
                            break;
                    }
                } else {
                    RedDotImageButton redDotImageButton10 = this.f78659E1;
                    if (redDotImageButton10 != null) {
                        redDotImageButton10.setEnabled(true);
                    }
                }
            } else {
                RedDotImageButton redDotImageButton11 = this.f78697Q1;
                if (redDotImageButton11 != null) {
                    redDotImageButton11.setEnabled(true);
                }
            }
        } else {
            RedDotImageButton redDotImageButton12 = this.f78788n1;
            if (redDotImageButton12 != null) {
                redDotImageButton12.setEnabled(true);
            }
        }
        mo79398SN();
    }

    /* renamed from: MU */
    public static final void m79343MU(EditFeedView editFeedView) {
        AbstractC19074t.m100208f(editFeedView, "this$0");
        editFeedView.mo78960q3();
        FeedActionZUtils.m47534V(editFeedView.f72421L0.m92648SI(), editFeedView.f78657D2, 1, 0);
        editFeedView.f78738a3 = true;
        if (editFeedView.f78653C2) {
            C20834z0.f102412a.m108927f(true);
            if (editFeedView.m92648SI() instanceof Activity) {
                Context m92648SI = editFeedView.m92648SI();
                AbstractC19074t.m100206d(m92648SI, "null cannot be cast to non-null type android.app.Activity");
                AbstractC23136l9.m118678T0((Activity) m92648SI);
            }
            editFeedView.finish();
            return;
        }
        if (editFeedView.f78649B2) {
            editFeedView.m85829DS(18);
        } else {
            editFeedView.m85975tO(editFeedView.f73175H4.f11895q);
        }
    }

    /* renamed from: RT */
    private final void m79347RT(List list, C23307g c23307g) {
        String str;
        String str2;
        ArrayList arrayList = this.f78796p1;
        if (arrayList == null) {
            this.f78796p1 = new ArrayList();
        } else {
            arrayList.clear();
        }
        this.f73180M4 = 0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) it.next();
            if (itemAlbumMobile != null && (str2 = itemAlbumMobile.f42607x) != null && str2.length() != 0) {
                this.f78796p1.add(m79355ZT(itemAlbumMobile, c23307g));
                this.f73180M4++;
            }
        }
        ArrayList arrayList2 = this.f78796p1;
        if (arrayList2 != null && arrayList2.size() == list.size()) {
            ArrayList arrayList3 = this.f78833y2;
            if (arrayList3 == null) {
                this.f78833y2 = new ArrayList();
            } else {
                arrayList3.clear();
            }
            Iterator it2 = this.f78796p1.iterator();
            while (it2.hasNext()) {
                MediaItem mediaItem = (MediaItem) it2.next();
                ArrayList arrayList4 = this.f78833y2;
                AbstractC19074t.m100205c(mediaItem);
                arrayList4.add(new MediaItem(mediaItem));
            }
            mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.qc
                public /* synthetic */ RunnableC16051qc() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EditFeedView.m79348ST(EditFeedView.this);
                }
            });
        }
        if (this.f78774j3 == 0) {
            mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.rc
                public /* synthetic */ RunnableC16088rc() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EditFeedView.m79349TT(EditFeedView.this);
                }
            });
        }
        C18054j mo102469l = C19587j.f97307a.m102530f(this.f78774j3).mo102469l(this.f78796p1);
        if (mo102469l == null || (str = mo102469l.m95948b()) == null) {
            str = "";
        }
        if (AbstractC20828w0.Companion.m108852a(this.f73174G4, str)) {
            ToastUtils.m89266n(AbstractC8020f0.str_warning_theme_lunar_new_year_2024_expired_edit_feed, new Object[0]);
        }
    }

    /* renamed from: ST */
    public static final void m79348ST(EditFeedView editFeedView) {
        AbstractC19074t.m100208f(editFeedView, "this$0");
        editFeedView.m85941jR();
        editFeedView.m85877SR();
    }

    /* renamed from: TT */
    public static final void m79349TT(EditFeedView editFeedView) {
        AbstractC19074t.m100208f(editFeedView, "this$0");
        editFeedView.m85858MN();
    }

    /* renamed from: UT */
    private final void m79350UT(C17391z c17391z, C17391z c17391z2) {
        C27373c m79356aU = m79356aU(c17391z, c17391z2);
        this.f78662F1 = m79356aU;
        String m140220E = m79356aU.m140220E();
        if (m140220E == null) {
            m140220E = "";
        }
        this.f73181N4 = m140220E;
        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.kc
            public /* synthetic */ RunnableC15810kc() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                EditFeedView.m79351VT(EditFeedView.this);
            }
        });
    }

    /* renamed from: VT */
    public static final void m79351VT(EditFeedView editFeedView) {
        AbstractC19074t.m100208f(editFeedView, "this$0");
        if (editFeedView.mo79396QP(5)) {
            editFeedView.mo79383BS(5);
        } else {
            AbstractC2379w.m12430d(editFeedView.f78756f1);
            editFeedView.mo78955kl(new Runnable() { // from class: com.zing.zalo.ui.zviews.ic
                public /* synthetic */ RunnableC15731ic() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EditFeedView.m79352WT(EditFeedView.this);
                }
            }, 300L);
        }
    }

    /* renamed from: WT */
    public static final void m79352WT(EditFeedView editFeedView) {
        AbstractC19074t.m100208f(editFeedView, "this$0");
        try {
            QuickPickerView quickPickerView = editFeedView.f78716V0;
            if (quickPickerView != null) {
                quickPickerView.m71284sO(false, new SensitiveData("gallery_post_video_feed", "social_timeline", null, 4, null));
            }
            editFeedView.m85897WS(5);
            editFeedView.m85921dO(5, true);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: XT */
    private final void m79353XT() {
        m79358cU(new C14230c(), false, true);
    }

    /* renamed from: YT */
    private final void m79354YT(C3003l3 c3003l3) {
        this.f78736a1.clear();
        LinkedHashMap linkedHashMap = c3003l3.f11957b;
        AbstractC19074t.m100207e(linkedHashMap, "mFriendsMap");
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            InviteContactProfile inviteContactProfile = new InviteContactProfile();
            inviteContactProfile.f42434r = str;
            inviteContactProfile.f42437s = AbstractC21935u.m114542i(str, str2);
            LinkedHashMap linkedHashMap2 = this.f78736a1;
            AbstractC19074t.m100207e(linkedHashMap2, "mTaggedProfiles");
            linkedHashMap2.put(str, inviteContactProfile);
        }
        c3003l3.f11960e = false;
    }

    /* renamed from: ZT */
    private final MediaItem m79355ZT(ItemAlbumMobile itemAlbumMobile, C23307g c23307g) {
        MediaItem mediaItem = new MediaItem();
        String str = itemAlbumMobile.f42607x;
        AbstractC19074t.m100207e(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        mediaItem.mo41082W0(str);
        String str2 = itemAlbumMobile.f42548C;
        AbstractC19074t.m100207e(str2, "thumbnail");
        mediaItem.m41153k1(str2);
        mediaItem.m41131X0(itemAlbumMobile.f42595r);
        mediaItem.m41140d1(true);
        ItemAlbumMobile.C7883c c7883c = itemAlbumMobile.f42596r0;
        if (c7883c != null) {
            mediaItem.m41155l1((int) (c7883c.f42616c - c7883c.f42614a));
            ItemAlbumMobile.C7883c c7883c2 = itemAlbumMobile.f42596r0;
            mediaItem.m41151j1((int) (c7883c2.f42617d - c7883c2.f42615b));
        } else if (c23307g != null) {
            mediaItem.m41155l1(c23307g.f113474a);
            mediaItem.m41151j1(c23307g.f113475b);
        }
        return mediaItem;
    }

    /* renamed from: aU */
    private final C27373c m79356aU(C17391z c17391z, C17391z c17391z2) {
        String str;
        String str2;
        String str3;
        int i11;
        int i12;
        long j11;
        String str4;
        C2954c c2954c;
        int i13;
        C28227x3 m14010a;
        C28227x3 m14010a2;
        AbstractC2959d m13986a;
        ArrayList arrayList;
        C23307g c23307g;
        C23307g c23307g2;
        C27373c c27373c = new C27373c(null, null, null, null, null, null, 0L, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0.0f, 0.0f, 0L, 0L, 0L, false, false, false, false, false, null, 0, false, null, 0, -1, 7, null);
        String str5 = "";
        if (c17391z == null || (str = c17391z.f88620c) == null) {
            str = "";
        }
        c27373c.m140250e0(str);
        String m140220E = c27373c.m140220E();
        C28227x3 c28227x3 = null;
        if (m140220E == null || m140220E.length() == 0) {
            if (c17391z != null) {
                str2 = c17391z.f88621d;
            } else {
                str2 = null;
            }
            c27373c.m140250e0(str2);
        }
        if (c17391z != null) {
            str3 = c17391z.f88622e;
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str3 = "";
        }
        if (TextUtils.isEmpty(str3)) {
            if (c17391z2 != null) {
                str3 = c17391z2.f88622e;
            } else {
                str3 = null;
            }
        }
        c27373c.m140237V(str3);
        C3025q0 c3025q0 = this.f73174G4.f12023C;
        int i14 = 0;
        if (c3025q0 != null && (c23307g2 = c3025q0.f12119j) != null) {
            i11 = c23307g2.f113474a;
        } else {
            i11 = 0;
        }
        c27373c.m140252f0(i11);
        C3025q0 c3025q02 = this.f73174G4.f12023C;
        if (c3025q02 != null && (c23307g = c3025q02.f12119j) != null) {
            i12 = c23307g.f113475b;
        } else {
            i12 = 0;
        }
        c27373c.m140241Z(i12);
        if (this.f73174G4.f12058q == 23 && ((c27373c.m140221F() == 0 || c27373c.m140272z() == 0) && this.f73174G4.m14508h0())) {
            C3025q0 c3025q03 = this.f73174G4.f12023C;
            if (c3025q03 != null && (arrayList = c3025q03.f12107P) != null) {
                c2954c = (C2954c) arrayList.get(0);
            } else {
                c2954c = null;
            }
            if (c2954c != null && (m13986a = c2954c.m13986a()) != null) {
                c28227x3 = m13986a.m14010a();
            }
            if (c28227x3 != null) {
                AbstractC2959d m13986a2 = c2954c.m13986a();
                if (m13986a2 != null && (m14010a2 = m13986a2.m14010a()) != null) {
                    i13 = m14010a2.f131648a;
                } else {
                    i13 = 0;
                }
                c27373c.m140252f0(i13);
                AbstractC2959d m13986a3 = c2954c.m13986a();
                if (m13986a3 != null && (m14010a = m13986a3.m14010a()) != null) {
                    i14 = m14010a.f131649b;
                }
                c27373c.m140241Z(i14);
            }
        }
        if (c17391z != null) {
            j11 = c17391z.f88632o;
        } else {
            j11 = 0;
        }
        c27373c.m140226K(j11);
        if (c17391z != null && (str4 = c17391z.f88634q) != null) {
            str5 = str4;
        }
        c27373c.m140231P(str5);
        return c27373c;
    }

    /* renamed from: bU */
    private final void m79357bU(InterfaceC14228a interfaceC14228a) {
        if (m85957oP()) {
            PrivacyInfo privacyInfo = new PrivacyInfo(this.f78744c1.f45973p);
            C23418f c23418f = C23418f.f113810a;
            c23418f.m123076c(this.f78783l4.getId(), privacyInfo);
            c23418f.m123074a(this.f78783l4.getId(), this.f78783l4.getPrivacyType(), new C14231d(interfaceC14228a));
        }
    }

    /* renamed from: cU */
    private final void m79358cU(InterfaceC14228a interfaceC14228a, boolean z11, boolean z12) {
        try {
            PrivacyInfo privacyInfo = this.f78744c1;
            if (privacyInfo == null) {
                interfaceC14228a.onError(-1);
                return;
            }
            if (!z11 && (!privacyInfo.m45153y() || this.f78744c1.m45151w())) {
                interfaceC14228a.mo79426a();
                return;
            }
            if (this.f73174G4.f12058q == 23) {
                m79357bU(interfaceC14228a);
                return;
            }
            if (this.f73182O4) {
                return;
            }
            this.f73182O4 = true;
            if (z12) {
                mo46829Y();
            }
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14232e(interfaceC14228a));
            c0766k.mo1604b7(this.f73174G4.f12057p, 0, 100, this.f78744c1.f45973p);
        } catch (Exception e11) {
            this.f73182O4 = false;
            interfaceC14228a.onError(-1);
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: dU */
    private final void m79359dU() {
        int i11;
        boolean z11;
        boolean z12;
        C31890dc m85824CO = m85824CO();
        if (m85824CO != null) {
            i11 = m85824CO.f146495a;
        } else {
            i11 = 0;
        }
        C20112a c20112a = this.f78766h3;
        String str = this.f78764h1;
        AbstractC19074t.m100207e(str, "mDescription");
        String str2 = this.f73174G4.f12023C.f12101J;
        AbstractC19074t.m100207e(str2, "feedMemoryId");
        C3025q0 c3025q0 = this.f73174G4.f12023C;
        int i12 = c3025q0.f12102K;
        C17244x0 c17244x0 = c3025q0.f12104M;
        C3003l3 m85980vO = m85980vO();
        C3063z0 c3063z0 = this.f78745c2;
        PrivacyInfo m85818AO = m85818AO();
        double d11 = this.f73174G4.f12023C.f12103L;
        TrackingSource trackingSource = this.f78698Q2;
        if (this.f78748d1 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        C3000l0 c3000l0 = this.f73175H4;
        if (!m79364nU() && !m79363mU()) {
            z12 = false;
        } else {
            z12 = true;
        }
        c20112a.m104639s0(str, str2, i12, c17244x0, m85980vO, c3063z0, m85818AO, i11, d11, trackingSource, z11, c3000l0, z12, this.f73173F4);
    }

    /* renamed from: fU */
    public static final C3000l0 m79360fU(Intent intent) {
        return Companion.m79427a(intent);
    }

    /* renamed from: gU */
    private final void m79361gU() {
        View findViewById = this.f78708T0.findViewById(AbstractC6918a0.layoutFeedMemory);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        FeedMemoryPreview feedMemoryPreview = (FeedMemoryPreview) findViewById;
        this.f73176I4 = feedMemoryPreview;
        FeedMemoryPreview feedMemoryPreview2 = null;
        if (feedMemoryPreview == null) {
            AbstractC19074t.m100223u("feedMemoryPreview");
            feedMemoryPreview = null;
        }
        feedMemoryPreview.m44402j(getContext());
        FeedMemoryPreview feedMemoryPreview3 = this.f73176I4;
        if (feedMemoryPreview3 == null) {
            AbstractC19074t.m100223u("feedMemoryPreview");
            feedMemoryPreview3 = null;
        }
        feedMemoryPreview3.setFeedMemoryPreviewClickListener(new FeedMemoryPreview.InterfaceC8207e() { // from class: com.zing.zalo.ui.zviews.jc
            @Override // com.zing.zalo.feed.components.FeedMemoryPreview.InterfaceC8207e
            /* renamed from: a */
            public final void mo44409a() {
                EditFeedView.m79362hU();
            }
        });
        AbstractC1785o lifecycle = getLifecycle();
        AbstractC19074t.m100207e(lifecycle, "<get-lifecycle>(...)");
        FeedMemoryPreview feedMemoryPreview4 = this.f73176I4;
        if (feedMemoryPreview4 == null) {
            AbstractC19074t.m100223u("feedMemoryPreview");
        } else {
            feedMemoryPreview2 = feedMemoryPreview4;
        }
        FeedItemZInstantLifecycleHelper.m44299a(lifecycle, feedMemoryPreview2);
    }

    /* renamed from: hU */
    public static final void m79362hU() {
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_notice_content_not_change));
    }

    /* renamed from: mU */
    private final boolean m79363mU() {
        int i11;
        ArrayList arrayList = this.f78796p1;
        if ((arrayList != null && !arrayList.isEmpty()) || ((i11 = this.f73174G4.f12058q) != 2 && i11 != 3)) {
            return false;
        }
        return true;
    }

    /* renamed from: nU */
    private final boolean m79364nU() {
        if (this.f78662F1 == null && this.f73174G4.f12058q == 17) {
            return true;
        }
        return false;
    }

    /* renamed from: oU */
    private final void m79365oU(C3020p0 c3020p0) {
        try {
            if (c3020p0.f12058q == 23) {
                mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.dc
                    public /* synthetic */ RunnableC15546dc() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        EditFeedView.m79366pU(EditFeedView.this);
                    }
                });
            } else {
                mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.ec
                    public /* synthetic */ RunnableC15583ec() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        EditFeedView.m79367qU(EditFeedView.this);
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: pU */
    public static final void m79366pU(EditFeedView editFeedView) {
        AbstractC19074t.m100208f(editFeedView, "this$0");
        editFeedView.mo79401bT();
    }

    /* renamed from: qU */
    public static final void m79367qU(EditFeedView editFeedView) {
        AbstractC19074t.m100208f(editFeedView, "this$0");
        editFeedView.m85972sP();
    }

    /* renamed from: rU */
    private final void m79368rU(C3020p0 c3020p0) {
        int i11;
        C3025q0 c3025q0 = c3020p0.f12023C;
        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.lc

            /* renamed from: q */
            public final /* synthetic */ C3025q0 f81001q;

            public /* synthetic */ RunnableC15847lc(C3025q0 c3025q02) {
                r2 = c3025q02;
            }

            @Override // java.lang.Runnable
            public final void run() {
                EditFeedView.m79371uU(EditFeedView.this, r2);
            }
        });
        C31845ac m152996J = C31845ac.m152996J();
        if (c3025q02 != null) {
            i11 = c3025q02.f12096E;
        } else {
            i11 = 0;
        }
        m152996J.m153057o0(i11, new C31845ac.e() { // from class: com.zing.zalo.ui.zviews.mc

            /* renamed from: b */
            public final /* synthetic */ C3020p0 f81121b;

            public /* synthetic */ C15884mc(C3020p0 c3020p02) {
                r2 = c3020p02;
            }

            @Override // p716zh.C31845ac.e
            /* renamed from: a */
            public final void mo39491a(int i12, String str, C31890dc c31890dc) {
                EditFeedView.m79369sU(EditFeedView.this, r2, i12, str, c31890dc);
            }
        });
    }

    /* renamed from: sU */
    public static final void m79369sU(EditFeedView editFeedView, C3020p0 c3020p0, int i11, String str, C31890dc c31890dc) {
        AbstractC19074t.m100208f(editFeedView, "this$0");
        AbstractC19074t.m100208f(c3020p0, "$feedItem");
        if (c31890dc != null) {
            editFeedView.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.hc

                /* renamed from: q */
                public final /* synthetic */ EditFeedView f80572q;

                /* renamed from: r */
                public final /* synthetic */ C31890dc f80573r;

                /* renamed from: s */
                public final /* synthetic */ C3020p0 f80574s;

                public /* synthetic */ RunnableC15694hc(EditFeedView editFeedView2, C31890dc c31890dc2, C3020p0 c3020p02) {
                    r2 = editFeedView2;
                    r3 = c31890dc2;
                    r4 = c3020p02;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EditFeedView.m79370tU(C31890dc.this, r2, r3, r4);
                }
            });
        }
    }

    /* renamed from: tU */
    public static final void m79370tU(C31890dc c31890dc, EditFeedView editFeedView, C31890dc c31890dc2, C3020p0 c3020p0) {
        AbstractC19074t.m100208f(c31890dc, "$this_apply");
        AbstractC19074t.m100208f(editFeedView, "this$0");
        AbstractC19074t.m100208f(c3020p0, "$feedItem");
        if (c31890dc.m153248s()) {
            editFeedView.m85928fS(c31890dc2, false);
            editFeedView.m85932gS();
            int m153031I = C31845ac.m152996J().m153031I(editFeedView.f78684M2.m140539P(), c31890dc);
            editFeedView.f78684M2.m140551f0(c31890dc);
            editFeedView.m85839GS(!c31890dc.m153249t(), false);
            editFeedView.m85959oS(m153031I);
            editFeedView.m85974sT();
        } else {
            editFeedView.m85906ZR(c31890dc, true);
        }
        if (c3020p0.f12058q == 1) {
            editFeedView.m85894WN();
            AbstractC2379w.m12432f(editFeedView.f78756f1);
        }
    }

    /* renamed from: uU */
    public static final void m79371uU(EditFeedView editFeedView, C3025q0 c3025q0) {
        int i11;
        CharSequence charSequence;
        AbstractC19074t.m100208f(editFeedView, "this$0");
        StatusComposeEditText statusComposeEditText = editFeedView.f78756f1;
        C23672c[] c23672cArr = null;
        if (statusComposeEditText != null) {
            if (c3025q0 != null) {
                charSequence = c3025q0.f12110a;
            } else {
                charSequence = null;
            }
            if (charSequence == null) {
                charSequence = "";
            }
            statusComposeEditText.setText(charSequence);
        }
        Editable text = editFeedView.f78756f1.getText();
        if (text != null) {
            Editable text2 = editFeedView.f78756f1.getText();
            if (text2 != null) {
                i11 = text2.length();
            } else {
                i11 = 0;
            }
            c23672cArr = (C23672c[]) text.getSpans(0, i11, C23672c.class);
        }
        if (c23672cArr != null) {
            Iterator m100149a = AbstractC19044c.m100149a(c23672cArr);
            while (m100149a.hasNext()) {
                C23672c c23672c = (C23672c) m100149a.next();
                Editable text3 = editFeedView.f78756f1.getText();
                if (text3 != null) {
                    text3.removeSpan(c23672c);
                }
            }
        }
    }

    /* renamed from: vU */
    private final void m79373vU(C3000l0 c3000l0) {
        SongInfo songInfo;
        this.f73175H4 = c3000l0;
        C3020p0 m14322a0 = c3000l0.m14322a0();
        if (m14322a0 != null) {
            this.f73174G4 = m14322a0;
            this.f78774j3 = m14322a0.f12023C.f12127r.m95929b();
        }
        if (this.f73174G4.f12058q == 23) {
            if (this.f78783l4 == null) {
                this.f78783l4 = ProfilePreviewAlbumItem.Companion.m46320b();
            }
            this.f78783l4.setId(this.f73174G4.f12023C.f12106O.m13958a());
            this.f78783l4.setThumb(this.f73174G4.f12023C.f12106O.m13961d());
            this.f78783l4.setTitle(this.f73174G4.f12023C.f12106O.m13962e());
            this.f78783l4.setSize(this.f73174G4.f12023C.f12107P.size());
            this.f78783l4.setThemeInfo(this.f73174G4.f12023C.f12106O.m13960c());
        }
        if (C20791e.f102159a.m108488d() && (songInfo = this.f73174G4.f12023C.f12108Q) != null) {
            this.f78766h3.m104604C0(songInfo.m45182d());
            this.f78766h3.m104634n0(this.f73174G4.f12023C.f12108Q.m45181c());
        }
        ArrayList arrayList = this.f73174G4.f12033M;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.f73174G4.f12034N;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        C3020p0 c3020p0 = this.f73174G4;
        m79340KU(c3020p0);
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.ac

            /* renamed from: q */
            public final /* synthetic */ C3020p0 f79802q;

            public /* synthetic */ RunnableC15432ac(C3020p0 c3020p02) {
                r2 = c3020p02;
            }

            @Override // java.lang.Runnable
            public final void run() {
                EditFeedView.m79375wU(EditFeedView.this, r2);
            }
        });
    }

    /* renamed from: wU */
    public static final void m79375wU(EditFeedView editFeedView, C3020p0 c3020p0) {
        AbstractC19074t.m100208f(editFeedView, "this$0");
        AbstractC19074t.m100208f(c3020p0, "$this_apply");
        editFeedView.m79327DU(c3020p0);
        editFeedView.m79368rU(c3020p0);
        editFeedView.m79325CU(c3020p0);
        editFeedView.m79377xU(c3020p0);
        editFeedView.m79331FU(c3020p0);
        editFeedView.m79335HU(c3020p0);
        editFeedView.m79381zU(c3020p0);
        editFeedView.m79365oU(c3020p0);
    }

    /* renamed from: xU */
    private final void m79377xU(C3020p0 c3020p0) {
        C3025q0.b bVar;
        C3025q0 c3025q0 = c3020p0.f12023C;
        if (c3025q0 != null && (bVar = c3025q0.f12134y) != null) {
            LinkAttachment linkAttachment = new LinkAttachment();
            this.f78701R1 = linkAttachment;
            linkAttachment.f42624p = bVar.f12141d;
            linkAttachment.f42625q = bVar.f12138a;
            linkAttachment.f42627s = bVar.f12143f;
            linkAttachment.f42628t = bVar.f12142e;
            linkAttachment.f42626r = bVar.f12139b;
            linkAttachment.f42631w = bVar.f12144g;
            linkAttachment.f42632x = bVar.f12145h;
            linkAttachment.f42633y = bVar.f12146i;
            mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.oc
                public /* synthetic */ RunnableC15977oc() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EditFeedView.m79379yU(EditFeedView.this);
                }
            });
        }
        this.f78741b2 = c3020p0.f12023C.f12100I;
    }

    /* renamed from: yU */
    public static final void m79379yU(EditFeedView editFeedView) {
        AbstractC19074t.m100208f(editFeedView, "this$0");
        editFeedView.m85958oR();
    }

    /* renamed from: zU */
    private final void m79381zU(C3020p0 c3020p0) {
        InterfaceC22508f interfaceC22508f;
        if (c3020p0.f12058q == 22) {
            C3025q0 c3025q0 = c3020p0.f12023C;
            if (c3025q0 != null) {
                C17244x0 c17244x0 = c3025q0.f12104M;
                if (c17244x0 != null) {
                    interfaceC22508f = c17244x0.m92064b();
                } else {
                    interfaceC22508f = null;
                }
                mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.bc

                    /* renamed from: q */
                    public final /* synthetic */ EditFeedView f79912q;

                    /* renamed from: r */
                    public final /* synthetic */ C3025q0 f79913r;

                    public /* synthetic */ RunnableC15469bc(EditFeedView this, C3025q0 c3025q02) {
                        r2 = this;
                        r3 = c3025q02;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        EditFeedView.m79321AU(InterfaceC22508f.this, r2, r3);
                    }
                });
            }
            m85894WN();
            return;
        }
        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.cc
            public /* synthetic */ RunnableC15505cc() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                EditFeedView.m79323BU(EditFeedView.this);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView
    /* renamed from: AR */
    protected void mo79382AR() {
        try {
            if (this.f78712U0) {
                AbstractC2379w.m12430d(this.f78756f1);
            }
            if (m92648SI() != null) {
                Bundle m83056qM = ProfilePickerView.m83056qM(new ArrayList(this.f78736a1.values()), 20, AbstractC23136l9.m118743r0(AbstractC8020f0.profile_picker_tag_activity_title));
                m83056qM.putBoolean("extra_show_text_instead_icon", true);
                m83056qM.putBoolean("allow_empty_pick", true);
                m83056qM.putBoolean("extra_use_data_from_picker", true);
                if (m85905ZP()) {
                    m83056qM.putLong("extra_album_id_to_get_friend_list_privacy", this.f78783l4.getId());
                    m83056qM.putLong("extra_album_privacy_type_to_get_friend_list_privacy", this.f78783l4.getPrivacyType());
                }
                C17487o0 m92662fJ = m92662fJ();
                if (m92662fJ != null) {
                    m92662fJ.m93066i2(ProfilePickerView.class, m83056qM, 1007, 1, true);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView
    /* renamed from: BS */
    protected void mo79383BS(int i11) {
        try {
            int i12 = 3;
            if (this.f78709T1 && i11 != 3) {
                ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_status_mode_conflict_msg, mo79388FO(3), mo79388FO(i11)));
            } else {
                int i13 = this.f73174G4.f12058q;
                if (i13 != 2 && i13 != 3) {
                    if (i13 != 7) {
                        if (i13 != 17) {
                            if (i13 != 24) {
                                i12 = 0;
                            }
                        } else {
                            i12 = 5;
                        }
                    }
                } else {
                    i12 = 4;
                }
                ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_status_mode_conflict_msg, mo79388FO(i12), mo79388FO(i11)));
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView
    /* renamed from: CR */
    public Bundle mo79384CR() {
        Bundle mo79384CR = super.mo79384CR();
        mo79384CR.putInt("extra_preload_grid_mode", -1);
        AbstractC19074t.m100205c(mo79384CR);
        return mo79384CR;
    }

    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView
    /* renamed from: DN */
    protected boolean mo79385DN() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView
    /* renamed from: EO */
    protected int mo79386EO() {
        return AbstractC7409c0.edit_feed_view;
    }

    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView
    /* renamed from: ER */
    public void mo79387ER() {
        m79397QT();
        if (this.f73174G4.f12058q == 22) {
            m79359dU();
        } else {
            super.mo79387ER();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView, com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        AbstractC19074t.m100208f(actionBarMenu, "menu");
        super.mo37482FJ(actionBarMenu);
        Button button = this.f78707S3;
        if (button != null) {
            button.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.save));
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView
    /* renamed from: FO */
    public String mo79388FO(int i11) {
        String str;
        int i12;
        if (i11 != 0) {
            try {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                if (i11 == 6) {
                                    if (!m85950mP() && (i12 = this.f73174G4.f12058q) != 2 && i12 != 3) {
                                        if (!m85969rP() && this.f73174G4.f12058q != 17) {
                                            if (!m85943kP()) {
                                                str = "";
                                            } else {
                                                str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_status_mode_link);
                                            }
                                            AbstractC19074t.m100205c(str);
                                        }
                                        str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_status_mode_video);
                                        AbstractC19074t.m100205c(str);
                                    }
                                    str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_status_mode_photos);
                                    AbstractC19074t.m100205c(str);
                                } else {
                                    throw new IllegalArgumentException("Invalid mode: " + i11);
                                }
                            } else {
                                str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_status_mode_video);
                                AbstractC19074t.m100207e(str, "getString(...)");
                            }
                        } else {
                            str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_status_mode_photos);
                            AbstractC19074t.m100207e(str, "getString(...)");
                        }
                    } else {
                        str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_status_mode_link);
                        AbstractC19074t.m100207e(str, "getString(...)");
                    }
                } else {
                    str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_status_mode_sticker);
                    AbstractC19074t.m100207e(str, "getString(...)");
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                return "";
            }
        } else {
            str = "Text";
        }
        return str;
    }

    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView
    /* renamed from: JR */
    public void mo79389JR() {
        if (!this.f73184Q4) {
            if (this.f73174G4.m14496a0()) {
                super.mo79389JR();
                return;
            } else {
                m85886UO();
                return;
            }
        }
        super.mo79389JR();
    }

    /* renamed from: JU */
    public final void m79390JU(boolean z11) {
        this.f73182O4 = z11;
    }

    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView
    /* renamed from: LO */
    public Intent mo79391LO() {
        Intent mo79391LO = super.mo79391LO();
        if (mo79391LO != null) {
            mo79391LO.putExtra("EXTRA_NEW_FEED_RESULTS", AbstractC20826v0.m108827p(this.f73175H4).toString());
        }
        AbstractC19074t.m100205c(mo79391LO);
        return mo79391LO;
    }

    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView
    /* renamed from: LP */
    public void mo79392LP() {
        super.mo79392LP();
        m79361gU();
        ComposeSongItemView composeSongItemView = this.f78832y1;
        if (composeSongItemView != null) {
            composeSongItemView.m43590d0();
        }
    }

    /* renamed from: LU */
    public final void m79393LU(C3020p0 c3020p0) {
        AbstractC19074t.m100208f(c3020p0, "feedItem");
        int i11 = c3020p0.f12058q;
        if (i11 != 2 && i11 != 3) {
            if (i11 != 7) {
                if (i11 != 17) {
                    if (i11 != 23) {
                        if (i11 != 24) {
                            m85897WS(0);
                            return;
                        } else {
                            m85897WS(3);
                            return;
                        }
                    }
                    if (c3020p0.m14508h0()) {
                        m85897WS(5);
                        return;
                    } else {
                        m85897WS(4);
                        return;
                    }
                }
                m85897WS(5);
                return;
            }
            m85897WS(3);
            return;
        }
        m85897WS(4);
    }

    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView
    /* renamed from: NO */
    protected CharSequence mo79394NO() {
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_dialog_cancel_edit_feed_msg_general);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        return m118743r0;
    }

    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView
    /* renamed from: QO */
    protected String mo79395QO() {
        return "edit_feed_multi_photo";
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x006f, code lost:            if (r10.m14508h0() == false) goto L115;     */
    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView
    /* renamed from: QP */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected boolean mo79396QP(int i11) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        C3020p0 c3020p0;
        int i12;
        int i13 = this.f78803q4;
        if (i13 == i11) {
            return false;
        }
        if (i13 != 0 && i11 != 0 && i13 != 6 && i11 != 6) {
            return true;
        }
        if (i11 != 0 && i11 != 6 && this.f73174G4.f12058q == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i11 != 3 && (m85943kP() || this.f78709T1)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (i11 != 2 && (m85965qP() || this.f73174G4.f12058q == 6)) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (i11 != 4 && (m85950mP() || (i12 = (c3020p0 = this.f73174G4).f12058q) == 2 || i12 == 3 || c3020p0.m14505f0())) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (i11 != 5) {
            if (!m85969rP()) {
                C3020p0 c3020p02 = this.f73174G4;
                if (c3020p02.f12058q != 17) {
                }
            }
            z15 = true;
            if (z11 && !z12 && !z13 && !z14 && !z15) {
                return false;
            }
            return true;
        }
        z15 = false;
        if (z11) {
        }
        return true;
    }

    /* renamed from: QT */
    public final void m79397QT() {
        TrackingSource trackingSource = this.f78698Q2;
        if (trackingSource != null) {
            trackingSource.m40677a("editCaption", Boolean.valueOf(m79407iU()));
            this.f78698Q2.m40677a("editPrivacy", Boolean.valueOf(m79412kU()));
            if (m85950mP()) {
                this.f78698Q2.m40677a("editMedia", Boolean.valueOf(m79410jU()));
            } else if (m85969rP()) {
                this.f78698Q2.m40677a("editMedia", Boolean.valueOf(m79415lU()));
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView, com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        bundle.putBoolean("EXTRA_SAVE_IS_PICKED_VIDEO", this.f73183P4);
        bundle.putBoolean("EXTRA_SAVE_IS_PICKED_LOCATION", this.f73184Q4);
    }

    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView
    /* renamed from: SN */
    public void mo79398SN() {
        int i11 = this.f73174G4.f12058q;
        if (i11 != 1 && i11 != 6 && i11 != 2 && i11 != 3 && i11 != 17 && i11 != 23 && i11 != 22) {
            super.mo79398SN();
            return;
        }
        QuickPickerView quickPickerView = this.f78716V0;
        if (quickPickerView != null) {
            quickPickerView.m71212GO(0);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView
    /* renamed from: TS */
    protected void mo79399TS(boolean z11) {
        C0732w.Companion.m1189a().m1187q(mo79395QO(), "", mo79400ZN(z11), null);
    }

    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView
    /* renamed from: ZN */
    protected C0708i mo79400ZN(boolean z11) {
        C0708i c0708i;
        String str;
        try {
            if (!z11) {
                this.f78806r3.m1072c("status", 1);
                this.f78806r3.m1072c("final_layout", this.f78774j3);
                this.f78806r3.m1072c("final_photo_count", this.f78796p1.size());
                this.f78806r3.m1072c("before_edit_layout", this.f73177J4);
                if (C23212s8.m119603k()) {
                    c0708i = this.f78806r3;
                    str = "light";
                } else {
                    c0708i = this.f78806r3;
                    str = "dark";
                }
                c0708i.m1075f("post_theme", str);
            } else {
                this.f78806r3.m1072c("status", 0);
            }
            this.f78806r3.m1072c("click_layout_button_count", this.f78814t3);
            this.f78806r3.m1072c("click_preview_background_count", this.f78818u3);
            JSONObject jSONObject = new JSONObject();
            int length = this.f78810s3.length;
            for (int i11 = 0; i11 < length; i11++) {
                jSONObject.put(String.valueOf(i11), this.f78810s3[i11]);
            }
            this.f78806r3.m1074e("layout_choice_count", jSONObject);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        C0708i c0708i2 = this.f78806r3;
        AbstractC19074t.m100207e(c0708i2, "trackingData");
        return c0708i2;
    }

    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView
    /* renamed from: bT */
    public void mo79401bT() {
        if (this.f73174G4.f12058q == 23) {
            super.mo79401bT();
        } else {
            m85972sP();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView
    /* renamed from: eP */
    protected void mo79402eP(C25630b c25630b) {
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_notice_content_not_change));
    }

    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView
    /* renamed from: eT */
    public void mo79403eT() {
        super.mo79403eT();
        this.f78732Z0.setShowAlbum(false);
        this.f78644A1.setShowAlbum(false);
        this.f78732Z0.setShowMusic(false);
        this.f78644A1.setShowMusic(false);
    }

    /* renamed from: eU */
    public final void m79404eU(C3020p0 c3020p0) {
        CharSequence charSequence;
        AbstractC19074t.m100208f(c3020p0, "feedItem");
        C3025q0 c3025q0 = c3020p0.f12023C;
        if (c3025q0 != null) {
            charSequence = c3025q0.f12110a;
        } else {
            charSequence = null;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        this.f73178K4 = charSequence;
        PrivacyInfo privacyInfo = c3020p0.f12042V;
        AbstractC19074t.m100207e(privacyInfo, "privacyInfo");
        this.f73179L4 = privacyInfo;
    }

    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView
    /* renamed from: hP */
    public void mo79405hP() {
        C17391z m108789V;
        if (!this.f73183P4) {
            Bundle bundle = new Bundle();
            bundle.putInt("EXTRA_INT_REQUEST_CODE", 10014);
            bundle.putBoolean("EXTRA_BOOL_HIDE_FEED_CONTROL_LAYOUT", true);
            bundle.putInt("EXTRA_SOURCE_OPEN_FROM", 1);
            C3020p0 c3020p0 = this.f73174G4;
            if (c3020p0.f12058q == 23) {
                m108789V = AbstractC20826v0.m108787U(c3020p0, 0);
            } else {
                m108789V = AbstractC20826v0.m108789V(c3020p0);
            }
            C20043e.m104032w(m92676n2(), this.f73174G4, m108789V, 1, bundle, null);
            return;
        }
        super.mo79405hP();
    }

    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView
    /* renamed from: hR */
    protected void mo79406hR() {
        C3020p0 c3020p0;
        String str;
        int m104529e;
        try {
            ArrayList<C3000l0> m137786e = C26767v.m137782d().m137786e();
            long mo124311f = C23793c.Companion.m124321a().mo124311f();
            JSONArray jSONArray = new JSONArray();
            if (m137786e != null) {
                for (C3000l0 c3000l0 : m137786e) {
                    if (c3000l0 != null) {
                        c3020p0 = c3000l0.m14322a0();
                    } else {
                        c3020p0 = null;
                    }
                    if (c3020p0 != null) {
                        JSONObject jSONObject = new JSONObject();
                        C3020p0 m14322a0 = c3000l0.m14322a0();
                        AbstractC19074t.m100205c(m14322a0);
                        if (m14322a0.m14488S()) {
                            str = "1";
                        } else {
                            str = "0";
                        }
                        jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, str);
                        C3020p0 m14322a02 = c3000l0.m14322a0();
                        AbstractC19074t.m100205c(m14322a02);
                        m104529e = AbstractC20104d.m104529e(((float) (mo124311f - m14322a02.f12062u)) / 3600000.0f);
                        jSONObject.put("time_in_queue", m104529e);
                        jSONArray.put(jSONObject);
                    }
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("size", jSONArray.length());
            jSONObject2.put("local_feeds", jSONArray);
            C0815e1.m2075D().m2100V(new C23648e(57, "form_edit_feed", 0, "post_feed_with_queue_local", jSONObject2.toString()), false);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: iU */
    public final boolean m79407iU() {
        return !TextUtils.equals(this.f73178K4, this.f78764h1);
    }

    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView
    /* renamed from: jO */
    protected void mo79408jO() {
        boolean z11;
        C20112a c20112a = this.f78766h3;
        String str = this.f78764h1;
        AbstractC19074t.m100207e(str, "mDescription");
        LinkAttachment linkAttachment = this.f78701R1;
        C3023p3 c3023p3 = this.f78741b2;
        C3003l3 m85980vO = m85980vO();
        C3063z0 c3063z0 = this.f78745c2;
        PrivacyInfo m85818AO = m85818AO();
        C31890dc m85824CO = m85824CO();
        TrackingSource trackingSource = this.f78698Q2;
        boolean z12 = true;
        if (this.f78748d1 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        C3000l0 c3000l0 = this.f73175H4;
        if (!m79364nU() && !m79363mU()) {
            z12 = false;
        }
        c20112a.m104638r0(str, linkAttachment, c3023p3, m85980vO, c3063z0, m85818AO, m85824CO, trackingSource, z11, c3000l0, z12, this.f73173F4);
    }

    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView
    /* renamed from: jS */
    public void mo79409jS(boolean z11) {
        super.mo79409jS(z11);
        m79340KU(this.f73174G4);
    }

    /* renamed from: jU */
    public final boolean m79410jU() {
        int i11;
        int i12;
        ArrayList arrayList = this.f78796p1;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = this.f78796p1;
            AbstractC19074t.m100207e(arrayList2, "mUploadPhotos");
            if ((arrayList2 instanceof Collection) && arrayList2.isEmpty()) {
                i12 = 0;
            } else {
                Iterator it = arrayList2.iterator();
                i12 = 0;
                while (it.hasNext()) {
                    if (((MediaItem) it.next()).m41174v0() && (i12 = i12 + 1) < 0) {
                        AbstractC25368s.m131508p();
                    }
                }
            }
            i11 = this.f78796p1.size();
        } else {
            i11 = 0;
            i12 = 0;
        }
        if (i11 == this.f73180M4 && i11 == i12) {
            return false;
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView
    /* renamed from: kO */
    protected void mo79411kO() {
        boolean z11;
        C20112a c20112a = this.f78766h3;
        String str = this.f78764h1;
        AbstractC19074t.m100207e(str, "mDescription");
        C3003l3 m85980vO = m85980vO();
        C3063z0 c3063z0 = this.f78745c2;
        PrivacyInfo m85818AO = m85818AO();
        C31890dc m85824CO = m85824CO();
        TrackingSource trackingSource = this.f78698Q2;
        boolean z12 = true;
        if (this.f78748d1 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        C3000l0 c3000l0 = this.f73175H4;
        if (!m79364nU() && !m79363mU()) {
            z12 = false;
        }
        c20112a.m104643w0(str, m85980vO, c3063z0, m85818AO, m85824CO, trackingSource, z11, c3000l0, z12, this.f73173F4);
    }

    /* renamed from: kU */
    public final boolean m79412kU() {
        if (this.f73179L4.f45973p != m85818AO().f45973p) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView
    /* renamed from: lO */
    protected void mo79413lO() {
        long j11;
        boolean z11;
        boolean z12;
        int m131209i0;
        int m131209i02;
        boolean z13;
        boolean z14;
        try {
            this.f78752e1 = false;
            List m71242VL = this.f78716V0.m71242VL();
            AbstractC19074t.m100207e(m71242VL, "getAllMediaItems(...)");
            ProfilePreviewAlbumItem profilePreviewAlbumItem = this.f78783l4;
            if (profilePreviewAlbumItem != null) {
                j11 = profilePreviewAlbumItem.getId();
            } else {
                j11 = 0;
            }
            long j12 = j11;
            C2949b m108833s = AbstractC20826v0.m108833s(this.f78783l4);
            if (m85845IO() == 1) {
                MediaItem mediaItem = (MediaItem) this.f78796p1.get(0);
                m131209i02 = AbstractC25332a0.m131209i0(m71242VL, mediaItem);
                mediaItem.m41135Z0(m131209i02);
                C20112a c20112a = this.f78766h3;
                String str = this.f78764h1;
                AbstractC19074t.m100207e(str, "mDescription");
                AbstractC19074t.m100205c(mediaItem);
                C3003l3 m85980vO = m85980vO();
                AbstractC19074t.m100207e(m85980vO, "generateLocalTagInfo(...)");
                C3063z0 c3063z0 = this.f78745c2;
                PrivacyInfo m85818AO = m85818AO();
                C31890dc m85824CO = m85824CO();
                TrackingSource trackingSource = this.f78698Q2;
                AbstractC19074t.m100207e(trackingSource, "trackingSource");
                SongInfo songInfo = this.f78758f3;
                if (this.f78748d1 != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                C3000l0 c3000l0 = this.f73175H4;
                if (!m79364nU() && !m79363mU()) {
                    z14 = false;
                    c20112a.m104641u0(str, mediaItem, m85980vO, c3063z0, m85818AO, m85824CO, trackingSource, j12, m108833s, songInfo, z13, c3000l0, z14, this.f73173F4);
                    return;
                }
                z14 = true;
                c20112a.m104641u0(str, mediaItem, m85980vO, c3063z0, m85818AO, m85824CO, trackingSource, j12, m108833s, songInfo, z13, c3000l0, z14, this.f73173F4);
                return;
            }
            if (m85845IO() > 1) {
                Iterator it = this.f78796p1.iterator();
                while (it.hasNext()) {
                    MediaItem mediaItem2 = (MediaItem) it.next();
                    if (mediaItem2 != null) {
                        m131209i0 = AbstractC25332a0.m131209i0(m71242VL, mediaItem2);
                        mediaItem2.m41135Z0(m131209i0);
                    }
                }
                C20112a c20112a2 = this.f78766h3;
                String str2 = this.f78764h1;
                AbstractC19074t.m100207e(str2, "mDescription");
                ArrayList arrayList = this.f78796p1;
                AbstractC19074t.m100207e(arrayList, "mUploadPhotos");
                boolean z15 = this.f78730Y2;
                C3003l3 m85980vO2 = m85980vO();
                C3063z0 c3063z02 = this.f78745c2;
                PrivacyInfo m85818AO2 = m85818AO();
                C31890dc m85824CO2 = m85824CO();
                TrackingSource trackingSource2 = this.f78698Q2;
                SongInfo songInfo2 = this.f78758f3;
                if (this.f78748d1 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C3000l0 c3000l02 = this.f73175H4;
                if (!m79364nU() && !m79363mU()) {
                    z12 = false;
                    c20112a2.m104640t0(str2, arrayList, z15, m85980vO2, c3063z02, m85818AO2, m85824CO2, trackingSource2, j12, m108833s, songInfo2, z11, c3000l02, z12, this.f73173F4, this.f78778k3);
                    mo79399TS(false);
                }
                z12 = true;
                c20112a2.m104640t0(str2, arrayList, z15, m85980vO2, c3063z02, m85818AO2, m85824CO2, trackingSource2, j12, m108833s, songInfo2, z11, c3000l02, z12, this.f73173F4, this.f78778k3);
                mo79399TS(false);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            mo78960q3();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView
    /* renamed from: lR */
    public void mo79414lR(C18460c c18460c) {
        this.f73184Q4 = true;
        super.mo79414lR(c18460c);
    }

    /* renamed from: lU */
    public final boolean m79415lU() {
        C27373c c27373c = this.f78662F1;
        if (c27373c != null && AbstractC19074t.m100204b(this.f73181N4, c27373c.m140220E())) {
            return false;
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView
    /* renamed from: mO */
    protected void mo79416mO() {
        boolean z11;
        C20112a c20112a = this.f78766h3;
        String str = this.f78764h1;
        AbstractC19074t.m100207e(str, "mDescription");
        C25630b c25630b = this.f78683M1;
        C3003l3 m85980vO = m85980vO();
        C3063z0 c3063z0 = this.f78745c2;
        PrivacyInfo m85818AO = m85818AO();
        AbstractC19074t.m100207e(m85818AO, "getCurrentPrivacyApplying(...)");
        C31890dc m85824CO = m85824CO();
        TrackingSource trackingSource = this.f78698Q2;
        boolean z12 = true;
        if (this.f78748d1 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        C3000l0 c3000l0 = this.f73175H4;
        if (!m79364nU() && !m79363mU()) {
            z12 = false;
        }
        c20112a.m104642v0(str, c25630b, m85980vO, c3063z0, m85818AO, m85824CO, trackingSource, z11, c3000l0, z12, this.f73173F4);
    }

    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView
    /* renamed from: nO */
    protected void mo79417nO() {
        boolean z11;
        C20112a c20112a = this.f78766h3;
        String str = this.f78764h1;
        AbstractC19074t.m100207e(str, "mDescription");
        C27373c c27373c = this.f78662F1;
        C3003l3 m85980vO = m85980vO();
        C3063z0 c3063z0 = this.f78745c2;
        PrivacyInfo m85818AO = m85818AO();
        String str2 = this.f78665G1;
        C31890dc m85824CO = m85824CO();
        TrackingSource trackingSource = this.f78698Q2;
        ProfilePreviewAlbumItem profilePreviewAlbumItem = this.f78783l4;
        boolean z12 = true;
        if (this.f78748d1 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        C3000l0 c3000l0 = this.f73175H4;
        if (!m79364nU() && !m79363mU()) {
            z12 = false;
        }
        c20112a.m104644x0(str, c27373c, m85980vO, c3063z0, m85818AO, str2, m85824CO, trackingSource, profilePreviewAlbumItem, z11, c3000l0, z12, this.f73173F4);
    }

    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView
    /* renamed from: nP */
    public boolean mo79418nP() {
        if (!super.mo79418nP() && this.f73174G4.f12058q != 22) {
            return false;
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView
    /* renamed from: nT */
    public void mo79419nT() {
        if (!m79363mU() && !m79364nU() && this.f73174G4.f12058q != 22) {
            super.mo79419nT();
        } else {
            this.f78707S3.setEnabled(true);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView, android.view.View.OnClickListener
    public void onClick(View view) {
        Integer num;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int i11 = AbstractC6918a0.feed_sticker_preview_delete;
        if (num == null || num.intValue() != i11) {
            int i12 = AbstractC6918a0.link_preview_delete;
            if (num == null || num.intValue() != i12) {
                int i13 = AbstractC6918a0.container_detail_album;
                if (num == null || num.intValue() != i13) {
                    int i14 = AbstractC6918a0.btn_post_attach_link;
                    if (num == null || num.intValue() != i14) {
                        super.onClick(view);
                        return;
                    }
                    return;
                }
            }
        }
        ToastUtils.m89266n(AbstractC8020f0.str_edit_feed_cannot_edit, new Object[0]);
    }

    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView
    /* renamed from: pO */
    public boolean mo79420pO() {
        if (this.f73174G4.m14508h0()) {
            return false;
        }
        return super.mo79420pO();
    }

    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView
    /* renamed from: pR */
    public void mo79421pR() {
        if (!m79363mU() && !m79364nU()) {
            m79353XT();
        } else {
            ToastUtils.m89266n(AbstractC8020f0.str_edit_feed_empty_content, new Object[0]);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView
    /* renamed from: qR */
    public void mo79422qR(C27373c c27373c, String str) {
        this.f73183P4 = true;
        super.mo79422qR(c27373c, str);
    }

    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView
    /* renamed from: tT */
    protected void mo79423tT(C3000l0 c3000l0) {
        AbstractC19074t.m100208f(c3000l0, "feedContent");
        m85964qO(new Runnable() { // from class: com.zing.zalo.ui.zviews.nc
            public /* synthetic */ RunnableC15939nc() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                EditFeedView.m79343MU(EditFeedView.this);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:            r1 = r0.m14322a0();     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:            if (r1 == null) goto L70;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:            r4.f73174G4 = r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:            m79393LU(r4.f73174G4);        m79404eU(r4.f73174G4);     */
    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo37135xJ(Bundle bundle) {
        C32002l4 m154287a;
        C3000l0 c3000l0;
        C3020p0 m14322a0;
        String string;
        try {
            super.mo37135xJ(bundle);
            Bundle m92642L3 = m92642L3();
            if (m92642L3 != null) {
                if (m92642L3.containsKey("EXTRA_ENTRY_POINT_CHAIN")) {
                    m154287a = C32002l4.Companion.m154292f(m92642L3.getString("EXTRA_ENTRY_POINT_CHAIN")).m154271a(IMediaPlayer.MEDIA_INFO_HAVE_DATA_STREAM);
                } else {
                    m154287a = C32002l4.Companion.m154287a(IMediaPlayer.MEDIA_INFO_HAVE_DATA_STREAM);
                }
                this.f78698Q2 = C32017m4.m154326S().m154375u(m154287a);
                String string2 = m92642L3.getString("EXTRA_FEED_ID", "");
                AbstractC19074t.m100207e(string2, "getString(...)");
                this.f73173F4 = string2;
                if (!TextUtils.isEmpty(string2)) {
                    c3000l0 = C26878b.m138449b().m138451c(this.f73173F4);
                } else {
                    c3000l0 = null;
                }
                if (c3000l0 == null && (string = m92642L3.getString("EXTRA_FEED_CONTENT_JSON")) != null && string.length() != 0) {
                    c3000l0 = AbstractC20826v0.m108750B0(new JSONObject(string));
                }
                if (bundle == null) {
                    if (c3000l0 != null) {
                        m79373vU(c3000l0);
                    }
                } else {
                    this.f73183P4 = bundle.getBoolean("EXTRA_SAVE_IS_PICKED_VIDEO");
                    this.f73184Q4 = bundle.getBoolean("EXTRA_SAVE_IS_PICKED_LOCATION");
                }
                if (c3000l0 != null && (m14322a0 = c3000l0.m14322a0()) != null) {
                    int m95929b = m14322a0.f12023C.f12127r.m95929b();
                    this.f78774j3 = m95929b;
                    int[] iArr = this.f78810s3;
                    iArr[m95929b] = iArr[m95929b] + 1;
                    this.f73177J4 = m95929b;
                    this.f78832y1.m43592f0(m95929b);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView
    /* renamed from: xS */
    protected void mo79424xS() {
    }

    @Override // com.zing.zalo.p077ui.zviews.UpdateStatusView
    /* renamed from: yR */
    public void mo79425yR() {
        m79358cU(new C14233f(), false, true);
    }
}
