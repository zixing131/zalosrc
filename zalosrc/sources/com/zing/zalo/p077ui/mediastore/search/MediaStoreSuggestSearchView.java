package com.zing.zalo.p077ui.mediastore.search;

import am.C0943w;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import ci.C3499e0;
import ci.C3518o;
import ci.C3521p0;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.mediastore.CreateMediaStoreParam;
import com.zing.zalo.dialog.datetimepicker.C8003a;
import com.zing.zalo.p077ui.mediastore.search.MediaStoreSuggestSearchView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.C23212s8;
import mu.C23446d;
import nu.C23938d;
import p227i3.C20218v;
import p262jb.AbstractC21196a;
import p348mi.AbstractC23306f;
import p461qu.AbstractC25495a;
import p649xl.C29905l5;
import p716zh.C31973j5;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* loaded from: classes6.dex */
public final class MediaStoreSuggestSearchView extends SlidableZaloView implements View.OnClickListener {
    public static final C12398a Companion = new C12398a(null);

    /* renamed from: P0 */
    private C29905l5 f64485P0;

    /* renamed from: V0 */
    private Date f64491V0;

    /* renamed from: W0 */
    private Date f64492W0;

    /* renamed from: X0 */
    private String f64493X0;

    /* renamed from: Y0 */
    private C3499e0 f64494Y0;

    /* renamed from: Z0 */
    private C31973j5 f64495Z0;

    /* renamed from: a1 */
    private InterfaceC12401d f64496a1;

    /* renamed from: b1 */
    private boolean f64497b1;

    /* renamed from: c1 */
    private boolean f64498c1;

    /* renamed from: d1 */
    private boolean f64499d1;

    /* renamed from: Q0 */
    private final ArrayList f64486Q0 = new ArrayList();

    /* renamed from: R0 */
    private final int f64487R0 = AbstractC23136l9.m118742r(16.0f);

    /* renamed from: S0 */
    private final int f64488S0 = AbstractC23136l9.m118742r(12.0f);

    /* renamed from: T0 */
    private final int f64489T0 = AbstractC23136l9.m118742r(48.0f);

    /* renamed from: U0 */
    private final int f64490U0 = AbstractC23136l9.m118742r(0.5f);

    /* renamed from: e1 */
    private EnumC12400c f64500e1 = EnumC12400c.f64504p;

    /* renamed from: com.zing.zalo.ui.mediastore.search.MediaStoreSuggestSearchView$a */
    /* loaded from: classes6.dex */
    public static final class C12398a {
        private C12398a() {
        }

        public /* synthetic */ C12398a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.search.MediaStoreSuggestSearchView$b */
    /* loaded from: classes6.dex */
    public static final class C12399b {

        /* renamed from: a */
        private int f64501a;

        /* renamed from: b */
        private String f64502b;

        /* renamed from: c */
        private String f64503c;

        public C12399b(int i11, String str, String str2) {
            AbstractC19074t.m100208f(str, "title");
            AbstractC19074t.m100208f(str2, "subTitle");
            this.f64501a = i11;
            this.f64502b = str;
            this.f64503c = str2;
        }

        /* renamed from: a */
        public final int m69677a() {
            return this.f64501a;
        }

        /* renamed from: b */
        public final String m69678b() {
            return this.f64503c;
        }

        /* renamed from: c */
        public final String m69679c() {
            return this.f64502b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12399b)) {
                return false;
            }
            C12399b c12399b = (C12399b) obj;
            return this.f64501a == c12399b.f64501a && AbstractC19074t.m100204b(this.f64502b, c12399b.f64502b) && AbstractC19074t.m100204b(this.f64503c, c12399b.f64503c);
        }

        public int hashCode() {
            return (((this.f64501a * 31) + this.f64502b.hashCode()) * 31) + this.f64503c.hashCode();
        }

