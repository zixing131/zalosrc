package com.zing.zalo.adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7211t;
import com.zing.zalo.control.C7904b;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collections;
import me0.AbstractC23136l9;
import me0.AbstractC23268y2;
import me0.C23212s8;
import me0.C23278z2;
import org.json.JSONObject;
import p354n3.C23528a;
import p471r3.C25630b;
import p588vw.C28644j;
import p588vw.C28652r;
import vg.C28020b3;
import zc0.AbstractC31783a;
import zc0.InterfaceC31785c;
import zc0.InterfaceC31786d;

/* renamed from: com.zing.zalo.adapters.t */
/* loaded from: classes3.dex */
public final class C7211t extends AbstractC31783a {

    /* renamed from: r */
    private final Context f39546r;

    /* renamed from: s */
    private LayoutInflater f39547s;

    /* renamed from: t */
    private C23528a f39548t;

    /* renamed from: u */
    private InterfaceC31786d f39549u;

    /* renamed from: v */
    private d f39550v;

    /* renamed from: w */
    private final ArrayList f39551w;

    /* renamed from: com.zing.zalo.adapters.t$a */
    /* loaded from: classes3.dex */
    public static class a {
        public static final C32700a Companion = new C32700a(null);

        /* renamed from: a */
        private int f39552a;

        /* renamed from: b */
        private boolean f39553b = true;

        /* renamed from: com.zing.zalo.adapters.t$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C32700a {
            private C32700a() {
            }

            public /* synthetic */ C32700a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        public a(int i11) {
            this.f39552a = i11;
        }

        /* renamed from: a */
        public final int m36697a() {
            return this.f39552a;
        }

        /* renamed from: b */
        public final boolean m36698b() {
            return this.f39553b;
        }
    }

    /* renamed from: com.zing.zalo.adapters.t$b */
    /* loaded from: classes3.dex */
    public static final class b extends a {

        /* renamed from: c */
        private C7904b f39554c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C7904b c7904b) {
            super(0);
            AbstractC19074t.m100208f(c7904b, "topicInfo");
            this.f39554c = c7904b;
        }

