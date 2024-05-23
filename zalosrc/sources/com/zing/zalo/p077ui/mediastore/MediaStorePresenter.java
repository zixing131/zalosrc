package com.zing.zalo.p077ui.mediastore;

import ag0.C0815e1;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.AbstractC1765e;
import androidx.lifecycle.InterfaceC1767f;
import androidx.lifecycle.InterfaceC1801w;
import au.EnumC2344e0;
import au.EnumC2363o;
import au.EnumC2382z;
import b40.C2535j;
import b40.C2549x;
import ci.C3499e0;
import ci.C3508j;
import ci.C3509j0;
import ci.C3510k;
import ci.C3518o;
import ci.C3521p0;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.control.mediastore.CreateMediaStoreParam;
import com.zing.zalo.control.mediastore.MSFilterData;
import com.zing.zalo.p077ui.mediastore.InterfaceC12361f;
import com.zing.zalo.p077ui.mediastore.MediaStoreBasePage;
import com.zing.zalo.p077ui.mediastore.MediaStoreView;
import com.zing.zalo.p077ui.mediastore.search.MediaStoreQuickSearchListView;
import com.zing.zalo.p077ui.mediastore.search.MediaStoreSearchPage;
import com.zing.zalo.p077ui.mediastore.search.MediaStoreSuggestSearchView;
import com.zing.zalo.usecase.mediastore.SearchGeneralMS;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import en0.InterfaceC18494a;
import fe0.C18892a;
import fe0.C18898g;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import me0.AbstractC23184q2;
import mm0.AbstractC23350e;
import p131ei.C18434b;
import p205hc.AbstractC19962a;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p461qu.AbstractC25495a;
import p716zh.C31862c;
import pm0.AbstractC24856m;
import pm0.AbstractC24866w;
import pm0.C24860q;
import pm0.InterfaceC24854k;
import qm0.AbstractC25361o0;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import x70.C29448r;
import x70.InterfaceC29445q;

/* loaded from: classes6.dex */
public final class MediaStorePresenter extends AbstractC19962a implements InterfaceC1767f {

    /* renamed from: A */
    private boolean f64067A;

    /* renamed from: B */
    private boolean f64068B;

    /* renamed from: C */
    private boolean f64069C;

    /* renamed from: D */
    private boolean f64070D;

    /* renamed from: E */
    private boolean f64071E;

    /* renamed from: F */
    private boolean f64072F;

    /* renamed from: G */
    private boolean f64073G;

    /* renamed from: H */
    private int f64074H;

    /* renamed from: I */
    private String f64075I;

    /* renamed from: J */
    private long f64076J;

    /* renamed from: K */
    private long f64077K;

    /* renamed from: L */
    private EnumC2344e0 f64078L;

    /* renamed from: M */
    private int f64079M;

    /* renamed from: N */
    private final InterfaceC24854k f64080N;

    /* renamed from: O */
    private final InterfaceC24854k f64081O;

    /* renamed from: P */
    private final InterfaceC24854k f64082P;

    /* renamed from: Q */
    private final InterfaceC24854k f64083Q;

    /* renamed from: R */
    private final InterfaceC24854k f64084R;

    /* renamed from: S */
    private final InterfaceC24854k f64085S;

    /* renamed from: t */
    private C3499e0 f64086t;

    /* renamed from: u */
    private final Object f64087u;

    /* renamed from: v */
    private final InterfaceC24854k f64088v;

    /* renamed from: w */
    private final InterfaceC24854k f64089w;

    /* renamed from: x */
    private boolean f64090x;

    /* renamed from: y */
    private boolean f64091y;

    /* renamed from: z */
    private boolean f64092z;

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStorePresenter$a */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C12303a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f64093a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f64094b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f64095c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f64096d;

