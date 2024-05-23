package com.zing.zalo.p077ui.chat.chatrow;

import ag0.AbstractC0837p0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import b40.C2526d;
import b40.C2535j;
import bi0.AbstractC2807a;
import cg.AbstractC3460h;
import ch0.AbstractC3489d;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.feed.mvp.profile.model.theme.Image;
import com.zing.zalo.gifplayer.C8917b;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.p077ui.widget.C13641h;
import com.zing.zalo.p077ui.widget.C13697o;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zvideoutil.ZVideoUtil;
import dj.C17945a0;
import dj.C17969i0;
import dj.C17990p0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import gg0.AbstractC19444a;
import gw.AbstractC19656s0;
import hf0.AbstractC20049k;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import l60.C22103b;
import ln0.AbstractC22543l;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import me0.AbstractC23214t;
import me0.AbstractC23217t2;
import me0.AbstractC23238v2;
import me0.C23212s8;
import me0.C23278z2;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import mw.AbstractC23463h;
import n60.C23594g;
import p164fn.EnumC19038l;
import p239ih.C20556f;
import p262jb.AbstractC21196a;
import p348mi.AbstractC23306f;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p461qu.AbstractC25495a;
import p559uv.C27373c;
import p698yz.AbstractC31111g;
import p698yz.C31106b;
import p698yz.EnumC31105a;
import p698yz.EnumC31107c;
import p716zh.AbstractC31990k7;
import p716zh.C31883d5;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import th.AbstractC26687h;
import ui0.C27280g;
import vg.AbstractC28236y3;
import vg.C28023b6;
import vg.C28203u6;
import vg.C28227x3;
import w50.C28769a;
import w50.C28771c;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* loaded from: classes5.dex */
public final class ChatRowFile extends ChatRowHasCaption implements C17945a0.x {
    public static final C11353a Companion = new C11353a(null);

    /* renamed from: Q7 */
    private static final int f57759Q7 = AbstractC23136l9.m118742r(0.5f);

    /* renamed from: R7 */
    private static boolean f57760R7;

    /* renamed from: S7 */
    private static TextPaint f57761S7;

    /* renamed from: T7 */
    private static TextPaint f57762T7;

    /* renamed from: U7 */
    private static TextPaint f57763U7;

    /* renamed from: V7 */
    private static TextPaint f57764V7;

    /* renamed from: W7 */
    private static TextPaint f57765W7;

    /* renamed from: X7 */
    private static TextPaint f57766X7;

    /* renamed from: Y7 */
    private static TextPaint f57767Y7;

    /* renamed from: B7 */
    private C17990p0 f57768B7;

    /* renamed from: C7 */
    private EnumC31105a f57769C7;

    /* renamed from: D7 */
    private boolean f57770D7;

    /* renamed from: E7 */
    private boolean f57771E7;

    /* renamed from: F7 */
    private C11356d f57772F7;

    /* renamed from: G7 */
    private C11357e f57773G7;

    /* renamed from: H7 */
    private boolean f57774H7;

    /* renamed from: I7 */
    private final C13697o f57775I7;

    /* renamed from: J7 */
    private final C3977j f57776J7;

    /* renamed from: K7 */
    private C13641h f57777K7;

    /* renamed from: L7 */
    private C22103b f57778L7;

    /* renamed from: M7 */
    private final Handler f57779M7;

    /* renamed from: N7 */
    private final AtomicBoolean f57780N7;

    /* renamed from: O7 */
    private boolean f57781O7;

    /* renamed from: P7 */
    private boolean f57782P7;

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowFile$a */
    /* loaded from: classes5.dex */
    public static final class C11353a {
        private C11353a() {
        }