        /* renamed from: c */
        public final C7904b m36699c() {
            return this.f39554c;
        }
    }

    /* renamed from: com.zing.zalo.adapters.t$c */
    /* loaded from: classes3.dex */
    public final class c extends RecyclerView.AbstractC1876c0 implements InterfaceC31785c {

        /* renamed from: I */
        private c f39555I;

        /* renamed from: J */
        private View f39556J;

        /* renamed from: K */
        private ImageView f39557K;

        /* renamed from: L */
        private ImageView f39558L;

        /* renamed from: M */
        private RobotoTextView f39559M;

        /* renamed from: N */
        private RecyclingImageView f39560N;

        /* renamed from: O */
        private ImageView f39561O;

        /* renamed from: P */
        private View f39562P;

        /* renamed from: Q */
        final /* synthetic */ C7211t f39563Q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(final C7211t c7211t, View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
            this.f39563Q = c7211t;
            this.f39555I = this;
            View findViewById = view.findViewById(AbstractC6918a0.main_container);
            AbstractC19074t.m100206d(findViewById, "null cannot be cast to non-null type android.view.View");
            this.f39556J = findViewById;
            View findViewById2 = view.findViewById(AbstractC6918a0.ic_drag_handle);
            AbstractC19074t.m100206d(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
            ImageView imageView = (ImageView) findViewById2;
            this.f39557K = imageView;
            imageView.setOnTouchListener(new View.OnTouchListener() { // from class: com.zing.zalo.adapters.u
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    boolean m36704m0;
                    m36704m0 = C7211t.c.m36704m0(C7211t.this, this, view2, motionEvent);
                    return m36704m0;
                }
            });
            view.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C7211t.c.m36705n0(C7211t.this, this, view2);
                }
            });
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.zing.zalo.adapters.w
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    boolean m36706o0;
                    m36706o0 = C7211t.c.m36706o0(C7211t.this, this, view2);
                    return m36706o0;
                }
            });
            View findViewById3 = view.findViewById(AbstractC6918a0.ic_board_type);
            AbstractC19074t.m100207e(findViewById3, "findViewById(...)");
            this.f39558L = (ImageView) findViewById3;
            View findViewById4 = view.findViewById(AbstractC6918a0.tv_title);
            AbstractC19074t.m100207e(findViewById4, "findViewById(...)");
            this.f39559M = (RobotoTextView) findViewById4;
            View findViewById5 = view.findViewById(AbstractC6918a0.thumb_image);
            AbstractC19074t.m100207e(findViewById5, "findViewById(...)");
            this.f39560N = (RecyclingImageView) findViewById5;
            View findViewById6 = view.findViewById(AbstractC6918a0.ic_remove);
            AbstractC19074t.m100207e(findViewById6, "findViewById(...)");
            ImageView imageView2 = (ImageView) findViewById6;
            this.f39561O = imageView2;
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C7211t.c.m36707p0(C7211t.this, this, view2);
                }
            });
            View findViewById7 = view.findViewById(AbstractC6918a0.btm_separator_line);
            AbstractC19074t.m100207e(findViewById7, "findViewById(...)");
            this.f39562P = findViewById7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m0 */
        public static final boolean m36704m0(C7211t c7211t, c cVar, View view, MotionEvent motionEvent) {
            AbstractC19074t.m100208f(c7211t, "this$0");
            AbstractC19074t.m100208f(cVar, "this$1");
            if (motionEvent != null && motionEvent.getAction() == 0 && c7211t.m36694R() != null) {
                InterfaceC31786d m36694R = c7211t.m36694R();
                AbstractC19074t.m100205c(m36694R);
                m36694R.mo79463c(cVar.f39555I);
                return false;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n0 */
        public static final void m36705n0(C7211t c7211t, c cVar, View view) {
            AbstractC19074t.m100208f(c7211t, "this$0");
            AbstractC19074t.m100208f(cVar, "this$1");
            b bVar = (b) c7211t.m36692Q(cVar.f39555I.m9929A());
            if (bVar != null && c7211t.m36695S() != null) {
                d m36695S = c7211t.m36695S();
                AbstractC19074t.m100205c(m36695S);
                m36695S.mo36712a(bVar.m36699c().f42715C, bVar.m36699c().f42729a);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o0 */
        public static final boolean m36706o0(C7211t c7211t, c cVar, View view) {
            AbstractC19074t.m100208f(c7211t, "this$0");
            AbstractC19074t.m100208f(cVar, "this$1");
            if (c7211t.m36694R() != null) {
                InterfaceC31786d m36694R = c7211t.m36694R();
                AbstractC19074t.m100205c(m36694R);
                m36694R.mo79463c(cVar.f39555I);
                return false;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p0 */
        public static final void m36707p0(C7211t c7211t, c cVar, View view) {
            AbstractC19074t.m100208f(c7211t, "this$0");
            AbstractC19074t.m100208f(cVar, "this$1");
            b bVar = (b) c7211t.m36692Q(cVar.f39555I.m9929A());
            if (bVar != null && c7211t.m36695S() != null) {
                d m36695S = c7211t.m36695S();
                AbstractC19074t.m100205c(m36695S);
                m36695S.mo36713b(bVar.m36699c().f42715C, bVar.m36699c().f42729a);
            }
        }

        @Override // zc0.InterfaceC31785c
        /* renamed from: h */
        public void mo16604h() {
            this.f7784p.setBackgroundResource(AbstractC16803z.stencils_contact_bg);
        }

        @Override // zc0.InterfaceC31785c
        /* renamed from: m */
        public void mo16606m() {
            this.f7784p.setBackground(C23212s8.m119609q(this.f39563Q.m36693P(), AbstractC16781w.bg_sticker_arrange_dragging));
        }

        /* renamed from: q0 */
        public final View m36708q0() {
            return this.f39556J;
        }

        /* renamed from: r0 */
        public final ImageView m36709r0() {
            return this.f39558L;
        }

        /* renamed from: s0 */
        public final RecyclingImageView m36710s0() {
            return this.f39560N;
        }

        /* renamed from: t0 */
        public final RobotoTextView m36711t0() {
            return this.f39559M;
        }
    }

    /* renamed from: com.zing.zalo.adapters.t$d */
    /* loaded from: classes3.dex */
    public interface d {
        /* renamed from: a */
        void mo36712a(String str, int i11);

        /* renamed from: b */
        void mo36713b(String str, int i11);
    }

    public C7211t(Context context, d dVar, InterfaceC31786d interfaceC31786d) {
        AbstractC19074t.m100208f(context, "context");
        this.f39546r = context;
        Object systemService = context.getSystemService("layout_inflater");
        AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.f39547s = (LayoutInflater) systemService;
        this.f39548t = new C23528a(context);
        this.f39549u = interfaceC31786d;
        this.f39550v = dVar;
        this.f39551w = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public final a m36692Q(int i11) {
        if (i11 >= 0) {
            try {
                if (i11 < mo10003k()) {
                    return (a) this.f39551w.get(i11);
                }
                return null;
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012f A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:3:0x0005, B:5:0x000b, B:7:0x000f, B:9:0x0017, B:11:0x0028, B:12:0x004e, B:19:0x0060, B:20:0x00a6, B:27:0x00be, B:29:0x00c9, B:31:0x00cf, B:32:0x00d8, B:33:0x0129, B:35:0x012f, B:43:0x0145, B:44:0x0148, B:47:0x014d, B:49:0x015d, B:51:0x017c, B:53:0x0184, B:56:0x0188, B:58:0x0196, B:60:0x01a0, B:63:0x01aa, B:65:0x01bc, B:68:0x01c6, B:70:0x01ca, B:72:0x00d2, B:73:0x00dc, B:74:0x00f3, B:76:0x00fb, B:77:0x0108, B:78:0x0115, B:79:0x0069, B:80:0x0072, B:81:0x007b, B:82:0x0084, B:83:0x008d, B:85:0x0095, B:86:0x009e, B:87:0x003d), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ca A[Catch: Exception -> 0x003a, TRY_LEAVE, TryCatch #0 {Exception -> 0x003a, blocks: (B:3:0x0005, B:5:0x000b, B:7:0x000f, B:9:0x0017, B:11:0x0028, B:12:0x004e, B:19:0x0060, B:20:0x00a6, B:27:0x00be, B:29:0x00c9, B:31:0x00cf, B:32:0x00d8, B:33:0x0129, B:35:0x012f, B:43:0x0145, B:44:0x0148, B:47:0x014d, B:49:0x015d, B:51:0x017c, B:53:0x0184, B:56:0x0188, B:58:0x0196, B:60:0x01a0, B:63:0x01aa, B:65:0x01bc, B:68:0x01c6, B:70:0x01ca, B:72:0x00d2, B:73:0x00dc, B:74:0x00f3, B:76:0x00fb, B:77:0x0108, B:78:0x0115, B:79:0x0069, B:80:0x0072, B:81:0x007b, B:82:0x0084, B:83:0x008d, B:85:0x0095, B:86:0x009e, B:87:0x003d), top: B:2:0x0005 }] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        Drawable m118665N;
        int i12;
        String m118743r0;
        AbstractC19074t.m100208f(abstractC1876c0, "holder");
        try {
            if (mo10005m(i11) == 0 && (abstractC1876c0 instanceof c)) {
                a m36692Q = m36692Q(i11);
                if (m36692Q instanceof b) {
                    C7904b m36699c = ((b) m36692Q).m36699c();
                    if (((b) m36692Q).m36698b()) {
                        AbstractC23136l9.m118754v(abstractC1876c0.f7784p, true);
                        ((c) abstractC1876c0).m36708q0().setAlpha(1.0f);
                    } else {
                        AbstractC23136l9.m118754v(abstractC1876c0.f7784p, false);
                        ((c) abstractC1876c0).m36708q0().setAlpha(0.5f);
                    }
                    int i13 = m36699c.f42729a;
                    if (i13 != 0) {
                        if (i13 != 1) {
                            if (i13 != 2) {
                                if (i13 != 3) {
                                    if (i13 != 4) {
                                        if (i13 != 5) {
                                            m118665N = AbstractC23136l9.m118665N(this.f39546r, AbstractC16803z.ic_default_pin);
                                        } else {
                                            m118665N = AbstractC23136l9.m118665N(this.f39546r, AbstractC16803z.ic_pinned_album);
                                        }
                                    }
                                } else {
                                    m118665N = AbstractC23136l9.m118665N(this.f39546r, AbstractC16803z.ic_poll_color);
                                }
                            } else {
                                m118665N = AbstractC23136l9.m118665N(this.f39546r, AbstractC16803z.ic_message);
                            }
                        } else {
                            m118665N = AbstractC23136l9.m118665N(this.f39546r, AbstractC16803z.ic_note);
                        }
                        ((c) abstractC1876c0).m36709r0().setImageDrawable(m118665N);
                        i12 = m36699c.f42729a;
                        if (i12 != 0) {
                            if (i12 != 1) {
                                if (i12 != 2) {
                                    if (i12 != 3 && i12 != 4 && i12 != 5) {
                                        RobotoTextView m36711t0 = ((c) abstractC1876c0).m36711t0();
                                        String str = m36699c.f42736h;
                                        if (str != null && !TextUtils.isEmpty(str)) {
                                            m118743r0 = m36699c.f42736h;
                                        } else {
                                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_unsupported_pin_title);
                                        }
                                        m36711t0.setText(m118743r0);
                                    }
                                } else {
                                    ((c) abstractC1876c0).m36711t0().setText(C28652r.m143349v().m143357H(m36699c.m40773k()));
                                }
                            } else if (TextUtils.isEmpty(m36699c.f42716D)) {
                                ((c) abstractC1876c0).m36711t0().setText(m36699c.f42736h);
                            } else {
                                ((c) abstractC1876c0).m36711t0().setText(m36699c.f42716D);
                            }
                            if (m36699c.f42729a == 2) {
                                RecyclingImageView m36710s0 = ((c) abstractC1876c0).m36710s0();
                                int i14 = m36699c.f42746r;
                                if (i14 != 1) {
                                    if (i14 != 32 && i14 != 44 && i14 != 49) {
                                        switch (i14) {
                                            case 36:
                                                m36710s0.setVisibility(0);
                                                m36710s0.setImageResource(AbstractC16803z.no_image2);
                                                if (!TextUtils.isEmpty(m36699c.f42749u)) {
                                                    C25630b m143282P0 = C28644j.m143233Y().m143282P0(new C25630b(new JSONObject(m36699c.f42749u)));
                                                    AbstractC19074t.m100207e(m143282P0, "prepareStickerInfo(...)");
                                                    if (m143282P0.m132448z()) {
                                                        Bitmap m141206w = C28020b3.f130648a.m141206w(m143282P0);
                                                        if (m141206w != null) {
                                                            m36710s0.setImageBitmap(m141206w);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    C28020b3.m141166H(C28020b3.f130648a, m36710s0, this.f39548t, m143282P0, null, false, null, 28, null);
                                                    return;
                                                }
                                                String m40766d = m36699c.m40766d();
                                                if (!TextUtils.isEmpty(m40766d)) {
                                                    AbstractC23268y2.m120031e(this.f39548t, m36710s0, m40766d, C23278z2.m120122e());
                                                    return;
                                                }
                                                return;
                                            case 37:
                                            case 38:
                                                break;
                                            default:
                                                m36710s0.setVisibility(8);
                                                return;
                                        }
                                    }
                                    m36710s0.setVisibility(0);
                                    m36710s0.setImageResource(AbstractC16803z.no_image2);
                                    String m40766d2 = m36699c.m40766d();
                                    if (!TextUtils.isEmpty(m40766d2)) {
                                        AbstractC23268y2.m120031e(this.f39548t, m36710s0, m40766d2, C23278z2.m120122e());
                                        return;
                                    }
                                    return;
                                }
                                m36710s0.setVisibility(8);
                                return;
                            }
                            ((c) abstractC1876c0).m36710s0().setVisibility(8);
                            return;
                        }
                        ((c) abstractC1876c0).m36711t0().setText(C28652r.m143349v().m143357H(m36699c.f42754z));
                        if (m36699c.f42729a == 2) {
                        }
                    }
                    if (m36699c.f42732d > 0) {
                        m118665N = AbstractC23136l9.m118665N(this.f39546r, AbstractC16803z.ic_reminder);
                    } else {
                        m118665N = AbstractC23136l9.m118665N(this.f39546r, AbstractC16803z.ic_note);
                    }
                    ((c) abstractC1876c0).m36709r0().setImageDrawable(m118665N);
                    i12 = m36699c.f42729a;
                    if (i12 != 0) {
                    }
                    ((c) abstractC1876c0).m36711t0().setText(C28652r.m143349v().m143357H(m36699c.f42754z));
                    if (m36699c.f42729a == 2) {
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        View inflate = this.f39547s.inflate(AbstractC7409c0.edit_pin_board_item_row, viewGroup, false);
        AbstractC19074t.m100205c(inflate);
        return new c(this, inflate);
    }

    @Override // zc0.AbstractC31783a
    /* renamed from: L */
    public boolean mo16594L(int i11, int i12) {
        Collections.swap(this.f39551w, i11, i12);
        m10012t(i11, i12);
        return true;
    }

    @Override // zc0.AbstractC31783a
    /* renamed from: M */
    public boolean mo16595M(int i11, int i12) {
        InterfaceC31786d interfaceC31786d = this.f39549u;
        if (interfaceC31786d != null) {
            interfaceC31786d.mo79462b(i11, i12);
            return false;
        }
        return false;
    }

    @Override // zc0.AbstractC31783a
    /* renamed from: N */
    public void mo16596N() {
        InterfaceC31786d interfaceC31786d = this.f39549u;
        if (interfaceC31786d != null) {
            interfaceC31786d.mo79461a();
        }
    }

    /* renamed from: P */
    public final Context m36693P() {
        return this.f39546r;
    }

    /* renamed from: R */
    public final InterfaceC31786d m36694R() {
        return this.f39549u;
    }

    /* renamed from: S */
    public final d m36695S() {
        return this.f39550v;
    }

    /* renamed from: T */
    public final void m36696T(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "items");
        ArrayList arrayList2 = this.f39551w;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f39551w.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        try {
            a m36692Q = m36692Q(i11);
            if (m36692Q != null) {
                return m36692Q.m36697a();
            }
            return 0;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return 0;
        }
    }
}