        static {
            int[] iArr = new int[EnumC2363o.values().length];
            try {
                iArr[EnumC2363o.f9890q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2363o.f9891r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f64093a = iArr;
            int[] iArr2 = new int[EnumC2382z.values().length];
            try {
                iArr2[EnumC2382z.f9948u.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC2382z.f9945r.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC2382z.f9946s.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC2382z.f9947t.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f64094b = iArr2;
            int[] iArr3 = new int[EnumC2344e0.values().length];
            try {
                iArr3[EnumC2344e0.f9853r.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[EnumC2344e0.f9854s.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f64095c = iArr3;
            int[] iArr4 = new int[C3508j.b.values().length];
            try {
                iArr4[C3508j.b.f14700q.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[C3508j.b.f14701r.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            f64096d = iArr4;
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStorePresenter$b */
    /* loaded from: classes6.dex */
    static final class C12304b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C12304b f64097q = new C12304b();

        C12304b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C18892a mo12V4() {
            return AbstractC23306f.m120718v();
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStorePresenter$c */
    /* loaded from: classes6.dex */
    public static final class C12305c implements C18434b.e {
        C12305c() {
        }

        @Override // p131ei.C18434b.e
        /* renamed from: a */
        public void mo64321a(int i11, C31862c c31862c) {
            boolean z11;
            try {
                InterfaceC12361f interfaceC12361f = (InterfaceC12361f) MediaStorePresenter.this.m103742Dp();
                if (c31862c != null && !c31862c.m153154f() && !c31862c.f146332y && c31862c.m153155h() && c31862c.m153149a()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                interfaceC12361f.mo69314Dq(z11, c31862c);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStorePresenter$d */
    /* loaded from: classes6.dex */
    public static final class C12306d extends ActionBarMenuItem.C17435d {
        C12306d() {
        }

        @Override // com.zing.zalo.zview.actionbar.ActionBarMenuItem.C17435d
        /* renamed from: b */
        public void mo69246b() {
            MediaStorePresenter.this.f64075I = "";
            if (MediaStorePresenter.this.f64069C) {
                MediaStorePresenter.this.f64091y = false;
                MediaStorePresenter.this.m69182Vq(true);
            }
        }

        @Override // com.zing.zalo.zview.actionbar.ActionBarMenuItem.C17435d
        /* renamed from: f */
        public void mo65079f(EditText editText) {
            boolean z11;
            AbstractC19074t.m100208f(editText, "editText");
            InterfaceC12361f interfaceC12361f = (InterfaceC12361f) MediaStorePresenter.this.m103742Dp();
            Editable text = editText.getText();
            AbstractC19074t.m100207e(text, "getText(...)");
            if (text.length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            interfaceC12361f.mo69316ED(z11);
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStorePresenter$e */
    /* loaded from: classes6.dex */
    public static final class C12307e implements MediaStoreQuickSearchListView.InterfaceC12387a {
        C12307e() {
        }

        @Override // com.zing.zalo.p077ui.mediastore.search.MediaStoreQuickSearchListView.InterfaceC12387a
        /* renamed from: a */
        public void mo69247a(boolean z11) {
            MediaStorePresenter.this.m69163Lr(z11);
            MediaStorePresenter.this.m69188Yq();
        }

        @Override // com.zing.zalo.p077ui.mediastore.search.MediaStoreQuickSearchListView.InterfaceC12387a
        /* renamed from: b */
        public void mo69248b(C3518o c3518o) {
            AbstractC19074t.m100208f(c3518o, "item");
            MediaStorePresenter.this.m69146Dr(c3518o);
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStorePresenter$f */
    /* loaded from: classes6.dex */
    public static final class C12308f implements MediaStoreSuggestSearchView.InterfaceC12401d {
        C12308f() {
        }

        @Override // com.zing.zalo.p077ui.mediastore.search.MediaStoreSuggestSearchView.InterfaceC12401d
        /* renamed from: a */
        public List mo69249a() {
            return MediaStorePresenter.this.m69192ar();
        }

        @Override // com.zing.zalo.p077ui.mediastore.search.MediaStoreSuggestSearchView.InterfaceC12401d
        /* renamed from: b */
        public void mo69250b(C3518o c3518o) {
            AbstractC19074t.m100208f(c3518o, "item");
            MediaStorePresenter.this.m69180Tq(false);
            MediaStorePresenter.this.m69146Dr(c3518o);
        }

        @Override // com.zing.zalo.p077ui.mediastore.search.MediaStoreSuggestSearchView.InterfaceC12401d
        /* renamed from: c */
        public void mo69251c() {
            MediaStorePresenter.this.m69166Mr();
            C0815e1.m2075D().m2100V(new C23648e(35, "", 0, "click_on_search_by_time", ""), false);
        }

        @Override // com.zing.zalo.p077ui.mediastore.search.MediaStoreSuggestSearchView.InterfaceC12401d
        /* renamed from: d */
        public void mo69252d(long j11, long j12, String str) {
            boolean z11;
            AbstractC19074t.m100208f(str, "keyQuickSearch");
            MediaStorePresenter mediaStorePresenter = MediaStorePresenter.this;
            if (str.length() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            mediaStorePresenter.f64091y = z11;
            MediaStorePresenter.this.m69234wr(j11, j12, str);
        }

        @Override // com.zing.zalo.p077ui.mediastore.search.MediaStoreSuggestSearchView.InterfaceC12401d
        /* renamed from: e */
        public void mo69253e() {
            boolean z11;
            MediaStorePresenter mediaStorePresenter = MediaStorePresenter.this;
            if (mediaStorePresenter.f64069C && ((InterfaceC12361f) MediaStorePresenter.this.m103742Dp()).mo69367sc() == MediaStoreSuggestSearchView.EnumC12400c.f64505q) {
                z11 = true;
            } else {
                z11 = false;
            }
            mediaStorePresenter.f64072F = z11;
            if (MediaStorePresenter.this.f64069C && ((InterfaceC12361f) MediaStorePresenter.this.m103742Dp()).mo69331O5().length() == 0) {
                ((InterfaceC12361f) MediaStorePresenter.this.m103742Dp()).mo69342Xz(MediaStorePresenter.this.f64075I);
            }
            MediaStorePresenter.this.m69182Vq(false);
        }

        @Override // com.zing.zalo.p077ui.mediastore.search.MediaStoreSuggestSearchView.InterfaceC12401d
        /* renamed from: f */
        public void mo69254f(boolean z11) {
            int i11;
            if (z11) {
                ((InterfaceC12361f) MediaStorePresenter.this.m103742Dp()).mo69347da(false);
                InterfaceC12361f interfaceC12361f = (InterfaceC12361f) MediaStorePresenter.this.m103742Dp();
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ms_custom_time_hint);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                interfaceC12361f.mo69362nd(m118743r0);
                ((InterfaceC12361f) MediaStorePresenter.this.m103742Dp()).mo69342Xz("");
            } else {
                if (MediaStorePresenter.this.f64069C && ((InterfaceC12361f) MediaStorePresenter.this.m103742Dp()).mo69331O5().length() == 0) {
                    ((InterfaceC12361f) MediaStorePresenter.this.m103742Dp()).mo69342Xz(MediaStorePresenter.this.f64075I);
                }
                InterfaceC12361f interfaceC12361f2 = (InterfaceC12361f) MediaStorePresenter.this.m103742Dp();
                if (MediaStorePresenter.this.f64072F) {
                    i11 = AbstractC8020f0.str_ms_search_by_time_hint;
                } else {
                    i11 = AbstractC8020f0.str_hint_search_media;
                }
                String m118743r02 = AbstractC23136l9.m118743r0(i11);
                AbstractC19074t.m100205c(m118743r02);
                interfaceC12361f2.mo69362nd(m118743r02);
            }
            ((InterfaceC12361f) MediaStorePresenter.this.m103742Dp()).mo69356jq(!z11);
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStorePresenter$g */
    /* loaded from: classes6.dex */
    public static final class C12309g implements InterfaceC29445q {
        C12309g() {
        }

        @Override // x70.InterfaceC29445q
        /* renamed from: I3 */
        public void mo69255I3(String str) {
            AbstractC19074t.m100208f(str, "newSearchTextKey");
            MediaStorePresenter.this.f64075I = str;
            SearchGeneralMS m69218nr = MediaStorePresenter.this.m69218nr();
            C3499e0 c3499e0 = MediaStorePresenter.this.f64086t;
            if (c3499e0 == null) {
                AbstractC19074t.m100223u("mediaStore");
                c3499e0 = null;
            }
            m69218nr.m101508a(new SearchGeneralMS.C16729a(c3499e0, str, MediaStoreSearchPage.EnumC12391a.f64469p, 0L, 0L, 24, null));
            ((InterfaceC12361f) MediaStorePresenter.this.m103742Dp()).mo69348dn();
            C0815e1.m2075D().m2100V(new C23648e(35, "", 0, "click_on_enter_search_btn", ""), false);
        }

        @Override // x70.InterfaceC29445q
        /* renamed from: T */
        public void mo69256T(boolean z11, boolean z12) {
            if (z11) {
                ((InterfaceC12361f) MediaStorePresenter.this.m103742Dp()).mo69338SE();
                ((InterfaceC12361f) MediaStorePresenter.this.m103742Dp()).mo69328LG(MediaStorePresenter.this.f64072F, MediaStorePresenter.this.m69221pr());
                if (!TextUtils.isEmpty(MediaStorePresenter.this.f64075I)) {
                    MediaStorePresenter.this.m69180Tq(true);
                    if (!z12) {
                        MediaStorePresenter.this.m69159Jr();
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        @Override // x70.InterfaceC29445q
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo69257a(C31862c c31862c, String str, String str2) {
            boolean z11;
            AbstractC19074t.m100208f(str, "actionType");
            AbstractC19074t.m100208f(str2, "actionData");
            if (c31862c != null) {
                z11 = true;
                if (c31862c.m153153e()) {
                    MediaStorePresenter.this.m69150Fr(c31862c);
                    if (TextUtils.isEmpty(str)) {
                        if (AbstractC19074t.m100204b(str, "action.window.close")) {
                            if (!z11) {
                                MediaStorePresenter.this.m69150Fr(c31862c);
                                return;
                            }
                            return;
                        }
                        ((InterfaceC12361f) MediaStorePresenter.this.m103742Dp()).mo69324Ij(str, str2);
                        return;
                    }
                    return;
                }
            }
            z11 = false;
            if (TextUtils.isEmpty(str)) {
            }
        }

        @Override // x70.InterfaceC29445q
        /* renamed from: b */
        public void mo69258b(Bundle bundle) {
            EnumC2344e0 enumC2344e0;
            if (bundle != null) {
                try {
                    MediaStorePresenter mediaStorePresenter = MediaStorePresenter.this;
                    EnumC2344e0[] values = EnumC2344e0.values();
                    int length = values.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length) {
                            enumC2344e0 = values[i11];
                            if (enumC2344e0.ordinal() == bundle.getInt("extra_type_id")) {
                                break;
                            } else {
                                i11++;
                            }
                        } else {
                            enumC2344e0 = null;
                            break;
                        }
                    }
                    if (enumC2344e0 == null) {
                        enumC2344e0 = EnumC2344e0.f9852q;
                    }
                    mediaStorePresenter.f64078L = enumC2344e0;
                    mediaStorePresenter.m69238yr(mediaStorePresenter.f64078L);
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        }

        @Override // x70.InterfaceC29445q
        /* renamed from: c */
        public boolean mo69259c(int i11, String str) {
            AbstractC19074t.m100208f(str, "searchKey");
            if (i11 == 3) {
                try {
                    MediaStorePresenter mediaStorePresenter = MediaStorePresenter.this;
                    mediaStorePresenter.m69196cr(str, mediaStorePresenter.f64072F, false);
                    return true;
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
            return false;
        }

        @Override // x70.InterfaceC29445q
        /* renamed from: d */
        public void mo69260d(int i11) {
            ((InterfaceC12361f) MediaStorePresenter.this.m103742Dp()).mo69352if();
        }

        @Override // x70.InterfaceC29445q
        /* renamed from: e */
        public void mo69261e() {
            ((InterfaceC12361f) MediaStorePresenter.this.m103742Dp()).mo69355jF();
            InterfaceC12361f interfaceC12361f = (InterfaceC12361f) MediaStorePresenter.this.m103742Dp();
            C3499e0 c3499e0 = MediaStorePresenter.this.f64086t;
            if (c3499e0 == null) {
                AbstractC19074t.m100223u("mediaStore");
                c3499e0 = null;
            }
            interfaceC12361f.mo69311Bd(c3499e0.m17609N(), MediaStorePresenter.this.m69227sr(), MediaStorePresenter.this.m69206hr(), MediaStorePresenter.this.m69211jr());
            ((InterfaceC12361f) MediaStorePresenter.this.m103742Dp()).mo69340WH();
            ((InterfaceC12361f) MediaStorePresenter.this.m103742Dp()).mo69321G5();
            MediaStorePresenter.this.m69236xr();
            MediaStorePresenter.this.m69176Rq();
            if (MediaStorePresenter.this.f64071E) {
                ((InterfaceC12361f) MediaStorePresenter.this.m103742Dp()).mo69325Jj();
                ((InterfaceC12361f) MediaStorePresenter.this.m103742Dp()).mo69366rk(true, true, "", MediaStorePresenter.this.f64072F);
                MediaStorePresenter.this.m69186Xq();
            }
            if (MediaStorePresenter.this.f64073G) {
                MediaStorePresenter.this.m69184Wq();
            }
        }

        @Override // x70.InterfaceC29445q
        /* renamed from: f */
        public void mo69262f(int i11) {
            MediaStorePresenter.this.f64079M = i11;
            MediaStorePresenter.this.m69188Yq();
            if (MediaStorePresenter.this.f64079M != ((InterfaceC12361f) MediaStorePresenter.this.m103742Dp()).mo69335Rb()) {
                ((InterfaceC12361f) MediaStorePresenter.this.m103742Dp()).mo69352if();
            }
            MediaStorePresenter.this.m69186Xq();
        }

        @Override // x70.InterfaceC29445q
        /* renamed from: g */
        public boolean mo69263g(int i11) {
            if (i11 == 4) {
                if (((InterfaceC12361f) MediaStorePresenter.this.m103742Dp()).mo69360mI() || MediaStorePresenter.this.m69190Zq()) {
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // x70.InterfaceC29445q
        /* renamed from: h */
        public void mo69264h(int i11, int i12) {
            if (i12 != i11) {
                ((InterfaceC12361f) MediaStorePresenter.this.m103742Dp()).mo69334P8(i11, MediaStorePresenter.this.f64075I);
            } else {
                ((InterfaceC12361f) MediaStorePresenter.this.m103742Dp()).mo69346bc();
            }
            MediaStorePresenter.this.m69141Ar(i11);
        }

        @Override // x70.InterfaceC29445q
        /* renamed from: i */
        public void mo69265i(C12368g c12368g, Bundle bundle) {
            try {
                MediaStorePresenter.this.m69148Er(c12368g);
                C3499e0 c3499e0 = MediaStorePresenter.this.f64086t;
                C3499e0 c3499e02 = null;
                if (c3499e0 == null) {
                    AbstractC19074t.m100223u("mediaStore");
                    c3499e0 = null;
                }
                c3499e0.m17631o0(MediaStorePresenter.this.f64087u);
                C3499e0 c3499e03 = MediaStorePresenter.this.f64086t;
                if (c3499e03 == null) {
                    AbstractC19074t.m100223u("mediaStore");
                } else {
                    c3499e02 = c3499e03;
                }
                c3499e02.m17624i0();
                if (bundle != null) {
                    MediaStorePresenter mediaStorePresenter = MediaStorePresenter.this;
                    if (bundle.containsKey("extra_search_text")) {
                        String string = bundle.getString("extra_search_text", "");
                        AbstractC19074t.m100207e(string, "getString(...)");
                        mediaStorePresenter.f64075I = string;
                    }
                    mediaStorePresenter.f64072F = bundle.getBoolean("EXTRA_IS_IN_SEARCH_TIME_MODE", false);
                    mediaStorePresenter.f64071E = bundle.getBoolean("EXTRA_IS_OPENING_SUGGEST_SEARCH_VIEW", false);
                    mediaStorePresenter.f64076J = bundle.getLong("EXTRA_START_TIME", 0L);
                    mediaStorePresenter.f64077K = bundle.getLong("EXTRA_END_TIME", 0L);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // x70.InterfaceC29445q
        /* renamed from: j */
        public void mo69266j(String str) {
            AbstractC19074t.m100208f(str, "newSearchTimeKey");
            MediaStorePresenter.this.f64075I = str;
            SearchGeneralMS m69218nr = MediaStorePresenter.this.m69218nr();
            C3499e0 c3499e0 = MediaStorePresenter.this.f64086t;
            if (c3499e0 == null) {
                AbstractC19074t.m100223u("mediaStore");
                c3499e0 = null;
            }
            m69218nr.m101508a(new SearchGeneralMS.C16729a(c3499e0, str, MediaStoreSearchPage.EnumC12391a.f64470q, MediaStorePresenter.this.f64076J, MediaStorePresenter.this.f64077K));
            ((InterfaceC12361f) MediaStorePresenter.this.m103742Dp()).mo69348dn();
        }

        @Override // x70.InterfaceC29445q
        /* renamed from: j3 */
        public void mo69267j3(Bundle bundle) {
            boolean z11;
            AbstractC19074t.m100208f(bundle, "outState");
            if (MediaStorePresenter.this.f64069C) {
                MediaStorePresenter mediaStorePresenter = MediaStorePresenter.this;
                if (((InterfaceC12361f) mediaStorePresenter.m103742Dp()).mo69371yA() == MediaStoreSearchPage.EnumC12391a.f64470q) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                mediaStorePresenter.f64072F = z11;
            }
            MediaStorePresenter mediaStorePresenter2 = MediaStorePresenter.this;
            int mo69364pE = ((InterfaceC12361f) mediaStorePresenter2.m103742Dp()).mo69364pE();
            if (mo69364pE >= 0 && mo69364pE < mediaStorePresenter2.m69227sr().size()) {
                bundle.putInt("extra_type_id", mediaStorePresenter2.m69223qr(mo69364pE).ordinal());
            }
            if (!TextUtils.isEmpty(mediaStorePresenter2.f64075I)) {
                bundle.putString("extra_search_text", mediaStorePresenter2.f64075I);
            }
            bundle.putBoolean("EXTRA_IS_IN_SEARCH_TIME_MODE", mediaStorePresenter2.f64072F);
            bundle.putBoolean("EXTRA_IS_OPENING_SUGGEST_SEARCH_VIEW", mediaStorePresenter2.f64071E);
            bundle.putLong("EXTRA_START_TIME", mediaStorePresenter2.f64076J);
            bundle.putLong("EXTRA_END_TIME", mediaStorePresenter2.f64077K);
        }

        @Override // x70.InterfaceC29445q
        /* renamed from: k */
        public void mo69268k() {
            try {
                ((InterfaceC12361f) MediaStorePresenter.this.m103742Dp()).mo69359l9(MediaStorePresenter.this.m69204gr());
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // x70.InterfaceC29445q
        /* renamed from: l */
        public boolean mo69269l(int i11) {
            try {
                if (i11 == 16908332) {
                    MediaStorePresenter.this.m69209jf();
                    return true;
                }
                if (i11 == AbstractC6918a0.menu_item_search) {
                    MediaStorePresenter.this.m69241Cr();
                    return true;
                }
                if (i11 == AbstractC6918a0.menu_change_layout_sub) {
                    MediaStorePresenter.this.m69143Br();
                    return true;
                }
                if (i11 == AbstractC6918a0.menu_multi_select) {
                    ((InterfaceC12361f) MediaStorePresenter.this.m103742Dp()).mo69309B7();
                    return true;
                }
                return false;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return false;
            }
        }

        @Override // x70.InterfaceC29445q
        /* renamed from: m */
        public void mo69270m() {
            if (MediaStorePresenter.this.f64069C) {
                if (MediaStorePresenter.this.f64072F) {
                    ((InterfaceC12361f) MediaStorePresenter.this.m103742Dp()).mo69342Xz("");
                }
                MediaStorePresenter.this.m69182Vq(true);
            }
        }

        @Override // x70.InterfaceC29445q
        public void onActivityResult(int i11, int i12, Intent intent) {
            if (i11 == 100 && i12 == -1) {
                ((InterfaceC12361f) MediaStorePresenter.this.m103742Dp()).mo69360mI();
            }
        }

        @Override // x70.InterfaceC29445q
        public void onPageSelected(int i11) {
            try {
                ((InterfaceC12361f) MediaStorePresenter.this.m103742Dp()).mo69373ym();
                ((InterfaceC12361f) MediaStorePresenter.this.m103742Dp()).mo69318Ez(i11);
                ((InterfaceC12361f) MediaStorePresenter.this.m103742Dp()).mo69332O8();
                MediaStorePresenter.this.m69186Xq();
                MediaStorePresenter.this.m69174Qq(i11);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // x70.InterfaceC29445q
        /* renamed from: x */
        public void mo69271x(int i11, Object... objArr) {
            boolean z11;
            AbstractC19074t.m100208f(objArr, "args");
            try {
                if (i11 == 52) {
                    C3499e0 c3499e0 = MediaStorePresenter.this.f64086t;
                    if (c3499e0 == null) {
                        AbstractC19074t.m100223u("mediaStore");
                        c3499e0 = null;
                    }
                    if (AbstractC23184q2.m119459q(AbstractC25495a.m132088m(c3499e0.m17608M()), i11, Arrays.copyOf(objArr, objArr.length))) {
                        ((InterfaceC12361f) MediaStorePresenter.this.m103742Dp()).mo69351g();
                        return;
                    }
                    return;
                }
                if (i11 == 6020) {
                    if (objArr.length == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        Object obj = objArr[0];
                        AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Int");
                        if (((Integer) obj).intValue() == 24 && MediaStorePresenter.this.f64073G) {
                            MediaStorePresenter.this.m69184Wq();
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // x70.InterfaceC29445q
        /* renamed from: y3 */
        public void mo69272y3() {
            try {
                C3499e0 c3499e0 = MediaStorePresenter.this.f64086t;
                if (c3499e0 == null) {
                    AbstractC19074t.m100223u("mediaStore");
                    c3499e0 = null;
                }
                if (c3499e0.m17612Q() == EnumC2363o.f9889p && AbstractC23309i.m121553W2() == 1) {
                    ((InterfaceC12361f) MediaStorePresenter.this.m103742Dp()).mo69310Bb(MediaStorePresenter.this.f64072F, MediaStorePresenter.this.m69198dr());
                }
                ((InterfaceC12361f) MediaStorePresenter.this.m103742Dp()).mo69336Rx();
                ((InterfaceC12361f) MediaStorePresenter.this.m103742Dp()).mo69345ap();
                ((InterfaceC12361f) MediaStorePresenter.this.m103742Dp()).mo69344ab();
                MediaStorePresenter.this.m69186Xq();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStorePresenter$h */
    /* loaded from: classes6.dex */
    static final class C12310h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ InterfaceC12361f f64104r;

        /* renamed from: com.zing.zalo.ui.mediastore.MediaStorePresenter$h$a */
        /* loaded from: classes6.dex */
        public static final class a implements MediaStoreBasePage.InterfaceC12276c {

            /* renamed from: a */
            final /* synthetic */ MediaStorePresenter f64105a;

            /* renamed from: b */
            final /* synthetic */ InterfaceC12361f f64106b;

            a(MediaStorePresenter mediaStorePresenter, InterfaceC12361f interfaceC12361f) {
                this.f64105a = mediaStorePresenter;
                this.f64106b = interfaceC12361f;
            }

            @Override // com.zing.zalo.p077ui.mediastore.MediaStoreBasePage.InterfaceC12276c
            /* renamed from: a */
            public void mo68947a() {
                this.f64105a.m69186Xq();
            }

            @Override // com.zing.zalo.p077ui.mediastore.MediaStoreBasePage.InterfaceC12276c
            /* renamed from: b */
            public void mo68948b(List list) {
                int size;
                int i11;
                if (list != null) {
                    try {
                        size = list.size();
                    } catch (Exception e11) {
                        AbstractC23350e.m122778h(e11);
                        return;
                    }
                } else {
                    size = 0;
                }
                if (size > 1) {
                    i11 = AbstractC8020f0.str_multi_selection_count;
                } else {
                    i11 = AbstractC8020f0.str_multi_selection_singular_count;
                }
                String m118746s0 = AbstractC23136l9.m118746s0(i11, Integer.valueOf(size));
                AbstractC19074t.m100207e(m118746s0, "getString(...)");
                this.f64106b.mo69330MC(m118746s0);
            }

            @Override // com.zing.zalo.p077ui.mediastore.MediaStoreBasePage.InterfaceC12276c
            /* renamed from: c */
            public void mo68949c(boolean z11) {
                try {
                    if (this.f64105a.f64090x != z11) {
                        this.f64105a.f64090x = z11;
                        this.f64106b.mo69313C4(z11);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }

            @Override // com.zing.zalo.p077ui.mediastore.MediaStoreBasePage.InterfaceC12276c
            /* renamed from: d */
            public void mo68950d(boolean z11, int i11, int i12, View view) {
                int mo69335Rb;
                this.f64105a.m69186Xq();
                this.f64105a.m69188Yq();
                if (this.f64105a.f64079M < this.f64106b.mo69335Rb()) {
                    if ((view == null || view.getY() < 0.0f) && !this.f64105a.f64069C && !this.f64105a.f64070D) {
                        InterfaceC12361f interfaceC12361f = this.f64106b;
                        if (view != null) {
                            mo69335Rb = (int) (-view.getY());
                        } else {
                            mo69335Rb = interfaceC12361f.mo69335Rb();
                        }
                        interfaceC12361f.mo69365qf(0, mo69335Rb);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12310h(InterfaceC12361f interfaceC12361f) {
            super(0);
            this.f64104r = interfaceC12361f;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a mo12V4() {
            return new a(MediaStorePresenter.this, this.f64104r);
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStorePresenter$i */
    /* loaded from: classes6.dex */
    static final class C12311i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C12311i f64107q = new C12311i();

        C12311i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3521p0 mo12V4() {
            return AbstractC23306f.m120569C0();
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStorePresenter$j */
    /* loaded from: classes6.dex */
    static final class C12312j extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC12361f f64108q;

        /* renamed from: r */
        final /* synthetic */ MediaStorePresenter f64109r;

        /* renamed from: com.zing.zalo.ui.mediastore.MediaStorePresenter$j$a */
        /* loaded from: classes6.dex */
        public static final class a implements MediaStoreBasePage.InterfaceC12275b {

            /* renamed from: a */
            final /* synthetic */ InterfaceC12361f f64110a;

            /* renamed from: b */
            final /* synthetic */ MediaStorePresenter f64111b;

            a(InterfaceC12361f interfaceC12361f, MediaStorePresenter mediaStorePresenter) {
                this.f64110a = interfaceC12361f;
                this.f64111b = mediaStorePresenter;
            }

            @Override // com.zing.zalo.p077ui.mediastore.MediaStoreBasePage.InterfaceC12275b
            /* renamed from: F3 */
            public void mo68935F3(boolean z11) {
                this.f64111b.f64067A = z11;
                this.f64111b.m69188Yq();
            }

            @Override // com.zing.zalo.p077ui.mediastore.MediaStoreBasePage.InterfaceC12275b
            /* renamed from: I0 */
            public void mo68936I0(EnumC2382z enumC2382z) {
                AbstractC19074t.m100208f(enumC2382z, ZinstantMetaConstant.IMPRESSION_META_TYPE);
                this.f64111b.m69181Uq(true, enumC2382z);
            }

            @Override // com.zing.zalo.p077ui.mediastore.MediaStoreBasePage.InterfaceC12275b
            /* renamed from: M3 */
            public NestedScrollViewParent mo68937M3() {
                return this.f64110a.mo69329M3();
            }

            @Override // com.zing.zalo.p077ui.mediastore.MediaStoreBasePage.InterfaceC12275b
            /* renamed from: S3 */
            public void mo68938S3(boolean z11) {
                this.f64110a.mo69337S3(z11);
            }

            @Override // com.zing.zalo.p077ui.mediastore.MediaStoreBasePage.InterfaceC12275b
            /* renamed from: n4 */
            public void mo68939n4(int i11, boolean z11, boolean z12) {
                this.f64110a.mo69361n4(i11, z11, z12);
            }

            @Override // com.zing.zalo.p077ui.mediastore.MediaStoreBasePage.InterfaceC12275b
            /* renamed from: o4 */
            public void mo68940o4(boolean z11) {
                this.f64110a.mo69341X5(z11);
            }

            @Override // com.zing.zalo.p077ui.mediastore.MediaStoreBasePage.InterfaceC12275b
            /* renamed from: p4 */
            public int mo68941p4() {
                return this.f64111b.m69200er();
            }

            @Override // com.zing.zalo.p077ui.mediastore.MediaStoreBasePage.InterfaceC12275b
            /* renamed from: q4 */
            public void mo68942q4(boolean z11) {
                this.f64110a.mo69347da(z11);
            }

            @Override // com.zing.zalo.p077ui.mediastore.MediaStoreBasePage.InterfaceC12275b
            /* renamed from: r4 */
            public void mo68943r4(MediaStoreItem mediaStoreItem) {
                AbstractC19074t.m100208f(mediaStoreItem, "item");
                try {
                    C3499e0 c3499e0 = this.f64111b.f64086t;
                    C3499e0 c3499e02 = null;
                    if (c3499e0 == null) {
                        AbstractC19074t.m100223u("mediaStore");
                        c3499e0 = null;
                    }
                    if (c3499e0.m17608M().length() == 0) {
                        return;
                    }
                    InterfaceC12361f interfaceC12361f = this.f64110a;
                    C3499e0 c3499e03 = this.f64111b.f64086t;
                    if (c3499e03 == null) {
                        AbstractC19074t.m100223u("mediaStore");
                    } else {
                        c3499e02 = c3499e03;
                    }
                    interfaceC12361f.mo69320FE(c3499e02.m17608M(), mediaStoreItem.m40571M());
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }

            @Override // com.zing.zalo.p077ui.mediastore.MediaStoreBasePage.InterfaceC12275b
            /* renamed from: s4 */
            public void mo68944s4(EnumC2382z enumC2382z) {
                MediaStoreSearchPage.EnumC12391a enumC12391a;
                AbstractC19074t.m100208f(enumC2382z, ZinstantMetaConstant.IMPRESSION_META_TYPE);
                String mo69331O5 = this.f64110a.mo69331O5();
                if (enumC2382z == EnumC2382z.f9944q) {
                    MediaStorePresenter mediaStorePresenter = this.f64111b;
                    mediaStorePresenter.m69196cr(mo69331O5, mediaStorePresenter.f64072F, true);
                    return;
                }
                MediaStorePresenter mediaStorePresenter2 = this.f64111b;
                if (mediaStorePresenter2.f64072F) {
                    enumC12391a = MediaStoreSearchPage.EnumC12391a.f64470q;
                } else {
                    enumC12391a = MediaStoreSearchPage.EnumC12391a.f64469p;
                }
                mediaStorePresenter2.m69194br(enumC2382z, enumC12391a);
            }

            @Override // com.zing.zalo.p077ui.mediastore.MediaStoreBasePage.InterfaceC12275b
            /* renamed from: t4 */
            public int mo68945t4() {
                return this.f64110a.mo69357ju();
            }

            @Override // com.zing.zalo.p077ui.mediastore.MediaStoreBasePage.InterfaceC12275b
            /* renamed from: u4 */
            public String mo68946u4() {
                return this.f64111b.f64075I;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12312j(InterfaceC12361f interfaceC12361f, MediaStorePresenter mediaStorePresenter) {
            super(0);
            this.f64108q = interfaceC12361f;
            this.f64109r = mediaStorePresenter;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a mo12V4() {
            return new a(this.f64108q, this.f64109r);
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStorePresenter$k */
    /* loaded from: classes6.dex */
    static final class C12313k extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C12313k f64112q = new C12313k();

        C12313k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C18898g mo12V4() {
            return AbstractC23306f.m120682k1();
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStorePresenter$l */
    /* loaded from: classes6.dex */
    static final class C12314l extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C12314l f64113q = new C12314l();

        C12314l() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SearchGeneralMS mo12V4() {
            return AbstractC23306f.m120686l1();
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStorePresenter$m */
    /* loaded from: classes6.dex */
    static final class C12315m extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C12315m f64114q = new C12315m();

        C12315m() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List mo12V4() {
            List m131506n;
            m131506n = AbstractC25368s.m131506n(EnumC2344e0.f9852q, EnumC2344e0.f9854s, EnumC2344e0.f9853r);
            return m131506n;
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStorePresenter$n */
    /* loaded from: classes6.dex */
    static final class C12316n extends AbstractC19075u implements InterfaceC18494a {
        C12316n() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map mo12V4() {
            int m131511r;
            int m131400e;
            int m116580c;
            List<EnumC2344e0> m69227sr = MediaStorePresenter.this.m69227sr();
            MediaStorePresenter mediaStorePresenter = MediaStorePresenter.this;
            m131511r = AbstractC25370t.m131511r(m69227sr, 10);
            m131400e = AbstractC25361o0.m131400e(m131511r);
            m116580c = AbstractC22543l.m116580c(m131400e, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(m116580c);
            for (EnumC2344e0 enumC2344e0 : m69227sr) {
                C24860q m129235a = AbstractC24866w.m129235a(enumC2344e0.m12311c(), mediaStorePresenter.m69229tr(enumC2344e0.m12311c()));
                linkedHashMap.put(m129235a.m129215c(), m129235a.m129216d());
            }
            return linkedHashMap;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaStorePresenter(InterfaceC12361f interfaceC12361f) {
        super(interfaceC12361f);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        InterfaceC24854k m129210a6;
        InterfaceC24854k m129210a7;
        InterfaceC24854k m129210a8;
        AbstractC19074t.m100208f(interfaceC12361f, "mvpView");
        this.f64087u = new Object();
        m129210a = AbstractC24856m.m129210a(C12315m.f64114q);
        this.f64088v = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C12316n());
        this.f64089w = m129210a2;
        this.f64092z = true;
        this.f64067A = true;
        this.f64068B = true;
        this.f64075I = "";
        this.f64078L = EnumC2344e0.f9852q;
        m129210a3 = AbstractC24856m.m129210a(C12311i.f64107q);
        this.f64080N = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(C12314l.f64113q);
        this.f64081O = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(C12313k.f64112q);
        this.f64082P = m129210a5;
        m129210a6 = AbstractC24856m.m129210a(C12304b.f64097q);
        this.f64083Q = m129210a6;
        m129210a7 = AbstractC24856m.m129210a(new C12310h(interfaceC12361f));
        this.f64084R = m129210a7;
        m129210a8 = AbstractC24856m.m129210a(new C12312j(interfaceC12361f, this));
        this.f64085S = m129210a8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ar */
    public final void m69141Ar(int i11) {
        if (this.f64074H == i11) {
            return;
        }
        this.f64074H = i11;
        int i12 = C12303a.f64095c[m69223qr(i11).ordinal()];
        if (i12 != 1) {
            if (i12 == 2) {
                C0815e1.m2075D().m2100V(new C23648e(35, "", 0, "click_on_tab_file", m69242S2()), false);
                return;
            }
            return;
        }
        C0815e1.m2075D().m2100V(new C23648e(35, "", 0, "click_on_tab_link", m69242S2()), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Br */
    public final void m69143Br() {
        C18892a m69202fr = m69202fr();
        C3499e0 c3499e0 = this.f64086t;
        if (c3499e0 == null) {
            AbstractC19074t.m100223u("mediaStore");
            c3499e0 = null;
        }
        m69202fr.m101508a(new C18892a.a(c3499e0, null, false, 6, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Dr */
    public final void m69146Dr(C3518o c3518o) {
        int ordinal = c3518o.m17766e().ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        m69178Sq(c3518o.m17762a());
                        C0815e1.m2075D().m2100V(new C23648e(35, "", 0, "click_on_search_by_video", ""), false);
                        return;
                    }
                    return;
                }
                m69166Mr();
                m69182Vq(true);
                C0815e1.m2075D().m2100V(new C23648e(35, "", 0, "click_on_search_by_time", ""), false);
                return;
            }
            m69178Sq(c3518o.m17762a());
            C0815e1.m2075D().m2100V(new C23648e(35, "", 0, "click_on_search_by_sender", ""), false);
            return;
        }
        ((InterfaceC12361f) m103742Dp()).mo69366rk(true, true, "", this.f64072F);
        m69182Vq(true);
        m69186Xq();
        C0815e1.m2075D().m2100V(new C23648e(35, "", 0, "click_on_search_btn", ""), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b A[Catch: Exception -> 0x0018, TryCatch #0 {Exception -> 0x0018, blocks: (B:5:0x0003, B:8:0x0011, B:11:0x001b, B:13:0x002d, B:15:0x0035, B:17:0x003b, B:18:0x0041, B:20:0x0054, B:25:0x0033), top: B:4:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[Catch: Exception -> 0x0018, TRY_LEAVE, TryCatch #0 {Exception -> 0x0018, blocks: (B:5:0x0003, B:8:0x0011, B:11:0x001b, B:13:0x002d, B:15:0x0035, B:17:0x003b, B:18:0x0041, B:20:0x0054, B:25:0x0033), top: B:4:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* renamed from: Er */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m69148Er(C12368g c12368g) {
        String str;
        CreateMediaStoreParam m69529a;
        CreateMediaStoreParam m69529a2;
        MSFilterData mSFilterData;
        if (c12368g == null) {
            return;
        }
        try {
            this.f64078L = c12368g.m69530b();
            CreateMediaStoreParam m69529a3 = c12368g.m69529a();
            if (m69529a3 != null) {
                str = m69529a3.m40908a();
                if (str == null) {
                }
                this.f64073G = AbstractC25495a.m132079d(str);
                C3521p0 m69208ir = m69208ir();
                m69529a = c12368g.m69529a();
                if (m69529a != null || (r4 = m69529a.m40910c()) == null) {
                    EnumC2363o enumC2363o = EnumC2363o.f9889p;
                }
                m69529a2 = c12368g.m69529a();
                if (m69529a2 == null) {
                    mSFilterData = m69529a2.m40909b();
                } else {
                    mSFilterData = null;
                }
                this.f64086t = m69208ir.m17791p(new CreateMediaStoreParam(str, enumC2363o, mSFilterData));
                if (AbstractC19074t.m100204b(c12368g.m69531c(), "")) {
                    C0815e1.m2075D().m2100V(new C23648e(35, c12368g.m69531c(), 1, "open_media_store_view", m69242S2()), false);
                    return;
                }
                return;
            }
            str = "";
            this.f64073G = AbstractC25495a.m132079d(str);
            C3521p0 m69208ir2 = m69208ir();
            m69529a = c12368g.m69529a();
            if (m69529a != null) {
            }
            EnumC2363o enumC2363o2 = EnumC2363o.f9889p;
            m69529a2 = c12368g.m69529a();
            if (m69529a2 == null) {
            }
            this.f64086t = m69208ir2.m17791p(new CreateMediaStoreParam(str, enumC2363o2, mSFilterData));
            if (AbstractC19074t.m100204b(c12368g.m69531c(), "")) {
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Fr */
    public final void m69150Fr(C31862c c31862c) {
        ((InterfaceC12361f) m103742Dp()).mo69370us();
        C18434b.Companion.m97695b().m97691w(c31862c);
    }

    /* renamed from: Gr */
    private final void m69152Gr() {
        this.f64075I = "";
        this.f64076J = 0L;
        this.f64077K = 0L;
    }

    /* renamed from: Ir */
    private final void m69156Ir() {
        this.f64068B = true;
        this.f64067A = true;
        m69163Lr(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Jr */
    public final void m69159Jr() {
        ((InterfaceC12361f) m103742Dp()).mo69322GB(new MediaStoreView.C12327b(null, null, null, null, m69211jr(), m69206hr(), 15, null));
        if (!this.f64070D) {
            ((InterfaceC12361f) m103742Dp()).mo69366rk(true, true, this.f64075I, this.f64072F);
            if (this.f64072F) {
                ((InterfaceC12361f) m103742Dp()).mo69327Kq(this.f64075I);
            } else {
                ((InterfaceC12361f) m103742Dp()).mo69343Z5(this.f64075I);
            }
        }
        m69182Vq(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Lr */
    public final void m69163Lr(boolean z11) {
        this.f64092z = z11;
        ((InterfaceC12361f) m103742Dp()).mo69372yl(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Mr */
    public final void m69166Mr() {
        this.f64072F = true;
        this.f64091y = false;
        m69186Xq();
        ((InterfaceC12361f) m103742Dp()).mo69366rk(true, true, "", this.f64072F);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Qq */
    public final void m69174Qq(int i11) {
        String str;
        EnumC2344e0 m69223qr = m69223qr(i11);
        if (m69223qr == EnumC2344e0.f9852q) {
            str = "100150";
        } else if (m69223qr == EnumC2344e0.f9853r) {
            str = "100151";
        } else {
            str = "100152";
        }
        AbstractC23647d.m123906p(str);
        AbstractC23647d.m123893c();
        C0815e1.m2075D().m2097S(4, 1, System.currentTimeMillis());
        C0815e1.m2075D().m2096R(m69243or(m69223qr), System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Rq */
    public final void m69176Rq() {
        if (!m69240zr()) {
            return;
        }
        List m69192ar = m69192ar();
        if (!m69192ar.isEmpty()) {
            ((InterfaceC12361f) m103742Dp()).mo69349eb(m69192ar, m69213kr(), this.f64090x);
        }
    }

    /* renamed from: Sq */
    private final void m69178Sq(C3508j c3508j) {
        if (c3508j == null) {
            return;
        }
        try {
            C3499e0 c3499e0 = null;
            if (c3508j instanceof C3510k) {
                InterfaceC12361f interfaceC12361f = (InterfaceC12361f) m103742Dp();
                C3499e0 c3499e02 = this.f64086t;
                if (c3499e02 == null) {
                    AbstractC19074t.m100223u("mediaStore");
                } else {
                    c3499e0 = c3499e02;
                }
                interfaceC12361f.mo69312Bm(c3508j, c3499e0.m17608M());
                if (((C3510k) c3508j).m17713y0() == C3508j.b.f14701r) {
                    AbstractC23647d.m123897g("10015433");
                }
            } else {
                InterfaceC12361f interfaceC12361f2 = (InterfaceC12361f) m103742Dp();
                C3499e0 c3499e03 = this.f64086t;
                if (c3499e03 == null) {
                    AbstractC19074t.m100223u("mediaStore");
                } else {
                    c3499e0 = c3499e03;
                }
                interfaceC12361f2.mo69317Ek(c3508j, c3499e0.m17608M());
                int i11 = C12303a.f64096d[c3508j.m17713y0().ordinal()];
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC23647d.m123897g("10015434");
                    }
                } else {
                    AbstractC23647d.m123897g("10015436");
                }
            }
            if (this.f64069C) {
                m69180Tq(false);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Tq */
    public final void m69180Tq(boolean z11) {
        MediaStoreSearchPage.EnumC12391a enumC12391a;
        try {
            this.f64069C = z11;
            m69188Yq();
            if (this.f64072F) {
                enumC12391a = MediaStoreSearchPage.EnumC12391a.f64470q;
            } else {
                enumC12391a = MediaStoreSearchPage.EnumC12391a.f64469p;
            }
            MediaStoreSearchPage.EnumC12391a enumC12391a2 = enumC12391a;
            InterfaceC12361f interfaceC12361f = (InterfaceC12361f) m103742Dp();
            C3499e0 c3499e0 = this.f64086t;
            if (c3499e0 == null) {
                AbstractC19074t.m100223u("mediaStore");
                c3499e0 = null;
            }
            interfaceC12361f.mo69323IG(z11, new MediaStoreView.C12327b(null, enumC12391a2, c3499e0.m17609N(), null, m69211jr(), null, 41, null));
            if (z11) {
                m69156Ir();
            } else {
                ((InterfaceC12361f) m103742Dp()).mo69366rk(false, false, "", this.f64072F);
                m69152Gr();
            }
            m69186Xq();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Uq */
    public final void m69181Uq(boolean z11, EnumC2382z enumC2382z) {
        MediaStoreSearchPage.EnumC12391a enumC12391a;
        String m118746s0;
        try {
            this.f64070D = z11;
            m69188Yq();
            if (this.f64072F) {
                enumC12391a = MediaStoreSearchPage.EnumC12391a.f64470q;
            } else {
                enumC12391a = MediaStoreSearchPage.EnumC12391a.f64469p;
            }
            C3499e0 c3499e0 = this.f64086t;
            C3499e0 c3499e02 = null;
            if (c3499e0 == null) {
                AbstractC19074t.m100223u("mediaStore");
                c3499e0 = null;
            }
            CreateMediaStoreParam m17609N = c3499e0.m17609N();
            C3499e0 c3499e03 = this.f64086t;
            if (c3499e03 == null) {
                AbstractC19074t.m100223u("mediaStore");
            } else {
                c3499e02 = c3499e03;
            }
            ((InterfaceC12361f) m103742Dp()).mo69353ip(z11, new MediaStoreView.C12327b(enumC2382z, enumC12391a, m17609N, c3499e02.m17610O(), m69211jr(), m69206hr()));
            if (z11) {
                m69194br(enumC2382z, enumC12391a);
                m69156Ir();
                int i11 = C12303a.f64094b[enumC2382z.ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                m118746s0 = "";
                            } else {
                                m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_search_title_file, this.f64075I);
                            }
                        } else {
                            m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_search_title_link, this.f64075I);
                        }
                    } else {
                        m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_search_title_media, this.f64075I);
                    }
                } else {
                    m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_search_title_album, this.f64075I);
                }
                AbstractC19074t.m100205c(m118746s0);
                ((InterfaceC12361f) m103742Dp()).mo69368tj(m118746s0);
                ((InterfaceC12361f) m103742Dp()).mo69366rk(false, false, "", this.f64072F);
            } else {
                ((InterfaceC12361f) m103742Dp()).mo69368tj(m69204gr());
                ((InterfaceC12361f) m103742Dp()).mo69366rk(true, false, this.f64075I, this.f64072F);
            }
            m69186Xq();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Vq */
    public final void m69182Vq(boolean z11) {
        int i11;
        try {
            if (this.f64071E == z11) {
                return;
            }
            this.f64071E = z11;
            m69188Yq();
            if (!this.f64072F) {
                this.f64091y = false;
            }
            InterfaceC12361f interfaceC12361f = (InterfaceC12361f) m103742Dp();
            if (this.f64072F) {
                i11 = AbstractC8020f0.str_ms_search_by_time_hint;
            } else {
                i11 = AbstractC8020f0.str_hint_search_media;
            }
            String m118743r0 = AbstractC23136l9.m118743r0(i11);
            AbstractC19074t.m100205c(m118743r0);
            interfaceC12361f.mo69362nd(m118743r0);
            boolean z12 = this.f64091y;
            C3499e0 c3499e0 = this.f64086t;
            if (c3499e0 == null) {
                AbstractC19074t.m100223u("mediaStore");
                c3499e0 = null;
            }
            ((InterfaceC12361f) m103742Dp()).mo69377zm(z11, new MediaStoreView.C12328c(z12, c3499e0.m17608M(), this.f64076J, this.f64077K, this.f64072F, m69221pr()));
            if (z11) {
                if (!this.f64091y) {
                    ((InterfaceC12361f) m103742Dp()).mo69347da(true);
                }
            } else if (!this.f64069C) {
                ((InterfaceC12361f) m103742Dp()).mo69366rk(false, false, "", this.f64072F);
                m69186Xq();
                this.f64075I = "";
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Wq */
    public final void m69184Wq() {
        C18434b m97695b = C18434b.Companion.m97695b();
        C3499e0 c3499e0 = this.f64086t;
        if (c3499e0 == null) {
            AbstractC19074t.m100223u("mediaStore");
            c3499e0 = null;
        }
        m97695b.m97685n(24, c3499e0.m17608M(), null, new C12305c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Xq */
    public final void m69186Xq() {
        boolean z11;
        String m118743r0;
        if (this.f64079M >= ((InterfaceC12361f) m103742Dp()).mo69376zH()) {
            z11 = true;
        } else {
            z11 = false;
        }
        try {
            if (!this.f64069C && !this.f64070D && !this.f64072F && !this.f64071E) {
                boolean mo69315Dt = ((InterfaceC12361f) m103742Dp()).mo69315Dt(AbstractC6918a0.action_bar_menu_more);
                boolean mo69315Dt2 = ((InterfaceC12361f) m103742Dp()).mo69315Dt(AbstractC6918a0.menu_multi_select);
                ((InterfaceC12361f) m103742Dp()).mo69363o8(((InterfaceC12361f) m103742Dp()).mo69315Dt(AbstractC6918a0.menu_change_layout_sub));
                ((InterfaceC12361f) m103742Dp()).mo69358kG(mo69315Dt);
                ((InterfaceC12361f) m103742Dp()).mo69354iw(mo69315Dt2);
                ((InterfaceC12361f) m103742Dp()).mo69350fe(z11);
                int i11 = C12303a.f64095c[m69223qr(((InterfaceC12361f) m103742Dp()).mo69364pE()).ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        C3499e0 c3499e0 = this.f64086t;
                        if (c3499e0 == null) {
                            AbstractC19074t.m100223u("mediaStore");
                            c3499e0 = null;
                        }
                        if (c3499e0.m17612Q() == EnumC2363o.f9891r) {
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_media_store_media_setting_item_select_video);
                        } else {
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_media_store_media_setting_item_select);
                        }
                    } else {
                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_media_store_media_setting_file_item_select);
                    }
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_media_store_media_setting_link_item_select);
                }
                AbstractC19074t.m100205c(m118743r0);
                ((InterfaceC12361f) m103742Dp()).mo69375zA(m118743r0);
                return;
            }
            ((InterfaceC12361f) m103742Dp()).mo69363o8(false);
            ((InterfaceC12361f) m103742Dp()).mo69358kG(false);
            ((InterfaceC12361f) m103742Dp()).mo69354iw(false);
            ((InterfaceC12361f) m103742Dp()).mo69350fe(false);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Yq */
    public final void m69188Yq() {
        View mo69333OD;
        boolean z11;
        boolean z12 = false;
        if (((InterfaceC12361f) m103742Dp()).mo69335Rb() == 0 || this.f64069C || this.f64070D ? !((mo69333OD = ((InterfaceC12361f) m103742Dp()).mo69333OD()) == null || mo69333OD.getY() < 0.0f) : this.f64079M == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f64068B = z11;
        InterfaceC12361f interfaceC12361f = (InterfaceC12361f) m103742Dp();
        if (this.f64068B && this.f64067A && this.f64092z && !this.f64070D && !this.f64071E && !this.f64069C) {
            z12 = true;
        }
        interfaceC12361f.mo69319F3(z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Zq */
    public final boolean m69190Zq() {
        if (this.f64070D) {
            m69181Uq(false, EnumC2382z.f9944q);
            return true;
        }
        if (this.f64071E) {
            this.f64072F &= this.f64069C;
            m69182Vq(false);
            return true;
        }
        if (!this.f64069C) {
            return false;
        }
        this.f64072F = false;
        m69180Tq(false);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ar */
    public final List m69192ar() {
        boolean z11;
        ArrayList arrayList = new ArrayList();
        if (AbstractC23309i.m121553W2() == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            C3518o c3518o = new C3518o();
            c3518o.m17770i(C3518o.b.f14757q);
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.hint_default_search);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            c3518o.m17769h(m118743r0);
            c3518o.m17768g(AbstractC16803z.ic_ms_quick_search);
            arrayList.add(c3518o);
        }
        C3518o c3518o2 = new C3518o();
        c3518o2.m17770i(C3518o.b.f14758r);
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ms_quick_search_by_sender);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        c3518o2.m17769h(m118743r02);
        c3518o2.m17768g(AbstractC16803z.ic_ms_quick_search_sender);
        C3499e0 c3499e0 = this.f64086t;
        C3499e0 c3499e02 = null;
        if (c3499e0 == null) {
            AbstractC19074t.m100223u("mediaStore");
            c3499e0 = null;
        }
        C3510k c3510k = new C3510k(new CreateMediaStoreParam(c3499e0.m17608M(), null, null, 6, null));
        c3510k.m17701N0(C3508j.b.f14701r);
        c3510k.m17748e1(true);
        c3518o2.m17767f(c3510k);
        arrayList.add(c3518o2);
        if (z11) {
            C3518o c3518o3 = new C3518o();
            c3518o3.m17770i(C3518o.b.f14759s);
            String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ms_quick_search_by_time);
            AbstractC19074t.m100207e(m118743r03, "getString(...)");
            c3518o3.m17769h(m118743r03);
            c3518o3.m17768g(AbstractC16803z.ic_ms_quick_search_time);
            arrayList.add(c3518o3);
        }
        C3518o c3518o4 = new C3518o();
        c3518o4.m17770i(C3518o.b.f14760t);
        String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ms_quick_search_by_video);
        AbstractC19074t.m100207e(m118743r04, "getString(...)");
        c3518o4.m17769h(m118743r04);
        c3518o4.m17768g(AbstractC16803z.ic_ms_quick_search_video);
        C3499e0 c3499e03 = this.f64086t;
        if (c3499e03 == null) {
            AbstractC19074t.m100223u("mediaStore");
        } else {
            c3499e02 = c3499e03;
        }
        C3508j c3508j = new C3508j(new CreateMediaStoreParam(c3499e02.m17608M(), EnumC2363o.f9891r, null, 4, null));
        c3508j.m17701N0(C3508j.b.f14700q);
        c3508j.m17700M0(1L);
        c3508j.m17706S0(AbstractC23136l9.m118743r0(AbstractC8020f0.str_media_store_collection_video_title));
        c3518o4.m17767f(c3508j);
        arrayList.add(c3518o4);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: br */
    public final void m69194br(EnumC2382z enumC2382z, MediaStoreSearchPage.EnumC12391a enumC12391a) {
        C3499e0 c3499e0;
        C18898g m69215lr = m69215lr();
        C3499e0 c3499e02 = this.f64086t;
        C3499e0 c3499e03 = null;
        if (c3499e02 == null) {
            AbstractC19074t.m100223u("mediaStore");
            c3499e0 = null;
        } else {
            c3499e0 = c3499e02;
        }
        C3499e0 c3499e04 = this.f64086t;
        if (c3499e04 == null) {
            AbstractC19074t.m100223u("mediaStore");
        } else {
            c3499e03 = c3499e04;
        }
        m69215lr.m101508a(new C18898g.a(c3499e0, c3499e03.m17610O(), enumC2382z, enumC12391a, this.f64076J, this.f64077K, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cr */
    public final void m69196cr(String str, boolean z11, boolean z12) {
        boolean z13;
        int i11;
        boolean z14;
        try {
            int length = str.length() - 1;
            int i12 = 0;
            boolean z15 = false;
            while (i12 <= length) {
                if (!z15) {
                    i11 = i12;
                } else {
                    i11 = length;
                }
                if (AbstractC19074t.m100209g(str.charAt(i11), 32) <= 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (!z15) {
                    if (!z14) {
                        z15 = true;
                    } else {
                        i12++;
                    }
                } else if (!z14) {
                    break;
                } else {
                    length--;
                }
            }
            String obj = str.subSequence(i12, length + 1).toString();
            if (((InterfaceC12361f) m103742Dp()).mo69371yA() == MediaStoreSearchPage.EnumC12391a.f64469p && z11) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (AbstractC19074t.m100204b(obj, this.f64075I) && !z12 && !z13) {
                m69182Vq(false);
                ((InterfaceC12361f) m103742Dp()).mo69347da(false);
            }
            boolean isEmpty = TextUtils.isEmpty(obj);
            if (z11 && !isEmpty) {
                m69180Tq(true);
                m69182Vq(false);
                if (!z12) {
                    m69152Gr();
                }
                ((InterfaceC12361f) m103742Dp()).mo69327Kq(obj);
            } else if (!isEmpty) {
                m69180Tq(true);
                ((InterfaceC12361f) m103742Dp()).mo69343Z5(obj);
                m69182Vq(false);
            }
            ((InterfaceC12361f) m103742Dp()).mo69347da(false);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dr */
    public final ActionBarMenuItem.C17435d m69198dr() {
        return new C12306d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: er */
    public final int m69200er() {
        if (this.f64090x) {
            return ((InterfaceC12361f) m103742Dp()).mo69339Uu();
        }
        return 0;
    }

    /* renamed from: fr */
    private final C18892a m69202fr() {
        return (C18892a) this.f64083Q.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gr */
    public final String m69204gr() {
        String m40919c;
        C3499e0 c3499e0 = this.f64086t;
        C3499e0 c3499e02 = null;
        if (c3499e0 == null) {
            AbstractC19074t.m100223u("mediaStore");
            c3499e0 = null;
        }
        int i11 = C12303a.f64093a[c3499e0.m17612Q().ordinal()];
        if (i11 != 1 && i11 != 2) {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_media_v4);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            return m118743r0;
        }
        C3499e0 c3499e03 = this.f64086t;
        if (c3499e03 == null) {
            AbstractC19074t.m100223u("mediaStore");
        } else {
            c3499e02 = c3499e03;
        }
        MSFilterData m17611P = c3499e02.m17611P();
        if (m17611P == null || (m40919c = m17611P.m40919c()) == null) {
            return "";
        }
        return m40919c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hr */
    public final MediaStoreBasePage.InterfaceC12276c m69206hr() {
        return (MediaStoreBasePage.InterfaceC12276c) this.f64084R.getValue();
    }

    /* renamed from: ir */
    private final C3521p0 m69208ir() {
        return (C3521p0) this.f64080N.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jf */
    public final void m69209jf() {
        if (!m69190Zq()) {
            ((InterfaceC12361f) m103742Dp()).mo69351g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jr */
    public final MediaStoreBasePage.InterfaceC12275b m69211jr() {
        return (MediaStoreBasePage.InterfaceC12275b) this.f64085S.getValue();
    }

    /* renamed from: kr */
    private final MediaStoreQuickSearchListView.InterfaceC12387a m69213kr() {
        return new C12307e();
    }

    /* renamed from: lr */
    private final C18898g m69215lr() {
        return (C18898g) this.f64082P.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nr */
    public final SearchGeneralMS m69218nr() {
        return (SearchGeneralMS) this.f64081O.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pr */
    public final MediaStoreSuggestSearchView.InterfaceC12401d m69221pr() {
        return new C12308f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qr */
    public final EnumC2344e0 m69223qr(int i11) {
        if (i11 >= 0 && i11 < m69227sr().size()) {
            return (EnumC2344e0) m69227sr().get(i11);
        }
        return EnumC2344e0.f9852q;
    }

    /* renamed from: rr */
    private final int m69225rr(EnumC2344e0 enumC2344e0) {
        Iterator it = m69227sr().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (((EnumC2344e0) it.next()) != enumC2344e0) {
                i11++;
            } else {
                return i11;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sr */
    public final List m69227sr() {
        return (List) this.f64088v.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tr */
    public final String m69229tr(String str) {
        if (AbstractC19074t.m100204b(str, EnumC2344e0.f9852q.m12311c())) {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_media);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            return m118743r0;
        }
        if (AbstractC19074t.m100204b(str, EnumC2344e0.f9853r.m12311c())) {
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_link);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            return m118743r02;
        }
        if (AbstractC19074t.m100204b(str, EnumC2344e0.f9854s.m12311c())) {
            String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_file);
            AbstractC19074t.m100207e(m118743r03, "getString(...)");
            return m118743r03;
        }
        return "";
    }

    /* renamed from: ur */
    private final Map m69231ur() {
        return (Map) this.f64089w.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wr */
    public final void m69234wr(long j11, long j12, String str) {
        this.f64072F = true;
        this.f64076J = j11;
        this.f64077K = j12;
        m69180Tq(true);
        if (TextUtils.isEmpty(str)) {
            str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_from) + " " + new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(new Date(j11)) + " " + AbstractC23136l9.m118743r0(AbstractC8020f0.str_to) + " " + new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(new Date(j12));
        }
        if (!AbstractC19074t.m100204b(str, this.f64075I)) {
            ((InterfaceC12361f) m103742Dp()).mo69327Kq(str);
        }
        ((InterfaceC12361f) m103742Dp()).mo69366rk(true, false, str, this.f64072F);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xr */
    public final void m69236xr() {
        ((InterfaceC12361f) m103742Dp()).mo69326Ki(m69227sr(), m69231ur());
        m69238yr(m69223qr(((InterfaceC12361f) m103742Dp()).mo69364pE()));
        ((InterfaceC12361f) m103742Dp()).mo69318Ez(((InterfaceC12361f) m103742Dp()).mo69364pE());
        C3499e0 c3499e0 = this.f64086t;
        if (c3499e0 == null) {
            AbstractC19074t.m100223u("mediaStore");
            c3499e0 = null;
        }
        if (c3499e0.m17612Q() == EnumC2363o.f9891r) {
            ((InterfaceC12361f) m103742Dp()).mo69374z9(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yr */
    public final void m69238yr(EnumC2344e0 enumC2344e0) {
        if (m69227sr().contains(enumC2344e0)) {
            InterfaceC12361f.a.m69488a((InterfaceC12361f) m103742Dp(), m69225rr(enumC2344e0), null, 2, null);
        }
    }

    /* renamed from: zr */
    private final boolean m69240zr() {
        C3499e0 c3499e0 = this.f64086t;
        if (c3499e0 == null) {
            AbstractC19074t.m100223u("mediaStore");
            c3499e0 = null;
        }
        if (c3499e0.m17612Q() == EnumC2363o.f9889p) {
            return true;
        }
        return false;
    }

    /* renamed from: Cr */
    public final void m69241Cr() {
        ((InterfaceC12361f) m103742Dp()).mo69366rk(true, true, "", this.f64072F);
        m69182Vq(true);
        m69186Xq();
        C0815e1.m2075D().m2100V(new C23648e(35, "", 0, "click_on_search_btn", ""), false);
    }

    @Override // androidx.lifecycle.InterfaceC1767f
    /* renamed from: D5 */
    public /* synthetic */ void mo8645D5(InterfaceC1801w interfaceC1801w) {
        AbstractC1765e.m9272a(this, interfaceC1801w);
    }

    @Override // androidx.lifecycle.InterfaceC1767f
    /* renamed from: Ro */
    public void mo8646Ro(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        m69188Yq();
        m69186Xq();
    }

    /* renamed from: S2 */
    public final String m69242S2() {
        return this.f64073G ? "2" : "1";
    }

    @Override // androidx.lifecycle.InterfaceC1767f
    /* renamed from: Xy */
    public void mo8647Xy(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        C3521p0 m69208ir = m69208ir();
        C3499e0 c3499e0 = this.f64086t;
        C3499e0 c3499e02 = null;
        if (c3499e0 == null) {
            AbstractC19074t.m100223u("mediaStore");
            c3499e0 = null;
        }
        m69208ir.m17794v(c3499e0, this.f64087u);
        C2535j c2535j = C2535j.f10308a;
        C3499e0 c3499e03 = this.f64086t;
        if (c3499e03 == null) {
            AbstractC19074t.m100223u("mediaStore");
        } else {
            c3499e02 = c3499e03;
        }
        c2535j.m12768B("chat_storedmedia", c3499e02.m17608M());
        C2549x.f10397a.m12856n();
        C29448r.f136087a.m146702a();
    }

    @Override // androidx.lifecycle.InterfaceC1767f
    /* renamed from: Zv */
    public void mo8648Zv(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        C0815e1.m2075D().m2097S(4, 1, System.currentTimeMillis());
        C3499e0 c3499e0 = this.f64086t;
        if (c3499e0 == null) {
            AbstractC19074t.m100223u("mediaStore");
            c3499e0 = null;
        }
        C3509j0.m17730p(c3499e0.m17608M());
    }

    @Override // androidx.lifecycle.InterfaceC1767f
    /* renamed from: mr */
    public /* synthetic */ void mo8649mr(InterfaceC1801w interfaceC1801w) {
        AbstractC1765e.m9274c(this, interfaceC1801w);
    }

    /* renamed from: or */
    public final int m69243or(EnumC2344e0 enumC2344e0) {
        AbstractC19074t.m100208f(enumC2344e0, "tab");
        int i11 = C12303a.f64095c[enumC2344e0.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return 5;
            }
            return 6;
        }
        return 7;
    }

    /* renamed from: vr */
    public InterfaceC29445q m69244vr() {
        return new C12309g();
    }

    @Override // androidx.lifecycle.InterfaceC1767f
    /* renamed from: wC */
    public void mo8650wC(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        C0815e1.m2075D().m2096R(m69243or(this.f64078L), System.currentTimeMillis());
        C3499e0 c3499e0 = this.f64086t;
        if (c3499e0 == null) {
            AbstractC19074t.m100223u("mediaStore");
            c3499e0 = null;
        }
        C3509j0.m17726l(c3499e0.m17608M());
    }
}