        public /* synthetic */ C11353a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: h */
        private final void m61282h() {
            synchronized (this) {
                ChatRowFile.f57761S7 = null;
                ChatRowFile.f57762T7 = null;
                ChatRowFile.f57763U7 = null;
                ChatRowFile.f57764V7 = null;
                ChatRowFile.f57765W7 = null;
                ChatRowFile.f57766X7 = null;
                ChatRowFile.f57767Y7 = null;
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
        }

        /* renamed from: j */
        public final TextPaint m61283j(Context context) {
            synchronized (this) {
                TextPaint textPaint = ChatRowFile.f57765W7;
                if (textPaint != null) {
                    return textPaint;
                }
                C13704p1 c13704p1 = new C13704p1(1);
                c13704p1.setTypeface(Typeface.DEFAULT);
                c13704p1.setTextSize(AbstractC23136l9.m118759w1(10));
                c13704p1.setColor(-1);
                ChatRowFile.f57765W7 = c13704p1;
                return c13704p1;
            }
        }

        /* renamed from: k */
        public final TextPaint m61284k(Context context) {
            synchronized (this) {
                TextPaint textPaint = ChatRowFile.f57764V7;
                if (textPaint != null) {
                    return textPaint;
                }
                C13704p1 c13704p1 = new C13704p1(1);
                c13704p1.m76613c();
                c13704p1.setTextSize(AbstractC23136l9.m118759w1(12));
                c13704p1.setColor(-1);
                ChatRowFile.f57764V7 = c13704p1;
                return c13704p1;
            }
        }

        /* renamed from: l */
        public final TextPaint m61285l(Context context) {
            synchronized (this) {
                TextPaint textPaint = ChatRowFile.f57766X7;
                if (textPaint != null) {
                    return textPaint;
                }
                C13704p1 c13704p1 = new C13704p1(1);
                c13704p1.setTypeface(Typeface.DEFAULT);
                c13704p1.setTextSize(AbstractC23136l9.m118759w1(10));
                c13704p1.setColor(-1);
                ChatRowFile.f57766X7 = c13704p1;
                return c13704p1;
            }
        }

        /* renamed from: m */
        public final TextPaint m61286m(Context context) {
            synchronized (this) {
                TextPaint textPaint = ChatRowFile.f57767Y7;
                if (textPaint != null) {
                    return textPaint;
                }
                C13704p1 c13704p1 = new C13704p1(1);
                c13704p1.m76613c();
                c13704p1.setTextSize(context.getResources().getDimension(AbstractC16802y.label_text_size));
                c13704p1.setColor(AbstractC23136l9.m118641B(context, AbstractC16801x.label_duration_text_color));
                ChatRowFile.f57767Y7 = c13704p1;
                return c13704p1;
            }
        }

        /* renamed from: n */
        public final TextPaint m61287n(Context context) {
            synchronized (this) {
                TextPaint textPaint = ChatRowFile.f57762T7;
                if (textPaint != null) {
                    return textPaint;
                }
                C13704p1 c13704p1 = new C13704p1(1);
                c13704p1.setTypeface(Typeface.DEFAULT);
                c13704p1.setTextSize(AbstractC23136l9.m118759w1(11));
                c13704p1.setColor(C23212s8.m119607o(context, AbstractC2807a.text_02));
                ChatRowFile.f57762T7 = c13704p1;
                return c13704p1;
            }
        }

        /* renamed from: o */
        public final TextPaint m61288o(Context context) {
            synchronized (this) {
                TextPaint textPaint = ChatRowFile.f57761S7;
                if (textPaint != null) {
                    return textPaint;
                }
                C13704p1 c13704p1 = new C13704p1(1);
                c13704p1.m76613c();
                c13704p1.setTextSize(AbstractC23136l9.m118759w1(13));
                c13704p1.setColor(AbstractC11531v0.Companion.m62543V0());
                ChatRowFile.f57761S7 = c13704p1;
                return c13704p1;
            }
        }

        /* renamed from: p */
        public final TextPaint m61289p(Context context) {
            C13704p1 c13704p1 = new C13704p1(1);
            c13704p1.setTypeface(Typeface.DEFAULT);
            c13704p1.setTextSize(AbstractC23136l9.m118759w1(11));
            c13704p1.setColor(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
            return c13704p1;
        }

        /* renamed from: i */
        public final boolean m61290i() {
            return ChatRowFile.f57760R7;
        }

        /* renamed from: q */
        public final void m61291q(boolean z11) {
            ChatRowFile.f57760R7 = z11;
            m61282h();
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowFile$b */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC11354b {

        /* renamed from: a */
        private final Context f57783a;

        /* renamed from: b */
        private String f57784b;

        /* renamed from: c */
        private int f57785c;

        /* renamed from: d */
        private int f57786d;

        /* renamed from: e */
        private int f57787e;

        /* renamed from: f */
        private final Point f57788f;

        /* renamed from: g */
        private CharSequence f57789g;

        /* renamed from: h */
        private String f57790h;

        /* renamed from: i */
        private Layout f57791i;

        /* renamed from: j */
        private final Point f57792j;

        /* renamed from: k */
        private CharSequence f57793k;

        /* renamed from: l */
        private Layout f57794l;

        /* renamed from: m */
        private final Point f57795m;

        /* renamed from: n */
        private CharSequence f57796n;

        /* renamed from: o */
        private int f57797o;

        /* renamed from: p */
        private Layout f57798p;

        /* renamed from: q */
        private final Point f57799q;

        /* renamed from: r */
        private int f57800r;

        /* renamed from: s */
        private Drawable f57801s;

        /* renamed from: t */
        private int f57802t;

        /* renamed from: u */
        private int f57803u;

        /* renamed from: v */
        private final Point f57804v;

        /* renamed from: w */
        private EnumC11358f f57805w;

        /* renamed from: x */
        private final Point f57806x;

        /* renamed from: y */
        private final int f57807y;

        public AbstractC11354b(Context context) {
            AbstractC19074t.m100208f(context, "context");
            this.f57783a = context;
            this.f57784b = "";
            this.f57788f = new Point();
            this.f57789g = "";
            this.f57790h = "";
            this.f57792j = new Point();
            this.f57793k = "";
            this.f57795m = new Point();
            this.f57796n = "";
            this.f57799q = new Point();
            this.f57804v = new Point();
            this.f57805w = EnumC11358f.f57856p;
            this.f57806x = new Point();
            this.f57807y = AbstractC23136l9.m118742r(3.0f);
        }

        /* renamed from: A */
        public final int m61292A() {
            return this.f57807y;
        }

        /* renamed from: B */
        public final int m61293B() {
            return this.f57800r;
        }

        /* renamed from: C */
        public final String m61294C() {
            return this.f57784b;
        }

        /* renamed from: D */
        public final int m61295D() {
            return this.f57787e;
        }

        /* renamed from: E */
        public final int m61296E() {
            return this.f57786d;
        }

        /* renamed from: F */
        public final int m61297F() {
            return this.f57785c;
        }

        /* renamed from: G */
        public final Point m61298G() {
            return this.f57788f;
        }

        /* renamed from: H */
        public final Point m61299H() {
            return this.f57806x;
        }

        /* renamed from: I */
        public abstract EnumC11358f mo61300I();

        /* renamed from: J */
        public final void m61301J(CharSequence charSequence) {
            AbstractC19074t.m100208f(charSequence, "<set-?>");
            this.f57793k = charSequence;
        }

        /* renamed from: K */
        public final void m61302K(Layout layout) {
            this.f57794l = layout;
        }

        /* renamed from: L */
        public final void m61303L(Drawable drawable) {
            this.f57801s = drawable;
        }

        /* renamed from: M */
        public final void m61304M(int i11) {
            this.f57803u = i11;
        }

        /* renamed from: N */
        public final void m61305N(int i11) {
            this.f57802t = i11;
        }

        /* renamed from: O */
        public final void m61306O(CharSequence charSequence) {
            AbstractC19074t.m100208f(charSequence, "<set-?>");
            this.f57789g = charSequence;
        }

        /* renamed from: P */
        public final void m61307P(String str) {
            AbstractC19074t.m100208f(str, "<set-?>");
            this.f57790h = str;
        }

        /* renamed from: Q */
        public final void m61308Q(Layout layout) {
            this.f57791i = layout;
        }

        /* renamed from: R */
        public final void m61309R(EnumC11358f enumC11358f) {
            AbstractC19074t.m100208f(enumC11358f, "<set-?>");
            this.f57805w = enumC11358f;
        }

        /* renamed from: S */
        public final void m61310S(CharSequence charSequence) {
            AbstractC19074t.m100208f(charSequence, "<set-?>");
            this.f57796n = charSequence;
        }

        /* renamed from: T */
        public final void m61311T(Layout layout) {
            this.f57798p = layout;
        }

        /* renamed from: U */
        public final void m61312U(int i11) {
            this.f57797o = i11;
        }

        /* renamed from: V */
        public final void m61313V(int i11) {
            this.f57800r = i11;
        }

        /* renamed from: W */
        public final void m61314W(String str) {
            AbstractC19074t.m100208f(str, "<set-?>");
            this.f57784b = str;
        }

        /* renamed from: X */
        public final void m61315X(int i11) {
            this.f57787e = i11;
        }

        /* renamed from: Y */
        public final void m61316Y(int i11) {
            this.f57786d = i11;
        }

        /* renamed from: Z */
        public final void m61317Z(int i11) {
            this.f57785c = i11;
        }

        /* renamed from: a */
        public abstract int mo61318a();

        /* renamed from: b */
        public final Context m61319b() {
            return this.f57783a;
        }

        /* renamed from: c */
        public final CharSequence m61320c() {
            return this.f57793k;
        }

        /* renamed from: d */
        public final Layout m61321d() {
            return this.f57794l;
        }

        /* renamed from: e */
        public final Point m61322e() {
            return this.f57795m;
        }

        /* renamed from: f */
        public abstract TextPaint mo61323f();

        /* renamed from: g */
        public abstract int mo61324g();

        /* renamed from: h */
        public abstract int mo61325h();

        /* renamed from: i */
        public final Drawable m61326i() {
            return this.f57801s;
        }

        /* renamed from: j */
        public final Point m61327j() {
            return this.f57804v;
        }

        /* renamed from: k */
        public final int m61328k() {
            return this.f57803u;
        }

        /* renamed from: l */
        public abstract int mo61329l();

        /* renamed from: m */
        public final int m61330m() {
            return this.f57802t;
        }

        /* renamed from: n */
        public final CharSequence m61331n() {
            return this.f57789g;
        }

        /* renamed from: o */
        public final String m61332o() {
            return this.f57790h;
        }

        /* renamed from: p */
        public final Layout m61333p() {
            return this.f57791i;
        }

        /* renamed from: q */
        public final Point m61334q() {
            return this.f57792j;
        }

        /* renamed from: r */
        public abstract int mo61335r();

        /* renamed from: s */
        public abstract TextPaint mo61336s();

        /* renamed from: t */
        public final EnumC11358f m61337t() {
            return this.f57805w;
        }

        /* renamed from: u */
        public final CharSequence m61338u() {
            return this.f57796n;
        }

        /* renamed from: v */
        public final Layout m61339v() {
            return this.f57798p;
        }

        /* renamed from: w */
        public final Point m61340w() {
            return this.f57799q;
        }

        /* renamed from: x */
        public final int m61341x() {
            return this.f57797o;
        }

        /* renamed from: y */
        public abstract TextPaint mo61342y();

        /* renamed from: z */
        public final boolean m61343z() {
            if (this.f57784b.length() > 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowFile$c */
    /* loaded from: classes5.dex */
    public static final class EnumC11355c extends Enum {

        /* renamed from: p */
        public static final EnumC11355c f57808p = new EnumC11355c("DOWNLOAD", 0);

        /* renamed from: q */
        public static final EnumC11355c f57809q = new EnumC11355c("UPLOADING_DOWNLOADING", 1);

        /* renamed from: r */
        public static final EnumC11355c f57810r = new EnumC11355c("EXTENSION_ICON", 2);

        /* renamed from: s */
        public static final EnumC11355c f57811s = new EnumC11355c("ROLLED", 3);

        /* renamed from: t */
        private static final /* synthetic */ EnumC11355c[] f57812t;

        /* renamed from: u */
        private static final /* synthetic */ InterfaceC30165a f57813u;

        static {
            EnumC11355c[] m61344b = m61344b();
            f57812t = m61344b;
            f57813u = AbstractC30166b.m148796a(m61344b);
        }

        private EnumC11355c(String str, int i11) {
            super(str, i11);
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC11355c[] m61344b() {
            return new EnumC11355c[]{f57808p, f57809q, f57810r, f57811s};
        }

        public static EnumC11355c valueOf(String str) {
            return (EnumC11355c) Enum.valueOf(EnumC11355c.class, str);
        }

        public static EnumC11355c[] values() {
            return (EnumC11355c[]) f57812t.clone();
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowFile$d */
    /* loaded from: classes5.dex */
    public static final class C11356d extends AbstractC11354b {

        /* renamed from: A */
        private boolean f57814A;

        /* renamed from: B */
        private boolean f57815B;

        /* renamed from: C */
        private final int f57816C;

        /* renamed from: D */
        private String f57817D;

        /* renamed from: E */
        private int f57818E;

        /* renamed from: F */
        private Layout f57819F;

        /* renamed from: G */
        private final Point f57820G;

        /* renamed from: H */
        private boolean f57821H;

        /* renamed from: I */
        private final Point f57822I;

        /* renamed from: J */
        private boolean f57823J;

        /* renamed from: K */
        private final Point f57824K;

        /* renamed from: L */
        private final int f57825L;

        /* renamed from: M */
        private final float f57826M;

        /* renamed from: N */
        private final float f57827N;

        /* renamed from: O */
        private final Paint f57828O;

        /* renamed from: P */
        private final RectF f57829P;

        /* renamed from: Q */
        private final int f57830Q;

        /* renamed from: R */
        private int f57831R;

        /* renamed from: S */
        private final Rect f57832S;

        /* renamed from: T */
        private final int f57833T;

        /* renamed from: U */
        private final int f57834U;

        /* renamed from: V */
        private final int f57835V;

        /* renamed from: W */
        private final int f57836W;

        /* renamed from: X */
        private final int f57837X;

        /* renamed from: z */
        private boolean f57838z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11356d(Context context) {
            super(context);
            AbstractC19074t.m100208f(context, "context");
            this.f57816C = AbstractC23136l9.m118742r(32.0f);
            this.f57817D = "";
            this.f57820G = new Point();
            this.f57822I = new Point();
            this.f57824K = new Point();
            this.f57825L = AbstractC23136l9.m118742r(6.0f);
            this.f57826M = context.getResources().getDimension(AbstractC16802y.label_padding);
            this.f57827N = context.getResources().getDimension(AbstractC16802y.label_radius);
            Paint paint = new Paint(1);
            paint.setColor(AbstractC23136l9.m118641B(context, AbstractC16801x.label_duration_background_color));
            this.f57828O = paint;
            this.f57829P = new RectF();
            this.f57830Q = AbstractC23136l9.m118742r(8.0f);
            this.f57832S = new Rect();
            this.f57833T = AbstractC23136l9.m118742r(2.0f);
            this.f57834U = AbstractC23136l9.m118742r(12.0f);
            this.f57837X = 1;
        }

        /* renamed from: A0 */
        public final void m61345A0(boolean z11) {
            this.f57821H = z11;
        }

        /* renamed from: B0 */
        public final void m61346B0(boolean z11) {
            this.f57823J = z11;
        }

        /* renamed from: C0 */
        public final void m61347C0(String str) {
            AbstractC19074t.m100208f(str, "<set-?>");
            this.f57817D = str;
        }

        /* renamed from: D0 */
        public final void m61348D0(Layout layout) {
            this.f57819F = layout;
        }

        /* renamed from: E0 */
        public final void m61349E0(int i11) {
            this.f57818E = i11;
        }

        /* renamed from: F0 */
        public final void m61350F0(boolean z11) {
            this.f57814A = z11;
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowFile.AbstractC11354b
        /* renamed from: I */
        public EnumC11358f mo61300I() {
            if (!this.f57838z && !this.f57815B) {
                return EnumC11358f.f57857q;
            }
            return EnumC11358f.f57858r;
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowFile.AbstractC11354b
        /* renamed from: a */
        public int mo61318a() {
            int m118742r;
            Drawable m62521O = AbstractC11531v0.Companion.m62521O();
            if (m62521O != null) {
                m118742r = m62521O.getIntrinsicWidth();
            } else {
                m118742r = AbstractC23136l9.m118742r(48.0f);
            }
            return m118742r / 2;
        }

        /* renamed from: a0 */
        public int m61351a0() {
            return this.f57836W;
        }

        /* renamed from: b0 */
        public int m61352b0() {
            return this.f57835V;
        }

        /* renamed from: c0 */
        public final int m61353c0() {
            return this.f57831R;
        }

        /* renamed from: d0 */
        public final Rect m61354d0() {
            return this.f57832S;
        }

        /* renamed from: e0 */
        public final int m61355e0() {
            return this.f57830Q;
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowFile.AbstractC11354b
        /* renamed from: f */
        public TextPaint mo61323f() {
            return ChatRowFile.Companion.m61283j(m61319b());
        }

        /* renamed from: f0 */
        public final int m61356f0() {
            return this.f57833T;
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowFile.AbstractC11354b
        /* renamed from: g */
        public int mo61324g() {
            return this.f57834U;
        }

        /* renamed from: g0 */
        public final boolean m61357g0() {
            return this.f57821H;
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowFile.AbstractC11354b
        /* renamed from: h */
        public int mo61325h() {
            return m61330m();
        }

        /* renamed from: h0 */
        public final boolean m61358h0() {
            return this.f57823J;
        }

        /* renamed from: i0 */
        public final Point m61359i0() {
            return this.f57822I;
        }

        /* renamed from: j0 */
        public final String m61360j0() {
            return this.f57817D;
        }

        /* renamed from: k0 */
        public final float m61361k0() {
            return this.f57826M;
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowFile.AbstractC11354b
        /* renamed from: l */
        public int mo61329l() {
            return this.f57816C;
        }

        /* renamed from: l0 */
        public final Paint m61362l0() {
            return this.f57828O;
        }

        /* renamed from: m0 */
        public final float m61363m0() {
            return this.f57827N;
        }

        /* renamed from: n0 */
        public final RectF m61364n0() {
            return this.f57829P;
        }

        /* renamed from: o0 */
        public final Layout m61365o0() {
            return this.f57819F;
        }

        /* renamed from: p0 */
        public final Point m61366p0() {
            return this.f57820G;
        }

        /* renamed from: q0 */
        public final int m61367q0() {
            return this.f57825L;
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowFile.AbstractC11354b
        /* renamed from: r */
        public int mo61335r() {
            return this.f57837X;
        }

        /* renamed from: r0 */
        public final TextPaint m61368r0() {
            return ChatRowFile.Companion.m61286m(m61319b());
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowFile.AbstractC11354b
        /* renamed from: s */
        public TextPaint mo61336s() {
            return ChatRowFile.Companion.m61284k(m61319b());
        }

        /* renamed from: s0 */
        public final int m61369s0() {
            return this.f57818E;
        }

        /* renamed from: t0 */
        public final Point m61370t0() {
            return this.f57824K;
        }

        /* renamed from: u0 */
        public final boolean m61371u0() {
            return this.f57815B;
        }

        /* renamed from: v0 */
        public final boolean m61372v0() {
            return this.f57838z;
        }

        /* renamed from: w0 */
        public final boolean m61373w0() {
            return this.f57814A;
        }

        /* renamed from: x0 */
        public final void m61374x0(int i11) {
            this.f57831R = i11;
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowFile.AbstractC11354b
        /* renamed from: y */
        public TextPaint mo61342y() {
            return ChatRowFile.Companion.m61285l(m61319b());
        }

        /* renamed from: y0 */
        public final void m61375y0(boolean z11) {
            this.f57815B = z11;
        }

        /* renamed from: z0 */
        public final void m61376z0(boolean z11) {
            this.f57838z = z11;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowFile$e */
    /* loaded from: classes5.dex */
    public static final class C11357e extends AbstractC11354b {

        /* renamed from: A */
        private final int f57839A;

        /* renamed from: B */
        private final int f57840B;

        /* renamed from: C */
        private final InterfaceC24854k f57841C;

        /* renamed from: D */
        private final InterfaceC24854k f57842D;

        /* renamed from: E */
        private Drawable f57843E;

        /* renamed from: F */
        private final Point f57844F;

        /* renamed from: G */
        private boolean f57845G;

        /* renamed from: H */
        private final EnumC11358f f57846H;

        /* renamed from: I */
        private final int f57847I;

        /* renamed from: J */
        private final int f57848J;

        /* renamed from: K */
        private final int f57849K;

        /* renamed from: L */
        private final int f57850L;

        /* renamed from: M */
        private final InterfaceC24854k f57851M;

        /* renamed from: z */
        private EnumC11355c f57852z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowFile$e$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Context f57853q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context) {
                super(0);
                this.f57853q = context;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final TextPaint mo12V4() {
                return ChatRowFile.Companion.m61289p(this.f57853q);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowFile$e$b */
        /* loaded from: classes5.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Context f57854q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context) {
                super(0);
                this.f57854q = context;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final Drawable mo12V4() {
                return AbstractC23136l9.m118665N(this.f57854q, AbstractC16803z.chat_received_file_icon_round_background);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowFile$e$c */
        /* loaded from: classes5.dex */
        public static final class c extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Context f57855q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Context context) {
                super(0);
                this.f57855q = context;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final Drawable mo12V4() {
                return AbstractC23136l9.m118665N(this.f57855q, AbstractC16803z.chat_sent_file_icon_round_background);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11357e(Context context) {
            super(context);
            InterfaceC24854k m129210a;
            InterfaceC24854k m129210a2;
            InterfaceC24854k m129210a3;
            AbstractC19074t.m100208f(context, "context");
            this.f57852z = EnumC11355c.f57808p;
            this.f57839A = AbstractC23136l9.m118742r(48.0f);
            this.f57840B = AbstractC23136l9.m118742r(40.0f);
            m129210a = AbstractC24856m.m129210a(new c(context));
            this.f57841C = m129210a;
            m129210a2 = AbstractC24856m.m129210a(new b(context));
            this.f57842D = m129210a2;
            this.f57844F = new Point();
            this.f57846H = EnumC11358f.f57857q;
            this.f57847I = AbstractC23136l9.m118742r(12.0f);
            this.f57848J = AbstractC23136l9.m118742r(4.0f);
            this.f57849K = AbstractC23136l9.m118742r(2.0f);
            this.f57850L = 1;
            m129210a3 = AbstractC24856m.m129210a(new a(context));
            this.f57851M = m129210a3;
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowFile.AbstractC11354b
        /* renamed from: I */
        public EnumC11358f mo61300I() {
            return this.f57846H;
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowFile.AbstractC11354b
        /* renamed from: a */
        public int mo61318a() {
            return AbstractC23136l9.m118742r(12.0f);
        }

        /* renamed from: a0 */
        public final boolean m61377a0() {
            return this.f57845G;
        }

        /* renamed from: b0 */
        public int m61378b0() {
            return this.f57849K;
        }

        /* renamed from: c0 */
        public final Drawable m61379c0() {
            return this.f57843E;
        }

        /* renamed from: d0 */
        public final Point m61380d0() {
            return this.f57844F;
        }

        /* renamed from: e0 */
        public final int m61381e0() {
            return this.f57840B;
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowFile.AbstractC11354b
        /* renamed from: f */
        public TextPaint mo61323f() {
            return ChatRowFile.Companion.m61287n(m61319b());
        }

        /* renamed from: f0 */
        public final EnumC11355c m61382f0() {
            return this.f57852z;
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowFile.AbstractC11354b
        /* renamed from: g */
        public int mo61324g() {
            return this.f57847I;
        }

        /* renamed from: g0 */
        public int m61383g0() {
            return this.f57848J;
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowFile.AbstractC11354b
        /* renamed from: h */
        public int mo61325h() {
            return this.f57840B;
        }

        /* renamed from: h0 */
        public final TextPaint m61384h0() {
            return (TextPaint) this.f57851M.getValue();
        }

        /* renamed from: i0 */
        public final Drawable m61385i0() {
            return (Drawable) this.f57842D.getValue();
        }

        /* renamed from: j0 */
        public final Drawable m61386j0() {
            return (Drawable) this.f57841C.getValue();
        }

        /* renamed from: k0 */
        public final void m61387k0(boolean z11) {
            this.f57845G = z11;
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowFile.AbstractC11354b
        /* renamed from: l */
        public int mo61329l() {
            return this.f57839A;
        }

        /* renamed from: l0 */
        public final void m61388l0(Drawable drawable) {
            this.f57843E = drawable;
        }

        /* renamed from: m0 */
        public final void m61389m0(EnumC11355c enumC11355c) {
            AbstractC19074t.m100208f(enumC11355c, "<set-?>");
            this.f57852z = enumC11355c;
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowFile.AbstractC11354b
        /* renamed from: r */
        public int mo61335r() {
            return this.f57850L;
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowFile.AbstractC11354b
        /* renamed from: s */
        public TextPaint mo61336s() {
            return ChatRowFile.Companion.m61288o(m61319b());
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowFile.AbstractC11354b
        /* renamed from: y */
        public TextPaint mo61342y() {
            return m61384h0();
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowFile$f */
    /* loaded from: classes5.dex */
    public static final class EnumC11358f extends Enum {

        /* renamed from: p */
        public static final EnumC11358f f57856p = new EnumC11358f(Image.SCALE_TYPE_NONE, 0);

        /* renamed from: q */
        public static final EnumC11358f f57857q = new EnumC11358f("CIRCLE", 1);

        /* renamed from: r */
        public static final EnumC11358f f57858r = new EnumC11358f("LINE", 2);

        /* renamed from: s */
        private static final /* synthetic */ EnumC11358f[] f57859s;

        /* renamed from: t */
        private static final /* synthetic */ InterfaceC30165a f57860t;

        static {
            EnumC11358f[] m61393b = m61393b();
            f57859s = m61393b;
            f57860t = AbstractC30166b.m148796a(m61393b);
        }

        private EnumC11358f(String str, int i11) {
            super(str, i11);
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC11358f[] m61393b() {
            return new EnumC11358f[]{f57856p, f57857q, f57858r};
        }

        public static EnumC11358f valueOf(String str) {
            return (EnumC11358f) Enum.valueOf(EnumC11358f.class, str);
        }

        public static EnumC11358f[] values() {
            return (EnumC11358f[]) f57859s.clone();
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowFile$g */
    /* loaded from: classes5.dex */
    public /* synthetic */ class C11359g {

        /* renamed from: a */
        public static final /* synthetic */ int[] f57861a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f57862b;

        static {
            int[] iArr = new int[EnumC31105a.values().length];
            try {
                iArr[EnumC31105a.f143335v.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC31105a.f143336w.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC31105a.f143337x.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC31105a.f143330q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC31105a.f143334u.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC31105a.f143332s.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC31105a.f143329p.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC31105a.f143331r.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC31105a.f143333t.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f57861a = iArr;
            int[] iArr2 = new int[EnumC11355c.values().length];
            try {
                iArr2[EnumC11355c.f57808p.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[EnumC11355c.f57809q.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[EnumC11355c.f57810r.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[EnumC11355c.f57811s.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            f57862b = iArr2;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowFile$h */
    /* loaded from: classes5.dex */
    public static final class C11360h extends C23999j {
        C11360h() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC3968a, "imageview");
            AbstractC19074t.m100208f(c23995f, "status");
            try {
                ChatRowFile chatRowFile = ChatRowFile.this;
                if (chatRowFile.f57263B != null && TextUtils.equals(str, chatRowFile.getCurrentUiSpec().m61294C())) {
                    boolean z11 = true;
                    if (c3979l != null && c3979l.m18839c() != null) {
                        ChatRowFile.this.f57774H7 = true;
                        ChatRowFile.this.f57776J7.setImageInfo(c3979l, false);
                        C13697o c13697o = ChatRowFile.this.f57775I7;
                        Bitmap m18839c = c3979l.m18839c();
                        if (c23995f.m125666q() == 4) {
                            z11 = false;
                        }
                        c13697o.m76480u(m18839c, z11);
                        if (c23995f.m125666q() != 4) {
                            ChatRowFile.this.invalidate();
                        }
                    } else if (!ChatRowFile.this.f57263B.m94913I3()) {
                        ChatRowFile.this.f57263B.m94909Ha(true);
                        String m95266u2 = ChatRowFile.this.f57263B.m95266u2();
                        AbstractC19074t.m100207e(m95266u2, "extractThumbUrl(...)");
                        if (!TextUtils.equals(m95266u2, ChatRowFile.this.getCurrentUiSpec().m61294C())) {
                            ChatRowFile.this.getCurrentUiSpec().m61314W(m95266u2);
                            ChatRowFile.this.m61213G5();
                        }
                    } else if (ChatRowFile.this.f57771E7 && ChatRowFile.this.f57772F7.m61372v0() && !TextUtils.isEmpty(ChatRowFile.this.f57263B.m94983Q3())) {
                        AbstractC11354b currentUiSpec = ChatRowFile.this.getCurrentUiSpec();
                        String m94983Q3 = ChatRowFile.this.f57263B.m94983Q3();
                        AbstractC19074t.m100207e(m94983Q3, "getLocalpath(...)");
                        currentUiSpec.m61314W(m94983Q3);
                        ChatRowFile.this.m61213G5();
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowFile$i */
    /* loaded from: classes5.dex */
    public static final class HandlerC11361i extends Handler {
        HandlerC11361i(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i11;
            C22103b c22103b;
            int m116580c;
            C13641h c13641h;
            int m116580c2;
            int i12;
            C22103b c22103b2;
            int m116580c3;
            C13641h c13641h2;
            int m116580c4;
            AbstractC19074t.m100208f(message, "msg");
            try {
                super.handleMessage(message);
                int i13 = message.what;
                if (i13 != 1000) {
                    if (i13 == 10002) {
                        C17945a0 c17945a0 = ChatRowFile.this.f57263B;
                        if (c17945a0 != null) {
                            i12 = c17945a0.m94982Q2();
                        } else {
                            i12 = 0;
                        }
                        if (ChatRowFile.this.getCurrentUiSpec().m61337t() == EnumC11358f.f57857q && ChatRowFile.this.f57777K7 != null && (c13641h2 = ChatRowFile.this.f57777K7) != null) {
                            m116580c4 = AbstractC22543l.m116580c(i12, 10);
                            c13641h2.m76416k(m116580c4);
                        }
                        if (ChatRowFile.this.getCurrentUiSpec().m61337t() == EnumC11358f.f57858r && ChatRowFile.this.f57778L7 != null && (c22103b2 = ChatRowFile.this.f57778L7) != null) {
                            m116580c3 = AbstractC22543l.m116580c(i12, 10);
                            c22103b2.m115321d(m116580c3, false);
                        }
                        ChatRowFile.this.m61119v3(false);
                        return;
                    }
                    return;
                }
                C17945a0 c17945a02 = ChatRowFile.this.f57263B;
                if (c17945a02 != null) {
                    i11 = c17945a02.m95001S2();
                } else {
                    i11 = 0;
                }
                if (ChatRowFile.this.getCurrentUiSpec().m61337t() == EnumC11358f.f57857q && ChatRowFile.this.f57777K7 != null && (c13641h = ChatRowFile.this.f57777K7) != null) {
                    m116580c2 = AbstractC22543l.m116580c(i11, 10);
                    c13641h.m76416k(m116580c2);
                }
                if (ChatRowFile.this.getCurrentUiSpec().m61337t() == EnumC11358f.f57858r && ChatRowFile.this.f57778L7 != null && (c22103b = ChatRowFile.this.f57778L7) != null) {
                    m116580c = AbstractC22543l.m116580c(i11, 10);
                    c22103b.m115321d(m116580c, false);
                }
                ChatRowFile.this.m61119v3(false);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRowFile(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f57769C7 = EnumC31105a.f143330q;
        this.f57772F7 = new C11356d(context);
        this.f57773G7 = new C11357e(context);
        this.f57775I7 = new C13697o(this);
        this.f57776J7 = new C3977j(context);
        this.f57779M7 = new HandlerC11361i(Looper.getMainLooper());
        this.f57780N7 = new AtomicBoolean(false);
    }

    /* renamed from: A5 */
    public static final void m61203A5(ChatRowFile chatRowFile) {
        AbstractC19074t.m100208f(chatRowFile, "this$0");
        if (AbstractC19444a.m101693a()) {
            chatRowFile.invalidate();
        } else {
            chatRowFile.postInvalidate();
        }
    }

    /* renamed from: D5 */
    private final boolean m61207D5(EnumC31105a enumC31105a) {
        if (enumC31105a != EnumC31105a.f143335v && enumC31105a != EnumC31105a.f143337x) {
            return false;
        }
        return true;
    }

    /* renamed from: E5 */
    private final void m61209E5(int i11, int i12, int i13, int i14, boolean z11) {
        int i15 = f57759Q7;
        int i16 = i11 + i15;
        int i17 = i12 + i15;
        this.f57772F7.m61298G().x = i16;
        this.f57772F7.m61298G().y = i17;
        this.f57775I7.m76460H(i16, i17);
        AbstractC11531v0.x3 x3Var = AbstractC11531v0.Companion;
        Drawable m62521O = x3Var.m62521O();
        if (this.f57772F7.m61357g0() && m62521O != null) {
            this.f57772F7.m61359i0().x = ((this.f57775I7.m76473l() - m62521O.getIntrinsicWidth()) / 2) + i16;
            this.f57772F7.m61359i0().y = ((this.f57775I7.m76472k() - m62521O.getIntrinsicHeight()) / 2) + i17;
        }
        Drawable m62524P = x3Var.m62524P();
        if (this.f57772F7.m61358h0() && m62524P != null) {
            this.f57772F7.m61370t0().x = ((this.f57775I7.m76473l() - m62524P.getIntrinsicWidth()) / 2) + i16;
            this.f57772F7.m61370t0().y = ((this.f57775I7.m76472k() - m62524P.getIntrinsicHeight()) / 2) + i17;
        }
        if (this.f57772F7.m61365o0() != null) {
            this.f57772F7.m61366p0().x = this.f57772F7.m61367q0() + i16;
            this.f57772F7.m61366p0().y = this.f57772F7.m61367q0() + i17;
        }
        if (this.f57772F7.m61337t() == EnumC11358f.f57857q && m62521O != null) {
            this.f57772F7.m61299H().x = i16 + ((this.f57775I7.m76473l() - m62521O.getIntrinsicWidth()) / 2);
            this.f57772F7.m61299H().y = i17 + ((this.f57775I7.m76472k() - m62521O.getIntrinsicHeight()) / 2);
        }
        if (this.f57772F7.m61337t() == EnumC11358f.f57858r) {
            this.f57772F7.m61299H().x = getBubblePaddingLeft() + i11;
            this.f57772F7.m61299H().y = (i14 - this.f57772F7.m61355e0()) + this.f57772F7.m61356f0();
        }
        int m61353c0 = i14 - this.f57772F7.m61353c0();
        this.f57772F7.m61354d0().set(i11, m61353c0, this.f57775I7.m76473l() + i11, i14);
        this.f57772F7.m61327j().x = getBubblePaddingLeft() + i11;
        this.f57772F7.m61327j().y = m61353c0 + this.f57772F7.m61355e0();
        int mo61325h = i11 + this.f57772F7.mo61325h() + this.f57772F7.mo61324g();
        int i18 = this.f57772F7.m61327j().y;
        Layout m61333p = this.f57772F7.m61333p();
        if (m61333p != null) {
            this.f57772F7.m61334q().x = mo61325h;
            this.f57772F7.m61334q().y = i18;
            i18 += m61333p.getHeight() + this.f57772F7.m61352b0();
        }
        Layout m61321d = this.f57772F7.m61321d();
        if (m61321d != null) {
            this.f57772F7.m61322e().x = mo61325h;
            this.f57772F7.m61322e().y = i18;
            i18 += m61321d.getHeight() + this.f57772F7.m61351a0();
        }
        if (this.f57772F7.m61339v() != null) {
            this.f57772F7.m61340w().x = mo61325h;
            this.f57772F7.m61340w().y = i18;
        }
    }

    /* renamed from: F5 */
    private final void m61211F5(int i11, int i12, int i13, int i14, boolean z11) {
        int i15;
        int i16;
        int m61381e0;
        if (this.f57773G7.m61343z()) {
            Point m61298G = this.f57773G7.m61298G();
            int i17 = f57759Q7;
            m61298G.x = i11 + i17;
            this.f57773G7.m61298G().y = i17 + i12;
            this.f57775I7.m76460H(this.f57773G7.m61298G().x, this.f57773G7.m61298G().y);
            i12 += this.f57773G7.m61295D();
        }
        int i18 = i12 + ChatRow.f57201L5;
        int bubblePaddingLeft = i11 + getBubblePaddingLeft();
        int mo61325h = this.f57773G7.mo61325h() + bubblePaddingLeft + this.f57773G7.mo61324g();
        Layout m61333p = this.f57773G7.m61333p();
        if (m61333p != null) {
            this.f57773G7.m61334q().x = mo61325h;
            this.f57773G7.m61334q().y = i18;
            i15 = m61333p.getHeight() + i18;
        } else {
            i15 = i18;
        }
        Layout m61321d = this.f57773G7.m61321d();
        if (m61321d != null) {
            if (m61333p != null) {
                i15 += this.f57773G7.m61383g0();
            }
            this.f57773G7.m61322e().x = mo61325h;
            this.f57773G7.m61322e().y = i15;
            i15 += m61321d.getHeight();
        }
        Layout m61339v = this.f57773G7.m61339v();
        if (m61339v != null) {
            if (m61321d != null || m61333p != null) {
                i15 += this.f57773G7.m61378b0();
            }
            this.f57773G7.m61340w().x = mo61325h;
            this.f57773G7.m61340w().y = i15;
            i15 += m61339v.getHeight();
        }
        int i19 = i15 - i18;
        if (this.f57773G7.m61382f0() == EnumC11355c.f57810r) {
            this.f57773G7.m61327j().x = bubblePaddingLeft;
            Point m61327j = this.f57773G7.m61327j();
            if (i19 >= this.f57773G7.m61328k()) {
                i18 += (i19 - this.f57773G7.m61328k()) / 2;
            }
            m61327j.y = i18;
            m61381e0 = this.f57773G7.m61328k();
        } else {
            int m61381e02 = bubblePaddingLeft + (this.f57773G7.m61381e0() / 2);
            if (i19 < this.f57773G7.m61381e0()) {
                i16 = this.f57773G7.m61381e0() / 2;
            } else {
                i16 = i19 / 2;
            }
            int i21 = i18 + i16;
            this.f57773G7.m61380d0().x = m61381e02 - (this.f57773G7.m61381e0() / 2);
            this.f57773G7.m61380d0().y = i21 - (this.f57773G7.m61381e0() / 2);
            this.f57773G7.m61327j().x = m61381e02 - (this.f57773G7.m61330m() / 2);
            this.f57773G7.m61327j().y = i21 - (this.f57773G7.m61328k() / 2);
            C13641h c13641h = this.f57777K7;
            if (this.f57773G7.m61382f0() == EnumC11355c.f57809q && c13641h != null) {
                this.f57773G7.m61299H().x = m61381e02 - c13641h.m76413g();
                this.f57773G7.m61299H().y = i21 - c13641h.m76413g();
            }
            m61381e0 = this.f57773G7.m61381e0();
        }
        if (i19 < m61381e0) {
            int i22 = (m61381e0 - i19) / 2;
            this.f57773G7.m61334q().y += i22;
            this.f57773G7.m61322e().y += i22;
            this.f57773G7.m61340w().y += i22;
        }
    }

    /* renamed from: G5 */
    public final void m61213G5() {
        this.f57775I7.m76477r();
        C24003n m120068F = C23278z2.m120068F();
        if (m60988L3() || C23999j.m125696L2(getCurrentUiSpec().m61294C(), m120068F)) {
            ((C23528a) this.f57275D.m123612r(this.f57776J7)).m123579C(getCurrentUiSpec().m61294C(), m120068F, new C11360h());
        }
    }

    /* renamed from: H5 */
    private final C28227x3 m61215H5(int i11, int i12, C28227x3 c28227x3) {
        int i13;
        int m116580c;
        int i14;
        Layout m61333p;
        int i15 = 0;
        if (this.f57772F7.m61333p() != null && (m61333p = this.f57772F7.m61333p()) != null) {
            i13 = m61333p.getHeight();
        } else {
            i13 = 0;
        }
        if (this.f57772F7.m61321d() != null) {
            Layout m61321d = this.f57772F7.m61321d();
            if (m61321d != null) {
                i14 = m61321d.getHeight();
            } else {
                i14 = 0;
            }
            i13 += i14 + this.f57772F7.m61352b0();
        }
        if (this.f57772F7.m61339v() != null) {
            Layout m61339v = this.f57772F7.m61339v();
            if (m61339v != null) {
                i15 = m61339v.getHeight();
            }
            i13 += i15 + this.f57772F7.m61351a0();
        }
        C11356d c11356d = this.f57772F7;
        m116580c = AbstractC22543l.m116580c(c11356d.m61328k(), i13);
        c11356d.m61374x0(m116580c + (this.f57772F7.m61355e0() * 2));
        int m76473l = this.f57775I7.m76473l();
        int i16 = f57759Q7;
        c28227x3.f131648a = m76473l + (i16 * 2);
        c28227x3.f131649b = this.f57775I7.m76472k() + (i16 * 2);
        return c28227x3;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    /* renamed from: I5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final C28227x3 m61217I5(int i11, int i12, C28227x3 c28227x3) {
        int i13;
        int i14;
        int m116580c;
        int bubblePaddingRight;
        int m116580c2;
        int i15;
        int m116580c3;
        int i16;
        int i17;
        int i18 = 0;
        if (this.f57773G7.m61333p() != null) {
            Layout m61333p = this.f57773G7.m61333p();
            if (m61333p != null) {
                i13 = m61333p.getWidth();
            } else {
                i13 = 0;
            }
            Layout m61333p2 = this.f57773G7.m61333p();
            if (m61333p2 != null) {
                i14 = m61333p2.getHeight();
                if (this.f57773G7.m61321d() != null) {
                    Layout m61321d = this.f57773G7.m61321d();
                    if (m61321d != null) {
                        i16 = m61321d.getWidth();
                    } else {
                        i16 = 0;
                    }
                    Layout m61321d2 = this.f57773G7.m61321d();
                    if (m61321d2 != null) {
                        i17 = m61321d2.getHeight();
                    } else {
                        i17 = 0;
                    }
                    i13 = AbstractC22543l.m116580c(i13, i16);
                    i14 += this.f57773G7.m61383g0() + i17;
                }
                if (this.f57773G7.m61339v() != null) {
                    int m61293B = this.f57773G7.m61293B();
                    Layout m61339v = this.f57773G7.m61339v();
                    if (m61339v != null) {
                        i15 = m61339v.getWidth();
                    } else {
                        i15 = 0;
                    }
                    m116580c3 = AbstractC22543l.m116580c(m61293B, i15);
                    Layout m61339v2 = this.f57773G7.m61339v();
                    if (m61339v2 != null) {
                        i18 = m61339v2.getHeight();
                    }
                    i13 = AbstractC22543l.m116580c(i13, m116580c3);
                    i14 += this.f57773G7.m61378b0() + i18;
                }
                m116580c = AbstractC22543l.m116580c(this.f57773G7.m61328k(), i14);
                if (!this.f57773G7.m61343z()) {
                    bubblePaddingRight = this.f57775I7.m76473l() + (f57759Q7 * 2);
                } else {
                    bubblePaddingRight = getBubblePaddingRight() + getBubblePaddingLeft() + this.f57773G7.m61381e0() + this.f57773G7.mo61324g() + i13;
                }
                int i19 = ChatRow.f57201L5;
                m116580c2 = AbstractC22543l.m116580c(m116580c, this.f57773G7.m61381e0());
                int i21 = i19 + m116580c2;
                if (this.f57773G7.m61343z()) {
                    i21 += this.f57775I7.m76472k() + (f57759Q7 * 2);
                }
                c28227x3.f131648a = bubblePaddingRight;
                c28227x3.f131649b = i21;
                return c28227x3;
            }
        } else {
            i13 = 0;
        }
        i14 = 0;
        if (this.f57773G7.m61321d() != null) {
        }
        if (this.f57773G7.m61339v() != null) {
        }
        m116580c = AbstractC22543l.m116580c(this.f57773G7.m61328k(), i14);
        if (!this.f57773G7.m61343z()) {
        }
        int i192 = ChatRow.f57201L5;
        m116580c2 = AbstractC22543l.m116580c(m116580c, this.f57773G7.m61381e0());
        int i212 = i192 + m116580c2;
        if (this.f57773G7.m61343z()) {
        }
        c28227x3.f131648a = bubblePaddingRight;
        c28227x3.f131649b = i212;
        return c28227x3;
    }

    /* renamed from: J5 */
    private final void m61219J5() {
        try {
            ContactProfile m141800i = C28203u6.m141800i(C28203u6.f131407a, this.f57263B.m94862C4(), false, 2, null);
            if (m141800i == null) {
                m141800i = new ContactProfile(this.f57263B.m94862C4());
                m141800i.f42437s = this.f57263B.m94854B4();
            }
            String m40383Q = m141800i.m40383Q(true, false);
            getDelegate().mo62059P3(this, new C31883d5(this.f57263B.m95090b5(), this.f57263B.m94983Q3(), getCurrentUiSpec().m61294C(), getCurrentUiSpec().m61297F(), getCurrentUiSpec().m61296E()), m40383Q);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: K5 */
    private final EnumC31105a m61221K5(C17945a0 c17945a0) {
        Exception e11;
        EnumC31105a enumC31105a;
        EnumC31105a enumC31105a2 = EnumC31105a.f143330q;
        try {
            enumC31105a = m61223L5(c17945a0);
        } catch (Exception e12) {
            e11 = e12;
            enumC31105a = enumC31105a2;
        }
        try {
        } catch (Exception e13) {
            e11 = e13;
            AbstractC23350e.m122778h(e11);
            return enumC31105a;
        }
        if (enumC31105a != EnumC31105a.f143333t) {
            if (enumC31105a == EnumC31105a.f143334u) {
            }
            return enumC31105a;
        }
        if (!this.f57268B4.m143918k()) {
            return enumC31105a2;
        }
        return enumC31105a;
    }

    /* renamed from: L5 */
    private final EnumC31105a m61223L5(C17945a0 c17945a0) {
        return AbstractC31111g.m151139t(c17945a0);
    }

    /* renamed from: M5 */
    private final void m61225M5() {
        EnumC11355c m61382f0;
        int m61328k;
        EnumC11355c enumC11355c;
        String str;
        String str2;
        String str3;
        long j11;
        boolean z11;
        Drawable m61385i0;
        Drawable drawable = null;
        String str4 = null;
        String str5 = "";
        if (!this.f57771E7) {
            C11357e c11357e = this.f57773G7;
            switch (C11359g.f57861a[this.f57769C7.ordinal()]) {
                case 1:
                case 3:
                    enumC11355c = EnumC11355c.f57811s;
                    break;
                case 2:
                case 4:
                case 5:
                case 6:
                    C17945a0 c17945a0 = this.f57263B;
                    if (c17945a0 == null || (str = c17945a0.mo95039W2()) == null) {
                        str = "";
                    }
                    if (AbstractC25495a.m132078c(str)) {
                        C17945a0 c17945a02 = this.f57263B;
                        if (c17945a02 != null) {
                            str3 = c17945a02.mo95039W2();
                        } else {
                            str3 = null;
                        }
                        C17945a0 c17945a03 = this.f57263B;
                        if (c17945a03 != null) {
                            j11 = c17945a03.m95238r3();
                        } else {
                            j11 = 0;
                        }
                        if (!AbstractC26687h.m137065f(str3, j11)) {
                            enumC11355c = EnumC11355c.f57810r;
                            break;
                        }
                    }
                    C17945a0 c17945a04 = this.f57263B;
                    if (c17945a04 == null || (str2 = c17945a04.mo95039W2()) == null) {
                        str2 = "";
                    }
                    if (AbstractC3489d.m17495c(str2) && !this.f57263B.m94849A8()) {
                        enumC11355c = EnumC11355c.f57810r;
                        break;
                    } else {
                        enumC11355c = EnumC11355c.f57808p;
                        break;
                    }
                    break;
                case 7:
                case 8:
                    enumC11355c = EnumC11355c.f57809q;
                    break;
                case 9:
                    enumC11355c = EnumC11355c.f57810r;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            c11357e.m61389m0(enumC11355c);
            C11357e c11357e2 = this.f57773G7;
            if (c11357e2.m61382f0() != EnumC11355c.f57810r) {
                z11 = true;
            } else {
                z11 = false;
            }
            c11357e2.m61387k0(z11);
            C11357e c11357e3 = this.f57773G7;
            C17945a0 c17945a05 = this.f57263B;
            if (c17945a05 != null && c17945a05.m95032V6()) {
                m61385i0 = this.f57773G7.m61386j0();
            } else {
                m61385i0 = this.f57773G7.m61385i0();
            }
            c11357e3.m61388l0(m61385i0);
        }
        if (this.f57771E7) {
            m61382f0 = EnumC11355c.f57810r;
        } else {
            m61382f0 = this.f57773G7.m61382f0();
        }
        int i11 = C11359g.f57862b[m61382f0.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        Context context = getContext();
                        AbstractC19074t.m100207e(context, "getContext(...)");
                        drawable = C27280g.m139660c(context, AbstractC23322a.zds_ic_file_rolled_out_solid_24, AbstractC2807a.icon_03);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    C17990p0 c17990p0 = this.f57768B7;
                    if (c17990p0 != null && c17990p0.m95670k()) {
                        drawable = AbstractC23136l9.m118665N(getContext(), AbstractC23322a.zds_ffic_folder_colored_48);
                    } else {
                        Context context2 = getContext();
                        C17990p0 c17990p02 = this.f57768B7;
                        if (c17990p02 != null) {
                            str4 = c17990p02.f91115D;
                        }
                        if (str4 != null) {
                            str5 = str4;
                        }
                        drawable = AbstractC28236y3.m142197h(context2, str5);
                    }
                }
            }
        } else {
            Context context3 = getContext();
            AbstractC19074t.m100207e(context3, "getContext(...)");
            drawable = C27280g.m139660c(context3, AbstractC23322a.zds_ic_download_solid_24, AbstractC2807a.icon_01);
        }
        getCurrentUiSpec().m61303L(drawable);
        if (m61382f0 == EnumC11355c.f57810r) {
            getCurrentUiSpec().m61304M(getCurrentUiSpec().mo61329l());
            AbstractC11354b currentUiSpec = getCurrentUiSpec();
            if (drawable != null && drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
                m61328k = (getCurrentUiSpec().m61328k() * drawable.getIntrinsicWidth()) / drawable.getIntrinsicHeight();
            } else {
                m61328k = getCurrentUiSpec().m61328k();
            }
            currentUiSpec.m61305N(m61328k);
            return;
        }
        if (drawable != null) {
            getCurrentUiSpec().m61305N(drawable.getIntrinsicWidth());
            getCurrentUiSpec().m61304M(drawable.getIntrinsicHeight());
        }
    }

    /* renamed from: N5 */
    private final void m61227N5() {
        boolean z11;
        StaticLayout staticLayout;
        boolean z12;
        if (!this.f57771E7) {
            return;
        }
        EnumC31105a enumC31105a = this.f57769C7;
        if (enumC31105a != EnumC31105a.f143330q && enumC31105a != EnumC31105a.f143334u && enumC31105a != EnumC31105a.f143336w && enumC31105a != EnumC31105a.f143332s) {
            if (enumC31105a == EnumC31105a.f143333t) {
                C11356d c11356d = this.f57772F7;
                c11356d.m61346B0(c11356d.m61373w0());
            } else if (enumC31105a == EnumC31105a.f143335v || enumC31105a == EnumC31105a.f143337x) {
                C11356d c11356d2 = this.f57772F7;
                if (this.f57768B7 != null) {
                    C17945a0 c17945a0 = this.f57263B;
                    AbstractC19074t.m100207e(c17945a0, "message");
                    C17990p0 c17990p0 = this.f57768B7;
                    AbstractC19074t.m100205c(c17990p0);
                    if (!AbstractC26687h.m137062c(c17945a0, c17990p0)) {
                        z12 = true;
                        c11356d2.m61345A0(z12);
                    }
                }
                z12 = false;
                c11356d2.m61345A0(z12);
            }
        } else if (!this.f57259A1) {
            if (this.f57768B7 != null) {
                C17945a0 c17945a02 = this.f57263B;
                AbstractC19074t.m100207e(c17945a02, "message");
                C17990p0 c17990p02 = this.f57768B7;
                AbstractC19074t.m100205c(c17990p02);
                if (!AbstractC26687h.m137062c(c17945a02, c17990p02)) {
                    z11 = false;
                    this.f57772F7.m61345A0(!z11);
                }
            }
            z11 = true;
            this.f57772F7.m61345A0(!z11);
        }
        C11356d c11356d3 = this.f57772F7;
        if (!TextUtils.isEmpty(c11356d3.m61360j0())) {
            C11356d c11356d4 = this.f57772F7;
            c11356d4.m61349E0(AbstractC23136l9.m118764y0(c11356d4.m61368r0(), this.f57772F7.m61360j0()));
            staticLayout = AbstractC23214t.m119625l(this.f57772F7.m61360j0(), this.f57772F7.m61368r0(), this.f57772F7.m61369s0(), 1);
        } else {
            this.f57772F7.m61349E0(0);
            staticLayout = null;
        }
        c11356d3.m61348D0(staticLayout);
    }

    /* renamed from: e5 */
    private final void m61243e5() {
        try {
            if (this.f57769C7 == EnumC31105a.f143331r) {
                AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.y
                    public /* synthetic */ RunnableC11539y() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatRowFile.m61244f5(ChatRowFile.this);
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: f5 */
    public static final void m61244f5(ChatRowFile chatRowFile) {
        AbstractC19074t.m100208f(chatRowFile, "this$0");
        C17945a0 c17945a0 = chatRowFile.f57263B;
        AbstractC19074t.m100207e(c17945a0, "message");
        AbstractC19656s0.m103070m(c17945a0);
    }

    public final AbstractC11354b getCurrentUiSpec() {
        return this.f57771E7 ? this.f57772F7 : this.f57773G7;
    }

    public static final boolean getForceRefresh() {
        return Companion.m61290i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x00a3, code lost:            if (p698yz.AbstractC31111g.m151130k(r1) != false) goto L131;     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa A[Catch: all -> 0x0026, Exception -> 0x0029, TRY_ENTER, TryCatch #1 {Exception -> 0x0029, blocks: (B:3:0x0006, B:5:0x0018, B:8:0x002d, B:11:0x0035, B:13:0x0046, B:15:0x0052, B:21:0x00aa, B:24:0x00da, B:26:0x00ef, B:28:0x00f7, B:30:0x0100, B:31:0x01e7, B:36:0x010a, B:38:0x0111, B:40:0x0119, B:41:0x0136, B:43:0x013c, B:45:0x0140, B:47:0x0148, B:48:0x01be, B:49:0x0153, B:51:0x015b, B:53:0x0166, B:56:0x0175, B:58:0x018f, B:60:0x0197, B:62:0x019d, B:64:0x01a1, B:65:0x01ac, B:66:0x01d8, B:68:0x005b, B:70:0x0061, B:72:0x006d, B:74:0x0073, B:76:0x007b, B:78:0x0081, B:80:0x0097, B:82:0x009f), top: B:2:0x0006, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0111 A[Catch: all -> 0x0026, Exception -> 0x0029, TryCatch #1 {Exception -> 0x0029, blocks: (B:3:0x0006, B:5:0x0018, B:8:0x002d, B:11:0x0035, B:13:0x0046, B:15:0x0052, B:21:0x00aa, B:24:0x00da, B:26:0x00ef, B:28:0x00f7, B:30:0x0100, B:31:0x01e7, B:36:0x010a, B:38:0x0111, B:40:0x0119, B:41:0x0136, B:43:0x013c, B:45:0x0140, B:47:0x0148, B:48:0x01be, B:49:0x0153, B:51:0x015b, B:53:0x0166, B:56:0x0175, B:58:0x018f, B:60:0x0197, B:62:0x019d, B:64:0x01a1, B:65:0x01ac, B:66:0x01d8, B:68:0x005b, B:70:0x0061, B:72:0x006d, B:74:0x0073, B:76:0x007b, B:78:0x0081, B:80:0x0097, B:82:0x009f), top: B:2:0x0006, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x009d  */
    /* renamed from: h5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m61245h5(ChatRowFile chatRowFile, boolean z11) {
        String m94983Q3;
        boolean z12;
        int i11;
        String str;
        AbstractC19074t.m100208f(chatRowFile, "this$0");
        try {
            try {
                m94983Q3 = chatRowFile.f57263B.m94983Q3();
                AbstractC19074t.m100207e(m94983Q3, "getLocalpath(...)");
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            if (!TextUtils.isEmpty(m94983Q3)) {
                C17945a0 c17945a0 = chatRowFile.f57263B;
                if (c17945a0.m94893G1(c17945a0.m94983Q3())) {
                    z12 = true;
                    if (Build.VERSION.SDK_INT >= 29) {
                        if (!z12) {
                            m94983Q3 = chatRowFile.f57263B.m95283w2(false, false);
                            AbstractC19074t.m100207e(m94983Q3, "genDownloadFilePath(...)");
                            if (!TextUtils.isEmpty(m94983Q3) && !AbstractC19074t.m100204b(m94983Q3, chatRowFile.f57263B.m94983Q3()) && chatRowFile.f57263B.m94893G1(m94983Q3)) {
                                z12 = true;
                            }
                            z12 = false;
                        } else if (AbstractC31111g.m151130k(m94983Q3)) {
                            String m95283w2 = chatRowFile.f57263B.m95283w2(false, false);
                            if (!TextUtils.isEmpty(m95283w2) && !AbstractC19074t.m100204b(m95283w2, m94983Q3) && chatRowFile.f57263B.m94893G1(m95283w2)) {
                                AbstractC19074t.m100205c(m95283w2);
                            } else {
                                if (AbstractC23238v2.m119718c(new File(chatRowFile.f57263B.m94983Q3()), new File(m94983Q3))) {
                                    AbstractC19074t.m100205c(m95283w2);
                                }
                                z12 = false;
                            }
                            m94983Q3 = m95283w2;
                            z12 = true;
                        }
                        if (z12) {
                            C2526d c2526d = C2526d.f10270a;
                            MessageId m95029V3 = chatRowFile.f57263B.m95029V3();
                            AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
                            int position = chatRowFile.getPosition();
                            String mo62064S2 = chatRowFile.getDelegate().mo62064S2();
                            AbstractC19074t.m100207e(mo62064S2, "getLogChatType(...)");
                            c2526d.m12729v(m95029V3, position, "csc_msg_bubble", mo62064S2);
                            if (chatRowFile.f57263B.m95032V6()) {
                                str = "900102";
                            } else {
                                str = "900101";
                            }
                            AbstractC23647d.m123897g(str);
                            if (AbstractC26687h.m137065f(chatRowFile.f57263B.mo95039W2(), chatRowFile.f57263B.m95238r3())) {
                                if (chatRowFile.f57263B.m95089b4() != 1 && chatRowFile.f57263B.m95107d3() != 4) {
                                    AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.a0
                                        public /* synthetic */ RunnableC11451a0() {
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            ChatRowFile.m61248k5(ChatRowFile.this);
                                        }
                                    });
                                }
                            } else {
                                chatRowFile.f57263B.m95214o2(false, true);
                            }
                        } else {
                            if (chatRowFile.f57263B.m95147gc(m94983Q3, false, false)) {
                                C23744a.Companion.m124119a().m124116d(6, chatRowFile.f57263B.m95029V3(), chatRowFile.f57263B.mo95039W2());
                            }
                            chatRowFile.f57769C7 = EnumC31105a.f143333t;
                            if (z11) {
                                if (chatRowFile.f57771E7) {
                                    if (chatRowFile.f57772F7.m61372v0()) {
                                        chatRowFile.f57779M7.post(new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.b0
                                            public /* synthetic */ RunnableC11455b0() {
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                ChatRowFile.m61249l5(ChatRowFile.this);
                                            }
                                        });
                                    } else if (chatRowFile.f57772F7.m61373w0()) {
                                        C17945a0 c17945a02 = chatRowFile.f57263B;
                                        AbstractC19074t.m100207e(c17945a02, "message");
                                        C27373c m61263y5 = chatRowFile.m61263y5(c17945a02);
                                        if (m61263y5 != null) {
                                            if (AbstractC25495a.m132079d(chatRowFile.f57263B.mo95039W2())) {
                                                i11 = 7;
                                            } else {
                                                i11 = 0;
                                            }
                                            AbstractC20049k.m104119m(i11, chatRowFile.f57263B.m95029V3().m41044h(), 0L);
                                            chatRowFile.f57779M7.post(new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.c0

                                                /* renamed from: q */
                                                public final /* synthetic */ C27373c f59094q;

                                                public /* synthetic */ RunnableC11459c0(C27373c m61263y52) {
                                                    r2 = m61263y52;
                                                }

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    ChatRowFile.m61246i5(ChatRowFile.this, r2);
                                                }
                                            });
                                        }
                                    } else if (chatRowFile.f57772F7.m61371u0() && C8917b.m47601f() && C8917b.f47669Z) {
                                        chatRowFile.f57779M7.post(new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.d0
                                            public /* synthetic */ RunnableC11463d0() {
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                ChatRowFile.m61247j5(ChatRowFile.this);
                                            }
                                        });
                                    }
                                    C28023b6.m141250h0().m141301M(chatRowFile.f57263B.m95029V3().m41044h());
                                    C17945a0 c17945a03 = chatRowFile.f57263B;
                                    AbstractC19074t.m100207e(c17945a03, "message");
                                    AbstractC31111g.m151133n(c17945a03);
                                }
                                chatRowFile.getDelegate().mo62081e4(chatRowFile, new C20556f(chatRowFile.f57263B.m94983Q3()));
                                C28023b6.m141250h0().m141301M(chatRowFile.f57263B.m95029V3().m41044h());
                                C17945a0 c17945a032 = chatRowFile.f57263B;
                                AbstractC19074t.m100207e(c17945a032, "message");
                                AbstractC31111g.m151133n(c17945a032);
                            } else {
                                C17969i0 m94929K2 = chatRowFile.f57263B.m94929K2();
                                AbstractC19074t.m100206d(m94929K2, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentFile");
                                ((C17990p0) m94929K2).f91117F = false;
                            }
                        }
                        C23594g c23594g = C23594g.f114421a;
                        C17945a0 c17945a04 = chatRowFile.f57263B;
                        AbstractC19074t.m100207e(c17945a04, "message");
                        c23594g.m123701n(c17945a04);
                        chatRowFile.f57780N7.set(false);
                        return;
                    }
                    if (z12) {
                    }
                    if (z12) {
                    }
                    C23594g c23594g2 = C23594g.f114421a;
                    C17945a0 c17945a042 = chatRowFile.f57263B;
                    AbstractC19074t.m100207e(c17945a042, "message");
                    c23594g2.m123701n(c17945a042);
                    chatRowFile.f57780N7.set(false);
                    return;
                }
            }
            z12 = false;
            if (Build.VERSION.SDK_INT >= 29) {
            }
        } catch (Throwable th2) {
            chatRowFile.f57780N7.set(false);
            throw th2;
        }
    }

    /* renamed from: i5 */
    public static final void m61246i5(ChatRowFile chatRowFile, C27373c c27373c) {
        AbstractC19074t.m100208f(chatRowFile, "this$0");
        chatRowFile.getDelegate().mo62088i4(chatRowFile, c27373c);
    }

    /* renamed from: j5 */
    public static final void m61247j5(ChatRowFile chatRowFile) {
        AbstractC19074t.m100208f(chatRowFile, "this$0");
        chatRowFile.m61219J5();
    }

    /* renamed from: k5 */
    public static final void m61248k5(ChatRowFile chatRowFile) {
        AbstractC19074t.m100208f(chatRowFile, "this$0");
        chatRowFile.getDelegate().mo62061Q3(chatRowFile);
    }

    /* renamed from: l5 */
    public static final void m61249l5(ChatRowFile chatRowFile) {
        AbstractC19074t.m100208f(chatRowFile, "this$0");
        chatRowFile.getDelegate().mo62074a4(chatRowFile);
    }

    /* renamed from: m5 */
    private final void m61250m5(Canvas canvas) {
        Layout m61321d = getCurrentUiSpec().m61321d();
        if (m61321d != null) {
            canvas.save();
            canvas.translate(getCurrentUiSpec().m61322e().x, getCurrentUiSpec().m61322e().y);
            m61321d.draw(canvas);
            canvas.restore();
        }
    }

    /* renamed from: n5 */
    private final void m61251n5(Canvas canvas) {
        if (this.f57771E7) {
            m61252o5(canvas);
        } else {
            m61253p5(canvas);
        }
    }

    /* renamed from: o5 */
    private final void m61252o5(Canvas canvas) {
        Drawable m61326i = this.f57772F7.m61326i();
        if (m61326i != null) {
            m61326i.setBounds(this.f57772F7.m61327j().x, this.f57772F7.m61327j().y, this.f57772F7.m61327j().x + this.f57772F7.m61330m(), this.f57772F7.m61327j().y + this.f57772F7.m61328k());
            m61326i.draw(canvas);
        }
    }

    /* renamed from: p5 */
    private final void m61253p5(Canvas canvas) {
        Drawable m61379c0 = this.f57773G7.m61379c0();
        if (this.f57773G7.m61377a0() && m61379c0 != null) {
            canvas.save();
            canvas.translate(this.f57773G7.m61380d0().x, this.f57773G7.m61380d0().y);
            m61379c0.setBounds(0, 0, this.f57773G7.m61381e0(), this.f57773G7.m61381e0());
            m61379c0.draw(canvas);
            canvas.restore();
        }
        Drawable m61326i = this.f57773G7.m61326i();
        if (m61326i != null) {
            m61326i.setBounds(this.f57773G7.m61327j().x, this.f57773G7.m61327j().y, this.f57773G7.m61327j().x + this.f57773G7.m61330m(), this.f57773G7.m61327j().y + this.f57773G7.m61328k());
            m61326i.draw(canvas);
        }
    }

    /* renamed from: q5 */
    private final void m61254q5(Canvas canvas) {
        Layout m61333p = getCurrentUiSpec().m61333p();
        if (m61333p != null) {
            canvas.save();
            canvas.translate(getCurrentUiSpec().m61334q().x, getCurrentUiSpec().m61334q().y);
            m61333p.draw(canvas);
            canvas.restore();
        }
    }

    /* renamed from: r5 */
    private final void m61255r5(Canvas canvas) {
        Layout m61339v = getCurrentUiSpec().m61339v();
        if (m61339v != null) {
            canvas.save();
            canvas.translate(getCurrentUiSpec().m61340w().x, getCurrentUiSpec().m61340w().y);
            m61339v.draw(canvas);
            canvas.restore();
        }
    }

    /* renamed from: s5 */
    private final void m61256s5(Canvas canvas) {
        Drawable m62518N = AbstractC11531v0.Companion.m62518N();
        if (m62518N != null) {
            int i11 = this.f57530u0;
            int i12 = f57759Q7;
            m62518N.setBounds(i11 + i12, this.f57772F7.m61354d0().top + i12, this.f57536v0 - i12, this.f57541w0 - i12);
            m62518N.draw(canvas);
        }
    }

    public static final void setForceRefresh(boolean z11) {
        Companion.m61291q(z11);
    }

    private final void setupFileTextComponents(int i11) {
        int m116584g;
        int i12;
        int i13;
        int i14;
        int i15;
        StaticLayout staticLayout;
        int m116580c;
        int i16 = 0;
        if (this.f57771E7) {
            i15 = (((i11 - getBubblePaddingLeft()) - getBubblePaddingRight()) - getCurrentUiSpec().mo61325h()) - getCurrentUiSpec().mo61324g();
            i14 = i15;
            i12 = i14;
        } else {
            int bubblePaddingLeft = (((i11 - getBubblePaddingLeft()) - getBubblePaddingRight()) - getCurrentUiSpec().mo61325h()) - getCurrentUiSpec().mo61324g();
            m116584g = AbstractC22543l.m116584g((int) Math.ceil(getCurrentUiSpec().mo61336s().measureText(getCurrentUiSpec().m61331n(), 0, getCurrentUiSpec().m61331n().length())), bubblePaddingLeft);
            if (!TextUtils.isEmpty(getCurrentUiSpec().m61320c())) {
                int ceil = (int) Math.ceil(getCurrentUiSpec().mo61323f().measureText(getCurrentUiSpec().m61320c(), 0, getCurrentUiSpec().m61320c().length()));
                if (this.f57263B.m94849A8()) {
                    ceil += AbstractC23136l9.m118742r(24.0f);
                }
                i12 = AbstractC22543l.m116584g(ceil, bubblePaddingLeft);
            } else {
                i12 = 0;
            }
            if (!TextUtils.isEmpty(getCurrentUiSpec().m61338u())) {
                i13 = AbstractC22543l.m116584g((int) Math.ceil(getCurrentUiSpec().mo61342y().measureText(getCurrentUiSpec().m61338u(), 0, getCurrentUiSpec().m61338u().length())), bubblePaddingLeft);
            } else {
                i13 = 0;
            }
            i14 = i13;
            i15 = m116584g;
        }
        getCurrentUiSpec().m61308Q(m61271d5(getCurrentUiSpec().m61331n().toString(), getCurrentUiSpec().mo61336s(), i15, getCurrentUiSpec().mo61335r()));
        AbstractC11354b currentUiSpec = getCurrentUiSpec();
        StaticLayout staticLayout2 = null;
        if (!TextUtils.isEmpty(getCurrentUiSpec().m61320c())) {
            staticLayout = AbstractC23214t.m119625l(getCurrentUiSpec().m61320c(), getCurrentUiSpec().mo61323f(), i12, 1);
        } else {
            staticLayout = null;
        }
        currentUiSpec.m61302K(staticLayout);
        getCurrentUiSpec().mo61342y().setColor(getCurrentUiSpec().m61341x());
        AbstractC11354b currentUiSpec2 = getCurrentUiSpec();
        if (!TextUtils.isEmpty(getCurrentUiSpec().m61338u())) {
            staticLayout2 = AbstractC23214t.m119625l(getCurrentUiSpec().m61338u(), getCurrentUiSpec().mo61342y(), i14, 1);
        }
        currentUiSpec2.m61311T(staticLayout2);
        AbstractC11354b currentUiSpec3 = getCurrentUiSpec();
        int m61293B = getCurrentUiSpec().m61293B();
        Layout m61339v = getCurrentUiSpec().m61339v();
        if (m61339v != null) {
            i16 = m61339v.getWidth();
        }
        m116580c = AbstractC22543l.m116580c(m61293B, i16);
        currentUiSpec3.m61313V(m116580c);
    }

    private final void setupPreviewThumbComponent(int i11) {
        float f11;
        float m116579b;
        if (getCurrentUiSpec().m61343z()) {
            if (this.f57771E7) {
                f11 = 0.715f;
                if (getCurrentUiSpec().m61297F() > 0 && getCurrentUiSpec().m61296E() > 0) {
                    m116579b = AbstractC22543l.m116579b(getCurrentUiSpec().m61296E() / getCurrentUiSpec().m61297F(), 0.715f);
                    f11 = AbstractC22543l.m116583f(m116579b, 1.5f);
                }
            } else {
                f11 = 0.374f;
            }
            getCurrentUiSpec().m61315X((int) (i11 * f11));
            if (this.f57771E7) {
                this.f57775I7.m76461I(ChatRow.f57183C5);
                C13697o c13697o = this.f57775I7;
                int i12 = f57759Q7;
                c13697o.m76463K(5, i11 - (i12 * 2), getCurrentUiSpec().m61295D() - (i12 * 2));
                return;
            }
            this.f57775I7.m76461I(ChatRow.f57185D5);
            this.f57775I7.m76463K(5, i11 - (f57759Q7 * 2), getCurrentUiSpec().m61295D());
        }
    }

    private final void setupProgressComponents(int i11) {
        int i12;
        int m116580c;
        C22103b c22103b;
        boolean z11;
        int i13;
        getCurrentUiSpec().m61309R(EnumC11358f.f57856p);
        EnumC31105a enumC31105a = this.f57769C7;
        EnumC31105a enumC31105a2 = EnumC31105a.f143331r;
        if (enumC31105a == enumC31105a2 || enumC31105a == EnumC31105a.f143329p) {
            this.f57263B.m94859Bb(this);
            getCurrentUiSpec().m61309R(getCurrentUiSpec().mo61300I());
            m61265z5(getCurrentUiSpec(), i11);
            if (this.f57769C7 == enumC31105a2) {
                C17945a0 c17945a0 = this.f57263B;
                if (c17945a0 != null) {
                    i13 = c17945a0.m94982Q2();
                } else {
                    i13 = 0;
                }
                m116580c = AbstractC22543l.m116580c(i13, 10);
            } else {
                C17945a0 c17945a02 = this.f57263B;
                if (c17945a02 != null) {
                    i12 = c17945a02.m95001S2();
                } else {
                    i12 = 0;
                }
                m116580c = AbstractC22543l.m116580c(i12, 10);
            }
            if (getCurrentUiSpec().m61337t() == EnumC11358f.f57857q) {
                C13641h c13641h = this.f57777K7;
                if (c13641h != null) {
                    if (this.f57769C7 == enumC31105a2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    c13641h.m76243q(z11);
                }
                C13641h c13641h2 = this.f57777K7;
                if (c13641h2 != null) {
                    c13641h2.m76244r(false);
                }
                C13641h c13641h3 = this.f57777K7;
                if (c13641h3 != null) {
                    c13641h3.m76417l(m116580c, false);
                }
            }
            if (getCurrentUiSpec().m61337t() == EnumC11358f.f57858r && (c22103b = this.f57778L7) != null) {
                c22103b.m115321d(m116580c, false);
            }
        }
    }

    /* renamed from: t5 */
    private final void m61257t5(Canvas canvas) {
        Drawable m62521O;
        if (this.f57772F7.m61357g0() && (m62521O = AbstractC11531v0.Companion.m62521O()) != null) {
            AbstractC28236y3.m142204o(m62521O, this.f57772F7.m61359i0().x, this.f57772F7.m61359i0().y);
            m62521O.draw(canvas);
        }
    }

    /* renamed from: u5 */
    private final void m61258u5(Canvas canvas) {
        Layout m61365o0 = this.f57772F7.m61365o0();
        if (m61365o0 != null) {
            float f11 = this.f57772F7.m61366p0().x;
            float f12 = this.f57772F7.m61366p0().y;
            float f13 = 2;
            this.f57772F7.m61364n0().set(0.0f, 0.0f, m61365o0.getWidth() + (this.f57772F7.m61361k0() * f13), m61365o0.getHeight() + (f13 * this.f57772F7.m61361k0()));
            canvas.save();
            canvas.translate(f11, f12);
            canvas.drawRoundRect(this.f57772F7.m61364n0(), this.f57772F7.m61363m0(), this.f57772F7.m61363m0(), this.f57772F7.m61362l0());
            canvas.translate(this.f57772F7.m61361k0(), this.f57772F7.m61361k0());
            m61365o0.draw(canvas);
            canvas.restore();
        }
    }

    /* renamed from: v5 */
    private final void m61259v5(Canvas canvas) {
        Drawable m62524P;
        if (this.f57772F7.m61358h0() && (m62524P = AbstractC11531v0.Companion.m62524P()) != null) {
            AbstractC28236y3.m142204o(m62524P, this.f57772F7.m61370t0().x, this.f57772F7.m61370t0().y);
            m62524P.draw(canvas);
        }
    }

    /* renamed from: w5 */
    private final void m61260w5(Canvas canvas) {
        if (getCurrentUiSpec().m61343z()) {
            this.f57775I7.m76467d(canvas);
        }
    }

    /* renamed from: x5 */
    private final void m61261x5(Canvas canvas) {
        if (getCurrentUiSpec().m61337t() == EnumC11358f.f57857q && this.f57777K7 != null) {
            canvas.save();
            canvas.translate(getCurrentUiSpec().m61299H().x, getCurrentUiSpec().m61299H().y);
            C13641h c13641h = this.f57777K7;
            if (c13641h != null) {
                c13641h.m76410b(canvas);
            }
            canvas.restore();
        }
        if (getCurrentUiSpec().m61337t() == EnumC11358f.f57858r && this.f57778L7 != null) {
            canvas.save();
            canvas.translate(getCurrentUiSpec().m61299H().x, getCurrentUiSpec().m61299H().y);
            C22103b c22103b = this.f57778L7;
            if (c22103b != null) {
                c22103b.m115320b(canvas);
            }
            canvas.restore();
        }
    }

    /* renamed from: y5 */
    private final C27373c m61263y5(C17945a0 c17945a0) {
        String str;
        C27373c c27373c = null;
        try {
            String m94983Q3 = c17945a0.m94983Q3();
            AbstractC19074t.m100207e(m94983Q3, "getLocalpath(...)");
            if (TextUtils.isEmpty(m94983Q3) || !ZVideoUtil.getInstance().isPlayable(ZAbstractBase.reformatVideoPath(m94983Q3)) || TextUtils.isEmpty(m94983Q3)) {
                return null;
            }
            C27373c c27373c2 = new C27373c(null, null, null, null, null, null, 0L, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0.0f, 0.0f, 0L, 0L, 0L, false, false, false, false, false, null, 0, false, null, 0, -1, 7, null);
            try {
                c27373c2.m140250e0(m94983Q3);
                c27373c2.m140237V(getCurrentUiSpec().m61294C());
                try {
                    C17990p0 c17990p0 = this.f57768B7;
                    if (c17990p0 != null) {
                        str = c17990p0.f91115D;
                        if (str == null) {
                        }
                        c27373c2.f128950W = str;
                        return c27373c2;
                    }
                    str = "";
                    c27373c2.f128950W = str;
                    return c27373c2;
                } catch (Exception e11) {
                    e = e11;
                    c27373c = c27373c2;
                    AbstractC23350e.m122778h(e);
                    return c27373c;
                }
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Exception e13) {
            e = e13;
        }
    }

    /* renamed from: z5 */
    private final void m61265z5(AbstractC11354b abstractC11354b, int i11) {
        if (abstractC11354b.m61337t() == EnumC11358f.f57857q) {
            if (this.f57777K7 == null) {
                this.f57777K7 = new C13641h(this);
            }
            C13641h c13641h = this.f57777K7;
            if (c13641h != null) {
                c13641h.mo76241m(getCurrentUiSpec().mo61318a());
                if (this.f57771E7) {
                    c13641h.m76246t();
                } else {
                    c13641h.m76245s();
                }
            }
        }
        if (abstractC11354b.m61337t() == EnumC11358f.f57858r) {
            if (this.f57778L7 == null) {
                this.f57778L7 = new C22103b(new C22103b.a() { // from class: com.zing.zalo.ui.chat.chatrow.z
                    public /* synthetic */ C11542z() {
                    }

                    @Override // l60.C22103b.a
                    /* renamed from: a */
                    public final void mo62638a() {
                        ChatRowFile.m61203A5(ChatRowFile.this);
                    }
                });
            }
            C22103b c22103b = this.f57778L7;
            if (c22103b != null) {
                c22103b.m115322e(i11 - (ChatRow.f57203M5 * 2), abstractC11354b.m61292A());
            }
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: A3 */
    public void mo60947A3() {
        super.mo60947A3();
        this.f57781O7 = false;
        this.f57782P7 = false;
    }

    /* renamed from: B5 */
    public final boolean m61266B5(float f11, float f12) {
        C13641h c13641h = this.f57777K7;
        if (getCurrentUiSpec().m61337t() == EnumC11358f.f57857q && c13641h != null && f11 >= getCurrentUiSpec().m61299H().x && f11 <= getCurrentUiSpec().m61299H().x + (c13641h.m76413g() * 2) && f12 >= getCurrentUiSpec().m61299H().y && f12 <= getCurrentUiSpec().m61299H().y + (c13641h.m76413g() * 2)) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C2 */
    protected C28227x3 mo60952C2(int i11, int i12, C28227x3 c28227x3) {
        AbstractC19074t.m100208f(c28227x3, "result");
        if (this.f57771E7) {
            return m61215H5(i11, i12, c28227x3);
        }
        return m61217I5(i11, i12, c28227x3);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C3 */
    public void mo60953C3(C17945a0 c17945a0, C28769a c28769a, boolean z11) {
        boolean z12;
        C17990p0 c17990p0;
        String str;
        boolean z13;
        boolean z14;
        String str2;
        String m95266u2;
        boolean z15;
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(c28769a, "chatBubbleData");
        super.mo60953C3(c17945a0, c28769a, z11);
        c17945a0.m94997R9(this);
        EnumC31105a m61221K5 = m61221K5(c17945a0);
        this.f57769C7 = m61221K5;
        this.f57382U4 = m61207D5(m61221K5);
        if (mo60993N() && c17945a0.m94954N0()) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f57271C1 = z12;
        this.f57770D7 = c17945a0.m94895G3();
        C17969i0 m94929K2 = c17945a0.m94929K2();
        if (m94929K2 instanceof C17990p0) {
            c17990p0 = (C17990p0) m94929K2;
        } else {
            c17990p0 = null;
        }
        this.f57768B7 = c17990p0;
        if (c17990p0 != null) {
            if (TextUtils.isEmpty(c17990p0.f91115D)) {
                str = "";
            } else {
                str = c17990p0.f91115D;
            }
            boolean m154226g = AbstractC31990k7.m154226g(str);
            if (!m154226g && AbstractC31990k7.m154228i(str)) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!m154226g && !z13 && AbstractC31990k7.m154225f(str)) {
                z14 = true;
            } else {
                z14 = false;
            }
            long j11 = c17990p0.f91113B;
            if (j11 < 0) {
                str2 = "";
            } else {
                str2 = AbstractC23041d2.m118226y(j11);
            }
            AbstractC19074t.m100205c(str2);
            if (this.f57382U4) {
                m95266u2 = "";
            } else {
                m95266u2 = c17945a0.m95266u2();
                AbstractC19074t.m100207e(m95266u2, "extractThumbUrl(...)");
            }
            if (!this.f57382U4 && ((m154226g || z13 || z14) && !TextUtils.isEmpty(m95266u2))) {
                z15 = true;
            } else {
                z15 = false;
            }
            this.f57771E7 = z15;
            getCurrentUiSpec().m61314W(m95266u2);
            getCurrentUiSpec().m61317Z(c17990p0.f91120I);
            getCurrentUiSpec().m61316Y(c17990p0.f91121J);
            getCurrentUiSpec().m61306O(c17945a0.m94929K2().f91011p);
            AbstractC11354b currentUiSpec = getCurrentUiSpec();
            if (!this.f57771E7) {
                StringBuilder sb2 = new StringBuilder();
                if (c17990p0.m95670k()) {
                    sb2.append(str2);
                    if (c17990p0.f91125N > 0 && !c17945a0.m94889F6()) {
                        sb2.append(" • ");
                        C19067n0 c19067n0 = C19067n0.f94947a;
                        String string = getContext().getString(AbstractC8020f0.str_folder_items);
                        AbstractC19074t.m100207e(string, "getString(...)");
                        String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(c17990p0.f91125N)}, 1));
                        AbstractC19074t.m100207e(format, "format(...)");
                        sb2.append(format);
                    }
                    sb2.append(" • ");
                    sb2.append(getContext().getString(AbstractC8020f0.str_folder));
                } else {
                    sb2.append(str2);
                    if (sb2.length() > 0) {
                        AbstractC19074t.m100205c(str);
                        if (str.length() > 0) {
                            sb2.append(" • ");
                            String upperCase = str.toUpperCase(Locale.ROOT);
                            AbstractC19074t.m100207e(upperCase, "toUpperCase(...)");
                            sb2.append(upperCase);
                        }
                    }
                }
                str2 = sb2.toString();
                AbstractC19074t.m100205c(str2);
            }
            currentUiSpec.m61301J(str2);
            if (c17945a0.m94849A8() && !c17945a0.m95022U7()) {
                AbstractC11354b currentUiSpec2 = getCurrentUiSpec();
                Context context = getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                currentUiSpec2.m61301J(AbstractC23463h.m123174b(context, getCurrentUiSpec().m61320c(), this.f57771E7));
            }
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            C31106b m151126g = AbstractC31111g.m151126g(context2, EnumC31107c.f143342p, c17945a0, this.f57769C7);
            if (this.f57771E7) {
                int i11 = C11359g.f57861a[this.f57769C7.ordinal()];
                if (i11 != 1 && i11 != 2 && i11 != 3) {
                    getCurrentUiSpec().m61310S("");
                    getCurrentUiSpec().m61312U(m151126g.m151116b());
                } else {
                    getCurrentUiSpec().m61310S(m151126g.m151115a());
                    getCurrentUiSpec().m61312U(m151126g.m151116b());
                }
            } else {
                getCurrentUiSpec().m61310S(m151126g.m151115a());
                getCurrentUiSpec().m61312U(m151126g.m151116b());
            }
            getCurrentUiSpec().mo61342y().setColor(getCurrentUiSpec().m61341x());
            if (this.f57771E7) {
                C11356d c11356d = this.f57772F7;
                c11356d.m61376z0(m154226g);
                c11356d.m61350F0(z13);
                c11356d.m61375y0(z14);
                if (c11356d.m61373w0()) {
                    long j12 = c17990p0.f91122K;
                    if (j12 > 0) {
                        String m17440h = AbstractC3460h.m17440h(j12);
                        AbstractC19074t.m100207e(m17440h, "formatTime(...)");
                        c11356d.m61347C0(m17440h);
                        c11356d.m61349E0(AbstractC23136l9.m118764y0(c11356d.m61368r0(), c11356d.m61360j0()));
                    }
                }
                c11356d.m61347C0("");
                c11356d.m61349E0(0);
            }
        }
        C2535j.f10308a.m12775s("csc", c17945a0, this.f57382U4);
    }

    /* renamed from: C5 */
    public final boolean m61267C5(float f11, float f12) {
        if (getCurrentUiSpec().m61339v() == null || f11 < getCurrentUiSpec().m61340w().x || f11 > getCurrentUiSpec().m61340w().x + r0.getWidth() || f12 < getCurrentUiSpec().m61340w().y || f12 > getCurrentUiSpec().m61340w().y + r0.getHeight()) {
            return false;
        }
        return true;
    }

    @Override // dj.C17945a0.x
    /* renamed from: G */
    public void mo61268G(int i11, MessageId messageId) {
        try {
            C17945a0 c17945a0 = this.f57263B;
            if (c17945a0 != null && c17945a0.m95135f9(messageId) && !this.f57779M7.hasMessages(10002, messageId)) {
                Handler handler = this.f57779M7;
                handler.sendMessage(handler.obtainMessage(10002, messageId));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // dj.C17945a0.x
    /* renamed from: H */
    public void mo61269H(MessageId messageId, boolean z11) {
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: I3 */
    public void mo60975I3(C17945a0 c17945a0, C28769a c28769a, int i11) {
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(c28769a, "chatBubbleData");
        super.mo60975I3(c17945a0, c28769a, i11);
        setupPreviewThumbComponent(i11);
        m61225M5();
        setupFileTextComponents(i11);
        setupProgressComponents(i11);
        m61227N5();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: L2 */
    public boolean mo60987L2() {
        return !this.f57771E7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: N2 */
    protected void mo60995N2() {
        try {
            C17990p0 c17990p0 = this.f57768B7;
            if (c17990p0 == null) {
                return;
            }
            if (this.f57263B.m94878E4() == EnumC19038l.f94905r && !c17990p0.f91117F) {
                AbstractC23647d.m123897g("900099");
            }
            c17990p0.f91117F = true;
            if (this.f57771E7 && this.f57772F7.m61372v0() && this.f57769C7 == EnumC31105a.f143333t) {
                getDelegate().mo62074a4(this);
            } else {
                m61272g5(true);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: O3 */
    protected boolean mo61001O3() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: W */
    public boolean mo61028W(C28771c c28771c, C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "message");
        if (m61207D5(m61221K5(c17945a0))) {
            return false;
        }
        return super.mo61028W(c28771c, c17945a0);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Y2 */
    public void mo61036Y2(C17945a0 c17945a0, C28769a c28769a) {
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(c28769a, "chatBubbleData");
        super.mo61036Y2(c17945a0, c28769a);
        if (getCurrentUiSpec().m61343z() && !this.f57774H7 && !this.f57382U4) {
            m61213G5();
        }
        if (!c17945a0.m95032V6()) {
            EnumC31105a enumC31105a = this.f57769C7;
            if (enumC31105a == EnumC31105a.f143330q || enumC31105a == EnumC31105a.f143336w) {
                C23594g.f114421a.m123703r(c17945a0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0126 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: a4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List mo61270a4(List list) {
        List list2;
        String str;
        ArrayList m119662n;
        ArrayList m119662n2;
        int m116584g;
        int m116584g2;
        int m116584g3;
        try {
            if (this.f57263B != null && list != null) {
                char c11 = 1;
                if (!list.isEmpty()) {
                    String str2 = this.f57263B.m94929K2().f91011p;
                    Layout m61333p = getCurrentUiSpec().m61333p();
                    Layout m61321d = getCurrentUiSpec().m61321d();
                    CharSequence m61331n = getCurrentUiSpec().m61331n();
                    String m61332o = getCurrentUiSpec().m61332o();
                    C17990p0 c17990p0 = this.f57768B7;
                    if (c17990p0 != null) {
                        str = c17990p0.f91115D;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    if (!TextUtils.isEmpty(str2) && m61333p != null && m61333p.getText() != null && (m119662n2 = AbstractC23217t2.m119662n(str2, list)) != null && (!m119662n2.isEmpty())) {
                        CharSequence text = m61333p.getText();
                        AbstractC19074t.m100207e(text, "getText(...)");
                        if (!TextUtils.isEmpty(text)) {
                            if (TextUtils.equals(m61331n, text)) {
                                int length = text.length() - m61332o.length();
                                int length2 = m61331n.length() - 7;
                                int length3 = m61331n.length() - text.length();
                                Iterator it = m119662n2.iterator();
                                char c12 = 0;
                                boolean z11 = false;
                                while (it.hasNext()) {
                                    int[] iArr = (int[]) it.next();
                                    int i11 = iArr[c12];
                                    int i12 = iArr[c11];
                                    if (i11 < length && i12 > length2) {
                                        m116584g3 = AbstractC22543l.m116584g(i12 - length3, text.length());
                                        iArr[c11] = m116584g3;
                                    } else {
                                        if (i11 + 1 <= length && length < i12) {
                                            iArr[1] = length;
                                        } else if (i11 >= length && i12 <= length2) {
                                            it.remove();
                                        } else if (i11 <= length2 && length2 < i12) {
                                            iArr[0] = length2;
                                            iArr[1] = i12 - length3;
                                        } else if (i11 >= length2 && i12 >= length2) {
                                            m116584g = AbstractC22543l.m116584g(i11 - length3, text.length());
                                            m116584g2 = AbstractC22543l.m116584g(i12 - length3, text.length());
                                            c12 = 0;
                                            iArr[0] = m116584g;
                                            iArr[1] = m116584g2;
                                            c11 = 1;
                                        }
                                        c11 = 1;
                                        c12 = 0;
                                        z11 = true;
                                    }
                                    c12 = 0;
                                    c11 = 1;
                                }
                                if (z11) {
                                    m119662n2.add(new int[]{length, length + 4});
                                }
                            }
                            list2 = AbstractC23214t.m119614a(m119662n2, m61333p, text.length(), getCurrentUiSpec().m61334q().x, getCurrentUiSpec().m61334q().y);
                            if (list2 != null) {
                                try {
                                    if (!list2.isEmpty()) {
                                        return list2;
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    AbstractC23350e.m122778h(e);
                                    return list2;
                                }
                            }
                            if (TextUtils.isEmpty(str) && (m119662n = AbstractC23217t2.m119662n(str, list)) != null && (!m119662n.isEmpty())) {
                                return AbstractC23214t.m119614a(m119662n, m61321d, str.length(), getCurrentUiSpec().m61322e().x, getCurrentUiSpec().m61322e().y);
                            }
                            return list2;
                        }
                    }
                    list2 = null;
                    if (list2 != null) {
                    }
                    return TextUtils.isEmpty(str) ? list2 : list2;
                }
            }
            return null;
        } catch (Exception e12) {
            e = e12;
            list2 = null;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: c0 */
    public boolean mo61046c0(C17945a0 c17945a0, C28769a c28769a) {
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(c28769a, "chatBubbleData");
        if (super.mo61046c0(c17945a0, c28769a) || this.f57770D7 != c17945a0.m94895G3() || this.f57769C7 != m61221K5(c17945a0)) {
            return true;
        }
        return false;
    }

    /* renamed from: d5 */
    public final StaticLayout m61271d5(String str, TextPaint textPaint, int i11, int i12) {
        int offsetForHorizontal;
        int m116580c;
        int m116580c2;
        int m116580c3;
        String substring;
        int m116584g;
        AbstractC19074t.m100208f(str, "text");
        try {
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            StaticLayout staticLayout = new StaticLayout(str, textPaint, i11, alignment, 1.0f, AbstractC23136l9.m118742r(1.0f), false);
            if (i12 > 0 && staticLayout.getLineCount() > i12) {
                int i13 = i12 - 1;
                float lineLeft = staticLayout.getLineLeft(i13);
                if (lineLeft == 0.0f) {
                    offsetForHorizontal = staticLayout.getOffsetForHorizontal(i13, staticLayout.getLineWidth(i13));
                } else {
                    offsetForHorizontal = staticLayout.getOffsetForHorizontal(i13, lineLeft);
                }
                m116580c = AbstractC22543l.m116580c(0, offsetForHorizontal - 1);
                String substring2 = str.substring(0, m116580c);
                AbstractC19074t.m100207e(substring2, "substring(...)");
                m116580c2 = AbstractC22543l.m116580c(0, str.length() - 7);
                String substring3 = str.substring(m116580c2);
                AbstractC19074t.m100207e(substring3, "substring(...)");
                getCurrentUiSpec().m61307P("... " + substring3);
                if (substring2.length() <= getCurrentUiSpec().m61332o().length()) {
                    m116580c3 = AbstractC22543l.m116580c(0, offsetForHorizontal);
                    substring = str.substring(0, m116580c3);
                    AbstractC19074t.m100207e(substring, "substring(...)");
                } else {
                    substring = substring2.substring(0, substring2.length() - getCurrentUiSpec().m61332o().length());
                    AbstractC19074t.m100207e(substring, "substring(...)");
                }
                String str2 = substring + getCurrentUiSpec().m61332o();
                try {
                    m116584g = AbstractC22543l.m116584g((int) Math.ceil(getCurrentUiSpec().mo61336s().measureText(str2, 0, str2.length())), i11);
                    return new StaticLayout(str2, textPaint, m116584g, alignment, 1.0f, AbstractC23136l9.m118742r(1.0f), false);
                } catch (Exception e11) {
                    e = e11;
                    AbstractC23350e.m122776f("ChatRow", e);
                    StaticLayout m119625l = AbstractC23214t.m119625l(str, textPaint, i11, i12);
                    AbstractC19074t.m100207e(m119625l, "generateStaticLayout(...)");
                    return m119625l;
                }
            }
            return staticLayout;
        } catch (Exception e12) {
            e = e12;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g2 */
    protected void mo61063g2(int i11, int i12, int i13, int i14, boolean z11) {
        if (this.f57771E7) {
            m61209E5(i11, i12, i13, i14, z11);
        } else {
            m61211F5(i11, i12, i13, i14, z11);
        }
    }

    /* renamed from: g5 */
    public final void m61272g5(boolean z11) {
        if (this.f57382U4) {
            getDelegate().mo62067U3(this);
            return;
        }
        C17945a0 c17945a0 = this.f57263B;
        AbstractC19074t.m100207e(c17945a0, "message");
        if (AbstractC26687h.m137064e(c17945a0)) {
            getDelegate().mo62066T3(this);
        } else {
            if (!this.f57780N7.compareAndSet(false, true)) {
                return;
            }
            AbstractC23306f.m120573D1().m109954R(this.f57263B);
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.x

                /* renamed from: q */
                public final /* synthetic */ boolean f59659q;

                public /* synthetic */ RunnableC11536x(boolean z112) {
                    r2 = z112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatRowFile.m61245h5(ChatRowFile.this, r2);
                }
            });
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubbleMaxWidth() {
        int m116580c;
        if (getCurrentUiSpec().m61343z()) {
            m116580c = AbstractC22543l.m116580c(getWidthMeasurement() - ChatRow.f57198J6, AbstractC11531v0.Companion.m62546W0());
            return m116580c;
        }
        return super.getBubbleMaxWidth();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getDefaultBubblePaddingTop() {
        return 0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public String getMsgContentTalkText() {
        String msgContentTalkText = super.getMsgContentTalkText();
        try {
            String str = msgContentTalkText + AbstractC23136l9.m118743r0(AbstractC8020f0.str_reply_msg_file) + "\n";
            Layout m61333p = getCurrentUiSpec().m61333p();
            if (m61333p != null) {
                str = str + ((Object) m61333p.getText()) + "\n";
            }
            Layout m61321d = getCurrentUiSpec().m61321d();
            if (m61321d != null) {
                str = str + ((Object) m61321d.getText()) + "\n";
            }
            Layout m61339v = getCurrentUiSpec().m61339v();
            if (m61339v != null) {
                return str + ((Object) m61339v.getText()) + "\n";
            }
            return str;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return msgContentTalkText;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow, com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public Rect getPhotoCoords() {
        if (getCurrentUiSpec().m61343z()) {
            Rect rect = new Rect();
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            rect.left = iArr[0] + getCurrentUiSpec().m61298G().x;
            rect.top = (iArr[1] + getCurrentUiSpec().m61298G().y) - AbstractC23136l9.m118740q0(getContext());
            rect.right = rect.left + this.f57775I7.m76473l();
            rect.bottom = rect.top + this.f57775I7.m76472k();
            return rect;
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionX() {
        return 0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionY() {
        return 0;
    }

    public final Handler getUiHandler() {
        return this.f57779M7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: j3 */
    public boolean mo61075j3(MotionEvent motionEvent, int i11, float f11, float f12) {
        AbstractC19074t.m100208f(motionEvent, "event");
        if (i11 != 0) {
            if (i11 == 1) {
                if (this.f57781O7 && m61266B5(f11, f12) && this.f57769C7 == EnumC31105a.f143331r) {
                    m61243e5();
                    return true;
                }
                if (this.f57782P7 && m61267C5(f11, f12)) {
                    m61059f3();
                    return true;
                }
            }
        } else {
            boolean m61266B5 = m61266B5(f11, f12);
            this.f57781O7 = m61266B5;
            if (this.f57769C7 == EnumC31105a.f143336w) {
                boolean m61267C5 = m61267C5(f11, f12);
                this.f57782P7 = m61267C5;
                if (m61266B5 || m61267C5) {
                    return true;
                }
            } else if (m61266B5) {
                return true;
            }
        }
        if (super.mo61075j3(motionEvent, i11, f11, f12)) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: k0 */
    public int mo61076k0(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "message");
        int mo61076k0 = super.mo61076k0(c17945a0);
        EnumC31105a m61223L5 = m61223L5(c17945a0);
        if (m61223L5 == EnumC31105a.f143333t || m61223L5 == EnumC31105a.f143334u) {
            return mo61076k0 | 1;
        }
        return mo61076k0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: k4 */
    protected String mo61162k4(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "message");
        return null;
    }

    @Override // dj.C17945a0.x
    /* renamed from: m */
    public void mo61273m(int i11, MessageId messageId) {
        try {
            C17945a0 c17945a0 = this.f57263B;
            if (c17945a0 != null && c17945a0.m95135f9(messageId) && !this.f57779M7.hasMessages(1000, messageId)) {
                Handler handler = this.f57779M7;
                handler.sendMessage(handler.obtainMessage(1000, messageId));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // dj.C17945a0.x
    /* renamed from: s */
    public void mo61274s(MessageId messageId, String str, boolean z11) {
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: t0 */
    protected void mo61111t0(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        m61260w5(canvas);
        if (this.f57771E7) {
            m61256s5(canvas);
        }
        m61251n5(canvas);
        m61261x5(canvas);
        m61254q5(canvas);
        m61250m5(canvas);
        m61255r5(canvas);
        if (this.f57771E7) {
            m61258u5(canvas);
            m61257t5(canvas);
            m61259v5(canvas);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: w3 */
    public void mo61122w3() {
        super.mo61122w3();
        this.f57768B7 = null;
        this.f57769C7 = EnumC31105a.f143330q;
        this.f57770D7 = false;
        this.f57771E7 = false;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        C11356d c11356d = new C11356d(context);
        C17945a0 c17945a0 = this.f57263B;
        if (AbstractC19074t.m100204b(c17945a0, c17945a0)) {
            c11356d.m61313V(this.f57772F7.m61293B());
        }
        this.f57772F7 = c11356d;
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        C11357e c11357e = new C11357e(context2);
        C17945a0 c17945a02 = this.f57263B;
        if (AbstractC19074t.m100204b(c17945a02, c17945a02)) {
            c11357e.m61313V(this.f57773G7.m61293B());
        }
        this.f57773G7 = c11357e;
        this.f57774H7 = false;
        this.f57775I7.m76477r();
        this.f57776J7.setImageInfo(null);
    }
}
