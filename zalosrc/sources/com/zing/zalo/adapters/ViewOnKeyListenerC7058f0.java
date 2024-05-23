package com.zing.zalo.adapters;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.StickerView;
import dg0.AbstractC17930e;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p392oh.C24265l;
import p588vw.C28652r;
import p716zh.C31949hb;
import z90.AbstractC31727b;

/* renamed from: com.zing.zalo.adapters.f0 */
/* loaded from: classes3.dex */
public class ViewOnKeyListenerC7058f0 extends BaseAdapter implements View.OnKeyListener {

    /* renamed from: A */
    ListView f38555A;

    /* renamed from: B */
    b f38556B;

    /* renamed from: C */
    AbstractC31727b f38557C;

    /* renamed from: q */
    int f38561q;

    /* renamed from: r */
    int f38562r;

    /* renamed from: s */
    View.OnClickListener f38563s;

    /* renamed from: t */
    int f38564t;

    /* renamed from: u */
    int f38565u;

    /* renamed from: w */
    C28652r f38567w;

    /* renamed from: x */
    Handler f38568x;

    /* renamed from: p */
    int f38560p = 0;

    /* renamed from: v */
    List f38566v = new ArrayList();

    /* renamed from: y */
    int f38569y = 0;

    /* renamed from: z */
    public int f38570z = -1;

    /* renamed from: D */
    View.OnTouchListener f38558D = new a();

    /* renamed from: E */
    Runnable f38559E = new Runnable() { // from class: com.zing.zalo.adapters.y
        @Override // java.lang.Runnable
        public final void run() {
            ViewOnKeyListenerC7058f0.this.m36054t();
        }
    };

