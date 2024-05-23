package me0;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.text.TextUtils;
import android.widget.ImageView;
import au.C2343e;
import com.androidquery.util.C3979l;
import com.androidquery.util.C3980m;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.uicontrol.C16649s0;
import com.zing.zalocore.CoreUtility;
import e90.C18310c;
import e90.C18311d;
import id0.C20518d;
import java.util.ArrayList;
import l30.AbstractC22055v0;
import l80.C22122a0;
import me0.AbstractC23124k8;
import p304ks.AbstractC21935u;
import p348mi.C23302b;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p716zh.C31903ea;
import p716zh.C31980jc;
import p716zh.C32123ta;

/* renamed from: me0.k8 */
/* loaded from: classes4.dex */
public abstract class AbstractC23124k8 {

    /* renamed from: a */
    static C24003n f112216a = C23278z2.m120093R0();

    /* renamed from: b */
    static C24003n f112217b = C23278z2.m120097T0();

    /* renamed from: me0.k8$a */
    /* loaded from: classes4.dex */
    class a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ Context f112218l1;

        /* renamed from: m1 */
        final /* synthetic */ boolean f112219m1;

        /* renamed from: n1 */
        final /* synthetic */ RecyclingImageView f112220n1;

        /* renamed from: o1 */
        final /* synthetic */ C3979l f112221o1;

        /* renamed from: p1 */
        final /* synthetic */ String f112222p1;

        /* renamed from: q1 */
        final /* synthetic */ C31980jc f112223q1;

        /* renamed from: r1 */
        final /* synthetic */ String f112224r1;

        a(Context context, boolean z11, RecyclingImageView recyclingImageView, C3979l c3979l, String str, C31980jc c31980jc, String str2) {
            this.f112218l1 = context;
            this.f112219m1 = z11;
            this.f112220n1 = recyclingImageView;
            this.f112221o1 = c3979l;
            this.f112222p1 = str;
            this.f112223q1 = c31980jc;
            this.f112224r1 = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: H3 */
        public static /* synthetic */ void m118624H3(String str, C18311d c18311d) {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC23124k8.m118617g(this.f112218l1, this.f112219m1, this.f112220n1, this.f112221o1, c3979l, this.f112222p1, this.f112223q1.f147023p);
            if (c3979l != null && c3979l.m18839c() != null) {
                C18310c.f92602a.m97230d(this.f112224r1, 0.1f, c3979l.m18839c(), new C18310c.a() { // from class: me0.j8
                    @Override // e90.C18310c.a
                    /* renamed from: a */
                    public final void mo88380a(String str2, C18311d c18311d) {
                        AbstractC23124k8.a.m118624H3(str2, c18311d);
                    }
                });
            }
        }
    }

    /* renamed from: me0.k8$b */
    /* loaded from: classes4.dex */
    class b extends C22122a0.d {

        /* renamed from: c */
        final /* synthetic */ boolean f112225c;

        /* renamed from: d */
        final /* synthetic */ C22122a0 f112226d;

        /* renamed from: e */
        final /* synthetic */ C3979l f112227e;

        /* renamed from: f */
        final /* synthetic */ String f112228f;

        /* renamed from: g */
        final /* synthetic */ C31980jc f112229g;

        /* renamed from: h */
        final /* synthetic */ String f112230h;

