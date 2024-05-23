package com.zing.zalo.shortvideo.p072ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Outline;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.C1547f0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b20.C2502h;
import c20.C3226p;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.data.remote.common.NetworkException;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.receiver.LoadMoreVideoReceiver;
import com.zing.zalo.shortvideo.p072ui.view.SimilarVideosLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.UsernameTextView;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18511r;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ln0.AbstractC22543l;
import mj0.AbstractC23322a;
import pm0.C24848g0;
import pm0.C24860q;
import q10.C25055t1;
import r20.AbstractC25622b;
import r20.C25624d;
import r20.C25626f;
import r20.C25627g;
import r20.C25628h;
import s20.AbstractC26104f;
import s20.AbstractC26108j;
import s20.AbstractC26112n;
import u20.AbstractC26992m;
import u20.C26980a;
import v00.AbstractC27407b;
import v00.AbstractC27408c;
import v00.AbstractC27413h;
import v00.C27417l;
import w00.AbstractC28684a;
import z10.C31177m0;

@SuppressLint({"NotifyDataSetChanged"})
/* loaded from: classes5.dex */
public final class SimilarVideosLayout extends FrameLayout {

    /* renamed from: A */
    private int f53309A;

    /* renamed from: B */
    private int f53310B;

    /* renamed from: C */
    private int f53311C;

    /* renamed from: D */
    private int f53312D;

    /* renamed from: E */
    private int f53313E;

    /* renamed from: F */
    private float f53314F;

    /* renamed from: G */
    private float f53315G;

    /* renamed from: H */
    private float f53316H;

    /* renamed from: I */
    private float f53317I;

    /* renamed from: J */
    private boolean f53318J;

    /* renamed from: K */
    private Video f53319K;

    /* renamed from: L */
    private C31177m0 f53320L;

    /* renamed from: M */
    private OverScrollableRecyclerView.GridLayoutManager f53321M;

    /* renamed from: N */
    private LoadMoreVideoReceiver f53322N;

    /* renamed from: O */
    private boolean f53323O;

    /* renamed from: P */
    private InterfaceC18494a f53324P;

    /* renamed from: Q */
    private int f53325Q;

    /* renamed from: R */
    private int f53326R;

    /* renamed from: S */
    private int f53327S;

    /* renamed from: T */
    private HashMap f53328T;

    /* renamed from: U */
    private AbstractC25622b f53329U;

    /* renamed from: V */
    private VelocityTracker f53330V;

    /* renamed from: W */
    private MotionEvent f53331W;

    /* renamed from: a0 */
    private MotionEvent f53332a0;

    /* renamed from: b0 */
    private C25055t1 f53333b0;

    /* renamed from: p */
    private InterfaceC10446a f53334p;

    /* renamed from: q */
    private final C1547f0 f53335q;

    /* renamed from: r */
    private final String f53336r;

    /* renamed from: s */
    private final int f53337s;

    /* renamed from: t */
    private final int f53338t;

    /* renamed from: u */
    private final int f53339u;

    /* renamed from: v */
    private final int f53340v;

    /* renamed from: w */
    private long f53341w;

    /* renamed from: x */
    private int f53342x;

    /* renamed from: y */
    private int f53343y;

