package com.zing.zalo.adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.zing.p058v4.view.AbstractC6881a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.StickerView;
import com.zing.zalo.p077ui.custom.PhotoToggleButton;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me0.AbstractC23136l9;
import p354n3.C23528a;
import p471r3.C25630b;
import p588vw.C28644j;
import tg.C26674y;
import vg.C28020b3;
import z90.InterfaceC31726a;

/* renamed from: com.zing.zalo.adapters.b8 */
/* loaded from: classes3.dex */
public class C7020b8 extends AbstractC6881a {

    /* renamed from: A */
    boolean f38371A;

    /* renamed from: B */
    boolean f38372B;

    /* renamed from: E */
    PhotoToggleButton.InterfaceC11847c f38375E;

    /* renamed from: s */
    Context f38379s;

    /* renamed from: t */
    C23528a f38380t;

    /* renamed from: u */
    int f38381u;

    /* renamed from: v */
    int f38382v;

    /* renamed from: w */
    int f38383w;

    /* renamed from: x */
    int f38384x;

    /* renamed from: y */
    InterfaceC31726a f38385y;

    /* renamed from: z */
    LayoutInflater f38386z;

    /* renamed from: r */
    List f38378r = new ArrayList();

    /* renamed from: C */
    int f38373C = AbstractC16803z.radbox_checked;

    /* renamed from: D */
    int f38374D = AbstractC16803z.radbox_forgirl_uncheck;

    /* renamed from: F */
    Map f38376F = new LinkedHashMap();

    /* renamed from: G */
    View.OnTouchListener f38377G = new a();