        b(boolean z11, C22122a0 c22122a0, C3979l c3979l, String str, C31980jc c31980jc, String str2) {
            this.f112225c = z11;
            this.f112226d = c22122a0;
            this.f112227e = c3979l;
            this.f112228f = str;
            this.f112229g = c31980jc;
            this.f112230h = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public static /* synthetic */ void m118626j(String str, C18311d c18311d) {
        }

        @Override // l80.C22122a0.d
        /* renamed from: h */
        public void mo43943h(String str, C22122a0 c22122a0, C3979l c3979l, C23995f c23995f, boolean z11) {
            AbstractC23124k8.m118618h(this.f112225c, this.f112226d, this.f112227e, c3979l, this.f112228f, this.f112229g.f147023p);
            if (c3979l != null && c3979l.m18839c() != null) {
                C18310c.f92602a.m97230d(this.f112230h, 0.1f, c3979l.m18839c(), new C18310c.a() { // from class: me0.l8
                    @Override // e90.C18310c.a
                    /* renamed from: a */
                    public final void mo88380a(String str2, C18311d c18311d) {
                        AbstractC23124k8.b.m118626j(str2, c18311d);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m118613c(RecyclingImageView recyclingImageView, String str, Context context, boolean z11, C3979l c3979l, String str2, C31980jc c31980jc, C3979l c3979l2) {
        try {
            if (recyclingImageView.getTag(AbstractC6918a0.tag_story_thumb).equals(str)) {
                m118617g(context, z11, recyclingImageView, c3979l, c3979l2, str2, c31980jc.f147023p);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m118614d(C22122a0 c22122a0, String str, boolean z11, C3979l c3979l, String str2, C31980jc c31980jc, C3979l c3979l2) {
        try {
            if (c22122a0.getTag(AbstractC6918a0.tag_story_thumb).equals(str)) {
                m118618h(z11, c22122a0, c3979l, c3979l2, str2, c31980jc.f147023p);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: e */
    static void m118615e(RecyclingImageView recyclingImageView, C31980jc c31980jc, C23528a c23528a) {
        try {
            recyclingImageView.setTag(AbstractC6918a0.tag_story_thumb, c31980jc.f147025r);
            String str = c31980jc.f147025r;
            boolean equals = CoreUtility.f89233i.equals(c31980jc.f147023p);
            if (!TextUtils.isEmpty(str) && !str.equalsIgnoreCase("null")) {
                if (!equals && C23302b.f113247a.m120523d(str) && !TextUtils.isEmpty(c31980jc.f147024q)) {
                    int m12307a = C2343e.m12307a(c31980jc.f147023p, false);
                    recyclingImageView.setImageDrawable(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(AbstractC21935u.m114542i(c31980jc.f147023p, c31980jc.f147024q)), m12307a));
                } else {
                    ((C23528a) c23528a.m123612r(recyclingImageView)).m123618x(c31980jc.f147025r, f112216a);
                }
            } else {
                recyclingImageView.setImageDrawable(AbstractC23170p.m119358p(recyclingImageView.getContext()));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    static void m118616f(C22122a0 c22122a0, C31980jc c31980jc, C23528a c23528a) {
        try {
            c22122a0.setTag(AbstractC6918a0.tag_story_thumb, c31980jc.f147025r);
            String str = c31980jc.f147025r;
            boolean equals = CoreUtility.f89233i.equals(c31980jc.f147023p);
            if (!TextUtils.isEmpty(str) && !str.equalsIgnoreCase("null")) {
                if (!equals && C23302b.f113247a.m120523d(str) && !TextUtils.isEmpty(c31980jc.f147024q)) {
                    int m12307a = C2343e.m12307a(c31980jc.f147023p, false);
                    c22122a0.mo111925v1(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(AbstractC21935u.m114542i(c31980jc.f147023p, c31980jc.f147024q)), m12307a));
                } else {
                    c22122a0.m115375G1(c23528a, c31980jc.f147025r, f112217b);
                }
            } else {
                c22122a0.mo111925v1(AbstractC23170p.m119358p(c22122a0.getContext()));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    static void m118617g(Context context, boolean z11, RecyclingImageView recyclingImageView, C3979l c3979l, C3979l c3979l2, String str, String str2) {
        if (c3979l2 != null) {
            try {
                if (c3979l2.m18839c() != null) {
                    if (z11) {
                        recyclingImageView.setImageInfo(c3979l2);
                        return;
                    }
                    if (!TextUtils.equals(str, str2)) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(c3979l2);
                        recyclingImageView.setImageInfo(new C3980m(arrayList), false);
                        Drawable drawable = f112216a.f116261b;
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), c3979l2.m18839c());
                        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
                        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new C16649s0(drawable, scaleType), new C16649s0(bitmapDrawable, scaleType)});
                        recyclingImageView.setImageDrawable(transitionDrawable);
                        transitionDrawable.startTransition(300);
                        return;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (c3979l != null) {
                        arrayList2.add(c3979l);
                    }
                    arrayList2.add(c3979l2);
                    recyclingImageView.setImageInfo(new C3980m(arrayList2), false);
                    Drawable drawable2 = null;
                    if (c3979l != null) {
                        if (c3979l instanceof C3980m) {
                            C3979l m18857u = ((C3980m) c3979l).m18857u();
                            if (m18857u != null && m18857u.m18839c() != null && !m18857u.m18839c().isRecycled()) {
                                drawable2 = new BitmapDrawable(context.getResources(), m18857u.m18839c());
                            }
                        } else if (c3979l.m18839c() != null && !c3979l.m18839c().isRecycled()) {
                            drawable2 = new BitmapDrawable(context.getResources(), c3979l.m18839c());
                        }
                    }
                    if (drawable2 == null) {
                        drawable2 = f112216a.f116261b;
                    }
                    BitmapDrawable bitmapDrawable2 = new BitmapDrawable(context.getResources(), c3979l2.m18839c());
                    ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER_CROP;
                    TransitionDrawable transitionDrawable2 = new TransitionDrawable(new Drawable[]{new C16649s0(drawable2, scaleType2), new C16649s0(bitmapDrawable2, scaleType2)});
                    recyclingImageView.setImageDrawable(transitionDrawable2);
                    transitionDrawable2.startTransition(300);
                    return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        recyclingImageView.setImageDrawable(f112216a.f116261b);
    }

    /* renamed from: h */
    static void m118618h(boolean z11, C22122a0 c22122a0, C3979l c3979l, C3979l c3979l2, String str, String str2) {
        C3979l c3979l3;
        if (c3979l2 != null) {
            try {
                if (c3979l2.m18839c() != null) {
                    if (z11) {
                        c22122a0.m115386T1(c3979l2);
                        return;
                    }
                    if (c3979l instanceof C3980m) {
                        c3979l3 = ((C3980m) c3979l).m18857u();
                    } else {
                        c3979l3 = null;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (TextUtils.equals(str, str2) && c3979l != null) {
                        arrayList.add(c3979l3);
                    }
                    arrayList.add(c3979l2);
                    c22122a0.m115387U1(new C3980m(arrayList), false);
                    c22122a0.mo111924u1(c3979l2.m18839c());
                    c22122a0.m89135c1(new C20518d().m106593j(300L));
                    return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        c22122a0.mo111925v1(f112217b.f116261b);
    }

    /* renamed from: i */
    static void m118619i(Context context, RecyclingImageView recyclingImageView, C3979l c3979l, C3979l c3979l2, String str, String str2, boolean z11, String str3, C31980jc c31980jc) {
        try {
            if (str2.equals(str)) {
                if (!(recyclingImageView.getDrawable() instanceof TransitionDrawable)) {
                    recyclingImageView.setImageInfo(c3979l2);
                    return;
                }
                return;
            }
            if (!z11 && TextUtils.equals(str3, c31980jc.f147023p)) {
                ArrayList arrayList = new ArrayList();
                if (c3979l != null) {
                    arrayList.add(c3979l);
                }
                arrayList.add(c3979l2);
                recyclingImageView.setImageInfo(new C3980m(arrayList), false);
                Drawable drawable = null;
                if (c3979l != null) {
                    if (c3979l instanceof C3980m) {
                        C3979l m18857u = ((C3980m) c3979l).m18857u();
                        if (m18857u != null) {
                            drawable = new BitmapDrawable(context.getResources(), m18857u.m18839c());
                        }
                    } else {
                        drawable = new BitmapDrawable(context.getResources(), c3979l.m18839c());
                    }
                }
                if (drawable == null) {
                    drawable = f112216a.f116261b;
                }
                BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), c3979l2.m18839c());
                ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
                TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new C16649s0(drawable, scaleType), new C16649s0(bitmapDrawable, scaleType)});
                recyclingImageView.setImageDrawable(transitionDrawable);
                transitionDrawable.startTransition(300);
                return;
            }
            recyclingImageView.setImageInfo(c3979l2);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: j */
    static void m118620j(C22122a0 c22122a0, C3979l c3979l, C3979l c3979l2, String str, String str2, boolean z11, String str3, C31980jc c31980jc) {
        C3979l c3979l3;
        try {
            if (str2.equals(str)) {
                c22122a0.m115386T1(c3979l2);
                return;
            }
            if (!z11 && TextUtils.equals(str3, c31980jc.f147023p)) {
                if (c3979l instanceof C3980m) {
                    c3979l3 = ((C3980m) c3979l).m18857u();
                } else {
                    c3979l3 = null;
                }
                ArrayList arrayList = new ArrayList();
                if (c3979l3 != null) {
                    arrayList.add(c3979l3);
                }
                arrayList.add(c3979l2);
                c22122a0.m115387U1(new C3980m(arrayList), false);
                if (c3979l2 != null) {
                    c22122a0.mo111924u1(c3979l2.m18839c());
                    c22122a0.m89135c1(new C20518d().m106593j(300L));
                    return;
                }
                return;
            }
            c22122a0.m115386T1(c3979l2);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: k */
    public static void m118621k(C31980jc c31980jc, final C31980jc c31980jc2, final Context context, C23528a c23528a, final RecyclingImageView recyclingImageView) {
        String str;
        String str2;
        boolean z11;
        String str3 = "";
        if (recyclingImageView.getTag(AbstractC6918a0.tag_story_uid) == null) {
            str = "";
        } else {
            str = (String) recyclingImageView.getTag(AbstractC6918a0.tag_story_uid);
        }
        if (recyclingImageView.getTag(AbstractC6918a0.tag_story_thumb) == null) {
            str2 = "";
        } else {
            str2 = (String) recyclingImageView.getTag(AbstractC6918a0.tag_story_thumb);
        }
        recyclingImageView.setTag(AbstractC6918a0.tag_story_uid, c31980jc2.f147023p);
        if (c31980jc != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c31980jc != null) {
            str3 = c31980jc.f147023p;
        }
        C32123ta m153827t = c31980jc2.m153827t(str3);
        if (m153827t != null) {
            if (m153827t.m155070J()) {
                final String m155066C = m153827t.m155066C();
                recyclingImageView.setTag(AbstractC6918a0.tag_story_thumb, m155066C);
                final C3979l imageInfo = recyclingImageView.getImageInfo();
                C24003n m120133j = C23278z2.m120133j(context, AbstractC23006a0.m117930z(), AbstractC22055v0.m115158r(recyclingImageView));
                C31903ea c31903ea = C31903ea.f146582a;
                C3979l m153340e = c31903ea.m153340e(m153827t.f148115R, m153827t.f148116S, AbstractC22055v0.m115153m(), m120133j);
                if (m153340e != null) {
                    m118619i(context, recyclingImageView, imageInfo, m153340e, str2, m155066C, z11, str, c31980jc2);
                    return;
                }
                if (m155066C.equals(str2) || z11 || !TextUtils.equals(str, c31980jc2.f147023p) || imageInfo == null || imageInfo.m18839c() == null || imageInfo.m18839c().isRecycled()) {
                    recyclingImageView.setImageDrawable(f112216a.f116261b);
                }
                final boolean z12 = z11;
                final String str4 = str;
                c31903ea.m153346k(m153827t.f148115R, m153827t.f148116S, m153827t.f148117T, m120133j, AbstractC22055v0.m115153m(), new C31903ea.b() { // from class: me0.h8
                    @Override // p716zh.C31903ea.b
                    /* renamed from: a */
                    public final void mo46919a(C3979l c3979l) {
                        AbstractC23124k8.m118613c(RecyclingImageView.this, m155066C, context, z12, imageInfo, str4, c31980jc2, c3979l);
                    }
                });
                return;
            }
            String str5 = m153827t.f148146l;
            if (!TextUtils.isEmpty(str5)) {
                recyclingImageView.setTag(AbstractC6918a0.tag_story_thumb, str5);
                C3979l imageInfo2 = recyclingImageView.getImageInfo();
                C24003n c24003n = f112216a;
                C3979l m125676A2 = C23999j.m125676A2(str5, c24003n.f116260a, c24003n.f116266g);
                if (m125676A2 != null) {
                    m118619i(context, recyclingImageView, imageInfo2, m125676A2, str2, str5, z11, str, c31980jc2);
                    return;
                }
                if (str5.equals(str2) || z11 || !TextUtils.equals(str, c31980jc2.f147023p) || imageInfo2 == null || imageInfo2.m18839c() == null || imageInfo2.m18839c().isRecycled()) {
                    recyclingImageView.setImageDrawable(f112216a.f116261b);
                }
                ((C23528a) c23528a.m123612r(recyclingImageView)).m123579C(str5, f112216a, new a(context, z11, recyclingImageView, imageInfo2, str, c31980jc2, str5));
                return;
            }
            m118615e(recyclingImageView, c31980jc2, c23528a);
            return;
        }
        m118615e(recyclingImageView, c31980jc2, c23528a);
    }

    /* renamed from: l */
    public static void m118622l(C31980jc c31980jc, final C31980jc c31980jc2, C23528a c23528a, final C22122a0 c22122a0, Context context) {
        String str;
        String str2;
        boolean z11;
        String str3 = "";
        if (c22122a0.getTag(AbstractC6918a0.tag_story_uid) == null) {
            str = "";
        } else {
            str = (String) c22122a0.getTag(AbstractC6918a0.tag_story_uid);
        }
        if (c22122a0.getTag(AbstractC6918a0.tag_story_thumb) == null) {
            str2 = "";
        } else {
            str2 = (String) c22122a0.getTag(AbstractC6918a0.tag_story_thumb);
        }
        c22122a0.setTag(AbstractC6918a0.tag_story_uid, c31980jc2.f147023p);
        if (c31980jc != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c31980jc != null) {
            str3 = c31980jc.f147023p;
        }
        C32123ta m153827t = c31980jc2.m153827t(str3);
        if (m153827t != null) {
            if (m153827t.m155070J()) {
                final String m155066C = m153827t.m155066C();
                c22122a0.setTag(AbstractC6918a0.tag_story_thumb, m155066C);
                final C3979l m115373D1 = c22122a0.m115373D1();
                C24003n m120133j = C23278z2.m120133j(context, AbstractC23006a0.m117930z(), AbstractC22055v0.m115159s(c22122a0));
                C31903ea c31903ea = C31903ea.f146582a;
                C3979l m153340e = c31903ea.m153340e(m153827t.f148115R, m153827t.f148116S, AbstractC22055v0.m115153m(), m120133j);
                if (m153340e != null) {
                    m118620j(c22122a0, m115373D1, m153340e, str2, m155066C, z11, str, c31980jc2);
                    return;
                }
                if (m155066C.equals(str2) || z11 || !TextUtils.equals(str, c31980jc2.f147023p) || m115373D1 == null || m115373D1.m18839c() == null || m115373D1.m18839c().isRecycled()) {
                    c22122a0.mo111925v1(f112217b.f116261b);
                }
                final boolean z12 = z11;
                final String str4 = str;
                c31903ea.m153346k(m153827t.f148115R, m153827t.f148116S, m153827t.f148117T, m120133j, AbstractC22055v0.m115153m(), new C31903ea.b() { // from class: me0.i8
                    @Override // p716zh.C31903ea.b
                    /* renamed from: a */
                    public final void mo46919a(C3979l c3979l) {
                        AbstractC23124k8.m118614d(C22122a0.this, m155066C, z12, m115373D1, str4, c31980jc2, c3979l);
                    }
                });
                return;
            }
            String str5 = m153827t.f148146l;
            if (!TextUtils.isEmpty(str5)) {
                c22122a0.setTag(AbstractC6918a0.tag_story_thumb, str5);
                C3979l m115373D12 = c22122a0.m115373D1();
                C24003n c24003n = f112217b;
                C3979l m125676A2 = C23999j.m125676A2(str5, c24003n.f116260a, c24003n.f116266g);
                if (m125676A2 != null) {
                    m118620j(c22122a0, m115373D12, m125676A2, str2, str5, z11, str, c31980jc2);
                    return;
                }
                if (z11 || !TextUtils.equals(str, c31980jc2.f147023p) || m115373D12 == null || m115373D12.m18839c() == null || m115373D12.m18839c().isRecycled()) {
                    c22122a0.mo111925v1(f112217b.f116261b);
                }
                c22122a0.m115382P1(c23528a, str5, f112217b, new b(z11, c22122a0, m115373D12, str, c31980jc2, str5), 26014);
                return;
            }
            m118616f(c22122a0, c31980jc2, c23528a);
            return;
        }
        m118616f(c22122a0, c31980jc2, c23528a);
    }
}
