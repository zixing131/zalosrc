package com.zing.zalo.p077ui.chat.chatrow;

import ag0.C0815e1;
import am.AbstractC0924m0;
import am.C0943w;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.social.controls.MentionSpan;
import com.zing.zalo.social.controls.MsgInfoSpan;
import com.zing.zalo.social.controls.SuggestionTimeSpan;
import com.zing.zalo.utils.phonenumbers.C16741a;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import dj.C17945a0;
import dj.C17979l1;
import en0.InterfaceC18494a;
import en0.InterfaceC18510q;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import i70.C20379a;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23214t;
import me0.AbstractC23217t2;
import me0.C23081g9;
import me0.C23212s8;
import nb0.C23675f;
import org.json.JSONException;
import org.json.JSONObject;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p363nh.C23744a;
import p461qu.AbstractC25495a;
import p620wt.AbstractC29233h;
import p620wt.InterfaceC29232g;
import p656xs.AbstractC30200a;
import p716zh.C31845ac;
import p716zh.C31890dc;
import p716zh.C31899e6;
import p716zh.C31944h6;
import p716zh.C31973j5;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import th.AbstractC26683d;
import vg.AbstractC28245z3;
import w50.C28769a;
import y50.C30791a;
import y50.C30792b;
import y50.C30795e;
import y50.InterfaceC30793c;

/* loaded from: classes5.dex */
public abstract class ChatRowHasCaption extends ChatRow implements InterfaceC30793c {

    /* renamed from: V6 */
    private String f57971V6;

    /* renamed from: W6 */
    private boolean f57972W6;

    /* renamed from: X6 */
    private boolean f57973X6;

    /* renamed from: Y6 */
    private boolean f57974Y6;

    /* renamed from: Z6 */
    private Layout f57975Z6;

    /* renamed from: a7 */
    private int f57976a7;

    /* renamed from: b7 */
    private int f57977b7;

    /* renamed from: c7 */
    private int f57978c7;

    /* renamed from: d7 */
    private CharSequence f57979d7;

    /* renamed from: e7 */
    private int f57980e7;

    /* renamed from: f7 */
    private boolean f57981f7;

    /* renamed from: g7 */
    private C31944h6.b f57982g7;

    /* renamed from: h7 */
    private boolean f57983h7;

    /* renamed from: i7 */
    private List f57984i7;

    /* renamed from: j7 */
    private boolean f57985j7;

    /* renamed from: k7 */
    private List f57986k7;

    /* renamed from: l7 */
    private boolean f57987l7;

    /* renamed from: m7 */
    private Object f57988m7;

    /* renamed from: n7 */
    private C31899e6 f57989n7;

    /* renamed from: o7 */
    private final InterfaceC24854k f57990o7;

    /* renamed from: p7 */
    private C30791a f57991p7;

    /* renamed from: q7 */
    private C30792b f57992q7;

    /* renamed from: r7 */
    private float f57993r7;

    /* renamed from: s7 */
    private float f57994s7;

    /* renamed from: t7 */
    private boolean f57995t7;

    /* renamed from: u7 */
    private final InterfaceC24854k f57996u7;

    /* renamed from: v7 */
    private boolean f57997v7;

    /* renamed from: w7 */
    private float f57998w7;

    /* renamed from: x7 */
    private long f57999x7;

    /* renamed from: y7 */
    private Rect f58000y7;
    public static final C11365c Companion = new C11365c(null);

    /* renamed from: z7 */
    private static final InterfaceC29232g f57970z7 = AbstractC29233h.m145990a(C11363a.f58001q);

    /* renamed from: A7 */
    private static final InterfaceC29232g f57969A7 = AbstractC29233h.m145990a(C11364b.f58002q);

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowHasCaption$a */
    /* loaded from: classes5.dex */
    static final class C11363a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11363a f58001q = new C11363a();