    /* renamed from: com.zing.zalo.adapters.b8$a */
    /* loaded from: classes3.dex */
    class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            InterfaceC31726a interfaceC31726a;
            if (view != null && motionEvent != null) {
                try {
                    int action = motionEvent.getAction();
                    if ((action == 1 || action == 3) && (interfaceC31726a = C7020b8.this.f38385y) != null && (view instanceof StickerView)) {
                        interfaceC31726a.mo16641h(((StickerView) view).getEmoticon());
                        return false;
                    }
                    return false;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return false;
                }
            }
            return false;
        }
    }

    public C7020b8(Context context, int i11, int i12, int i13) {
        this.f38381u = 4;
        this.f38382v = 1;
        this.f38383w = 4;
        this.f38384x = AbstractC23136l9.m118742r(68.0f);
        this.f38379s = context;
        this.f38380t = new C23528a(context);
        i11 = i11 <= 0 ? 4 : i11;
        this.f38381u = i11;
        this.f38384x = i13;
        this.f38382v = i12;
        this.f38383w = i11 * i12;
        this.f38386z = LayoutInflater.from(context);
    }

    /* renamed from: A */
    static List m35881A(List list, int i11) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + i11;
            arrayList.add(new ArrayList(list.subList(i12, Math.min(size, i13))));
            i12 = i13;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public static /* synthetic */ void m35882G(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void m35883H(int i11, View view) {
        try {
            InterfaceC31726a interfaceC31726a = this.f38385y;
            if (interfaceC31726a != null && (view instanceof StickerView)) {
                interfaceC31726a.mo16639f((StickerView) view, i11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ boolean m35884I(int i11, View view) {
        InterfaceC31726a interfaceC31726a = this.f38385y;
        if (interfaceC31726a != null && (view instanceof StickerView)) {
            interfaceC31726a.mo16640g((StickerView) view, i11, -1);
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ void m35885J(PhotoToggleButton photoToggleButton, boolean z11) {
        try {
            Object tag = photoToggleButton.getTag();
            if (tag != null && (tag instanceof C25630b)) {
                C25630b c25630b = (C25630b) tag;
                if (this.f38376F.containsKey(c25630b.m132429g() + "")) {
                    this.f38376F.remove(c25630b.m132429g() + "");
                } else {
                    this.f38376F.clear();
                    this.f38376F.put(c25630b.m132429g() + "", c25630b);
                }
                mo35341m();
                PhotoToggleButton.InterfaceC11847c interfaceC11847c = this.f38375E;
                if (interfaceC11847c != null) {
                    interfaceC11847c.mo37055a(photoToggleButton, z11);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: B */
    View m35890B(C25630b c25630b, ViewGroup viewGroup) {
        StickerView stickerView = new StickerView(viewGroup.getContext());
        stickerView.setImageResource(AbstractC16803z.ic_suggeststicker_close);
        stickerView.setTag(c25630b);
        stickerView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.a8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7020b8.m35882G(view);
            }
        });
        return stickerView;
    }

    /* renamed from: C */
    LinearLayout m35891C(List list, ViewGroup viewGroup, int i11) {
        int i12;
        LinearLayout linearLayout = new LinearLayout(this.f38379s);
        int max = Math.max(list.size(), this.f38381u);
        for (int i13 = 0; i13 < max; i13++) {
            if (i13 < list.size()) {
                C25630b c25630b = (C25630b) list.get(i13);
                if (c25630b.m132429g() == -100) {
                    View m35890B = m35890B(c25630b, linearLayout);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 17;
                    linearLayout.addView(m35890B, layoutParams);
                } else {
                    FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
                    int i14 = this.f38384x;
                    linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(i14, i14));
                    StickerView stickerView = new StickerView(viewGroup.getContext());
                    try {
                        c25630b = C28644j.m143233Y().m143282P0(c25630b);
                        if (c25630b.m132448z()) {
                            Bitmap m141206w = C28020b3.f130648a.m141206w(c25630b);
                            if (m141206w != null) {
                                stickerView.setImageBitmap(m141206w);
                            }
                        } else {
                            C28020b3.f130648a.m141183G(c25630b, this.f38380t, stickerView, null, true);
                        }
                        final int m132432j = c25630b.m132432j();
                        stickerView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.x7
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C7020b8.this.m35883H(m132432j, view);
                            }
                        });
                        stickerView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.zing.zalo.adapters.y7
                            @Override // android.view.View.OnLongClickListener
                            public final boolean onLongClick(View view) {
                                boolean m35884I;
                                m35884I = C7020b8.this.m35884I(m132432j, view);
                                return m35884I;
                            }
                        });
                        stickerView.setOnTouchListener(this.f38377G);
                        stickerView.setEmoticon(String.valueOf(c25630b.m132429g()));
                        stickerView.setTag(c25630b);
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                    int i15 = this.f38384x;
                    frameLayout.addView(stickerView, new FrameLayout.LayoutParams(i15, i15));
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 5;
                    PhotoToggleButton photoToggleButton = new PhotoToggleButton(frameLayout.getContext());
                    photoToggleButton.setCheckedImageResId(this.f38373C);
                    photoToggleButton.setUncheckedImageResId(this.f38374D);
                    photoToggleButton.setOnCheckedChangeListener(new PhotoToggleButton.InterfaceC11847c() { // from class: com.zing.zalo.adapters.z7
                        @Override // com.zing.zalo.p077ui.custom.PhotoToggleButton.InterfaceC11847c
                        /* renamed from: a */
                        public final void mo37055a(PhotoToggleButton photoToggleButton2, boolean z11) {
                            C7020b8.this.m35885J(photoToggleButton2, z11);
                        }
                    });
                    photoToggleButton.setPadding(AbstractC23136l9.m118742r(6.0f), AbstractC23136l9.m118742r(6.0f), AbstractC23136l9.m118742r(6.0f), AbstractC23136l9.m118742r(6.0f));
                    photoToggleButton.setTag(c25630b);
                    int i16 = 8;
                    if (this.f38371A) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    photoToggleButton.setVisibility(i12);
                    photoToggleButton.setChecked(this.f38376F.containsKey(c25630b.m132429g() + ""));
                    frameLayout.addView(photoToggleButton, layoutParams2);
                    ProgressBar progressBar = (ProgressBar) this.f38386z.inflate(AbstractC7409c0.progress_bar_item, (ViewGroup) null);
                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(AbstractC23136l9.m118742r(30.0f), AbstractC23136l9.m118742r(30.0f));
                    layoutParams3.gravity = 17;
                    frameLayout.addView(progressBar, layoutParams3);
                    if (this.f38372B && c25630b.m132425e() > 0) {
                        if (C26674y.m136865t().m136882x(c25630b.m132425e() + "", "eventbox_id_" + c25630b.m132425e())) {
                            i16 = 0;
                        }
                        progressBar.setVisibility(i16);
                    } else {
                        progressBar.setVisibility(8);
                    }
                }
            } else {
                View view = new View(this.f38379s);
                int i17 = this.f38384x;
                linearLayout.addView(view, new LinearLayout.LayoutParams(i17, i17));
            }
            if (i13 < max - 1) {
                View view2 = new View(this.f38379s);
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, 0);
                layoutParams4.weight = 1.0f;
                linearLayout.addView(view2, layoutParams4);
            }
        }
        return linearLayout;
    }

    /* renamed from: D */
    public List m35892D() {
        return new ArrayList(this.f38376F.values());
    }

    /* renamed from: E */
    public C25630b m35893E(int i11) {
        try {
            return (C25630b) this.f38378r.get(i11);
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: F */
    public ArrayList m35894F(int i11) {
        int size;
        ArrayList arrayList = new ArrayList();
        try {
            List list = this.f38378r;
            if (list == null) {
                size = 0;
            } else {
                size = list.size();
            }
            int i12 = i11 * this.f38383w;
            for (int i13 = 0; i13 < this.f38383w; i13++) {
                int i14 = i12 + i13;
                if (i14 < size) {
                    arrayList.add(m35893E(i14));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: K */
    public void m35895K(boolean z11, int i11, int i12, PhotoToggleButton.InterfaceC11847c interfaceC11847c) {
        this.f38371A = z11;
        this.f38373C = i11;
        this.f38374D = i12;
        this.f38375E = interfaceC11847c;
    }

    /* renamed from: L */
    public void m35896L(boolean z11) {
        this.f38372B = z11;
    }

    /* renamed from: M */
    public void m35897M(List list) {
        this.f38378r = list;
        mo35341m();
    }

    /* renamed from: N */
    public void m35898N(InterfaceC31726a interfaceC31726a) {
        this.f38385y = interfaceC31726a;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: d */
    public final void mo35332d(ViewGroup viewGroup, int i11, Object obj) {
        if (viewGroup != null) {
            try {
                if (obj instanceof View) {
                    viewGroup.removeView((View) obj);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: g */
    public int mo35335g() {
        if (this.f38378r == null) {
            return 0;
        }
        return (int) Math.ceil(r0.size() / this.f38383w);
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: h */
    public int mo35336h(Object obj) {
        return -2;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: k */
    public final Object mo35339k(ViewGroup viewGroup, int i11) {
        LinearLayout linearLayout = new LinearLayout(this.f38379s);
        linearLayout.setOrientation(1);
        try {
            ArrayList m35894F = m35894F(i11);
            if (m35894F.size() > 0) {
                List m35881A = m35881A(m35894F, this.f38381u);
                for (int i12 = 0; i12 < m35881A.size(); i12++) {
                    List list = (List) m35881A.get(i12);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    if (i12 > 0) {
                        layoutParams.topMargin = AbstractC23136l9.m118742r(8.0f);
                    }
                    linearLayout.addView(m35891C(list, viewGroup, i11), layoutParams);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        viewGroup.addView(linearLayout, new ViewGroup.LayoutParams(-1, -2));
        return linearLayout;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: l */
    public boolean mo35340l(View view, Object obj) {
        return view == obj;
    }
}
