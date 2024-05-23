package p495rx;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.C7904b;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import me0.AbstractC23136l9;
import me0.AbstractC23268y2;
import me0.C23278z2;
import org.json.JSONObject;
import p354n3.C23528a;
import p471r3.C25630b;
import p588vw.C28644j;
import p588vw.C28652r;
import vg.C28020b3;

/* renamed from: rx.w */
/* loaded from: classes4.dex */
public final class C26009w extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private final Context f124094r;

    /* renamed from: s */
    private final LayoutInflater f124095s;

    /* renamed from: t */
    private final C23528a f124096t;

    /* renamed from: u */
    private final ArrayList f124097u;

    /* renamed from: v */
    private final a f124098v;

    /* renamed from: rx.w$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo85518a(C25988b c25988b);
    }

    /* renamed from: rx.w$b */
    /* loaded from: classes4.dex */
    public static class b {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private int f124099a;

        /* renamed from: rx.w$b$a */
        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        public b(int i11) {
            this.f124099a = i11;
        }

        /* renamed from: a */
        public final int m134042a() {
            return this.f124099a;
        }
    }

    /* renamed from: rx.w$c */
    /* loaded from: classes4.dex */
    public static final class c extends b {

        /* renamed from: b */
        private C7904b f124100b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C7904b c7904b) {
            super(0);
            AbstractC19074t.m100208f(c7904b, "topicInfo");
            this.f124100b = c7904b;
        }

        /* renamed from: b */
        public final C7904b m134043b() {
            return this.f124100b;
        }
    }

    /* renamed from: rx.w$d */
    /* loaded from: classes4.dex */
    private static final class d extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private ImageView f124101I;

        /* renamed from: J */
        private RobotoTextView f124102J;

        /* renamed from: K */
        private RecyclingImageView f124103K;

        /* renamed from: L */
        private ImageView f124104L;

        /* renamed from: M */
        private View f124105M;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
            View findViewById = view.findViewById(AbstractC6918a0.icn_topic_type);
            AbstractC19074t.m100207e(findViewById, "findViewById(...)");
            this.f124101I = (ImageView) findViewById;
            View findViewById2 = view.findViewById(AbstractC6918a0.tv_title);
            AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
            this.f124102J = (RobotoTextView) findViewById2;
            View findViewById3 = view.findViewById(AbstractC6918a0.thumb_image);
            AbstractC19074t.m100207e(findViewById3, "findViewById(...)");
            this.f124103K = (RecyclingImageView) findViewById3;
            View findViewById4 = view.findViewById(AbstractC6918a0.ic_remove);
            AbstractC19074t.m100207e(findViewById4, "findViewById(...)");
            this.f124104L = (ImageView) findViewById4;
            View findViewById5 = view.findViewById(AbstractC6918a0.btm_separator_line);
            AbstractC19074t.m100207e(findViewById5, "findViewById(...)");
            this.f124105M = findViewById5;
        }

        /* renamed from: i0 */
        public final View m134044i0() {
            return this.f124105M;
        }

        /* renamed from: j0 */
        public final ImageView m134045j0() {
            return this.f124104L;
        }

        /* renamed from: k0 */
        public final ImageView m134046k0() {
            return this.f124101I;
        }

        /* renamed from: l0 */
        public final RecyclingImageView m134047l0() {
            return this.f124103K;
        }

        /* renamed from: m0 */
        public final RobotoTextView m134048m0() {
            return this.f124102J;
        }
    }

    public C26009w(Context context, a aVar) {
        AbstractC19074t.m100208f(context, "context");
        this.f124094r = context;
        Object systemService = context.getSystemService("layout_inflater");
        AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.f124095s = (LayoutInflater) systemService;
        this.f124096t = new C23528a(context);
        this.f124097u = new ArrayList();
        this.f124098v = aVar;
    }

    /* renamed from: M */
    private final b m134039M(int i11) {
        if (i11 >= 0 && i11 < mo10003k()) {
            return (b) this.f124097u.get(i11);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public static final void m134040N(C26009w c26009w, C7904b c7904b, View view) {
        AbstractC19074t.m100208f(c26009w, "this$0");
        AbstractC19074t.m100208f(c7904b, "$topicInfo");
        a aVar = c26009w.f124098v;
        if (aVar != null) {
            String str = c7904b.f42715C;
            AbstractC19074t.m100207e(str, "id");
            aVar.mo85518a(new C25988b(str, c7904b.f42729a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0109 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:3:0x000b, B:5:0x0011, B:7:0x0015, B:9:0x001d, B:16:0x0036, B:17:0x007f, B:24:0x0097, B:26:0x00a2, B:28:0x00a8, B:29:0x00b1, B:30:0x0102, B:32:0x0109, B:40:0x0120, B:41:0x0123, B:42:0x01b1, B:44:0x01c7, B:47:0x01d1, B:49:0x0128, B:51:0x0138, B:53:0x0157, B:55:0x015f, B:56:0x0163, B:57:0x0173, B:59:0x017d, B:60:0x0187, B:62:0x0199, B:63:0x01a3, B:64:0x01a7, B:65:0x00ab, B:66:0x00b5, B:67:0x00cc, B:69:0x00d4, B:70:0x00e1, B:71:0x00ee, B:72:0x0042, B:73:0x004b, B:74:0x0054, B:75:0x005d, B:76:0x0066, B:78:0x006e, B:79:0x0077), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c7 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:3:0x000b, B:5:0x0011, B:7:0x0015, B:9:0x001d, B:16:0x0036, B:17:0x007f, B:24:0x0097, B:26:0x00a2, B:28:0x00a8, B:29:0x00b1, B:30:0x0102, B:32:0x0109, B:40:0x0120, B:41:0x0123, B:42:0x01b1, B:44:0x01c7, B:47:0x01d1, B:49:0x0128, B:51:0x0138, B:53:0x0157, B:55:0x015f, B:56:0x0163, B:57:0x0173, B:59:0x017d, B:60:0x0187, B:62:0x0199, B:63:0x01a3, B:64:0x01a7, B:65:0x00ab, B:66:0x00b5, B:67:0x00cc, B:69:0x00d4, B:70:0x00e1, B:71:0x00ee, B:72:0x0042, B:73:0x004b, B:74:0x0054, B:75:0x005d, B:76:0x0066, B:78:0x006e, B:79:0x0077), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d1 A[Catch: Exception -> 0x003f, TRY_LEAVE, TryCatch #0 {Exception -> 0x003f, blocks: (B:3:0x000b, B:5:0x0011, B:7:0x0015, B:9:0x001d, B:16:0x0036, B:17:0x007f, B:24:0x0097, B:26:0x00a2, B:28:0x00a8, B:29:0x00b1, B:30:0x0102, B:32:0x0109, B:40:0x0120, B:41:0x0123, B:42:0x01b1, B:44:0x01c7, B:47:0x01d1, B:49:0x0128, B:51:0x0138, B:53:0x0157, B:55:0x015f, B:56:0x0163, B:57:0x0173, B:59:0x017d, B:60:0x0187, B:62:0x0199, B:63:0x01a3, B:64:0x01a7, B:65:0x00ab, B:66:0x00b5, B:67:0x00cc, B:69:0x00d4, B:70:0x00e1, B:71:0x00ee, B:72:0x0042, B:73:0x004b, B:74:0x0054, B:75:0x005d, B:76:0x0066, B:78:0x006e, B:79:0x0077), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a7 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:3:0x000b, B:5:0x0011, B:7:0x0015, B:9:0x001d, B:16:0x0036, B:17:0x007f, B:24:0x0097, B:26:0x00a2, B:28:0x00a8, B:29:0x00b1, B:30:0x0102, B:32:0x0109, B:40:0x0120, B:41:0x0123, B:42:0x01b1, B:44:0x01c7, B:47:0x01d1, B:49:0x0128, B:51:0x0138, B:53:0x0157, B:55:0x015f, B:56:0x0163, B:57:0x0173, B:59:0x017d, B:60:0x0187, B:62:0x0199, B:63:0x01a3, B:64:0x01a7, B:65:0x00ab, B:66:0x00b5, B:67:0x00cc, B:69:0x00d4, B:70:0x00e1, B:71:0x00ee, B:72:0x0042, B:73:0x004b, B:74:0x0054, B:75:0x005d, B:76:0x0066, B:78:0x006e, B:79:0x0077), top: B:2:0x000b }] */
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
            if (mo10005m(i11) == 0 && (abstractC1876c0 instanceof d)) {
                b m134039M = m134039M(i11);
                if (m134039M instanceof c) {
                    final C7904b m134043b = ((c) m134039M).m134043b();
                    int i13 = m134043b.f42729a;
                    if (i13 != 0) {
                        if (i13 != 1) {
                            if (i13 != 2) {
                                if (i13 != 3) {
                                    if (i13 != 4) {
                                        if (i13 != 5) {
                                            m118665N = AbstractC23136l9.m118665N(this.f124094r, AbstractC16803z.ic_default_pin);
                                        } else {
                                            m118665N = AbstractC23136l9.m118665N(this.f124094r, AbstractC16803z.ic_pinned_album);
                                        }
                                    }
                                } else {
                                    m118665N = AbstractC23136l9.m118665N(this.f124094r, AbstractC16803z.ic_poll_color);
                                }
                            } else {
                                m118665N = AbstractC23136l9.m118665N(this.f124094r, AbstractC16803z.ic_message);
                            }
                        } else {
                            m118665N = AbstractC23136l9.m118665N(this.f124094r, AbstractC16803z.ic_note);
                        }
                        ((d) abstractC1876c0).m134046k0().setImageDrawable(m118665N);
                        i12 = m134043b.f42729a;
                        if (i12 != 0) {
                            if (i12 != 1) {
                                if (i12 != 2) {
                                    if (i12 != 3 && i12 != 4 && i12 != 5) {
                                        RobotoTextView m134048m0 = ((d) abstractC1876c0).m134048m0();
                                        String str = m134043b.f42736h;
                                        if (str != null && !TextUtils.isEmpty(str)) {
                                            m118743r0 = m134043b.f42736h;
                                        } else {
                                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_unsupported_pin_title);
                                        }
                                        m134048m0.setText(m118743r0);
                                    }
                                } else {
                                    ((d) abstractC1876c0).m134048m0().setText(C28652r.m143349v().m143357H(m134043b.m40773k()));
                                }
                            } else if (TextUtils.isEmpty(m134043b.f42716D)) {
                                ((d) abstractC1876c0).m134048m0().setText(m134043b.f42736h);
                            } else {
                                ((d) abstractC1876c0).m134048m0().setText(m134043b.f42716D);
                            }
                            if (m134043b.f42729a == 2) {
                                RecyclingImageView m134047l0 = ((d) abstractC1876c0).m134047l0();
                                int i14 = m134043b.f42746r;
                                if (i14 != 1) {
                                    if (i14 != 32 && i14 != 44 && i14 != 49) {
                                        switch (i14) {
                                            case 36:
                                                m134047l0.setVisibility(0);
                                                m134047l0.setImageResource(AbstractC16803z.no_image2);
                                                if (!TextUtils.isEmpty(m134043b.f42749u)) {
                                                    C25630b m143282P0 = C28644j.m143233Y().m143282P0(new C25630b(new JSONObject(m134043b.f42749u)));
                                                    AbstractC19074t.m100207e(m143282P0, "prepareStickerInfo(...)");
                                                    if (m143282P0.m132448z()) {
                                                        Bitmap m141206w = C28020b3.f130648a.m141206w(m143282P0);
                                                        if (m141206w != null) {
                                                            m134047l0.setImageBitmap(m141206w);
                                                            break;
                                                        }
                                                    } else {
                                                        C28020b3.m141166H(C28020b3.f130648a, m134047l0, this.f124096t, m143282P0, null, false, null, 28, null);
                                                        break;
                                                    }
                                                } else {
                                                    String m40766d = m134043b.m40766d();
                                                    if (!TextUtils.isEmpty(m40766d)) {
                                                        AbstractC23268y2.m120031e(this.f124096t, m134047l0, m40766d, C23278z2.m120122e());
                                                        break;
                                                    }
                                                }
                                                break;
                                            case 37:
                                            case 38:
                                                break;
                                            default:
                                                m134047l0.setVisibility(8);
                                                break;
                                        }
                                    }
                                    m134047l0.setVisibility(0);
                                    m134047l0.setImageResource(AbstractC16803z.no_image2);
                                    String m40766d2 = m134043b.m40766d();
                                    if (!TextUtils.isEmpty(m40766d2)) {
                                        AbstractC23268y2.m120031e(this.f124096t, m134047l0, m40766d2, C23278z2.m120122e());
                                    }
                                } else {
                                    m134047l0.setVisibility(8);
                                }
                            } else {
                                ((d) abstractC1876c0).m134047l0().setVisibility(8);
                            }
                            ((d) abstractC1876c0).m134045j0().setOnClickListener(new View.OnClickListener() { // from class: rx.v
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    C26009w.m134040N(C26009w.this, m134043b, view);
                                }
                            });
                            if (i11 == mo10003k() - 1) {
                                ((d) abstractC1876c0).m134044i0().setVisibility(8);
                                return;
                            } else {
                                ((d) abstractC1876c0).m134044i0().setVisibility(0);
                                return;
                            }
                        }
                        ((d) abstractC1876c0).m134048m0().setText(C28652r.m143349v().m143357H(m134043b.f42754z));
                        if (m134043b.f42729a == 2) {
                        }
                        ((d) abstractC1876c0).m134045j0().setOnClickListener(new View.OnClickListener() { // from class: rx.v
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C26009w.m134040N(C26009w.this, m134043b, view);
                            }
                        });
                        if (i11 == mo10003k() - 1) {
                        }
                    }
                    if (m134043b.f42732d > 0) {
                        m118665N = AbstractC23136l9.m118665N(this.f124094r, AbstractC16803z.ic_reminder);
                    } else {
                        m118665N = AbstractC23136l9.m118665N(this.f124094r, AbstractC16803z.ic_note);
                    }
                    ((d) abstractC1876c0).m134046k0().setImageDrawable(m118665N);
                    i12 = m134043b.f42729a;
                    if (i12 != 0) {
                    }
                    ((d) abstractC1876c0).m134048m0().setText(C28652r.m143349v().m143357H(m134043b.f42754z));
                    if (m134043b.f42729a == 2) {
                    }
                    ((d) abstractC1876c0).m134045j0().setOnClickListener(new View.OnClickListener() { // from class: rx.v
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C26009w.m134040N(C26009w.this, m134043b, view);
                        }
                    });
                    if (i11 == mo10003k() - 1) {
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
        if (i11 == 0) {
            View inflate = this.f124095s.inflate(AbstractC7409c0.unpin_topic_pin_board_item_layout, viewGroup, false);
            AbstractC19074t.m100205c(inflate);
            return new d(inflate);
        }
        throw new ClassCastException("Unknown viewType " + i11);
    }

    /* renamed from: O */
    public final void m134041O(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "items");
        ArrayList arrayList2 = this.f124097u;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f124097u.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        try {
            b m134039M = m134039M(i11);
            if (m134039M != null) {
                return m134039M.m134042a();
            }
            return 0;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return 0;
        }
    }
}