        C11363a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint mo12V4() {
            Paint paint = new Paint();
            paint.setColor(C23212s8.m119606n(AbstractC16781w.ChatLinkHighlightColor));
            return paint;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowHasCaption$b */
    /* loaded from: classes5.dex */
    static final class C11364b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11364b f58002q = new C11364b();

        C11364b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint mo12V4() {
            Paint paint = new Paint();
            paint.setColor(C23212s8.m119606n(AbstractC16781w.ChatSearchTextHighlightColor));
            return paint;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowHasCaption$c */
    /* loaded from: classes5.dex */
    public static final class C11365c {
        private C11365c() {
        }

        public /* synthetic */ C11365c(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final Paint m61433a() {
            return (Paint) ChatRowHasCaption.f57970z7.getValue();
        }

        /* renamed from: b */
        public final Paint m61434b() {
            return (Paint) ChatRowHasCaption.f57969A7.getValue();
        }

        /* renamed from: c */
        public final void m61435c() {
            ChatRowHasCaption.f57970z7.reset();
            ChatRowHasCaption.f57969A7.reset();
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowHasCaption$d */
    /* loaded from: classes5.dex */
    static final class C11366d extends AbstractC19075u implements InterfaceC18494a {
        C11366d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo12V4() {
            boolean z11;
            if (ChatRowHasCaption.this.mo61424b4() && ChatRowHasCaption.this.getDelegate().mo62101s4() == 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowHasCaption$e */
    /* loaded from: classes5.dex */
    public static final class C11367e implements InterfaceC30793c.a {

        /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowHasCaption$e$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC19075u implements InterfaceC18510q {

            /* renamed from: q */
            public static final a f58005q = new a();

            a() {
                super(3);
            }

            @Override // en0.InterfaceC18510q
            /* renamed from: Hr */
            public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
                return m61442a((C30791a) obj, ((Number) obj2).floatValue(), ((Number) obj3).floatValue());
            }

            /* renamed from: a */
            public final Boolean m61442a(C30791a c30791a, float f11, float f12) {
                AbstractC19074t.m100208f(c30791a, "controller");
                return Boolean.valueOf(c30791a.m149742b(f11, f12));
            }
        }

        /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowHasCaption$e$b */
        /* loaded from: classes5.dex */
        static final class b extends AbstractC19075u implements InterfaceC18510q {

            /* renamed from: q */
            final /* synthetic */ ChatRowHasCaption f58006q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(ChatRowHasCaption chatRowHasCaption) {
                super(3);
                this.f58006q = chatRowHasCaption;
            }

            @Override // en0.InterfaceC18510q
            /* renamed from: Hr */
            public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
                return m61443a((C30791a) obj, ((Number) obj2).floatValue(), ((Number) obj3).floatValue());
            }

            /* renamed from: a */
            public final Boolean m61443a(C30791a c30791a, float f11, float f12) {
                AbstractC19074t.m100208f(c30791a, "controller");
                return Boolean.valueOf(c30791a.m149743c(f11, f12, !this.f58006q.getDelegate().mo62039G3()));
            }
        }

        /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowHasCaption$e$c */
        /* loaded from: classes5.dex */
        static final class c extends AbstractC19075u implements InterfaceC18510q {

            /* renamed from: q */
            public static final c f58007q = new c();

            c() {
                super(3);
            }

            @Override // en0.InterfaceC18510q
            /* renamed from: Hr */
            public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
                return m61444a((C30791a) obj, ((Number) obj2).floatValue(), ((Number) obj3).floatValue());
            }

            /* renamed from: a */
            public final Boolean m61444a(C30791a c30791a, float f11, float f12) {
                AbstractC19074t.m100208f(c30791a, "controller");
                return Boolean.valueOf(c30791a.m149745e(f11, f12));
            }
        }

        /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowHasCaption$e$d */
        /* loaded from: classes5.dex */
        static final class d extends AbstractC19075u implements InterfaceC18510q {

            /* renamed from: q */
            public static final d f58008q = new d();

            d() {
                super(3);
            }

            @Override // en0.InterfaceC18510q
            /* renamed from: Hr */
            public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
                return m61445a((C30791a) obj, ((Number) obj2).floatValue(), ((Number) obj3).floatValue());
            }

            /* renamed from: a */
            public final Boolean m61445a(C30791a c30791a, float f11, float f12) {
                AbstractC19074t.m100208f(c30791a, "controller");
                return Boolean.valueOf(c30791a.m149746f());
            }
        }

        C11367e() {
        }

        /* renamed from: e */
        private final boolean m61437e(ViewGroup viewGroup, float f11, float f12, InterfaceC18510q interfaceC18510q) {
            C30791a c30791a = ChatRowHasCaption.this.f57991p7;
            if (c30791a != null) {
                ChatRowHasCaption chatRowHasCaption = ChatRowHasCaption.this;
                Rect rect = chatRowHasCaption.f58000y7;
                if (rect != null) {
                    try {
                        chatRowHasCaption.getDrawingRect(rect);
                        viewGroup.offsetDescendantRectToMyCoords(chatRowHasCaption, rect);
                        return ((Boolean) interfaceC18510q.mo45599Hr(c30791a, Float.valueOf((f11 - rect.left) - chatRowHasCaption.getTextPositionX()), Float.valueOf((f12 - rect.top) - chatRowHasCaption.getTextPositionY()))).booleanValue();
                    } catch (Exception e11) {
                        AbstractC20110a.f98889a.mo104552e(e11);
                    }
                }
            }
            return false;
        }

        @Override // y50.InterfaceC30793c.a
        /* renamed from: a */
        public boolean mo61438a(ViewGroup viewGroup, float f11, float f12) {
            AbstractC19074t.m100208f(viewGroup, "view");
            return m61437e(viewGroup, f11, f12, d.f58008q);
        }

        @Override // y50.InterfaceC30793c.a
        /* renamed from: b */
        public boolean mo61439b(ViewGroup viewGroup, float f11, float f12) {
            AbstractC19074t.m100208f(viewGroup, "view");
            return m61437e(viewGroup, f11, f12, c.f58007q);
        }

        @Override // y50.InterfaceC30793c.a
        /* renamed from: c */
        public boolean mo61440c(ViewGroup viewGroup, float f11, float f12) {
            AbstractC19074t.m100208f(viewGroup, "view");
            return m61437e(viewGroup, f11, f12, a.f58005q);
        }

        @Override // y50.InterfaceC30793c.a
        /* renamed from: d */
        public boolean mo61441d(ViewGroup viewGroup, float f11, float f12) {
            AbstractC19074t.m100208f(viewGroup, "view");
            return m61437e(viewGroup, f11, f12, new b(ChatRowHasCaption.this));
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowHasCaption$f */
    /* loaded from: classes5.dex */
    static final class C11368f extends AbstractC19075u implements InterfaceC18494a {
        C11368f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(ViewConfiguration.get(ChatRowHasCaption.this.getContext()).getScaledTouchSlop());
        }
    }

    public ChatRowHasCaption(Context context) {
        super(context);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(new C11366d());
        this.f57990o7 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C11368f());
        this.f57996u7 = m129210a2;
        this.f57998w7 = 1.0f;
    }

    /* renamed from: c4 */
    private final List m61408c4() {
        C28769a c28769a = this.f57269C;
        if (c28769a == null) {
            return null;
        }
        if (!this.f57985j7 || this.f57986k7 != c28769a.f133328x) {
            this.f57985j7 = true;
            ArrayList arrayList = c28769a.f133328x;
            this.f57986k7 = arrayList;
            this.f57984i7 = mo61270a4(arrayList);
        }
        return this.f57984i7;
    }

    /* renamed from: d4 */
    private final void m61409d4() {
        this.f57991p7 = null;
        this.f57992q7 = null;
        this.f58000y7 = null;
        getDelegate().setMoveTextSelectHandleController(null);
        getDelegate().setOnFirstReleaseAfterSelectingNewTextListener(null);
        getDelegate().mo62087i1();
        invalidate();
    }

    /* renamed from: e4 */
    private final C11367e m61410e4() {
        return new C11367e();
    }

    private final boolean getCanSupportSelectTextInContextMenu() {
        return ((Boolean) this.f57990o7.getValue()).booleanValue();
    }

    private final int getTouchSlop() {
        return ((Number) this.f57996u7.getValue()).intValue();
    }

    /* renamed from: i4 */
    private final int m61411i4(Layout layout) {
        int i11 = this.f57980e7;
        if (i11 != -1) {
            return i11;
        }
        return layout.getText().length();
    }

    /* renamed from: o4 */
    private final boolean m61412o4(float f11, float f12) {
        Layout layout;
        try {
            this.f57988m7 = null;
            layout = this.f57975Z6;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (layout != null && (layout.getText() instanceof Spanned)) {
            CharSequence text = layout.getText();
            AbstractC19074t.m100206d(text, "null cannot be cast to non-null type android.text.Spanned");
            Spanned spanned = (Spanned) text;
            int textPositionX = getTextPositionX();
            int textPositionY = getTextPositionY();
            int i11 = this.f57977b7 + textPositionX;
            int i12 = this.f57978c7 + textPositionY;
            if (getTextPositionX() >= 0 && textPositionY >= 0 && f12 >= textPositionY && f12 <= i12) {
                float f13 = textPositionX;
                if (f11 >= f13 && f11 <= i11) {
                    int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(((int) f12) - textPositionY), f11 - f13);
                    MsgInfoSpan[] msgInfoSpanArr = (MsgInfoSpan[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, MsgInfoSpan.class);
                    if (msgInfoSpanArr != null && msgInfoSpanArr.length != 0) {
                        MsgInfoSpan msgInfoSpan = msgInfoSpanArr[0];
                        this.f57988m7 = msgInfoSpan;
                        String m56340d = msgInfoSpan.m56340d();
                        if (m56340d != null && m56340d.length() != 0) {
                            int spanStart = spanned.getSpanStart(msgInfoSpan);
                            int spanEnd = spanned.getSpanEnd(msgInfoSpan);
                            C31899e6 c31899e6 = new C31899e6();
                            c31899e6.m153286b(layout, spanStart);
                            this.f57989n7 = c31899e6;
                            layout.getSelectionPath(spanStart, spanEnd, c31899e6);
                            return true;
                        }
                    }
                    MentionSpan[] mentionSpanArr = (MentionSpan[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, MentionSpan.class);
                    if (mentionSpanArr != null && mentionSpanArr.length != 0) {
                        MentionSpan mentionSpan = mentionSpanArr[0];
                        if (mentionSpan.f54785p == 0) {
                            this.f57988m7 = mentionSpan;
                            int spanStart2 = spanned.getSpanStart(mentionSpan);
                            int spanEnd2 = spanned.getSpanEnd(mentionSpan);
                            C31899e6 c31899e62 = new C31899e6();
                            c31899e62.m153286b(layout, spanStart2);
                            this.f57989n7 = c31899e62;
                            layout.getSelectionPath(spanStart2, spanEnd2, c31899e62);
                            return true;
                        }
                    }
                    SuggestionTimeSpan[] suggestionTimeSpanArr = (SuggestionTimeSpan[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, SuggestionTimeSpan.class);
                    if (suggestionTimeSpanArr != null && suggestionTimeSpanArr.length != 0) {
                        SuggestionTimeSpan suggestionTimeSpan = suggestionTimeSpanArr[0];
                        this.f57988m7 = suggestionTimeSpan;
                        int spanStart3 = spanned.getSpanStart(suggestionTimeSpan);
                        int spanEnd3 = spanned.getSpanEnd(suggestionTimeSpan);
                        C31899e6 c31899e63 = new C31899e6();
                        c31899e63.m153286b(layout, spanStart3);
                        this.f57989n7 = c31899e63;
                        layout.getSelectionPath(spanStart3, spanEnd3, c31899e63);
                        return true;
                    }
                    C23675f[] c23675fArr = (C23675f[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, C23675f.class);
                    if (c23675fArr != null && c23675fArr.length != 0) {
                        C23675f c23675f = c23675fArr[0];
                        this.f57988m7 = c23675f;
                        int spanStart4 = spanned.getSpanStart(c23675f);
                        int spanEnd4 = spanned.getSpanEnd(c23675f);
                        C31899e6 c31899e64 = new C31899e6();
                        c31899e64.m153286b(layout, spanStart4);
                        this.f57989n7 = c31899e64;
                        layout.getSelectionPath(spanStart4, spanEnd4, c31899e64);
                        return true;
                    }
                    URLSpan[] uRLSpanArr = (URLSpan[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, URLSpan.class);
                    if (uRLSpanArr != null && uRLSpanArr.length != 0) {
                        URLSpan uRLSpan = uRLSpanArr[0];
                        this.f57988m7 = uRLSpan;
                        int spanStart5 = spanned.getSpanStart(uRLSpan);
                        int spanEnd5 = spanned.getSpanEnd(uRLSpan);
                        C31899e6 c31899e65 = new C31899e6();
                        c31899e65.m153286b(layout, spanStart5);
                        this.f57989n7 = c31899e65;
                        layout.getSelectionPath(spanStart5, spanEnd5, c31899e65);
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: q4 */
    private final void m61413q4() {
        Object obj = this.f57988m7;
        if (obj != null) {
            if (obj instanceof MsgInfoSpan) {
                MsgInfoSpan msgInfoSpan = (MsgInfoSpan) obj;
                getDelegate().mo62100r4(msgInfoSpan.m56340d(), msgInfoSpan.m56338b(), this.f57263B.m95029V3().m41046j());
                m61419w4(msgInfoSpan.f54798w);
                m61420x4(msgInfoSpan.m56338b());
                return;
            }
            if (obj instanceof MentionSpan) {
                getDelegate().mo62108z4(String.valueOf(((MentionSpan) obj).f54788s));
                AbstractC23647d.m123897g("10003210");
                return;
            }
            if (obj instanceof C23675f) {
                getDelegate().mo62062R3(this);
                return;
            }
            if (obj instanceof SuggestionTimeSpan) {
                String str = ((SuggestionTimeSpan) obj).f54804t;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("openTimePicker", 0);
                    jSONObject.put("stringTimeSuggestion", str);
                    getDelegate().mo62076b4("action.set.reminder.msg", jSONObject.toString(), this.f57263B.m95041W4(), this.f57263B);
                    return;
                } catch (JSONException e11) {
                    e11.printStackTrace();
                    return;
                }
            }
            if (obj instanceof URLSpan) {
                URLSpan uRLSpan = (URLSpan) obj;
                String url = uRLSpan.getURL();
                AbstractC19074t.m100205c(url);
                String m153548n = C31944h6.m153548n(url);
                if (m153548n.length() > 0) {
                    getDelegate().mo62051K4(this, m153548n);
                } else if (url.length() != 0 && C16741a.m89329r().m89334E(url, AbstractC23309i.m121704a5())) {
                    getDelegate().mo62090j4(this, uRLSpan);
                } else {
                    uRLSpan.onClick(this);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r4 */
    public static final void m61414r4(ChatRowHasCaption chatRowHasCaption) {
        AbstractC19074t.m100208f(chatRowHasCaption, "this$0");
        chatRowHasCaption.m61418v4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s4 */
    public static final void m61415s4(C17979l1 c17979l1, C17945a0 c17945a0, int i11, String str, C31890dc c31890dc) {
        AbstractC19074t.m100208f(c17979l1, "$it");
        AbstractC19074t.m100208f(c17945a0, "$message");
        if (c31890dc != null) {
            try {
                if (c17979l1.f91065h == c31890dc.f146495a) {
                    c17979l1.f91066i = c31890dc;
                    c17945a0.m95123e9();
                    C23744a.Companion.m124119a().m124116d(4, c17945a0.mo95039W2());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: t4 */
    private final void m61416t4(C17945a0 c17945a0, Layout layout, boolean z11) {
        try {
            if (AbstractC26683d.f126393l && c17945a0 != null && layout != null) {
                if (z11) {
                    AbstractC28245z3.m142219b(layout.getText(), this);
                } else {
                    AbstractC28245z3.m142218a(layout.getText(), this);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: u4 */
    private final void m61417u4() {
        Layout layout = this.f57975Z6;
        if (layout != null) {
            C30795e c30795e = new C30795e(layout);
            int m61411i4 = m61411i4(layout);
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            this.f57992q7 = new C30792b(context, c30795e);
            C30791a c30791a = new C30791a(this);
            c30791a.m149744d(c30795e, m61411i4);
            this.f57991p7 = c30791a;
            this.f58000y7 = new Rect();
        }
    }

    /* renamed from: v4 */
    private final void m61418v4() {
        this.f57998w7 = 0.0f;
        this.f57999x7 = SystemClock.elapsedRealtime();
        invalidate();
    }

    /* renamed from: w4 */
    private final void m61419w4(int i11) {
        if (i11 == 16) {
            C0815e1.m2075D().m2100V(new C23648e(61, "message_info", 0, "hide_mem_list_intro_tap", new String[0]), true);
        }
    }

    /* renamed from: x4 */
    private final void m61420x4(String str) {
        String str2;
        if (str.length() > 0) {
            int i11 = 1;
            if (AbstractC19074t.m100204b(str, AbstractC23306f.m120583H().m110204g().m116315g())) {
                C31973j5 m4472f = C0943w.f3447a.m4472f(AbstractC25495a.m132088m(this.f57263B.mo95039W2()));
                if (m4472f != null && m4472f.m153778p0()) {
                    str2 = "ow";
                } else if (m4472f != null && m4472f.m153743U()) {
                    str2 = "ad";
                } else {
                    str2 = "mem";
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("member_role", str2);
                C20379a.f100400a.m106159a("message_info", 0, "community_info", jSONObject.toString());
                return;
            }
            if (TextUtils.equals(new JSONObject(str).optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, ""), AbstractC30200a.m148943b())) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("gid", AbstractC25495a.m132088m(this.f57263B.mo95039W2()));
                if (AbstractC0924m0.m3675b() != 1) {
                    i11 = 0;
                }
                jSONObject2.put("ekyc_status", i11);
                C20379a.f100400a.m106159a("message_info", 0, "upgrade_to_community", jSONObject2.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: A3 */
    public void mo60947A3() {
        super.mo60947A3();
        this.f57987l7 = false;
        this.f57988m7 = null;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C3 */
    public void mo60953C3(final C17945a0 c17945a0, C28769a c28769a, boolean z11) {
        boolean z12;
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(c28769a, "chatBubbleData");
        super.mo60953C3(c17945a0, c28769a, z11);
        String mo61162k4 = mo61162k4(c17945a0);
        this.f57971V6 = mo61162k4;
        if (mo61162k4 != null && mo61162k4.length() != 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.f57972W6 = !z12;
        this.f57973X6 = mo61430p4(getDelegate().mo62101s4(), c17945a0);
        final C17979l1 m95051X3 = c17945a0.m95051X3();
        if (m95051X3 != null && m95051X3.m95622d() && m95051X3.f91066i == null) {
            C31845ac.m152996J().m153057o0(m95051X3.f91065h, new C31845ac.e() { // from class: com.zing.zalo.ui.chat.chatrow.e0
                @Override // p716zh.C31845ac.e
                /* renamed from: a */
                public final void mo39491a(int i11, String str, C31890dc c31890dc) {
                    ChatRowHasCaption.m61415s4(C17979l1.this, c17945a0, i11, str, c31890dc);
                }
            });
        }
    }

    @Override // y50.InterfaceC30793c
    /* renamed from: G3 */
    public boolean mo61421G3() {
        return getDelegate().mo62039G3();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: I3 */
    public void mo60975I3(C17945a0 c17945a0, C28769a c28769a, int i11) {
        C30791a c30791a;
        int i12;
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(c28769a, "chatBubbleData");
        super.mo60975I3(c17945a0, c28769a, i11);
        if (mo61163l4()) {
            AbstractC23214t.a mo61199h4 = mo61199h4(c17945a0, this.f57971V6, mo61198j4(i11), this.f57973X6);
            if (mo61199h4 != null) {
                StaticLayout staticLayout = mo61199h4.f112484c;
                this.f57975Z6 = staticLayout;
                this.f57979d7 = mo61199h4.f112482a;
                this.f57980e7 = mo61199h4.f112489h;
                this.f57981f7 = mo61199h4.f112488g;
                this.f57976a7 = (int) mo61199h4.f112487f;
                this.f57977b7 = mo61199h4.f112485d;
                boolean z11 = false;
                if (staticLayout != null) {
                    i12 = staticLayout.getHeight();
                } else {
                    i12 = 0;
                }
                this.f57978c7 = i12;
                C31944h6.b bVar = mo61199h4.f112490i;
                this.f57982g7 = bVar;
                if (bVar != null) {
                    if (bVar.f146792e == 1 && bVar.f146793f) {
                        z11 = true;
                    }
                    bVar.f146793f = z11;
                }
            }
            Layout layout = this.f57975Z6;
            if (layout != null && (c30791a = this.f57991p7) != null) {
                C30795e c30795e = new C30795e(layout);
                int m61411i4 = m61411i4(layout);
                C30792b c30792b = this.f57992q7;
                if (c30792b != null) {
                    c30792b.m149755f(c30795e);
                }
                c30791a.m149744d(c30795e, m61411i4);
            }
        }
    }

    @Override // y50.InterfaceC30793c
    /* renamed from: K0 */
    public void mo61422K0(InterfaceC30793c.b bVar) {
        AbstractC19074t.m100208f(bVar, "content");
        C30792b c30792b = this.f57992q7;
        if (c30792b != null) {
            bVar.m149772p(this);
            bVar.m149765i(getTextPositionX());
            bVar.m149766j(getTextPositionY());
            c30792b.m149756i(bVar.m149761e(), bVar.m149760d());
            invalidate();
            C23081g9.m118410g(30L);
            setOnFirstReleaseAfterSelectingNewTextListener(new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.f0
                @Override // java.lang.Runnable
                public final void run() {
                    ChatRowHasCaption.m61414r4(ChatRowHasCaption.this);
                }
            });
            setMoveTextSelectHandleController(m61410e4());
        }
        getDelegate().mo62048K0(bVar);
    }

    @Override // y50.InterfaceC30793c
    /* renamed from: K2 */
    public void mo61423K2(InterfaceC30793c.b bVar) {
        AbstractC19074t.m100208f(bVar, "content");
        C30792b c30792b = this.f57992q7;
        if (c30792b != null) {
            c30792b.m149756i(bVar.m149761e(), bVar.m149760d());
            invalidate();
        }
        getDelegate().mo62049K2(bVar);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Y2 */
    public void mo61036Y2(C17945a0 c17945a0, C28769a c28769a) {
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(c28769a, "chatBubbleData");
        super.mo61036Y2(c17945a0, c28769a);
        m61416t4(c17945a0, this.f57975Z6, getDelegate().mo62077c());
    }

    /* renamed from: a4 */
    public List mo61270a4(List list) {
        int length;
        try {
            Layout layout = this.f57975Z6;
            CharSequence charSequence = this.f57979d7;
            List list2 = list;
            if (list2 != null && !list2.isEmpty() && charSequence != null && charSequence.length() != 0 && layout != null && getTextPositionX() >= 0) {
                if (this.f57973X6 || (length = this.f57980e7) <= 0) {
                    length = charSequence.length();
                }
                ArrayList m119662n = AbstractC23217t2.m119662n(charSequence.toString(), list);
                if (m119662n != null && (!m119662n.isEmpty())) {
                    return AbstractC23214t.m119614a(m119662n, layout, length, getTextPositionX() - this.f57976a7, getTextPositionY());
                }
                return null;
            }
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: b4 */
    protected boolean mo61424b4() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: c0 */
    public boolean mo61046c0(C17945a0 c17945a0, C28769a c28769a) {
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(c28769a, "chatBubbleData");
        if (super.mo61046c0(c17945a0, c28769a) || this.f57973X6 != mo61430p4(getDelegate().mo62101s4(), c17945a0)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: c3 */
    public void mo61049c3(Canvas canvas) {
        C31899e6 c31899e6;
        AbstractC19074t.m100208f(canvas, "canvas");
        super.mo61049c3(canvas);
        if (this.f57987l7 && (c31899e6 = this.f57989n7) != null) {
            canvas.save();
            canvas.translate(getTextPositionX(), getTextPositionY());
            canvas.drawPath(c31899e6, Companion.m61433a());
            canvas.restore();
        }
        C28769a c28769a = this.f57269C;
        if (c28769a != null && c28769a.f133314j) {
            List m61408c4 = m61408c4();
            this.f57984i7 = m61408c4;
            m61425f4(canvas, m61408c4);
        }
        C30792b c30792b = this.f57992q7;
        if (c30792b != null) {
            canvas.save();
            canvas.translate(getTextPositionX(), getTextPositionY());
            c30792b.m149754e(canvas);
            canvas.restore();
        }
    }

    /* renamed from: f4 */
    protected void m61425f4(Canvas canvas, List list) {
        AbstractC19074t.m100208f(canvas, "canvas");
        try {
            List list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    canvas.drawPath((Path) list.get(i11), Companion.m61434b());
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g4 */
    protected void m61426g4(Canvas canvas, int i11, int i12) {
        AbstractC19074t.m100208f(canvas, "canvas");
        Layout layout = this.f57975Z6;
        if (layout != null) {
            canvas.save();
            canvas.translate(i11, i12);
            try {
                layout.draw(canvas);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            canvas.restore();
        }
    }

    protected final C31944h6.b getDetectedLink() {
        return this.f57982g7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow, com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public int getJumpTargetY() {
        int i11 = 0;
        if (mo61124x1()) {
            List m61408c4 = m61408c4();
            if (m61408c4 != null) {
                if (!m61408c4.isEmpty()) {
                    i11 = ((C31899e6) m61408c4.get(0)).m153285a();
                }
            } else {
                m61408c4 = null;
            }
            this.f57984i7 = m61408c4;
        }
        return i11;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public String getMsgContentTalkText() {
        String msgContentTalkText = super.getMsgContentTalkText();
        AbstractC19074t.m100207e(msgContentTalkText, "getMsgContentTalkText(...)");
        try {
            Layout layout = this.f57975Z6;
            if (layout != null) {
                return msgContentTalkText + ((Object) layout.getText());
            }
            return msgContentTalkText;
        } catch (Exception e11) {
            e11.printStackTrace();
            return msgContentTalkText;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final CharSequence getProcessedText() {
        return this.f57979d7;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getTextHeight() {
        return this.f57978c7;
    }

    public final Layout getTextLayout() {
        return this.f57975Z6;
    }

    protected abstract int getTextPositionX();

    protected abstract int getTextPositionY();

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getTextWidth() {
        return this.f57977b7;
    }

    /* renamed from: h4 */
    protected AbstractC23214t.a mo61199h4(C17945a0 c17945a0, String str, int i11, boolean z11) {
        AbstractC19074t.m100208f(c17945a0, "message");
        if (i11 > 0 && str != null && str.length() != 0) {
            return c17945a0.m94975P5(str, i11, z11);
        }
        return null;
    }

    @Override // y50.InterfaceC30793c
    /* renamed from: i1 */
    public void mo61427i1() {
        m61409d4();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0029, code lost:            if (r2 == false) goto L19;     */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: j3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo61075j3(MotionEvent motionEvent, int i11, float f11, float f12) {
        boolean z11;
        AbstractC19074t.m100208f(motionEvent, "event");
        if (i11 != 0) {
            if (i11 == 1 && this.f57987l7 && m61412o4(f11, f12)) {
                m61413q4();
            }
            if (!super.mo61075j3(motionEvent, i11, f11, f12)) {
                return false;
            }
        } else {
            if (this.f57981f7 && m61412o4(f11, f12)) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f57987l7 = z11;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j4 */
    public int mo61198j4(int i11) {
        return i11 - (ChatRow.f57203M5 * 2);
    }

    /* renamed from: k4 */
    protected abstract String mo61162k4(C17945a0 c17945a0);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l4 */
    public boolean mo61163l4() {
        return this.f57972W6;
    }

    /* renamed from: m4 */
    protected boolean m61428m4(float f11, float f12) {
        Layout layout = this.f57975Z6;
        if (layout == null) {
            return false;
        }
        int textPositionX = (int) (f11 - getTextPositionX());
        int textPositionY = (int) (f12 - getTextPositionY());
        if (textPositionX < 0 || textPositionX > layout.getWidth() || textPositionY < 0 || textPositionY > layout.getHeight()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow, com.zing.zalo.p077ui.chat.chatrow.ChatRowBase
    /* renamed from: n */
    public void mo61088n() {
        if (this.f57987l7 && (this.f57988m7 instanceof URLSpan)) {
            InterfaceC11530v delegate = getDelegate();
            Object obj = this.f57988m7;
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type android.text.style.URLSpan");
            delegate.mo62090j4(this, (URLSpan) obj);
            return;
        }
        if (this.f57997v7) {
            m61417u4();
            C30791a c30791a = this.f57991p7;
            if (c30791a != null) {
                c30791a.m149741a(this.f57993r7 - getTextPositionX(), this.f57994s7 - getTextPositionY());
                return;
            }
            return;
        }
        super.mo61088n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n4 */
    public final boolean m61429n4() {
        return this.f57983h7;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a7, code lost:            if (r2 == false) goto L56;     */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: o3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo61096o3(MotionEvent motionEvent, int i11, float f11, float f12) {
        boolean z11;
        boolean z12;
        boolean z13;
        AbstractC19074t.m100208f(motionEvent, "event");
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    if (Math.abs(motionEvent.getX() - this.f57993r7) <= getTouchSlop() && Math.abs(motionEvent.getY() - this.f57994s7) <= getTouchSlop()) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    if (!this.f57995t7 && z13) {
                        m61180l();
                        this.f57995t7 = true;
                    }
                }
            } else {
                if (this.f57987l7 && m61412o4(f11, f12)) {
                    m61413q4();
                } else if (this.f57991p7 != null && m61428m4(f11, f12) && !this.f57997v7 && !this.f57995t7) {
                    m61409d4();
                }
                return true;
            }
            if (!super.mo61096o3(motionEvent, i11, f11, f12)) {
                return false;
            }
            return true;
        }
        this.f57993r7 = f11;
        this.f57994s7 = f12;
        this.f57995t7 = false;
        if (this.f57981f7 && m61412o4(f11, f12) && (this.f57988m7 instanceof C23675f)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f57987l7 = z11;
        if (!z11) {
            this.f57988m7 = null;
        }
        if (this.f57991p7 == null && getCanSupportSelectTextInContextMenu() && m61428m4(f11, f12)) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f57997v7 = z12;
        if (z12) {
            m61181r();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m61416t4(this.f57263B, this.f57975Z6, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow, android.view.View
    public void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        if (this.f57998w7 < 1.0f) {
            this.f57998w7 = Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f57999x7)) / 200);
        }
        super.onDraw(canvas);
        if (this.f57998w7 < 1.0f) {
            invalidate();
        }
    }

    /* renamed from: p4 */
    protected boolean mo61430p4(int i11, C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "message");
        if (i11 == 3) {
            return this.f57974Y6;
        }
        if (i11 != 2 && !c17945a0.f90748u2) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: r0 */
    public void mo61107r0(Canvas canvas) {
        C30792b c30792b;
        AbstractC19074t.m100208f(canvas, "canvas");
        super.mo61107r0(canvas);
        if (mo61163l4()) {
            m61426g4(canvas, getTextPositionX() - this.f57976a7, getTextPositionY());
            if (mo61421G3() && (c30792b = this.f57992q7) != null) {
                canvas.save();
                canvas.translate(getTextPositionX(), getTextPositionY());
                c30792b.m149753d(canvas, this.f57998w7);
                canvas.restore();
            }
        }
    }

    protected final void setDetectedLink(C31944h6.b bVar) {
        this.f57982g7 = bVar;
    }

    protected final void setExactOneLink(boolean z11) {
        this.f57983h7 = z11;
    }

    public final void setFullTextInContextMenu(boolean z11) {
        this.f57974Y6 = z11;
    }

    @Override // y50.InterfaceC30793c
    public void setMoveTextSelectHandleController(InterfaceC30793c.a aVar) {
        getDelegate().setMoveTextSelectHandleController(aVar);
    }

    @Override // y50.InterfaceC30793c
    public void setOnFirstReleaseAfterSelectingNewTextListener(Runnable runnable) {
        getDelegate().setOnFirstReleaseAfterSelectingNewTextListener(runnable);
    }

    protected final void setProcessedText(CharSequence charSequence) {
        this.f57979d7 = charSequence;
    }

    protected final void setTextHeight(int i11) {
        this.f57978c7 = i11;
    }

    protected final void setTextWidth(int i11) {
        this.f57977b7 = i11;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: w3 */
    public void mo61122w3() {
        super.mo61122w3();
        this.f57971V6 = "";
        this.f57975Z6 = null;
        this.f57976a7 = 0;
        this.f57977b7 = 0;
        this.f57978c7 = 0;
        this.f57985j7 = false;
        this.f57984i7 = null;
        this.f57979d7 = null;
        this.f57980e7 = -1;
        this.f57982g7 = null;
        this.f57983h7 = false;
    }
}