    /* renamed from: z */
    private int f53344z;

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SimilarVideosLayout$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC10446a {

        /* renamed from: com.zing.zalo.shortvideo.ui.view.SimilarVideosLayout$a$a */
        /* loaded from: classes5.dex */
        public static final class a {
            /* renamed from: a */
            public static /* synthetic */ void m54982a(InterfaceC10446a interfaceC10446a, String str, LoadMoreInfo loadMoreInfo, int i11, Object obj) {
                if (obj == null) {
                    if ((i11 & 2) != 0) {
                        loadMoreInfo = null;
                    }
                    interfaceC10446a.mo54977d(str, loadMoreInfo);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestPreload");
            }
        }

        /* renamed from: a */
        void mo54974a(Channel channel, boolean z11);

        /* renamed from: b */
        void mo54975b(String str, Section section, int i11, String str2);

        /* renamed from: c */
        void mo54976c();

        /* renamed from: d */
        void mo54977d(String str, LoadMoreInfo loadMoreInfo);

        /* renamed from: e */
        void mo54978e(boolean z11);

        /* renamed from: f */
        void mo54979f(String str);

        /* renamed from: g */
        void mo54980g(Channel channel);

        /* renamed from: h */
        void mo54981h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.SimilarVideosLayout$a0 */
    /* loaded from: classes5.dex */
    public static final class C10447a0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C10447a0 f53345q = new C10447a0();

        C10447a0() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54983a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54983a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.SimilarVideosLayout$b */
    /* loaded from: classes5.dex */
    public static final class C10448b extends AbstractC19075u implements InterfaceC18494a {
        C10448b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54984a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54984a() {
            SimilarVideosLayout.this.f53318J = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.SimilarVideosLayout$b0 */
    /* loaded from: classes5.dex */
    public static final class C10449b0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C10449b0 f53347q = new C10449b0();

        C10449b0() {
            super(1);
        }

        /* renamed from: a */
        public final void m54985a(float f11) {
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54985a(((Number) obj).floatValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.SimilarVideosLayout$c */
    /* loaded from: classes5.dex */
    public static final class C10450c extends AbstractC19075u implements InterfaceC18505l {
        C10450c() {
            super(1);
        }

        /* renamed from: a */
        public final void m54986a(float f11) {
            SimilarVideosLayout.this.m54939T((int) f11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54986a(((Number) obj).floatValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.SimilarVideosLayout$c0 */
    /* loaded from: classes5.dex */
    public static final class C10451c0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ Channel f53350r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10451c0(Channel channel) {
            super(1);
            this.f53350r = channel;
        }

        /* renamed from: a */
        public final void m54987a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC10446a callback = SimilarVideosLayout.this.getCallback();
            if (callback != null) {
                callback.mo54974a(this.f53350r, !r0.m50741Q());
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54987a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.SimilarVideosLayout$d */
    /* loaded from: classes5.dex */
    public static final class C10452d extends AbstractC19075u implements InterfaceC18494a {
        C10452d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54988a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54988a() {
            SimilarVideosLayout.this.f53318J = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.SimilarVideosLayout$d0 */
    /* loaded from: classes5.dex */
    public static final class C10453d0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ Video f53353r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10453d0(Video video) {
            super(1);
            this.f53353r = video;
        }

        /* renamed from: a */
        public final void m54989a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC10446a callback = SimilarVideosLayout.this.getCallback();
            if (callback != null) {
                callback.mo54980g(this.f53353r.m52887f());
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54989a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.SimilarVideosLayout$e */
    /* loaded from: classes5.dex */
    public static final class C10454e extends AbstractC19075u implements InterfaceC18505l {
        C10454e() {
            super(1);
        }

        /* renamed from: a */
        public final void m54990a(float f11) {
            SimilarVideosLayout.this.m54939T((int) f11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54990a(((Number) obj).floatValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.SimilarVideosLayout$e0 */
    /* loaded from: classes5.dex */
    public static final class C10455e0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ Video f53356r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10455e0(Video video) {
            super(1);
            this.f53356r = video;
        }

        /* renamed from: a */
        public final void m54991a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC10446a callback = SimilarVideosLayout.this.getCallback();
            if (callback != null) {
                callback.mo54980g(this.f53356r.m52887f());
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54991a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.SimilarVideosLayout$f */
    /* loaded from: classes5.dex */
    public static final class C10456f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ Section f53358r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10456f(Section section) {
            super(0);
            this.f53358r = section;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54992a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54992a() {
            SimilarVideosLayout.this.m54964D(this.f53358r);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SimilarVideosLayout$f0 */
    /* loaded from: classes5.dex */
    public static final class C10457f0 extends AbstractC26992m {

        /* renamed from: s */
        final /* synthetic */ String f53360s;

        C10457f0(String str) {
            this.f53360s = str;
        }

        @Override // u20.AbstractC26992m
        /* renamed from: a */
        public void mo52095a(View view) {
            AbstractC19074t.m100208f(view, "widget");
            InterfaceC10446a callback = SimilarVideosLayout.this.getCallback();
            if (callback != null) {
                String str = this.f53360s;
                AbstractC19074t.m100207e(str, "$hashtag");
                callback.mo54979f(str);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "paint");
            textPaint.setTypeface(AbstractC26112n.m134364E(SimilarVideosLayout.this, 9));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.SimilarVideosLayout$g */
    /* loaded from: classes5.dex */
    public static final class C10458g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f53361q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10458g(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f53361q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54993a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54993a() {
            this.f53361q.mo12V4();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SimilarVideosLayout$g0 */
    /* loaded from: classes5.dex */
    public static final class C10459g0 extends MetricAffectingSpan {
        C10459g0() {
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "paint");
        }

        @Override // android.text.style.MetricAffectingSpan
        public void updateMeasureState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "paint");
            textPaint.setTypeface(AbstractC26112n.m134364E(SimilarVideosLayout.this, 9));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.SimilarVideosLayout$h */
    /* loaded from: classes5.dex */
    public static final class C10460h extends AbstractC19075u implements InterfaceC18505l {
        C10460h() {
            super(1);
        }

        /* renamed from: a */
        public final void m54994a(float f11) {
            SimilarVideosLayout.this.m54939T((int) f11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54994a(((Number) obj).floatValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.SimilarVideosLayout$i */
    /* loaded from: classes5.dex */
    public static final class C10461i extends AbstractC19075u implements InterfaceC18494a {
        C10461i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C24848g0 mo12V4() {
            SimilarVideosLayout.this.f53323O = false;
            InterfaceC10446a callback = SimilarVideosLayout.this.getCallback();
            if (callback != null) {
                callback.mo54976c();
            }
            C31177m0 c31177m0 = SimilarVideosLayout.this.f53320L;
            if (c31177m0 != null) {
                c31177m0.m151809X();
            }
            C31177m0 c31177m02 = SimilarVideosLayout.this.f53320L;
            if (c31177m02 != null) {
                c31177m02.m10008p();
                return C24848g0.f119245a;
            }
            return null;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SimilarVideosLayout$j */
    /* loaded from: classes5.dex */
    static final class C10462j extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C10462j f53365q = new C10462j();

        C10462j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54996a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54996a() {
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SimilarVideosLayout$k */
    /* loaded from: classes5.dex */
    static final class C10463k extends AbstractC19075u implements InterfaceC18494a {
        C10463k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54997a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54997a() {
            Video video;
            String m52911t;
            InterfaceC10446a callback = SimilarVideosLayout.this.getCallback();
            if (callback != null && (video = SimilarVideosLayout.this.f53319K) != null && (m52911t = video.m52911t()) != null) {
                InterfaceC10446a.a.m54982a(callback, m52911t, null, 2, null);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SimilarVideosLayout$l */
    /* loaded from: classes5.dex */
    static final class C10464l extends AbstractC19075u implements InterfaceC18494a {
        C10464l() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54998a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54998a() {
            Video video;
            String m52911t;
            InterfaceC10446a callback = SimilarVideosLayout.this.getCallback();
            if (callback != null && (video = SimilarVideosLayout.this.f53319K) != null && (m52911t = video.m52911t()) != null) {
                InterfaceC10446a.a.m54982a(callback, m52911t, null, 2, null);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SimilarVideosLayout$m */
    /* loaded from: classes5.dex */
    static final class C10465m extends AbstractC19075u implements InterfaceC18509p {
        C10465m() {
            super(2);
        }

        /* renamed from: a */
        public final void m54999a(String str, String str2) {
            String str3;
            Section mo146381t;
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(str2, "uuid");
            Video video = SimilarVideosLayout.this.f53319K;
            if (video != null) {
                str3 = video.m52911t();
            } else {
                str3 = null;
            }
            if (AbstractC19074t.m100204b(str3, str) && AbstractC19074t.m100204b(SimilarVideosLayout.this.f53336r, str2) && (mo146381t = AbstractC28684a.Companion.m143692z().mo146381t(str)) != null) {
                SimilarVideosLayout.this.m54964D(mo146381t);
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m54999a((String) obj, (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SimilarVideosLayout$n */
    /* loaded from: classes5.dex */
    static final class C10466n extends AbstractC19075u implements InterfaceC18511r {
        C10466n() {
            super(4);
        }

        @Override // en0.InterfaceC18511r
        /* renamed from: Uc */
        public /* bridge */ /* synthetic */ Object mo49340Uc(Object obj, Object obj2, Object obj3, Object obj4) {
            m55000a((String) obj, ((Number) obj2).intValue(), (String) obj3, (String) obj4);
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55000a(String str, int i11, String str2, String str3) {
            String str4;
            OverScrollableRecyclerView.GridLayoutManager gridLayoutManager;
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(str2, "uuid");
            AbstractC19074t.m100208f(str3, "<anonymous parameter 3>");
            Video video = SimilarVideosLayout.this.f53319K;
            if (video != null) {
                str4 = video.m52911t();
            } else {
                str4 = null;
            }
            if (AbstractC19074t.m100204b(str4, str) && AbstractC19074t.m100204b(SimilarVideosLayout.this.f53336r, str2) && (gridLayoutManager = SimilarVideosLayout.this.f53321M) != null) {
                SimilarVideosLayout similarVideosLayout = SimilarVideosLayout.this;
                if (gridLayoutManager.m9741Z1() < i11) {
                    similarVideosLayout.m54938S(1.0f);
                    similarVideosLayout.f53318J = true;
                }
                gridLayoutManager.mo9756v1(i11);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SimilarVideosLayout$o */
    /* loaded from: classes5.dex */
    public static final class C10467o extends ViewOutlineProvider {
        C10467o() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            float f11;
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(outline, "outline");
            int width = view.getWidth();
            int height = view.getHeight();
            if (SimilarVideosLayout.this.f53309A < SimilarVideosLayout.this.f53337s) {
                f11 = 0.0f;
            } else {
                f11 = (1.0f - SimilarVideosLayout.this.f53316H) * SimilarVideosLayout.this.f53340v;
            }
            outline.setRoundRect(0, 0, width, height, f11);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SimilarVideosLayout$p */
    /* loaded from: classes5.dex */
    static final class C10468p extends AbstractC19075u implements InterfaceC18505l {
        C10468p() {
            super(1);
        }

        /* renamed from: a */
        public final void m55001a(View view) {
            AbstractC19074t.m100208f(view, "it");
            SimilarVideosLayout.m54933K(SimilarVideosLayout.this, false, 0.0f, 3, null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55001a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SimilarVideosLayout$q */
    /* loaded from: classes5.dex */
    public static final class C10469q extends ViewOutlineProvider {
        C10469q() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(outline, "outline");
            outline.setRect(0, -((int) view.getTranslationY()), view.getWidth(), view.getHeight());
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SimilarVideosLayout$r */
    /* loaded from: classes5.dex */
    public static final class C10470r implements C31177m0.b {
        C10470r() {
        }

        @Override // z10.C31177m0.b
        /* renamed from: a */
        public void mo55002a(LoadMoreInfo loadMoreInfo) {
            Video video;
            String m52911t;
            AbstractC19074t.m100208f(loadMoreInfo, "loadMore");
            InterfaceC10446a callback = SimilarVideosLayout.this.getCallback();
            if (callback != null && (video = SimilarVideosLayout.this.f53319K) != null && (m52911t = video.m52911t()) != null) {
                callback.mo54977d(m52911t, loadMoreInfo);
            }
        }

        @Override // z10.C31177m0.b
        /* renamed from: b */
        public void mo55003b(Section section, int i11) {
            Video video;
            String m52911t;
            AbstractC19074t.m100208f(section, "section");
            InterfaceC10446a callback = SimilarVideosLayout.this.getCallback();
            if (callback != null && (video = SimilarVideosLayout.this.f53319K) != null && (m52911t = video.m52911t()) != null) {
                callback.mo54975b(m52911t, section, i11, SimilarVideosLayout.this.f53336r);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SimilarVideosLayout$s */
    /* loaded from: classes5.dex */
    public static final class C10471s extends GridLayoutManager.AbstractC1865b {
        C10471s() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1865b
        /* renamed from: f */
        public int mo9682f(int i11) {
            Integer num;
            C31177m0 c31177m0 = SimilarVideosLayout.this.f53320L;
            if (c31177m0 != null) {
                num = Integer.valueOf(c31177m0.mo10005m(i11));
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 0) {
                return 1;
            }
            if (num != null && num.intValue() == 1) {
                return 2;
            }
            return 0;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SimilarVideosLayout$t */
    /* loaded from: classes5.dex */
    public static final class C10472t implements OverScrollableRecyclerView.InterfaceC10832c {
        C10472t() {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView.InterfaceC10832c
        /* renamed from: a */
        public void mo53961a() {
            C31177m0 c31177m0 = SimilarVideosLayout.this.f53320L;
            if (c31177m0 != null) {
                c31177m0.mo151429P();
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SimilarVideosLayout$u */
    /* loaded from: classes5.dex */
    public static final class C10473u extends RecyclerView.AbstractC1892s {

        /* renamed from: b */
        final /* synthetic */ OverScrollableRecyclerView f53379b;

        C10473u(OverScrollableRecyclerView overScrollableRecyclerView) {
            this.f53379b = overScrollableRecyclerView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            SimilarVideosLayout.this.m54971U(this.f53379b.computeVerticalScrollOffset() - this.f53379b.getOffsetY());
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SimilarVideosLayout$v */
    /* loaded from: classes5.dex */
    public static final class C10474v implements OverScrollableRecyclerView.InterfaceC10830a {

        /* renamed from: b */
        final /* synthetic */ OverScrollableRecyclerView f53381b;

        C10474v(OverScrollableRecyclerView overScrollableRecyclerView) {
            this.f53381b = overScrollableRecyclerView;
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView.InterfaceC10830a
        /* renamed from: a */
        public void mo52660a(float f11, float f12) {
            SimilarVideosLayout.this.m54971U(this.f53381b.computeVerticalScrollOffset() - this.f53381b.getOffsetY());
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SimilarVideosLayout$w */
    /* loaded from: classes5.dex */
    static final class C10475w extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C25055t1 f53382q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10475w(C25055t1 c25055t1) {
            super(0);
            this.f53382q = c25055t1;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(this.f53382q.f120308u.getMeasuredHeight());
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SimilarVideosLayout$x */
    /* loaded from: classes5.dex */
    static final class C10476x extends AbstractC19075u implements InterfaceC18494a {
        C10476x() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            int i11;
            int i12;
            if (SimilarVideosLayout.this.f53315G <= SimilarVideosLayout.this.f53314F) {
                i11 = SimilarVideosLayout.this.f53344z;
                i12 = SimilarVideosLayout.this.f53311C;
            } else {
                i11 = SimilarVideosLayout.this.f53344z;
                i12 = SimilarVideosLayout.this.f53313E;
            }
            return Integer.valueOf(i11 - i12);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SimilarVideosLayout$y */
    /* loaded from: classes5.dex */
    static final class C10477y extends AbstractC19075u implements InterfaceC18494a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.view.SimilarVideosLayout$y$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final a f53385q = new a();

            a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m55007a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m55007a() {
            }
        }

        C10477y() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55006a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55006a() {
            SimilarVideosLayout.this.f53318J = false;
            SimilarVideosLayout.this.f53323O = true;
            SimilarVideosLayout.this.f53324P.mo12V4();
            SimilarVideosLayout.this.f53324P = a.f53385q;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SimilarVideosLayout$z */
    /* loaded from: classes5.dex */
    static final class C10478z extends AbstractC19075u implements InterfaceC18505l {
        C10478z() {
            super(1);
        }

        /* renamed from: a */
        public final void m55008a(float f11) {
            SimilarVideosLayout.this.m54939T((int) f11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55008a(((Number) obj).floatValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimilarVideosLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f53335q = new C1547f0(this);
        String uuid = UUID.randomUUID().toString();
        AbstractC19074t.m100207e(uuid, "toString(...)");
        this.f53336r = uuid;
        this.f53337s = AbstractC26112n.m134365F(this);
        this.f53338t = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_header_height);
        this.f53339u = AbstractC26112n.m134433y(this, AbstractC27407b.zch_bts_thumb_height);
        this.f53340v = AbstractC26112n.m134433y(this, AbstractC27407b.zch_radius_12dp);
        this.f53324P = C10462j.f53365q;
        this.f53328T = new HashMap();
    }

    /* renamed from: A */
    private final void m54927A(float f11) {
        if (f11 <= 0.0f && (f11 != 0.0f || this.f53317I > 0.5f)) {
            if (f11 >= 0.0f && this.f53316H < 0.5f) {
                m54934O(this.f53313E, this.f53311C, f11, new C10452d(), new C10454e());
                return;
            }
            m54934O(this.f53313E, this.f53310B, f11, new C10448b(), new C10450c());
            if (!this.f53318J) {
                post(new Runnable() { // from class: m20.t1
                    @Override // java.lang.Runnable
                    public final void run() {
                        SimilarVideosLayout.m54929C(SimilarVideosLayout.this);
                    }
                });
                return;
            }
            return;
        }
        m54933K(this, false, f11, 1, null);
    }

    /* renamed from: B */
    static /* synthetic */ void m54928B(SimilarVideosLayout similarVideosLayout, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 0.0f;
        }
        similarVideosLayout.m54927A(f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public static final void m54929C(SimilarVideosLayout similarVideosLayout) {
        AbstractC19074t.m100208f(similarVideosLayout, "this$0");
        C25055t1 c25055t1 = similarVideosLayout.f53333b0;
        if (c25055t1 == null) {
            AbstractC19074t.m100223u("binding");
            c25055t1 = null;
        }
        c25055t1.f120307t.m9845O1(0, c25055t1.f120308u.getMeasuredHeight());
    }

    /* renamed from: G */
    private final void m54930G(float f11, float f12, float f13, float f14, final InterfaceC18494a interfaceC18494a, final InterfaceC18505l interfaceC18505l) {
        if (f12 >= f11 && f12 <= f13 && f14 != 0.0f) {
            C25624d c25624d = new C25624d(new C25626f(f12));
            c25624d.m132328c(new AbstractC25622b.r() { // from class: m20.r1
                @Override // r20.AbstractC25622b.r
                /* renamed from: a */
                public final void mo52475a(AbstractC25622b abstractC25622b, float f15, float f16) {
                    SimilarVideosLayout.m54931H(InterfaceC18505l.this, abstractC25622b, f15, f16);
                }
            });
            c25624d.m132327b(new AbstractC25622b.q() { // from class: m20.s1
                @Override // r20.AbstractC25622b.q
                /* renamed from: a */
                public final void mo52476a(AbstractC25622b abstractC25622b, boolean z11, float f15, float f16) {
                    SimilarVideosLayout.m54932I(InterfaceC18494a.this, abstractC25622b, z11, f15, f16);
                }
            });
            c25624d.m132372u(f14);
            c25624d.m132371t(f11);
            c25624d.m132370s(f13);
            c25624d.m132369r(0.1f);
            c25624d.mo132336n();
            this.f53329U = c25624d;
            return;
        }
        interfaceC18494a.mo12V4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public static final void m54931H(InterfaceC18505l interfaceC18505l, AbstractC25622b abstractC25622b, float f11, float f12) {
        AbstractC19074t.m100208f(interfaceC18505l, "$updAction");
        interfaceC18505l.mo205i9(Float.valueOf(f11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public static final void m54932I(InterfaceC18494a interfaceC18494a, AbstractC25622b abstractC25622b, boolean z11, float f11, float f12) {
        AbstractC19074t.m100208f(interfaceC18494a, "$endAction");
        if (!z11) {
            interfaceC18494a.mo12V4();
        }
    }

    /* renamed from: K */
    public static /* synthetic */ void m54933K(SimilarVideosLayout similarVideosLayout, boolean z11, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            f11 = 0.0f;
        }
        similarVideosLayout.m54967J(z11, f11);
    }

    /* renamed from: O */
    private final void m54934O(float f11, float f12, float f13, final InterfaceC18494a interfaceC18494a, final InterfaceC18505l interfaceC18505l) {
        if (f11 == f12 && f13 == 0.0f) {
            interfaceC18505l.mo205i9(Float.valueOf(f12));
            interfaceC18494a.mo12V4();
            return;
        }
        C25627g c25627g = new C25627g(new C25626f(f11));
        C25628h c25628h = new C25628h();
        c25628h.m132386d(1.0f);
        c25628h.m132388f(1000.0f);
        c25627g.m132382t(c25628h);
        c25627g.m132328c(new AbstractC25622b.r() { // from class: m20.u1
            @Override // r20.AbstractC25622b.r
            /* renamed from: a */
            public final void mo52475a(AbstractC25622b abstractC25622b, float f14, float f15) {
                SimilarVideosLayout.m54936Q(InterfaceC18505l.this, abstractC25622b, f14, f15);
            }
        });
        c25627g.m132327b(new AbstractC25622b.q() { // from class: m20.v1
            @Override // r20.AbstractC25622b.q
            /* renamed from: a */
            public final void mo52476a(AbstractC25622b abstractC25622b, boolean z11, float f14, float f15) {
                SimilarVideosLayout.m54937R(InterfaceC18494a.this, abstractC25622b, z11, f14, f15);
            }
        });
        c25627g.m132335m(f13);
        c25627g.m132380q(f12);
        this.f53329U = c25627g;
    }

    /* renamed from: P */
    static /* synthetic */ void m54935P(SimilarVideosLayout similarVideosLayout, float f11, float f12, float f13, InterfaceC18494a interfaceC18494a, InterfaceC18505l interfaceC18505l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 2) != 0) {
            f12 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            f13 = 0.0f;
        }
        if ((i11 & 8) != 0) {
            interfaceC18494a = C10447a0.f53345q;
        }
        if ((i11 & 16) != 0) {
            interfaceC18505l = C10449b0.f53347q;
        }
        similarVideosLayout.m54934O(f11, f12, f13, interfaceC18494a, interfaceC18505l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public static final void m54936Q(InterfaceC18505l interfaceC18505l, AbstractC25622b abstractC25622b, float f11, float f12) {
        AbstractC19074t.m100208f(interfaceC18505l, "$updAction");
        interfaceC18505l.mo205i9(Float.valueOf(f11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public static final void m54937R(InterfaceC18494a interfaceC18494a, AbstractC25622b abstractC25622b, boolean z11, float f11, float f12) {
        AbstractC19074t.m100208f(interfaceC18494a, "$endAction");
        if (!z11) {
            interfaceC18494a.mo12V4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public final void m54938S(float f11) {
        InterfaceC10446a interfaceC10446a;
        float f12 = this.f53315G;
        if (f12 < 1.0f && f11 >= 1.0f) {
            InterfaceC10446a interfaceC10446a2 = this.f53334p;
            if (interfaceC10446a2 != null) {
                interfaceC10446a2.mo54978e(true);
            }
        } else if (f12 >= 1.0f && f11 < 1.0f && (interfaceC10446a = this.f53334p) != null) {
            interfaceC10446a.mo54978e(false);
        }
        this.f53315G = f11;
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public final void m54939T(int i11) {
        int i12 = this.f53312D;
        m54938S((i12 - i11) / (i12 - this.f53310B));
    }

    /* renamed from: D */
    public final void m54964D(Section section) {
        Section m151811Z;
        List m51168m;
        AbstractC19074t.m100208f(section, "videos");
        if (!this.f53323O) {
            this.f53324P = new C10456f(section);
            return;
        }
        if (this.f53333b0 == null) {
            AbstractC19074t.m100223u("binding");
        }
        C31177m0 c31177m0 = this.f53320L;
        if (c31177m0 != null && (m151811Z = c31177m0.m151811Z()) != null && (m51168m = m151811Z.m51168m()) != null && m51168m.size() == 0) {
            C31177m0 c31177m02 = this.f53320L;
            if (c31177m02 != null) {
                if (section.m51168m().isEmpty()) {
                    c31177m02.m151807V();
                } else {
                    c31177m02.m151815d0(section);
                    C31177m0.m151803S(c31177m02, null, 1, null);
                }
                c31177m02.m10008p();
                return;
            }
            return;
        }
        C31177m0 c31177m03 = this.f53320L;
        if (c31177m03 != null) {
            int mo10003k = c31177m03.mo10003k();
            c31177m03.m151804R(section);
            int mo10003k2 = c31177m03.mo10003k() - mo10003k;
            c31177m03.m151445N();
            c31177m03.m10015w(mo10003k, mo10003k2);
        }
    }

    /* renamed from: E */
    public final int m54965E() {
        C3226p.a aVar = C3226p.Companion;
        return (int) ((aVar.m16360c() * (1.0f - this.f53317I)) + (aVar.m16361d() * this.f53317I));
    }

    /* renamed from: F */
    public final int m54966F() {
        if (C3226p.Companion.m16363f()) {
            return (int) (this.f53337s * this.f53317I);
        }
        return this.f53337s;
    }

    /* renamed from: J */
    public final void m54967J(boolean z11, float f11) {
        float m116579b;
        float m116579b2;
        C10461i c10461i = new C10461i();
        if (z11) {
            AbstractC25622b abstractC25622b = this.f53329U;
            if (abstractC25622b != null) {
                abstractC25622b.m132329d();
            }
            m54938S(0.0f);
            c10461i.mo12V4();
            return;
        }
        AbstractC25622b abstractC25622b2 = this.f53329U;
        if (abstractC25622b2 == null || !abstractC25622b2.m132331h()) {
            float f12 = this.f53310B;
            int i11 = this.f53313E;
            int i12 = this.f53312D;
            m116579b = AbstractC22543l.m116579b((i12 - i11) * 6.0f, this.f53326R);
            m116579b2 = AbstractC22543l.m116579b(m116579b, f11);
            m54930G(f12, i11, i12, m116579b2, new C10458g(c10461i), new C10460h());
        }
    }

    /* renamed from: L */
    public final void m54968L(Throwable th2) {
        Section m151811Z;
        List m51168m;
        AbstractC19074t.m100208f(th2, "throwable");
        if (this.f53333b0 == null) {
            AbstractC19074t.m100223u("binding");
        }
        C31177m0 c31177m0 = this.f53320L;
        if (c31177m0 != null && (m151811Z = c31177m0.m151811Z()) != null && (m51168m = m151811Z.m51168m()) != null && m51168m.size() == 0) {
            if (th2 instanceof NetworkException) {
                C31177m0 c31177m02 = this.f53320L;
                if (c31177m02 != null) {
                    c31177m02.m151806U(new C10463k());
                }
                C31177m0 c31177m03 = this.f53320L;
                if (c31177m03 != null) {
                    c31177m03.m10008p();
                    return;
                }
                return;
            }
            C31177m0 c31177m04 = this.f53320L;
            if (c31177m04 != null) {
                c31177m04.m151805T(new C10464l());
            }
            C31177m0 c31177m05 = this.f53320L;
            if (c31177m05 != null) {
                c31177m05.m10008p();
            }
        }
    }

    /* renamed from: M */
    public final void m54969M(boolean z11) {
        C31177m0 c31177m0;
        Section m151811Z;
        List m51168m;
        String m52911t;
        if (z11 && (c31177m0 = this.f53320L) != null && (m151811Z = c31177m0.m151811Z()) != null && (m51168m = m151811Z.m51168m()) != null && m51168m.size() == 0) {
            InterfaceC10446a interfaceC10446a = this.f53334p;
            if (interfaceC10446a != null) {
                Video video = this.f53319K;
                if (video != null && (m52911t = video.m52911t()) != null) {
                    InterfaceC10446a.a.m54982a(interfaceC10446a, m52911t, null, 2, null);
                } else {
                    return;
                }
            }
            C31177m0 c31177m02 = this.f53320L;
            if (c31177m02 != null) {
                c31177m02.m151808W();
            }
            C31177m0 c31177m03 = this.f53320L;
            if (c31177m03 != null) {
                c31177m03.m10008p();
            }
        }
    }

    /* renamed from: N */
    public final void m54970N(Video video) {
        AbstractC19074t.m100208f(video, "video");
        AbstractC25622b abstractC25622b = this.f53329U;
        if (abstractC25622b == null || !abstractC25622b.m132331h()) {
            this.f53319K = video;
            m54973W(video);
            m54935P(this, this.f53312D, this.f53311C, 0.0f, new C10477y(), new C10478z(), 4, null);
            InterfaceC10446a interfaceC10446a = this.f53334p;
            if (interfaceC10446a != null) {
                interfaceC10446a.mo54981h();
            }
        }
    }

    /* renamed from: U */
    public final void m54971U(float f11) {
        float f12;
        C25055t1 c25055t1 = this.f53333b0;
        if (c25055t1 == null) {
            AbstractC19074t.m100223u("binding");
            c25055t1 = null;
        }
        c25055t1.f120308u.setTranslationY(-f11);
        c25055t1.f120308u.invalidateOutline();
        SimpleShadowTextView simpleShadowTextView = c25055t1.f120300A;
        if (f11 < c25055t1.f120308u.getMeasuredHeight()) {
            f12 = 0.0f;
        } else {
            f12 = 1.0f;
        }
        simpleShadowTextView.setAlpha(f12);
    }

    /* renamed from: V */
    public final void m54972V(Channel channel) {
        String str;
        Channel m52887f;
        AbstractC19074t.m100208f(channel, "channel");
        String m50769l = channel.m50769l();
        Video video = this.f53319K;
        String str2 = null;
        if (video != null && (m52887f = video.m52887f()) != null) {
            str = m52887f.m50769l();
        } else {
            str = null;
        }
        if (!AbstractC19074t.m100204b(m50769l, str)) {
            return;
        }
        Boolean mo146377p = AbstractC28684a.Companion.m143692z().mo146377p(channel.m50769l());
        if (mo146377p != null) {
            channel.m50770l0(mo146377p.booleanValue());
        }
        C25055t1 c25055t1 = this.f53333b0;
        if (c25055t1 == null) {
            AbstractC19074t.m100223u("binding");
            c25055t1 = null;
        }
        SimpleShadowTextView simpleShadowTextView = c25055t1.f120306s;
        String m50769l2 = channel.m50769l();
        Channel m140377a = C27417l.f129055a.m140377a();
        if (m140377a != null) {
            str2 = m140377a.m50769l();
        }
        if (AbstractC19074t.m100204b(m50769l2, str2)) {
            AbstractC19074t.m100205c(simpleShadowTextView);
            AbstractC26112n.m134367H(simpleShadowTextView);
            return;
        }
        if (channel.m50741Q()) {
            SpannableString spannableString = new SpannableString(" ");
            Context context = simpleShadowTextView.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            spannableString.setSpan(new C26980a(context, AbstractC23322a.zch_ic_check_solid_16, 0, 4, null), 0, 1, 17);
            simpleShadowTextView.setText(spannableString);
            simpleShadowTextView.setBackgroundResource(AbstractC27408c.zch_bg_button_outline);
        } else {
            simpleShadowTextView.setText(AbstractC27413h.zch_item_video_follow);
            simpleShadowTextView.setBackgroundResource(AbstractC27408c.zch_bg_button_active_blue);
        }
        AbstractC19074t.m100205c(simpleShadowTextView);
        AbstractC26112n.m134407k0(simpleShadowTextView, new C10451c0(channel));
        AbstractC26112n.m134431w0(simpleShadowTextView);
    }

    /* renamed from: W */
    public final void m54973W(Video video) {
        AbstractC19074t.m100208f(video, "video");
        C25055t1 c25055t1 = this.f53333b0;
        if (c25055t1 == null) {
            AbstractC19074t.m100223u("binding");
            c25055t1 = null;
        }
        c25055t1.f120304q.setAvatar(video.m52887f());
        AvatarImageView avatarImageView = c25055t1.f120304q;
        AbstractC19074t.m100207e(avatarImageView, "aivSimilarAvatar");
        AbstractC26112n.m134407k0(avatarImageView, new C10453d0(video));
        c25055t1.f120312y.setText(video.m52887f().m50775o());
        c25055t1.f120312y.setVerifiedIcon(video.m52887f().m50725F());
        UsernameTextView usernameTextView = c25055t1.f120312y;
        AbstractC19074t.m100207e(usernameTextView, "txtSimilarName");
        AbstractC26112n.m134407k0(usernameTextView, new C10455e0(video));
        m54972V(video.m52887f());
        EllipsizedTextView ellipsizedTextView = c25055t1.f120311x;
        SpannableString spannableString = new SpannableString(video.m52894j());
        Matcher matcher = Pattern.compile("#\\w+").matcher(spannableString);
        while (matcher.find()) {
            spannableString.setSpan(new C10457f0(matcher.group()), matcher.start(), matcher.end(), 17);
            spannableString.setSpan(new C10459g0(), matcher.start(), matcher.end(), 17);
        }
        ellipsizedTextView.setText(spannableString);
        C31177m0 c31177m0 = this.f53320L;
        if (c31177m0 != null) {
            c31177m0.m151808W();
        }
        C31177m0 c31177m02 = this.f53320L;
        if (c31177m02 != null) {
            c31177m02.m10008p();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        if (getNestedScrollAxes() != 0) {
            if (this.f53318J) {
                motionEvent.offsetLocation(0.0f, this.f53313E - this.f53310B);
            } else {
                motionEvent.offsetLocation(0.0f, this.f53313E - this.f53311C);
            }
        }
        if (motionEvent.getAction() == 0) {
            this.f53331W = AbstractC26104f.m134330a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final InterfaceC10446a getCallback() {
        return this.f53334p;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f53335q.m7761a();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        LoadMoreVideoReceiver loadMoreVideoReceiver = new LoadMoreVideoReceiver(new C10465m(), new C10466n());
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        loadMoreVideoReceiver.mo53685d(context);
        this.f53322N = loadMoreVideoReceiver;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        LoadMoreVideoReceiver loadMoreVideoReceiver = this.f53322N;
        if (loadMoreVideoReceiver != null) {
            loadMoreVideoReceiver.mo53687g();
        }
        AbstractC25622b abstractC25622b = this.f53329U;
        if (abstractC25622b != null) {
            abstractC25622b.m132329d();
        }
        this.f53328T.clear();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f53325Q = viewConfiguration.getScaledTouchSlop();
        this.f53326R = viewConfiguration.getScaledMinimumFlingVelocity() * 10;
        this.f53327S = viewConfiguration.getScaledMaximumFlingVelocity();
        final C25055t1 m129940a = C25055t1.m129940a(this);
        AbstractC19074t.m100205c(m129940a);
        this.f53333b0 = m129940a;
        View view = m129940a.f120301B;
        view.setClipToOutline(true);
        view.setOutlineProvider(new C10467o());
        FrameLayout frameLayout = m129940a.f120309v;
        AbstractC19074t.m100207e(frameLayout, "lytSimilarHeader");
        AbstractC26112n.m134419q0(frameLayout, this.f53337s);
        ImageView imageView = m129940a.f120305r;
        AbstractC19074t.m100207e(imageView, "btnSimilarBack");
        AbstractC26112n.m134407k0(imageView, new C10468p());
        LinearLayout linearLayout = m129940a.f120308u;
        linearLayout.setClipToOutline(true);
        linearLayout.setOutlineProvider(new C10469q());
        C31177m0 c31177m0 = new C31177m0(null, 1, 0 == true ? 1 : 0);
        c31177m0.m151814c0(new C10470r());
        this.f53320L = c31177m0;
        final Context context = getContext();
        OverScrollableRecyclerView.GridLayoutManager gridLayoutManager = new OverScrollableRecyclerView.GridLayoutManager(this, context) { // from class: com.zing.zalo.shortvideo.ui.view.SimilarVideosLayout$onFinishInflate$2$5

            /* renamed from: S */
            private final int f53371S;

            /* renamed from: U */
            final /* synthetic */ SimilarVideosLayout f53373U;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context, 2, 0, false, false, 28, null);
                AbstractC19074t.m100205c(context);
                this.f53371S = Resources.getSystem().getDisplayMetrics().heightPixels;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.recyclerview.widget.LinearLayoutManager
            /* renamed from: K1 */
            public void mo9731K1(RecyclerView.C1899z c1899z, int[] iArr) {
                AbstractC19074t.m100208f(c1899z, "state");
                AbstractC19074t.m100208f(iArr, "extraLayoutSpace");
                int i11 = this.f53371S;
                iArr[0] = i11 / 2;
                iArr[1] = i11 / 2;
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
            /* renamed from: W0 */
            public void mo9666W0(RecyclerView.C1899z c1899z) {
                super.mo9666W0(c1899z);
                this.f53373U.m54971U(r3.computeVerticalScrollOffset() - C25055t1.this.f120307t.getOffsetY());
            }
        };
        gridLayoutManager.m9671f3(new C10471s());
        this.f53321M = gridLayoutManager;
        OverScrollableRecyclerView overScrollableRecyclerView = m129940a.f120307t;
        overScrollableRecyclerView.setAdapter(this.f53320L);
        overScrollableRecyclerView.setLayoutManager(this.f53321M);
        AbstractC19074t.m100205c(overScrollableRecyclerView);
        OverScrollableRecyclerView.m56144i2(overScrollableRecyclerView, new C10472t(), 0.0f, 2, null);
        overScrollableRecyclerView.m9826E(new C10473u(overScrollableRecyclerView));
        overScrollableRecyclerView.m56145b2(new C10474v(overScrollableRecyclerView));
        Context context2 = overScrollableRecyclerView.getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        overScrollableRecyclerView.m9816A(new C2502h(context2, new C10475w(m129940a), new C10476x()));
        overScrollableRecyclerView.setHasFixedSize(true);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        AbstractC25622b abstractC25622b = this.f53329U;
        if (abstractC25622b != null && abstractC25622b.m132331h()) {
            return true;
        }
        onTouchEvent(motionEvent);
        if (this.f53330V != null) {
            return true;
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        C25055t1 c25055t1 = this.f53333b0;
        if (c25055t1 == null) {
            AbstractC19074t.m100223u("binding");
            c25055t1 = null;
        }
        int i15 = this.f53309A;
        View view = c25055t1.f120301B;
        AbstractC19074t.m100207e(view, "vieSimilarBackground");
        AbstractC26112n.m134383X(view, i15, 0);
        int measuredWidth = (getMeasuredWidth() - c25055t1.f120302C.getMeasuredWidth()) / 2;
        AppCompatImageView appCompatImageView = c25055t1.f120302C;
        AbstractC19074t.m100207e(appCompatImageView, "vieSimilarThumb");
        AbstractC26112n.m134383X(appCompatImageView, i15, measuredWidth);
        int i16 = this.f53313E;
        FrameLayout frameLayout = c25055t1.f120309v;
        AbstractC19074t.m100207e(frameLayout, "lytSimilarHeader");
        AbstractC26112n.m134381V(frameLayout, i16, 0);
        OverScrollableRecyclerView overScrollableRecyclerView = c25055t1.f120307t;
        AbstractC19074t.m100207e(overScrollableRecyclerView, "lstSimilarVideos");
        AbstractC26112n.m134383X(overScrollableRecyclerView, i16, 0);
        LinearLayout linearLayout = c25055t1.f120308u;
        AbstractC19074t.m100207e(linearLayout, "lytSimilarDescription");
        AbstractC26112n.m134383X(linearLayout, i16, 0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        long j11 = (i12 & 4294967295L) | (i11 << 32);
        if (this.f53341w != j11) {
            this.f53341w = j11;
            this.f53342x = 0;
            int m16361d = this.f53337s + C3226p.Companion.m16361d();
            this.f53343y = m16361d;
            this.f53344z = size2;
            this.f53310B = this.f53337s + this.f53338t;
            int i13 = this.f53339u;
            this.f53311C = m16361d + i13;
            this.f53312D = i13 + size2;
            this.f53314F = (r2 - r8) / (r2 - r9);
        }
        float f11 = this.f53315G;
        float f12 = this.f53314F;
        if (f11 <= f12) {
            int i14 = (int) ((this.f53310B * f11) + ((1.0f - f11) * this.f53312D));
            this.f53313E = i14;
            this.f53316H = 0.0f;
            this.f53309A = i14 - this.f53339u;
            this.f53317I = f11 / f12;
        } else {
            this.f53313E = (int) ((this.f53310B * f11) + ((1.0f - f11) * this.f53312D));
            float f13 = (f11 - f12) / (1.0f - f12);
            this.f53316H = f13;
            this.f53309A = (int) ((this.f53342x * f13) + ((1.0f - f13) * this.f53343y));
            this.f53317I = 1.0f;
        }
        C25055t1 c25055t1 = this.f53333b0;
        if (c25055t1 == null) {
            AbstractC19074t.m100223u("binding");
            c25055t1 = null;
        }
        c25055t1.f120301B.invalidateOutline();
        View view = c25055t1.f120301B;
        AbstractC19074t.m100207e(view, "vieSimilarBackground");
        AbstractC26112n.m134387a0(view, size, 1073741824, size2, 1073741824);
        AppCompatImageView appCompatImageView = c25055t1.f120302C;
        AbstractC19074t.m100207e(appCompatImageView, "vieSimilarThumb");
        AbstractC26112n.m134387a0(appCompatImageView, 0, 0, this.f53339u, 1073741824);
        FrameLayout frameLayout = c25055t1.f120309v;
        AbstractC19074t.m100207e(frameLayout, "lytSimilarHeader");
        AbstractC26112n.m134387a0(frameLayout, size, 1073741824, (int) (this.f53316H * (this.f53337s + this.f53338t)), 1073741824);
        c25055t1.f120307t.m9853S0();
        OverScrollableRecyclerView overScrollableRecyclerView = c25055t1.f120307t;
        AbstractC19074t.m100207e(overScrollableRecyclerView, "lstSimilarVideos");
        AbstractC26112n.m134387a0(overScrollableRecyclerView, size, 1073741824, size2 - this.f53310B, 1073741824);
        LinearLayout linearLayout = c25055t1.f120308u;
        AbstractC19074t.m100207e(linearLayout, "lytSimilarDescription");
        AbstractC26112n.m134387a0(linearLayout, size, 1073741824, 0, 0);
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f11, float f12, boolean z11) {
        AbstractC19074t.m100208f(view, "child");
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f11, float f12) {
        AbstractC19074t.m100208f(view, "child");
        if (this.f53315G < 1.0f) {
            m54927A(-f12);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i11, int i12, int[] iArr) {
        Integer num;
        AbstractC19074t.m100208f(view, "child");
        AbstractC19074t.m100208f(iArr, "consumed");
        if (i12 > 0) {
            int i13 = this.f53313E;
            int i14 = i13 - this.f53310B;
            if (i14 > i12) {
                iArr[1] = i12;
            } else {
                iArr[1] = i14;
            }
            int i15 = iArr[1];
            if (i15 > 0) {
                m54939T(i13 - i15);
                return;
            }
            return;
        }
        if ((view instanceof OverScrollableRecyclerView) && !view.canScrollVertically(-1) && ((OverScrollableRecyclerView) view).getOffsetY() >= 0.0f && (num = (Integer) this.f53328T.get(view)) != null && num.intValue() == 0) {
            m54939T(this.f53313E - i12);
            iArr[1] = i12;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i11, int i12, int i13, int i14) {
        AbstractC19074t.m100208f(view, "child");
        if (i12 != 0) {
            HashMap hashMap = this.f53328T;
            Integer num = (Integer) hashMap.get(view);
            if (num == null) {
                num = 0;
            }
            hashMap.put(view, Integer.valueOf(num.intValue() + Math.abs(i12)));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i11) {
        AbstractC19074t.m100208f(view, "child");
        AbstractC19074t.m100208f(view2, ZinstantMetaConstant.TARGET_VIEWPORT);
        this.f53328T.put(view2, 0);
        this.f53335q.m7762b(view, view2, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i11) {
        AbstractC19074t.m100208f(view, "child");
        AbstractC19074t.m100208f(view2, ZinstantMetaConstant.TARGET_VIEWPORT);
        return (i11 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        AbstractC19074t.m100208f(view, "child");
        AbstractC25622b abstractC25622b = this.f53329U;
        if (abstractC25622b == null || !abstractC25622b.m132331h()) {
            m54928B(this, 0.0f, 1, null);
        }
        this.f53335q.m7764d(view);
        this.f53328T.remove(view);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        AbstractC19074t.m100208f(motionEvent, "event");
        AbstractC25622b abstractC25622b = this.f53329U;
        if (abstractC25622b != null && abstractC25622b.m132331h()) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            float f11 = 0.0f;
            if (action != 2) {
                if (this.f53332a0 == null) {
                    MotionEvent motionEvent2 = this.f53331W;
                    if (motionEvent2 != null && motionEvent2.getY() < this.f53309A && motionEvent.getY() < this.f53309A) {
                        m54933K(this, false, 0.0f, 3, null);
                    }
                    return true;
                }
                VelocityTracker velocityTracker2 = this.f53330V;
                if (velocityTracker2 != null) {
                    AbstractC19074t.m100205c(velocityTracker2);
                    velocityTracker2.addMovement(motionEvent);
                    VelocityTracker velocityTracker3 = this.f53330V;
                    AbstractC19074t.m100205c(velocityTracker3);
                    velocityTracker3.computeCurrentVelocity(1000, this.f53327S);
                    VelocityTracker velocityTracker4 = this.f53330V;
                    AbstractC19074t.m100205c(velocityTracker4);
                    C24860q m134358c = AbstractC26108j.m134358c(velocityTracker4, this.f53326R, this.f53327S);
                    boolean booleanValue = ((Boolean) m134358c.m129213a()).booleanValue();
                    float floatValue = ((Number) m134358c.m129214b()).floatValue();
                    if (booleanValue) {
                        f11 = floatValue;
                    }
                    m54927A(f11);
                    this.f53330V = null;
                }
                this.f53332a0 = null;
            } else {
                MotionEvent motionEvent3 = this.f53332a0;
                if (motionEvent3 != null && getNestedScrollAxes() == 0 && this.f53330V == null && AbstractC26104f.m134333d(motionEvent3, motionEvent, this.f53325Q)) {
                    VelocityTracker obtain = VelocityTracker.obtain();
                    this.f53330V = obtain;
                    AbstractC19074t.m100205c(obtain);
                    obtain.addMovement(motionEvent3);
                    this.f53332a0 = AbstractC26104f.m134330a(motionEvent);
                }
                MotionEvent motionEvent4 = this.f53332a0;
                if (motionEvent4 != null && getNestedScrollAxes() == 0 && (velocityTracker = this.f53330V) != null) {
                    AbstractC19074t.m100205c(velocityTracker);
                    velocityTracker.addMovement(motionEvent);
                    float y11 = motionEvent.getY() - motionEvent4.getY();
                    if (y11 < 0.0f) {
                        if (this.f53318J) {
                            m54938S(1.0f);
                        } else {
                            m54939T(Math.max(this.f53310B, (int) (this.f53311C + y11)));
                        }
                    } else if (this.f53318J) {
                        m54939T(Math.min((int) (this.f53310B + y11), this.f53312D));
                    } else {
                        m54939T(Math.min((int) (this.f53311C + y11), this.f53312D));
                    }
                }
            }
        } else {
            if (motionEvent.getY() >= this.f53309A) {
                this.f53332a0 = AbstractC26104f.m134330a(motionEvent);
            } else {
                this.f53332a0 = null;
            }
            this.f53330V = null;
        }
        return true;
    }

    public final void setCallback(InterfaceC10446a interfaceC10446a) {
        this.f53334p = interfaceC10446a;
    }
}