        public String toString() {
            return "SuggestItem(id=" + this.f64501a + ", title=" + this.f64502b + ", subTitle=" + this.f64503c + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.ui.mediastore.search.MediaStoreSuggestSearchView$c */
    /* loaded from: classes6.dex */
    public static final class EnumC12400c {

        /* renamed from: p */
        public static final EnumC12400c f64504p = new EnumC12400c("MODE_TEXT", 0);

        /* renamed from: q */
        public static final EnumC12400c f64505q = new EnumC12400c("MODE_TIME", 1);

        /* renamed from: r */
        private static final /* synthetic */ EnumC12400c[] f64506r;

        /* renamed from: s */
        private static final /* synthetic */ InterfaceC30165a f64507s;

        static {
            EnumC12400c[] m69680b = m69680b();
            f64506r = m69680b;
            f64507s = AbstractC30166b.m148796a(m69680b);
        }

        private EnumC12400c(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC12400c[] m69680b() {
            return new EnumC12400c[]{f64504p, f64505q};
        }

        public static EnumC12400c valueOf(String str) {
            return (EnumC12400c) Enum.valueOf(EnumC12400c.class, str);
        }

        public static EnumC12400c[] values() {
            return (EnumC12400c[]) f64506r.clone();
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.search.MediaStoreSuggestSearchView$d */
    /* loaded from: classes6.dex */
    public interface InterfaceC12401d {
        /* renamed from: a */
        List mo69249a();

        /* renamed from: b */
        void mo69250b(C3518o c3518o);

        /* renamed from: c */
        void mo69251c();

        /* renamed from: d */
        void mo69252d(long j11, long j12, String str);

        /* renamed from: e */
        void mo69253e();

        /* renamed from: f */
        void mo69254f(boolean z11);
    }

    /* renamed from: com.zing.zalo.ui.mediastore.search.MediaStoreSuggestSearchView$e */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C12402e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f64508a;

        static {
            int[] iArr = new int[C3518o.b.values().length];
            try {
                iArr[C3518o.b.f14758r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C3518o.b.f14760t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C3518o.b.f14759s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f64508a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.search.MediaStoreSuggestSearchView$f */
    /* loaded from: classes6.dex */
    public static final class C12403f implements C8003a.b {
        C12403f() {
        }

        @Override // com.zing.zalo.dialog.datetimepicker.C8003a.b
        /* renamed from: a */
        public void mo43146a(Date date, boolean z11) {
            boolean z12;
            AbstractC19074t.m100208f(date, "date");
            C29905l5 c29905l5 = null;
            if (MediaStoreSuggestSearchView.this.f64497b1) {
                C29905l5 c29905l52 = MediaStoreSuggestSearchView.this.f64485P0;
                if (c29905l52 == null) {
                    AbstractC19074t.m100223u("viewBinding");
                    c29905l52 = null;
                }
                c29905l52.f138561t.setText(new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(date));
                MediaStoreSuggestSearchView.this.f64491V0 = date;
            } else if (MediaStoreSuggestSearchView.this.f64498c1) {
                C29905l5 c29905l53 = MediaStoreSuggestSearchView.this.f64485P0;
                if (c29905l53 == null) {
                    AbstractC19074t.m100223u("viewBinding");
                    c29905l53 = null;
                }
                c29905l53.f138564w.setText(new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(date));
                MediaStoreSuggestSearchView.this.f64492W0 = date;
            }
            C29905l5 c29905l54 = MediaStoreSuggestSearchView.this.f64485P0;
            if (c29905l54 == null) {
                AbstractC19074t.m100223u("viewBinding");
            } else {
                c29905l5 = c29905l54;
            }
            RobotoTextView robotoTextView = c29905l5.f138558q;
            if (MediaStoreSuggestSearchView.this.f64491V0 != null && MediaStoreSuggestSearchView.this.f64492W0 != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            robotoTextView.setEnabled(z12);
            MediaStoreSuggestSearchView.this.f64497b1 = false;
            MediaStoreSuggestSearchView.this.f64498c1 = false;
        }

        @Override // com.zing.zalo.dialog.datetimepicker.C8003a.b
        /* renamed from: b */
        public void mo43147b() {
            MediaStoreSuggestSearchView.this.f64497b1 = false;
            MediaStoreSuggestSearchView.this.f64498c1 = false;
        }
    }

    public MediaStoreSuggestSearchView() {
        m69670wM();
    }

    /* renamed from: AM */
    private final void m69652AM() {
        this.f64497b1 = true;
        Date m69665qM = m69665qM();
        Calendar calendar = Calendar.getInstance();
        Date date = this.f64492W0;
        if (date != null) {
            AbstractC19074t.m100205c(date);
            calendar.setTimeInMillis(date.getTime());
        }
        AbstractC23160o0.m119292t1(calendar);
        Date time = calendar.getTime();
        C8003a.a m43142f = new C8003a.a(this.f72421L0.m92649TI()).m43142f(m69666rM());
        Date date2 = this.f64491V0;
        if (date2 == null) {
            date2 = time;
        }
        m43142f.m43138b(date2).m43144h(m69665qM).m43143g(time).m43141e(false).m43145i(false).m43137a().m43136j();
    }

    /* renamed from: BM */
    private final void m69653BM() {
        Date m69665qM;
        this.f64498c1 = true;
        if (this.f64491V0 != null) {
            Calendar calendar = Calendar.getInstance();
            Date date = this.f64491V0;
            AbstractC19074t.m100205c(date);
            calendar.setTimeInMillis(date.getTime());
            AbstractC23160o0.m119283q1(calendar);
            m69665qM = calendar.getTime();
        } else {
            m69665qM = m69665qM();
        }
        Calendar calendar2 = Calendar.getInstance();
        AbstractC23160o0.m119292t1(calendar2);
        Date time = calendar2.getTime();
        C8003a.a m43142f = new C8003a.a(this.f72421L0.m92649TI()).m43142f(m69666rM());
        Date date2 = this.f64492W0;
        if (date2 == null) {
            date2 = time;
        }
        m43142f.m43138b(date2).m43144h(m69665qM).m43143g(time).m43141e(false).m43145i(false).m43137a().m43136j();
    }

    /* renamed from: CM */
    private final void m69654CM(String str) {
        this.f72421L0.finish();
        InterfaceC12401d interfaceC12401d = this.f64496a1;
        if (interfaceC12401d != null) {
            interfaceC12401d.mo69253e();
        }
        InterfaceC12401d interfaceC12401d2 = this.f64496a1;
        if (interfaceC12401d2 != null) {
            Date date = this.f64491V0;
            AbstractC19074t.m100205c(date);
            long time = date.getTime();
            Date date2 = this.f64492W0;
            AbstractC19074t.m100205c(date2);
            interfaceC12401d2.mo69252d(time, date2.getTime(), str);
        }
        this.f64491V0 = null;
        this.f64492W0 = null;
    }

    /* renamed from: qM */
    private final Date m69665qM() {
        Calendar calendar = Calendar.getInstance();
        C31973j5 c31973j5 = this.f64495Z0;
        if (c31973j5 != null) {
            AbstractC19074t.m100205c(c31973j5);
            if (c31973j5.m153734P().length() > 0) {
                C31973j5 c31973j52 = this.f64495Z0;
                AbstractC19074t.m100205c(c31973j52);
                if (!AbstractC19074t.m100204b(c31973j52.m153734P(), "0")) {
                    C31973j5 c31973j53 = this.f64495Z0;
                    AbstractC19074t.m100205c(c31973j53);
                    calendar.setTimeInMillis(Long.parseLong(c31973j53.m153734P()));
                    AbstractC23160o0.m119283q1(calendar);
                    Date time = calendar.getTime();
                    AbstractC19074t.m100207e(time, "getTime(...)");
                    return time;
                }
            }
        }
        calendar.add(1, -3);
        AbstractC23160o0.m119283q1(calendar);
        Date time2 = calendar.getTime();
        AbstractC19074t.m100207e(time2, "getTime(...)");
        return time2;
    }

    /* renamed from: rM */
    private final C8003a.b m69666rM() {
        return new C12403f();
    }

    /* renamed from: tM */
    private final void m69667tM() {
        List arrayList;
        int i11;
        C29905l5 c29905l5 = this.f64485P0;
        if (c29905l5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29905l5 = null;
        }
        c29905l5.f138560s.removeAllViews();
        InterfaceC12401d interfaceC12401d = this.f64496a1;
        if (interfaceC12401d == null || (arrayList = interfaceC12401d.mo69249a()) == null) {
            arrayList = new ArrayList();
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            final C3518o c3518o = (C3518o) arrayList.get(i12);
            if (c3518o.m17766e() != C3518o.b.f14757q) {
                if (getContext() == null) {
                    return;
                }
                Context context = getContext();
                AbstractC19074t.m100205c(context);
                View robotoTextView = new RobotoTextView(context);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.f64490U0);
                C29905l5 c29905l52 = this.f64485P0;
                if (c29905l52 == null) {
                    AbstractC19074t.m100223u("viewBinding");
                    c29905l52 = null;
                }
                if (c29905l52.f138560s.getChildCount() != 0) {
                    if (c3518o.m17763b() != 0) {
                        i11 = this.f64489T0;
                    } else {
                        i11 = this.f64487R0;
                    }
                    layoutParams.setMargins(i11, 0, this.f64487R0, 0);
                }
                robotoTextView.setLayoutParams(layoutParams);
                robotoTextView.setBackgroundColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC16781w.ItemSeparatorColor));
                C29905l5 c29905l53 = this.f64485P0;
                if (c29905l53 == null) {
                    AbstractC19074t.m100223u("viewBinding");
                    c29905l53 = null;
                }
                c29905l53.f138560s.addView(robotoTextView);
                LinearLayout linearLayout = new LinearLayout(getContext());
                int i13 = this.f64487R0;
                linearLayout.setPadding(i13, i13, i13, i13);
                linearLayout.setOrientation(0);
                linearLayout.setId(c3518o.m17766e().ordinal());
                linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                C29905l5 c29905l54 = this.f64485P0;
                if (c29905l54 == null) {
                    AbstractC19074t.m100223u("viewBinding");
                    c29905l54 = null;
                }
                c29905l54.f138560s.addView(linearLayout);
                linearLayout.setOnClickListener(new View.OnClickListener() { // from class: d80.e
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MediaStoreSuggestSearchView.m69668uM(MediaStoreSuggestSearchView.this, c3518o, view);
                    }
                });
                if (c3518o.m17763b() != 0) {
                    ImageView imageView = new ImageView(getContext());
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.setMargins(0, 0, this.f64488S0, 0);
                    layoutParams2.gravity = 16;
                    imageView.setLayoutParams(layoutParams2);
                    imageView.setImageDrawable(AbstractC23136l9.m118665N(imageView.getContext(), c3518o.m17763b()));
                    linearLayout.addView(imageView);
                }
                Context context2 = getContext();
                AbstractC19074t.m100205c(context2);
                RobotoTextView robotoTextView2 = new RobotoTextView(context2);
                robotoTextView2.setTextSize(1, 14.0f);
                robotoTextView2.setTextColor(C23212s8.m119607o(robotoTextView2.getContext(), AbstractC21196a.TextColor1));
                robotoTextView2.setText(c3518o.m17765d());
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams3.gravity = 16;
                robotoTextView2.setLayoutParams(layoutParams3);
                linearLayout.addView(robotoTextView2);
                int i14 = C12402e.f64508a[c3518o.m17766e().ordinal()];
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 == 3) {
                            linearLayout.setId(AbstractC6918a0.search_media_by_time);
                        }
                    } else {
                        linearLayout.setId(AbstractC6918a0.search_media_by_video);
                    }
                } else {
                    linearLayout.setId(AbstractC6918a0.search_media_by_sender);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uM */
    public static final void m69668uM(MediaStoreSuggestSearchView mediaStoreSuggestSearchView, C3518o c3518o, View view) {
        AbstractC19074t.m100208f(mediaStoreSuggestSearchView, "this$0");
        AbstractC19074t.m100208f(c3518o, "$quickSearchItem");
        mediaStoreSuggestSearchView.m69672yM(c3518o);
    }

    /* renamed from: vM */
    private final void m69669vM(List list) {
        C29905l5 c29905l5 = this.f64485P0;
        if (c29905l5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29905l5 = null;
        }
        c29905l5.f138560s.removeAllViews();
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            C12399b c12399b = (C12399b) list.get(i11);
            if (c12399b.m69679c().length() > 0) {
                if (getContext() == null) {
                    return;
                }
                Context context = getContext();
                AbstractC19074t.m100205c(context);
                View robotoTextView = new RobotoTextView(context);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.f64490U0);
                C29905l5 c29905l52 = this.f64485P0;
                if (c29905l52 == null) {
                    AbstractC19074t.m100223u("viewBinding");
                    c29905l52 = null;
                }
                if (c29905l52.f138560s.getChildCount() != 0) {
                    int i12 = this.f64487R0;
                    layoutParams.setMargins(i12, 0, i12, 0);
                }
                robotoTextView.setLayoutParams(layoutParams);
                robotoTextView.setBackgroundColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC16781w.ItemSeparatorColor));
                C29905l5 c29905l53 = this.f64485P0;
                if (c29905l53 == null) {
                    AbstractC19074t.m100223u("viewBinding");
                    c29905l53 = null;
                }
                c29905l53.f138560s.addView(robotoTextView);
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                int i13 = this.f64487R0;
                linearLayout.setPadding(i13, i13, i13, i13);
                linearLayout.setOrientation(1);
                C29905l5 c29905l54 = this.f64485P0;
                if (c29905l54 == null) {
                    AbstractC19074t.m100223u("viewBinding");
                    c29905l54 = null;
                }
                c29905l54.f138560s.addView(linearLayout);
                linearLayout.setOnClickListener(this);
                Context context2 = getContext();
                AbstractC19074t.m100205c(context2);
                RobotoTextView robotoTextView2 = new RobotoTextView(context2);
                robotoTextView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                robotoTextView2.setTextSize(1, 14.0f);
                robotoTextView2.setTextColor(C23212s8.m119607o(robotoTextView2.getContext(), AbstractC21196a.TextColor1));
                robotoTextView2.setText(c12399b.m69679c());
                linearLayout.addView(robotoTextView2);
                if (c12399b.m69678b().length() > 0) {
                    Context context3 = getContext();
                    AbstractC19074t.m100205c(context3);
                    RobotoTextView robotoTextView3 = new RobotoTextView(context3);
                    robotoTextView3.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                    robotoTextView3.setTextSize(1, 14.0f);
                    robotoTextView3.setTextColor(C23212s8.m119607o(robotoTextView3.getContext(), AbstractC21196a.TextColor2));
                    robotoTextView3.setText(c12399b.m69678b());
                    linearLayout.addView(robotoTextView3);
                }
                int m69677a = c12399b.m69677a();
                if (m69677a != 0) {
                    if (m69677a != 1) {
                        if (m69677a != 2) {
                            if (m69677a != 3) {
                                linearLayout.setId(c12399b.m69677a());
                            } else {
                                linearLayout.setId(AbstractC6918a0.search_by_time_last_month);
                            }
                        } else {
                            linearLayout.setId(AbstractC6918a0.search_by_time_last_week);
                        }
                    } else {
                        linearLayout.setId(AbstractC6918a0.search_by_time_yesterday);
                    }
                } else {
                    linearLayout.setId(AbstractC6918a0.search_by_time_custom);
                }
            }
        }
    }

    /* renamed from: wM */
    private final void m69670wM() {
        ArrayList arrayList = this.f64486Q0;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ms_yesterday);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        arrayList.add(new C12399b(1, m118743r0, ""));
        ArrayList arrayList2 = this.f64486Q0;
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ms_last_seven_days);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        arrayList2.add(new C12399b(2, m118743r02, ""));
        ArrayList arrayList3 = this.f64486Q0;
        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ms_last_thirty_days);
        AbstractC19074t.m100207e(m118743r03, "getString(...)");
        arrayList3.add(new C12399b(3, m118743r03, ""));
        ArrayList arrayList4 = this.f64486Q0;
        String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ms_custom_time);
        AbstractC19074t.m100207e(m118743r04, "getString(...)");
        arrayList4.add(new C12399b(0, m118743r04, ""));
    }

    /* renamed from: xM */
    private final void m69671xM() {
        C29905l5 c29905l5 = this.f64485P0;
        C29905l5 c29905l52 = null;
        if (c29905l5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29905l5 = null;
        }
        c29905l5.f138560s.setVisibility(8);
        C29905l5 c29905l53 = this.f64485P0;
        if (c29905l53 == null) {
            AbstractC19074t.m100223u("viewBinding");
        } else {
            c29905l52 = c29905l53;
        }
        c29905l52.f138559r.setVisibility(0);
        InterfaceC12401d interfaceC12401d = this.f64496a1;
        if (interfaceC12401d != null) {
            interfaceC12401d.mo69254f(true);
        }
    }

    /* renamed from: yM */
    private final void m69672yM(C3518o c3518o) {
        if (c3518o.m17766e() != C3518o.b.f14758r && c3518o.m17766e() != C3518o.b.f14760t && c3518o.m17766e() != C3518o.b.f14761u) {
            if (c3518o.m17766e() == C3518o.b.f14759s) {
                m69669vM(this.f64486Q0);
                InterfaceC12401d interfaceC12401d = this.f64496a1;
                if (interfaceC12401d != null) {
                    interfaceC12401d.mo69251c();
                    return;
                }
                return;
            }
            return;
        }
        InterfaceC12401d interfaceC12401d2 = this.f64496a1;
        if (interfaceC12401d2 != null) {
            interfaceC12401d2.mo69253e();
        }
        InterfaceC12401d interfaceC12401d3 = this.f64496a1;
        if (interfaceC12401d3 != null) {
            interfaceC12401d3.mo69250b(c3518o);
        }
    }

    /* renamed from: zM */
    private final void m69673zM(String str) {
        C23938d m123129s = C23446d.m123128r().m123129s(str);
        Date date = new Date();
        date.setTime(m123129s.f115878j);
        this.f64492W0 = date;
        Date date2 = new Date();
        date2.setTime(m123129s.f115877i);
        this.f64491V0 = date2;
        m69654CM(str);
    }

    /* renamed from: DM */
    public final void m69674DM(EnumC12400c enumC12400c) {
        AbstractC19074t.m100208f(enumC12400c, "mode");
        this.f64500e1 = enumC12400c;
        if (enumC12400c == EnumC12400c.f64504p) {
            m69667tM();
        } else {
            m69669vM(this.f64486Q0);
        }
    }

    /* renamed from: EM */
    public final void m69675EM(InterfaceC12401d interfaceC12401d) {
        AbstractC19074t.m100208f(interfaceC12401d, "listenerSuggest");
        this.f64496a1 = interfaceC12401d;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29905l5 m148196c = C29905l5.m148196c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148196c, "inflate(...)");
        this.f64485P0 = m148196c;
        C29905l5 c29905l5 = null;
        if (m148196c == null) {
            AbstractC19074t.m100223u("viewBinding");
            m148196c = null;
        }
        m148196c.getRoot().setOnClickListener(this);
        C29905l5 c29905l52 = this.f64485P0;
        if (c29905l52 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29905l52 = null;
        }
        c29905l52.f138565x.setOnClickListener(this);
        C29905l5 c29905l53 = this.f64485P0;
        if (c29905l53 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29905l53 = null;
        }
        c29905l53.f138561t.setOnClickListener(this);
        C29905l5 c29905l54 = this.f64485P0;
        if (c29905l54 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29905l54 = null;
        }
        c29905l54.f138564w.setOnClickListener(this);
        C29905l5 c29905l55 = this.f64485P0;
        if (c29905l55 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29905l55 = null;
        }
        c29905l55.f138558q.setOnClickListener(this);
        C29905l5 c29905l56 = this.f64485P0;
        if (c29905l56 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29905l56 = null;
        }
        c29905l56.f138560s.setOnClickListener(this);
        C29905l5 c29905l57 = this.f64485P0;
        if (c29905l57 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29905l57 = null;
        }
        c29905l57.f138559r.setOnClickListener(this);
        C29905l5 c29905l58 = this.f64485P0;
        if (c29905l58 == null) {
            AbstractC19074t.m100223u("viewBinding");
        } else {
            c29905l5 = c29905l58;
        }
        LinearLayout root = c29905l5.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        InterfaceC12401d interfaceC12401d = this.f64496a1;
        if (interfaceC12401d != null) {
            interfaceC12401d.mo69254f(false);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        bundle.putSerializable("suggest_mode", this.f64500e1);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "MediaStoreSuggestSearchView";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        try {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.search_by_time_yesterday) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ms_yesterday);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                m69673zM(m118743r0);
                return;
            }
            if (id2 == AbstractC6918a0.search_by_time_last_week) {
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ms_last_seven_days);
                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                m69673zM(m118743r02);
                return;
            }
            if (id2 == AbstractC6918a0.search_by_time_last_month) {
                String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ms_last_thirty_days);
                AbstractC19074t.m100207e(m118743r03, "getString(...)");
                m69673zM(m118743r03);
                return;
            }
            if (id2 == AbstractC6918a0.search_by_time_custom) {
                m69671xM();
                return;
            }
            C29905l5 c29905l5 = this.f64485P0;
            C29905l5 c29905l52 = null;
            if (c29905l5 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c29905l5 = null;
            }
            if (id2 == c29905l5.f138561t.getId()) {
                m69652AM();
                return;
            }
            C29905l5 c29905l53 = this.f64485P0;
            if (c29905l53 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c29905l53 = null;
            }
            if (id2 == c29905l53.f138564w.getId()) {
                m69653BM();
                return;
            }
            C29905l5 c29905l54 = this.f64485P0;
            if (c29905l54 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c29905l54 = null;
            }
            if (id2 == c29905l54.f138558q.getId()) {
                m69654CM("");
                return;
            }
            C29905l5 c29905l55 = this.f64485P0;
            if (c29905l55 == null) {
                AbstractC19074t.m100223u("viewBinding");
            } else {
                c29905l52 = c29905l55;
            }
            if (id2 == c29905l52.f138565x.getId()) {
                this.f72421L0.finish();
                InterfaceC12401d interfaceC12401d = this.f64496a1;
                if (interfaceC12401d != null) {
                    interfaceC12401d.mo69253e();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: sM */
    public final EnumC12400c m69676sM() {
        return this.f64500e1;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        Serializable serializable;
        Serializable serializable2;
        boolean z11;
        String str;
        String str2;
        long j11;
        super.mo37135xJ(bundle);
        Bundle m92642L3 = this.f72421L0.m92642L3();
        C29905l5 c29905l5 = null;
        if (m92642L3 != null) {
            if (m92642L3.containsKey("suggest_mode")) {
                serializable2 = m92642L3.getSerializable("suggest_mode");
            } else {
                serializable2 = EnumC12400c.f64504p;
            }
            AbstractC19074t.m100206d(serializable2, "null cannot be cast to non-null type com.zing.zalo.ui.mediastore.search.MediaStoreSuggestSearchView.SuggestMode");
            this.f64500e1 = (EnumC12400c) serializable2;
            if (m92642L3.containsKey("show_custom_time_view") && m92642L3.getBoolean("show_custom_time_view")) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f64499d1 = z11;
            if (z11) {
                long j12 = 0;
                if (m92642L3.containsKey("start_time")) {
                    j11 = m92642L3.getLong("start_time");
                } else {
                    j11 = 0;
                }
                if (j11 != 0) {
                    Date date = new Date();
                    date.setTime(j11);
                    this.f64491V0 = date;
                }
                if (m92642L3.containsKey("end_time")) {
                    j12 = m92642L3.getLong("end_time");
                }
                if (j11 != 0) {
                    Date date2 = new Date();
                    date2.setTime(j12);
                    this.f64492W0 = date2;
                }
            }
            if (!m92642L3.containsKey("conversation_id")) {
                str = "";
            } else {
                str = m92642L3.getString("conversation_id");
            }
            this.f64493X0 = str;
            this.f64495Z0 = C0943w.f3447a.m4472f(AbstractC25495a.m132088m(str));
            C3521p0 m120569C0 = AbstractC23306f.m120569C0();
            String str3 = this.f64493X0;
            if (str3 == null) {
                str2 = "";
            } else {
                str2 = str3;
            }
            this.f64494Y0 = m120569C0.m17791p(new CreateMediaStoreParam(str2, null, null, 6, null));
            C29905l5 c29905l52 = this.f64485P0;
            if (c29905l52 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c29905l52 = null;
            }
            c29905l52.f138560s.setVisibility(0);
            C29905l5 c29905l53 = this.f64485P0;
            if (c29905l53 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c29905l53 = null;
            }
            c29905l53.f138559r.setVisibility(8);
        }
        if (bundle != null) {
            if (bundle.containsKey("suggest_mode")) {
                serializable = bundle.getSerializable("suggest_mode");
            } else {
                serializable = this.f64500e1;
            }
            AbstractC19074t.m100206d(serializable, "null cannot be cast to non-null type com.zing.zalo.ui.mediastore.search.MediaStoreSuggestSearchView.SuggestMode");
            this.f64500e1 = (EnumC12400c) serializable;
        }
        if (this.f64499d1) {
            m69671xM();
            if (this.f64491V0 != null && this.f64492W0 != null) {
                C29905l5 c29905l54 = this.f64485P0;
                if (c29905l54 == null) {
                    AbstractC19074t.m100223u("viewBinding");
                    c29905l54 = null;
                }
                RobotoTextView robotoTextView = c29905l54.f138561t;
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
                Date date3 = this.f64491V0;
                AbstractC19074t.m100205c(date3);
                robotoTextView.setText(simpleDateFormat.format(date3));
                C29905l5 c29905l55 = this.f64485P0;
                if (c29905l55 == null) {
                    AbstractC19074t.m100223u("viewBinding");
                    c29905l55 = null;
                }
                RobotoTextView robotoTextView2 = c29905l55.f138564w;
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
                Date date4 = this.f64492W0;
                AbstractC19074t.m100205c(date4);
                robotoTextView2.setText(simpleDateFormat2.format(date4));
                C29905l5 c29905l56 = this.f64485P0;
                if (c29905l56 == null) {
                    AbstractC19074t.m100223u("viewBinding");
                } else {
                    c29905l5 = c29905l56;
                }
                c29905l5.f138558q.setEnabled(true);
                return;
            }
            return;
        }
        m69674DM(this.f64500e1);
    }
}