    /* renamed from: com.zing.zalo.adapters.f0$a */
    /* loaded from: classes3.dex */
    class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            ListView listView;
            if (view != null && motionEvent != null && ViewOnKeyListenerC7058f0.this.f38557C != null) {
                int action = motionEvent.getAction();
                if (action != 1) {
                    if (action == 3 && (listView = ViewOnKeyListenerC7058f0.this.f38555A) != null) {
                        listView.requestDisallowInterceptTouchEvent(true);
                        return false;
                    }
                    return false;
                }
                ViewOnKeyListenerC7058f0.this.f38557C.mo71324g();
                return false;
            }
            return false;
        }
    }

    /* renamed from: com.zing.zalo.adapters.f0$b */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        public int f38572a = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.adapters.f0$c */
    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a */
        StickerView f38573a;

        /* renamed from: b */
        View f38574b;

        /* renamed from: c */
        TextView f38575c;

        /* renamed from: d */
        TextView f38576d;

        /* renamed from: e */
        LinearLayout f38577e;

        c() {
        }
    }

    public ViewOnKeyListenerC7058f0(Context context, String[] strArr) {
        m36047m(context, strArr);
    }

    /* renamed from: i */
    private void m36044i(View view, int[] iArr) {
        view.getLocationInWindow(iArr);
        iArr[0] = iArr[0] + (view.getWidth() / 2);
        iArr[1] = iArr[1] + (view.getHeight() / 2);
    }

    /* renamed from: k */
    private void m36045k(Context context, boolean z11, int i11, int i12, b bVar) {
        this.f38561q = i12;
        this.f38570z = i11;
        this.f38556B = bVar;
        this.f38562r = AbstractC23136l9.m118731n0(context) / this.f38561q;
        this.f38564t = 0;
        this.f38565u = context.getResources().getDimensionPixelSize(AbstractC16802y.item_emoticon_height) + (this.f38564t * 2);
        if (bVar != null) {
            this.f38565u = AbstractC23136l9.m118712h(context, this.f38556B.f38572a) + (this.f38564t * 2);
        }
        this.f38567w = C28652r.m143349v();
        this.f38568x = new Handler(Looper.getMainLooper());
        this.f38569y = AbstractC23136l9.m118712h(context, 10.0f);
        m36058v(!z11);
    }

    /* renamed from: l */
    private void m36046l(Context context, boolean z11, b bVar) {
        int i11;
        this.f38556B = bVar;
        float m118731n0 = AbstractC23136l9.m118731n0(context);
        this.f38570z = -2;
        this.f38561q = 7;
        this.f38562r = (int) (m118731n0 / 7);
        this.f38564t = 0;
        this.f38565u = context.getResources().getDimensionPixelSize(AbstractC16802y.item_emoticon_height) + (this.f38564t * 2);
        b bVar2 = this.f38556B;
        if (bVar2 != null && (i11 = bVar2.f38572a) > 0) {
            this.f38565u = AbstractC23136l9.m118712h(context, i11) + (this.f38564t * 2);
        }
        this.f38567w = C28652r.m143349v();
        this.f38568x = new Handler(Looper.getMainLooper());
        this.f38569y = AbstractC23136l9.m118712h(context, 10.0f);
        m36058v(!z11);
    }

    /* renamed from: m */
    private void m36047m(Context context, String[] strArr) {
        this.f38560p = 1;
        this.f38561q = 5;
        this.f38562r = AbstractC23136l9.m118731n0(context) / this.f38561q;
        this.f38564t = 0;
        this.f38565u = context.getResources().getDimensionPixelSize(AbstractC16802y.item_big_emoticon_height) + (this.f38564t * 2);
        this.f38567w = C28652r.m143349v();
        this.f38568x = new Handler(Looper.getMainLooper());
        this.f38569y = AbstractC23136l9.m118712h(context, 10.0f);
        int length = strArr.length;
        int i11 = this.f38561q;
        int i12 = ((length + i11) - 1) / i11;
        for (int i13 = 0; i13 < i12; i13++) {
            C28652r.c cVar = new C28652r.c(0);
            int i14 = 0;
            while (true) {
                int i15 = this.f38561q;
                if (i14 < i15) {
                    if ((i13 * i15) + i14 < strArr.length) {
                        cVar.f132857c.add(strArr[(i15 * i13) + i14]);
                    }
                    i14++;
                }
            }
            this.f38566v.add(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m36048n(c cVar, View view) {
        try {
            if (this.f38557C != null) {
                String emoticon = cVar.f38573a.getEmoticon();
                if (!TextUtils.isEmpty(emoticon)) {
                    m36044i(view, r1);
                    int m118742r = r1[1] + AbstractC23136l9.m118742r(2.0f);
                    int[] iArr = {0, m118742r};
                    this.f38557C.mo38306d(emoticon, iArr[0], m118742r);
                }
            } else {
                View.OnClickListener onClickListener = this.f38563s;
                if (onClickListener != null) {
                    onClickListener.onClick(cVar.f38573a);
                }
            }
            int i11 = this.f38570z;
            if (i11 == -2) {
                C28652r.m143349v().m143369f(cVar.f38573a.getEmoticon());
            } else if (i11 == -3) {
                C24265l.m126676s().m126693d(cVar.f38573a.getEmoticon());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ boolean m36049o(c cVar, View view) {
        if (this.f38557C != null) {
            String emoticon = cVar.f38573a.getEmoticon();
            if (!TextUtils.isEmpty(emoticon)) {
                ListView listView = this.f38555A;
                if (listView != null) {
                    listView.requestDisallowInterceptTouchEvent(true);
                }
                m36044i(view, r0);
                int m118742r = r0[1] + AbstractC23136l9.m118742r(2.0f);
                int[] iArr = {0, m118742r};
                this.f38557C.mo71323f(emoticon, iArr[0], m118742r);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m36050p(c cVar, int i11, View view) {
        try {
            if (this.f38557C != null) {
                String emoticon = cVar.f38573a.getEmoticon();
                if (!TextUtils.isEmpty(emoticon)) {
                    m36044i(view, r1);
                    int i12 = r1[1] + i11;
                    int[] iArr = {0, i12};
                    this.f38557C.mo38306d(emoticon, iArr[0], i12);
                }
            } else {
                View.OnClickListener onClickListener = this.f38563s;
                if (onClickListener != null) {
                    onClickListener.onClick(cVar.f38573a);
                }
            }
            int i13 = this.f38570z;
            if (i13 == -2) {
                C28652r.m143349v().m143369f(cVar.f38573a.getEmoticon());
            } else if (i13 == -3) {
                C24265l.m126676s().m126693d(cVar.f38573a.getEmoticon());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ boolean m36051q(c cVar, int i11, View view) {
        if (this.f38557C != null) {
            String emoticon = cVar.f38573a.getEmoticon();
            if (!TextUtils.isEmpty(emoticon)) {
                ListView listView = this.f38555A;
                if (listView != null) {
                    listView.requestDisallowInterceptTouchEvent(true);
                }
                m36044i(view, r0);
                int i12 = r0[1] + i11;
                int[] iArr = {0, i12};
                this.f38557C.mo71323f(emoticon, iArr[0], i12);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m36052r(View view) {
        this.f38557C.mo76785j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m36053s() {
        try {
            m36057u();
            this.f38568x.post(this.f38559E);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m36054t() {
        try {
            notifyDataSetChanged();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List list = this.f38566v;
        if (list != null && !list.isEmpty()) {
            return this.f38566v.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i11) {
        if (i11 < this.f38566v.size()) {
            return ((C28652r.c) this.f38566v.get(i11)).f132855a;
        }
        return 1;
    }

    @Override // android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2 = null;
        try {
            Context context = viewGroup.getContext();
            int itemViewType = getItemViewType(i11);
            if (view == null) {
                linearLayout = new LinearLayout(context);
                try {
                    if (itemViewType == 0) {
                        for (int i12 = 0; i12 < this.f38561q; i12++) {
                            c m36059w = m36059w(context);
                            m36059w.f38574b.setTag(m36059w);
                            linearLayout.addView(m36059w.f38574b);
                        }
                    } else {
                        TextView textView = new TextView(context);
                        textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                        textView.setGravity(16);
                        textView.setTextColor(C23212s8.m119607o(context, AbstractC2807a.text_02));
                        c cVar = new c();
                        textView.setTextSize(0, AbstractC23136l9.m118655I(AbstractC16802y.f61));
                        ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).setMargins(0, 0, 0, AbstractC23222t7.f112556e);
                        cVar.f38575c = textView;
                        TextView textView2 = new TextView(context);
                        textView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                        textView2.setGravity(8388629);
                        textView2.setTextSize(0, AbstractC23136l9.m118655I(AbstractC16802y.f61));
                        textView2.setTextColor(C23212s8.m119606n(AbstractC2807a.link_01));
                        textView2.setTypeface(textView2.getTypeface(), 1);
                        cVar.f38576d = textView2;
                        linearLayout.setTag(cVar);
                        linearLayout.addView(cVar.f38575c);
                        linearLayout.addView(cVar.f38576d);
                    }
                } catch (Exception e11) {
                    e = e11;
                    linearLayout2 = linearLayout;
                    e.printStackTrace();
                    return linearLayout2;
                }
            } else {
                linearLayout = (LinearLayout) view;
            }
            linearLayout2 = linearLayout;
            C28652r.c cVar2 = (C28652r.c) this.f38566v.get(i11);
            if (itemViewType == 1) {
                c cVar3 = (c) linearLayout2.getTag();
                int i13 = cVar2.f132856b;
                if (i13 == 2) {
                    cVar3.f38575c.setPadding(AbstractC23136l9.m118742r(13.0f), AbstractC23136l9.m118742r(2.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(0.0f));
                } else if (i13 == 1) {
                    cVar3.f38575c.setPadding(AbstractC23136l9.m118742r(13.0f), AbstractC23136l9.m118742r(2.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(0.0f));
                } else if (i13 == 3) {
                    cVar3.f38575c.setPadding(AbstractC23136l9.m118742r(13.0f), AbstractC23136l9.m118742r(80.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(0.0f));
                } else if (i13 == 4) {
                    cVar3.f38575c.setPadding(AbstractC23136l9.m118742r(13.0f), AbstractC23136l9.m118742r(40.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(0.0f));
                } else {
                    cVar3.f38575c.setPadding(AbstractC23136l9.m118742r(13.0f), AbstractC23136l9.m118742r(5.5f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(0.0f));
                }
                cVar3.f38575c.setText(cVar2.f132858d);
                if (cVar2.f132860f) {
                    cVar3.f38576d.setVisibility(0);
                    cVar3.f38576d.setText(cVar2.f132859e);
                    cVar3.f38576d.setPadding(cVar3.f38575c.getPaddingLeft(), cVar3.f38575c.getPaddingTop(), cVar3.f38575c.getPaddingRight(), cVar3.f38575c.getPaddingBottom());
                    if (this.f38557C != null) {
                        cVar3.f38576d.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.z
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                ViewOnKeyListenerC7058f0.this.m36052r(view2);
                            }
                        });
                    }
                } else {
                    cVar3.f38576d.setVisibility(8);
                }
            } else {
                for (int i14 = 0; i14 < linearLayout2.getChildCount(); i14++) {
                    if (i14 < cVar2.f132857c.size()) {
                        m36055h(linearLayout2.getChildAt(i14), (String) cVar2.f132857c.get(i14), cVar2.f132861g);
                    } else {
                        c cVar4 = (c) linearLayout2.getChildAt(i14).getTag();
                        cVar4.f38573a.setVisibility(8);
                        cVar4.f38575c.setVisibility(8);
                    }
                }
            }
        } catch (Exception e12) {
            e = e12;
        }
        return linearLayout2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    /* renamed from: h */
    void m36055h(View view, String str, boolean z11) {
        int i11;
        final int m118742r;
        int i12;
        final c cVar = (c) view.getTag();
        StickerView stickerView = cVar.f38573a;
        TextView textView = cVar.f38575c;
        stickerView.setEmoticon(str);
        if (str != null) {
            if (this.f38560p == 1) {
                i11 = 38;
            } else {
                i11 = 27;
            }
            b bVar = this.f38556B;
            if (bVar != null && (i12 = bVar.f38572a) > 0) {
                i11 = i12;
            }
            if (this.f38570z == -3) {
                i11 = 32;
            }
            if (this.f38567w.m143375n(str, i11) != null && !z11) {
                stickerView.setImageDrawable(this.f38567w.m143375n(str, i11));
                cVar.f38574b.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.a0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        ViewOnKeyListenerC7058f0.this.m36048n(cVar, view2);
                    }
                });
                cVar.f38574b.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.zing.zalo.adapters.b0
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view2) {
                        boolean m36049o;
                        m36049o = ViewOnKeyListenerC7058f0.this.m36049o(cVar, view2);
                        return m36049o;
                    }
                });
                LinearLayout linearLayout = cVar.f38577e;
                int i13 = this.f38569y;
                linearLayout.setPadding(0, i13, 0, i13);
                cVar.f38574b.setOnTouchListener(this.f38558D);
                stickerView.setVisibility(0);
                textView.setVisibility(8);
            } else {
                stickerView.setVisibility(8);
                textView.setVisibility(0);
                if (this.f38567w.m143375n(str, i11) != null) {
                    textView.setTextSize(1, i11 - 2.0f);
                    textView.setIncludeFontPadding(false);
                    textView.setText(C28652r.m143349v().m143358I(" " + str + " ", AbstractC23136l9.m118742r(r11)));
                } else {
                    textView.setText(C28652r.m143349v().m143357H(str));
                }
                if (this.f38567w.m143375n(str, i11) != null) {
                    m118742r = 0;
                } else {
                    m118742r = AbstractC23136l9.m118742r(6.0f);
                }
                cVar.f38574b.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.c0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        ViewOnKeyListenerC7058f0.this.m36050p(cVar, m118742r, view2);
                    }
                });
                cVar.f38574b.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.zing.zalo.adapters.d0
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view2) {
                        boolean m36051q;
                        m36051q = ViewOnKeyListenerC7058f0.this.m36051q(cVar, m118742r, view2);
                        return m36051q;
                    }
                });
                cVar.f38574b.setOnTouchListener(this.f38558D);
                cVar.f38577e.setPadding(0, 0, 0, 0);
            }
            View view2 = cVar.f38574b;
            if (view2 != null && view2.getVisibility() == 4) {
                cVar.f38574b.setVisibility(0);
                return;
            }
            return;
        }
        if (this.f38570z >= 0) {
            stickerView.setVisibility(8);
        } else {
            stickerView.setVisibility(4);
        }
        textView.setVisibility(8);
        stickerView.setImageBitmap(null);
        View view3 = cVar.f38574b;
        if (view3 != null) {
            view3.setOnClickListener(null);
            cVar.f38574b.setVisibility(4);
            cVar.f38574b.setOnTouchListener(null);
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i11) {
        return false;
    }

    @Override // android.widget.Adapter
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C28652r.c getItem(int i11) {
        if (i11 >= 0 && i11 < this.f38566v.size()) {
            return (C28652r.c) this.f38566v.get(i11);
        }
        return null;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i11, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: u */
    public void m36057u() {
        boolean z11;
        try {
            C28652r c28652r = this.f38567w;
            if (this.f38570z == -3) {
                z11 = true;
            } else {
                z11 = false;
            }
            int m143385z = c28652r.m143385z(z11);
            ArrayList arrayList = new ArrayList(C28652r.m143349v().f132845k);
            int i11 = this.f38570z;
            if (i11 == -1) {
                this.f38566v = C28652r.m143349v().m143380t(this.f38561q, false, true);
                return;
            }
            if (i11 == -2) {
                this.f38566v = C28652r.m143349v().m143380t(this.f38561q, true, true);
                return;
            }
            if (i11 == -3) {
                this.f38566v = C24265l.m126676s().m126701q(this.f38561q, true, C24265l.m126676s().m126699o().m128546d());
                return;
            }
            if (i11 >= 0 && i11 <= m143385z) {
                int size = ((C31949hb) arrayList.get(i11)).m153605c().size();
                int i12 = this.f38561q;
                int i13 = ((size + i12) - 1) / i12;
                for (int i14 = 0; i14 < i13; i14++) {
                    C28652r.c cVar = new C28652r.c(0);
                    int i15 = 0;
                    while (true) {
                        int i16 = this.f38561q;
                        if (i15 >= i16) {
                            break;
                        }
                        if ((i16 * i14) + i15 < ((C31949hb) arrayList.get(this.f38570z)).m153605c().size()) {
                            cVar.f132857c.add((String) ((C31949hb) arrayList.get(this.f38570z)).m153605c().get((this.f38561q * i14) + i15));
                        }
                        i15++;
                    }
                    this.f38566v.add(cVar);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: v */
    void m36058v(boolean z11) {
        try {
            if (!z11) {
                m36057u();
            } else {
                AbstractC17930e.m94544c().mo94531e(new Runnable() { // from class: com.zing.zalo.adapters.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnKeyListenerC7058f0.this.m36053s();
                    }
                }, 600L);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: w */
    c m36059w(Context context) {
        int i11;
        StickerView stickerView = new StickerView(context);
        int i12 = this.f38565u;
        stickerView.setLayoutParams(new LinearLayout.LayoutParams(i12, i12));
        int i13 = this.f38564t;
        stickerView.setPadding(i13, i13, i13, i13);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
        linearLayout.addView(stickerView);
        int i14 = this.f38569y;
        linearLayout.setPadding(0, i14, 0, i14);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setGravity(17);
        textView.setText("");
        textView.setTextColor(-16777216);
        if (AbstractC23136l9.m118731n0(context) <= 480) {
            i11 = 18;
        } else {
            i11 = 24;
        }
        if (this.f38560p == 1) {
            i11 = 38;
        }
        if (this.f38570z == -3) {
            i11 = 32;
        }
        float f11 = i11;
        textView.setTextSize(1, f11);
        textView.setPadding(0, AbstractC23136l9.m118742r(6.0f), 0, AbstractC23136l9.m118742r(10.0f));
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        textView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView2.setGravity(17);
        textView2.setText("");
        textView2.setVisibility(8);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(C23212s8.m119606n(AbstractC2807a.link_01));
        textView2.setTypeface(textView2.getTypeface(), 1);
        linearLayout.addView(textView2);
        linearLayout.setGravity(17);
        c cVar = new c();
        cVar.f38574b = linearLayout;
        cVar.f38573a = stickerView;
        cVar.f38575c = textView;
        cVar.f38576d = textView2;
        if (this.f38570z == -3) {
            textView.setTextSize(1, f11 - 2.0f);
            cVar.f38574b.setBackgroundResource(AbstractC16803z.stencils_bg_pressed);
        } else {
            linearLayout.setBackgroundResource(AbstractC16803z.item_background_ripple);
        }
        cVar.f38577e = linearLayout;
        return cVar;
    }

    /* renamed from: x */
    public void m36060x(AbstractC31727b abstractC31727b) {
        this.f38557C = abstractC31727b;
    }

    /* renamed from: y */
    public void m36061y(View.OnClickListener onClickListener) {
        this.f38563s = onClickListener;
    }

    public ViewOnKeyListenerC7058f0(Context context) {
        m36046l(context, true, null);
    }

    public ViewOnKeyListenerC7058f0(Context context, boolean z11, int i11, int i12, b bVar) {
        m36045k(context, z11, i11, i12, bVar);
    }
}
