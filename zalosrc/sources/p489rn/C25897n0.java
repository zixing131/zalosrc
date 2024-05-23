package p489rn;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ao.InterfaceC2259a;
import ao.InterfaceC2262d;
import au.C2370r0;
import bo.C2954c;
import bo.C3000l0;
import bo.C3020p0;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.components.FeedItemBase;
import com.zing.zalo.feed.components.FeedItemBiography;
import com.zing.zalo.feed.components.FeedItemLinkModulesView;
import com.zing.zalo.feed.components.FeedItemOptionModuleView;
import com.zing.zalo.feed.components.FeedItemPhotoModuleView;
import com.zing.zalo.feed.components.FeedItemPhotoMultiModuleView;
import com.zing.zalo.feed.components.FeedItemSocialAlbum;
import com.zing.zalo.feed.components.FeedItemSocialAlbumPhoto;
import com.zing.zalo.feed.components.FeedItemSocialAlbumVideo;
import com.zing.zalo.feed.components.FeedItemStickerModulesView;
import com.zing.zalo.feed.components.FeedItemSuggestBanner;
import com.zing.zalo.feed.components.FeedItemTextModuleView;
import com.zing.zalo.feed.components.FeedItemVideo;
import com.zing.zalo.feed.uicontrols.FeedGridView;
import com.zing.zalo.social.controls.InterfaceC10867f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zview.animation.AnimationTarget;
import hf0.C20047i;
import ho0.AbstractC20110a;
import i40.C20275e;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import l30.AbstractC22055v0;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import p175g0.AbstractC19181d;
import p354n3.C23528a;
import p716zh.C31995kc;
import th.AbstractC26683d;

/* renamed from: rn.n0 */
/* loaded from: classes4.dex */
public class C25897n0 extends AbstractC25856c2 {

    /* renamed from: A */
    HashMap f123536A;

    /* renamed from: B */
    C3000l0 f123537B;

    /* renamed from: D */
    ArrayList f123539D;

    /* renamed from: E */
    InterfaceC2262d f123540E;

    /* renamed from: F */
    C23528a f123541F;

    /* renamed from: G */
    public boolean[] f123542G;

    /* renamed from: H */
    HashMap f123543H;

    /* renamed from: I */
    public AbstractC22055v0.l f123544I;

    /* renamed from: J */
    C20047i f123545J;

    /* renamed from: K */
    ViewGroup f123546K;

    /* renamed from: u */
    Context f123547u;

    /* renamed from: v */
    InterfaceC2259a f123548v;

    /* renamed from: x */
    InterfaceC10867f f123550x;

    /* renamed from: y */
    LayoutInflater f123551y;

    /* renamed from: z */
    C2370r0 f123552z;

    /* renamed from: w */
    protected C25866f0 f123549w = new C25866f0();

    /* renamed from: C */
    boolean f123538C = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rn.n0$a */
    /* loaded from: classes4.dex */
    public class a extends C20275e {
        a() {
        }

        @Override // i40.C20275e
        /* renamed from: e */
        public String mo72438e(int i11) {
            return String.format("image#%s", Integer.valueOf(m105880q(i11)));
        }

        @Override // i40.C20275e
        /* renamed from: s */
        public boolean mo36888s() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rn.n0$b */
    /* loaded from: classes4.dex */
    public class b extends C20275e {
        b() {
        }

        @Override // i40.C20275e
        /* renamed from: s */
        public boolean mo36888s() {
            return true;
        }
    }

    /* renamed from: rn.n0$c */
    /* loaded from: classes4.dex */
    public interface c {
        /* renamed from: a */
        void mo133514a(AnimationTarget animationTarget, int i11);
    }

    public C25897n0(C2370r0 c2370r0, Context context, HashMap hashMap, HashMap hashMap2, boolean[] zArr) {
        this.f123547u = context;
        this.f123551y = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f123552z = c2370r0;
        this.f123536A = hashMap;
        this.f123541F = new C23528a(this.f123547u);
        this.f123543H = hashMap2;
        this.f123542G = zArr;
    }

    /* renamed from: L */
    private ArrayList m133562L(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C2954c c2954c = (C2954c) it.next();
                if (c2954c.m13986a() != null) {
                    ItemAlbumMobile itemAlbumMobile = new ItemAlbumMobile();
                    itemAlbumMobile.m40519e0(c2954c);
                    arrayList2.add(itemAlbumMobile);
                }
            }
        }
        return arrayList2;
    }

    /* renamed from: M */
    private Bundle m133563M() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("extra_need_scroll_to_bottom", true);
        return bundle;
    }

    /* renamed from: O */
    private View.OnClickListener m133564O(int i11) {
        return this.f123549w.m133494A(this.f123537B, i11, true, m133563M());
    }

    /* renamed from: P */
    private View.OnClickListener m133565P(int i11, C3020p0 c3020p0) {
        return this.f123549w.m133512y(this.f123537B, i11, c3020p0, true, m133563M());
    }

    /* renamed from: Q */
    private C16719g.c m133566Q(int i11, C3020p0 c3020p0) {
        return this.f123549w.m133513z(this.f123537B, i11, c3020p0, true, m133563M());
    }

    /* renamed from: R */
    private C16719g.c m133567R(int i11) {
        return this.f123549w.m133495B(this.f123537B, i11, true, m133563M());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public /* synthetic */ void m133568S(int i11, ViewGroup viewGroup, C3020p0 c3020p0, C16719g c16719g) {
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 += ((C3020p0) this.f123539D.get(i13)).f12023C.f12118i.size();
        }
        m133582e0(viewGroup, AbstractC20826v0.m108747A(c16719g), c3020p0, i12, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public /* synthetic */ void m133569T(int i11, ViewGroup viewGroup, C3020p0 c3020p0, AnimationTarget animationTarget, int i12) {
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            try {
                i13 += ((C3020p0) this.f123539D.get(i14)).f12023C.f12118i.size();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        m133582e0(viewGroup, animationTarget, c3020p0, i13 + i12, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public /* synthetic */ void m133570U(int i11, C17391z c17391z, FeedItemVideo feedItemVideo, View view) {
        try {
            C20047i c20047i = this.f123545J;
            if (c20047i != null) {
                c20047i.m104092Z(true);
            }
            this.f123548v.mo11957ig(this.f123537B, i11, c17391z, 1, feedItemVideo, feedItemVideo.getVideoDisplayView());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public /* synthetic */ void m133571V(int i11, C3020p0 c3020p0, FeedItemSocialAlbum feedItemSocialAlbum, View view) {
        try {
            C20047i c20047i = this.f123545J;
            if (c20047i != null) {
                c20047i.m104092Z(true);
            }
            InterfaceC2259a interfaceC2259a = this.f123548v;
            C3000l0 c3000l0 = this.f123537B;
            C17391z m108787U = AbstractC20826v0.m108787U(c3020p0, 0);
            FeedItemSocialAlbumVideo feedItemSocialAlbumVideo = feedItemSocialAlbum.f44639s0;
            interfaceC2259a.mo11957ig(c3000l0, i11, m108787U, 1, feedItemSocialAlbumVideo, feedItemSocialAlbumVideo.getVideoDisplayView());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public /* synthetic */ void m133572W(int i11, int i12) {
        try {
            if (this.f123548v != null) {
                C20047i c20047i = this.f123545J;
                if (c20047i != null) {
                    c20047i.m104092Z(true);
                }
                InterfaceC2259a interfaceC2259a = this.f123548v;
                C3000l0 c3000l0 = this.f123537B;
                interfaceC2259a.mo11957ig(c3000l0, i11, AbstractC20826v0.m108787U(c3000l0.m14322a0(), i12), 1, null, null);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public /* synthetic */ void m133573X(int i11, ViewGroup viewGroup, C3020p0 c3020p0, AnimationTarget animationTarget, int i12) {
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            try {
                i13 += ((C3020p0) this.f123539D.get(i14)).f12023C.f12107P.size();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        m133583f0(viewGroup, animationTarget, c3020p0, i13 + i12, false);
    }

    /* renamed from: K */
    boolean m133574K(int i11) {
        boolean[] zArr = this.f123542G;
        if (zArr != null && i11 >= 0 && i11 < zArr.length) {
            return zArr[i11];
        }
        AbstractC23350e.m122774d("FEEDGROUPHORIZONTAL", "VIEWPAGER PAGE INDEX IS OUT OF BOUND");
        return true;
    }

    /* renamed from: N */
    public C3020p0 m133575N(int i11) {
        ArrayList arrayList = this.f123539D;
        if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
            return (C3020p0) this.f123539D.get(i11);
        }
        return null;
    }

    /* renamed from: Y */
    public void m133576Y(C20047i c20047i) {
        this.f123545J = c20047i;
    }

    /* renamed from: Z */
    public void m133577Z(InterfaceC10867f interfaceC10867f) {
        this.f123550x = interfaceC10867f;
    }

    /* renamed from: a0 */
    public void m133578a0(C3000l0 c3000l0, ArrayList arrayList) {
        this.f123537B = c3000l0;
        this.f123539D = new ArrayList(arrayList);
    }

    /* renamed from: b0 */
    public void m133579b0(InterfaceC2259a interfaceC2259a) {
        this.f123548v = interfaceC2259a;
        this.f123549w.m133508l0(interfaceC2259a);
    }

    /* renamed from: c0 */
    public void m133580c0(InterfaceC2262d interfaceC2262d) {
        this.f123540E = interfaceC2262d;
        this.f123549w.m133509m0(interfaceC2262d);
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: d */
    public void mo35332d(ViewGroup viewGroup, int i11, Object obj) {
        if (AbstractC26683d.f126393l && (obj instanceof FeedItemBase)) {
            ((FeedItemBase) obj).m43689w();
        }
        viewGroup.removeView((View) obj);
    }

    /* renamed from: d0 */
    public void m133581d0(boolean z11) {
        this.f123538C = z11;
    }

    /* renamed from: e0 */
    void m133582e0(ViewGroup viewGroup, AnimationTarget animationTarget, C3020p0 c3020p0, int i11, boolean z11) {
        int i12;
        C3020p0 c3020p02;
        ArrayList arrayList;
        try {
            ArrayList arrayList2 = this.f123539D;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                SparseIntArray sparseIntArray = new SparseIntArray();
                SparseIntArray sparseIntArray2 = new SparseIntArray();
                a aVar = new a();
                ArrayList arrayList3 = new ArrayList();
                HashMap hashMap = new HashMap();
                for (int i13 = 0; i13 < this.f123539D.size(); i13++) {
                    C3020p0 c3020p03 = (C3020p0) this.f123539D.get(i13);
                    if (c3020p03 != null && (arrayList = c3020p03.f12023C.f12118i) != null) {
                        for (int i14 = 0; i14 < arrayList.size(); i14++) {
                            ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) arrayList.get(i14);
                            if (itemAlbumMobile != null) {
                                arrayList3.add(itemAlbumMobile);
                                hashMap.put(itemAlbumMobile.f42595r, c3020p03);
                                sparseIntArray.put(arrayList3.size() - 1, i13);
                                if (i14 == 0) {
                                    sparseIntArray2.put(i13, arrayList3.size() - 1);
                                }
                            }
                        }
                    }
                }
                int m118655I = AbstractC23136l9.m118655I(AbstractC19181d.abc_action_bar_default_height_material);
                int m118655I2 = AbstractC23136l9.m118655I(AbstractC16802y.height_tab_main);
                aVar.m105882u(m118655I);
                aVar.m105881t(m118655I2);
                this.f123552z.m12395b(viewGroup);
                aVar.m105861G(this.f123552z);
                aVar.m105857C(sparseIntArray);
                aVar.m105858D(sparseIntArray2);
                aVar.m105865K(i11);
                aVar.m105883v(z11);
                aVar.m105884w(c3020p0.f12057p);
                ItemAlbumMobile itemAlbumMobile2 = (ItemAlbumMobile) arrayList3.get(i11);
                if (itemAlbumMobile2 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("fromFeed", true);
                    C3000l0 c3000l0 = this.f123537B;
                    if (c3000l0 != null) {
                        i12 = c3000l0.f11896q0;
                    } else {
                        i12 = -1;
                    }
                    bundle.putInt("fromTimelineTab", i12);
                    bundle.putInt("EXTRA_INT_SUB_TITLE_MODE", 3);
                    bundle.putInt("EXTRA_INT_IMAGE_VIEWER_TYPE", 4);
                    bundle.putString("feedId", c3020p0.f12057p);
                    bundle.putString("userId", c3020p0.f12022B.f12280b);
                    if (c3020p0.m14493X()) {
                        bundle.putBoolean("viewOnly", true);
                    }
                    if (arrayList3.size() > 1) {
                        ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                        for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                            ItemAlbumMobile itemAlbumMobile3 = new ItemAlbumMobile((ItemAlbumMobile) arrayList3.get(i15));
                            if (hashMap.get(itemAlbumMobile3.f42595r) != null) {
                                c3020p02 = (C3020p0) hashMap.get(itemAlbumMobile3.f42595r);
                            } else {
                                c3020p02 = c3020p0;
                            }
                            if (c3020p02 != null) {
                                itemAlbumMobile3.f42605w = c3020p02.f12022B.f12282d;
                                itemAlbumMobile3.f42564O = c3020p02.f12062u;
                                itemAlbumMobile3.f42599t = c3020p02.f12057p;
                                itemAlbumMobile3.f42548C = itemAlbumMobile3.m40526m0();
                                itemAlbumMobile3.m40528o0(c3020p02);
                            }
                            arrayList4.add(itemAlbumMobile3);
                        }
                        bundle.putParcelableArrayList("medialist", arrayList4);
                        bundle.putBoolean("hasGridPhoto", true);
                        bundle.putInt("currentIndex", i11);
                    } else {
                        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
                        ItemAlbumMobile itemAlbumMobile4 = new ItemAlbumMobile(itemAlbumMobile2);
                        itemAlbumMobile4.f42605w = c3020p0.f12022B.f12282d;
                        itemAlbumMobile4.f42564O = c3020p0.f12062u;
                        itemAlbumMobile4.f42599t = c3020p0.f12057p;
                        itemAlbumMobile4.f42548C = itemAlbumMobile4.m40526m0();
                        itemAlbumMobile4.m40528o0(c3020p0);
                        arrayList5.add(itemAlbumMobile4);
                        bundle.putParcelableArrayList("medialist", arrayList5);
                    }
                    if (this.f123548v != null) {
                        C31995kc.m154255c().m154258d(c3020p0.f12057p, aVar);
                        this.f123548v.mo11941Yk(animationTarget, itemAlbumMobile2.f42607x, bundle, aVar, c3020p0, new TrackingSource(12), true);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f0 */
    void m133583f0(ViewGroup viewGroup, AnimationTarget animationTarget, C3020p0 c3020p0, int i11, boolean z11) {
        int i12;
        C3020p0 c3020p02;
        ArrayList m133562L;
        try {
            ArrayList arrayList = this.f123539D;
            if (arrayList != null && !arrayList.isEmpty()) {
                SparseIntArray sparseIntArray = new SparseIntArray();
                SparseIntArray sparseIntArray2 = new SparseIntArray();
                b bVar = new b();
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap = new HashMap();
                for (int i13 = 0; i13 < this.f123539D.size(); i13++) {
                    C3020p0 c3020p03 = (C3020p0) this.f123539D.get(i13);
                    if (c3020p03 != null && (m133562L = m133562L(c3020p03.f12023C.f12107P)) != null) {
                        for (int i14 = 0; i14 < m133562L.size(); i14++) {
                            ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) m133562L.get(i14);
                            if (itemAlbumMobile != null) {
                                arrayList2.add(itemAlbumMobile);
                                hashMap.put(itemAlbumMobile.f42595r, c3020p03);
                                sparseIntArray.put(arrayList2.size() - 1, i13);
                                if (i14 == 0) {
                                    sparseIntArray2.put(i13, arrayList2.size() - 1);
                                }
                            }
                        }
                    }
                }
                int m118655I = AbstractC23136l9.m118655I(AbstractC19181d.abc_action_bar_default_height_material);
                int m118655I2 = AbstractC23136l9.m118655I(AbstractC16802y.height_tab_main);
                bVar.m105882u(m118655I);
                bVar.m105881t(m118655I2);
                this.f123552z.m12395b(viewGroup);
                bVar.m105861G(this.f123552z);
                bVar.m105857C(sparseIntArray);
                bVar.m105858D(sparseIntArray2);
                bVar.m105865K(i11);
                bVar.m105883v(z11);
                bVar.m105884w(c3020p0.f12057p);
                ItemAlbumMobile itemAlbumMobile2 = (ItemAlbumMobile) arrayList2.get(i11);
                if (itemAlbumMobile2 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("fromFeed", true);
                    C3000l0 c3000l0 = this.f123537B;
                    if (c3000l0 != null) {
                        i12 = c3000l0.f11896q0;
                    } else {
                        i12 = -1;
                    }
                    bundle.putInt("fromTimelineTab", i12);
                    bundle.putInt("EXTRA_INT_SUB_TITLE_MODE", 3);
                    bundle.putInt("EXTRA_INT_IMAGE_VIEWER_TYPE", 4);
                    bundle.putString("feedId", c3020p0.f12057p);
                    bundle.putString("userId", c3020p0.f12022B.f12280b);
                    if (c3020p0.m14493X()) {
                        bundle.putBoolean("viewOnly", true);
                    }
                    if (arrayList2.size() > 1) {
                        ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                            ItemAlbumMobile itemAlbumMobile3 = new ItemAlbumMobile((ItemAlbumMobile) arrayList2.get(i15));
                            if (hashMap.get(itemAlbumMobile3.f42595r) != null) {
                                c3020p02 = (C3020p0) hashMap.get(itemAlbumMobile3.f42595r);
                            } else {
                                c3020p02 = c3020p0;
                            }
                            if (c3020p02 != null) {
                                itemAlbumMobile3.f42605w = c3020p02.f12022B.f12282d;
                                itemAlbumMobile3.f42564O = c3020p02.f12062u;
                                itemAlbumMobile3.f42599t = c3020p02.f12057p;
                                itemAlbumMobile3.f42548C = itemAlbumMobile3.m40526m0();
                                itemAlbumMobile3.m40528o0(c3020p02);
                            }
                            arrayList3.add(itemAlbumMobile3);
                        }
                        bundle.putParcelableArrayList("medialist", arrayList3);
                        bundle.putBoolean("hasGridPhoto", true);
                        bundle.putInt("currentIndex", i11);
                    } else {
                        ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                        ItemAlbumMobile itemAlbumMobile4 = new ItemAlbumMobile(itemAlbumMobile2);
                        itemAlbumMobile4.f42605w = c3020p0.f12022B.f12282d;
                        itemAlbumMobile4.f42564O = c3020p0.f12062u;
                        itemAlbumMobile4.f42599t = c3020p0.f12057p;
                        itemAlbumMobile4.f42548C = itemAlbumMobile4.m40526m0();
                        itemAlbumMobile4.m40528o0(c3020p0);
                        arrayList4.add(itemAlbumMobile4);
                        bundle.putParcelableArrayList("medialist", arrayList4);
                    }
                    if (this.f123548v != null) {
                        C31995kc.m154255c().m154258d(c3020p0.f12057p, bVar);
                        this.f123548v.mo11941Yk(animationTarget, itemAlbumMobile2.f42607x, bundle, bVar, c3020p0, new TrackingSource(12), true);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p489rn.AbstractC25856c2, com.zing.p058v4.view.AbstractC6881a
    /* renamed from: g */
    public int mo35335g() {
        ArrayList arrayList = this.f123539D;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: k */
    public Object mo35339k(final ViewGroup viewGroup, final int i11) {
        View view;
        FeedItemTextModuleView feedItemTextModuleView;
        View view2;
        FeedItemPhotoModuleView feedItemPhotoModuleView;
        View view3;
        FeedItemPhotoMultiModuleView feedItemPhotoMultiModuleView;
        View view4;
        FeedItemStickerModulesView feedItemStickerModulesView;
        View view5;
        FeedItemLinkModulesView feedItemLinkModulesView;
        View view6;
        FeedItemVideo feedItemVideo;
        View view7;
        FeedItemBiography feedItemBiography;
        View view8;
        FeedItemSuggestBanner feedItemSuggestBanner;
        View view9;
        FeedItemSocialAlbum feedItemSocialAlbum;
        View view10;
        FeedItemOptionModuleView feedItemOptionModuleView;
        final C3020p0 m133575N = m133575N(i11);
        if (m133575N != null) {
            try {
                int i12 = 0;
                if (m133575N.m14489T()) {
                    if (m133574K(i11)) {
                        Map map = (Map) this.f123536A.get(89);
                        if (map == null) {
                            HashMap hashMap = new HashMap();
                            feedItemOptionModuleView = new FeedItemOptionModuleView(this.f123547u);
                            feedItemOptionModuleView.m43908t0(1);
                            hashMap.put(Integer.valueOf(i11), feedItemOptionModuleView);
                            this.f123536A.put(89, hashMap);
                        } else if (map.containsKey(Integer.valueOf(i11)) && map.get(Integer.valueOf(i11)) != null) {
                            feedItemOptionModuleView = (FeedItemOptionModuleView) mo133439A(map, i11);
                        } else {
                            feedItemOptionModuleView = new FeedItemOptionModuleView(this.f123547u);
                            feedItemOptionModuleView.m43908t0(1);
                            map.put(Integer.valueOf(i11), feedItemOptionModuleView);
                            this.f123536A.put(89, map);
                        }
                        feedItemOptionModuleView.setFeedContent(this.f123537B);
                        feedItemOptionModuleView.setFeedCallback(this.f123548v);
                        feedItemOptionModuleView.m43900m0(this.f123537B, i11);
                        mo133443w(i11, feedItemOptionModuleView);
                        viewGroup.addView(feedItemOptionModuleView);
                        return feedItemOptionModuleView;
                    }
                    if (this.f123543H.get(2) == null) {
                        view10 = this.f123551y.inflate(AbstractC7409c0.loading_layout_feed, viewGroup, false);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(view10);
                        this.f123543H.put(2, arrayList);
                    } else {
                        ArrayList arrayList2 = (ArrayList) this.f123543H.get(2);
                        if (i11 < arrayList2.size() && arrayList2.get(i11) != null) {
                            view10 = (View) arrayList2.get(i11);
                        } else {
                            View inflate = this.f123551y.inflate(AbstractC7409c0.loading_layout_feed, viewGroup, false);
                            arrayList2.add(inflate);
                            this.f123543H.put(2, arrayList2);
                            view10 = inflate;
                        }
                    }
                    mo133443w(i11, view10);
                    viewGroup.addView(view10);
                    return view10;
                }
                int i13 = m133575N.f12058q;
                if (i13 == 1) {
                    if (m133574K(i11)) {
                        Map map2 = (Map) this.f123536A.get(2);
                        if (map2 == null) {
                            HashMap hashMap2 = new HashMap();
                            feedItemTextModuleView = new FeedItemTextModuleView(this.f123547u);
                            feedItemTextModuleView.mo43705j0(this.f123547u, 1);
                            hashMap2.put(Integer.valueOf(i11), feedItemTextModuleView);
                            this.f123536A.put(2, hashMap2);
                        } else if (map2.containsKey(Integer.valueOf(i11)) && map2.get(Integer.valueOf(i11)) != null) {
                            feedItemTextModuleView = (FeedItemTextModuleView) mo133439A(map2, i11);
                        } else {
                            feedItemTextModuleView = new FeedItemTextModuleView(this.f123547u);
                            feedItemTextModuleView.mo43705j0(this.f123547u, 1);
                            map2.put(Integer.valueOf(i11), feedItemTextModuleView);
                            this.f123536A.put(2, map2);
                        }
                        FeedItemTextModuleView feedItemTextModuleView2 = feedItemTextModuleView;
                        feedItemTextModuleView2.m43696Y(this.f123537B, i11, this.f123538C, this.f123548v, this.f123550x);
                        feedItemTextModuleView2.mo43698b0(this.f123537B, i11, this.f123547u, this.f123548v, this.f123550x, false, null, this.f123538C);
                        feedItemTextModuleView2.m43695X(this.f123537B, i11, this.f123538C, this.f123548v);
                        feedItemTextModuleView2.setOnProfileClickListener(this.f123549w.m133501J(this.f123537B, i11));
                        feedItemTextModuleView2.setOnFooterClickListener(m133567R(i11));
                        feedItemTextModuleView2.setOnAvatarClickListener(this.f123549w.m133503L(this.f123537B, m133575N, i11, this.f123544I));
                        feedItemTextModuleView2.setOnFeedMenuClickListener(this.f123549w.m133497D(this.f123537B, m133575N));
                        feedItemTextModuleView2.setOnItemClickListener(this.f123549w.m133495B(this.f123537B, i11, true, null));
                        feedItemTextModuleView2.setOnRecentlyLikeClickListener(this.f123549w.m133507P(m133575N));
                        mo133443w(i11, feedItemTextModuleView2);
                        viewGroup.addView(feedItemTextModuleView2);
                        return feedItemTextModuleView2;
                    }
                    if (this.f123543H.get(2) == null) {
                        view = this.f123551y.inflate(AbstractC7409c0.loading_layout_feed, viewGroup, false);
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(view);
                        this.f123543H.put(2, arrayList3);
                    } else {
                        ArrayList arrayList4 = (ArrayList) this.f123543H.get(2);
                        if (i11 < arrayList4.size() && arrayList4.get(i11) != null) {
                            view = (View) arrayList4.get(i11);
                        } else {
                            View inflate2 = this.f123551y.inflate(AbstractC7409c0.loading_layout_feed, viewGroup, false);
                            arrayList4.add(inflate2);
                            this.f123543H.put(2, arrayList4);
                            view = inflate2;
                        }
                    }
                    mo133443w(i11, view);
                    viewGroup.addView(view);
                    return view;
                }
                if (i13 == 2) {
                    if (m133574K(i11)) {
                        Map map3 = (Map) this.f123536A.get(3);
                        if (map3 == null) {
                            HashMap hashMap3 = new HashMap();
                            feedItemPhotoModuleView = new FeedItemPhotoModuleView(this.f123547u);
                            feedItemPhotoModuleView.mo43705j0(this.f123547u, 1);
                            hashMap3.put(Integer.valueOf(i11), feedItemPhotoModuleView);
                            this.f123536A.put(3, hashMap3);
                        } else if (map3.containsKey(Integer.valueOf(i11)) && map3.get(Integer.valueOf(i11)) != null) {
                            feedItemPhotoModuleView = (FeedItemPhotoModuleView) mo133439A(map3, i11);
                        } else {
                            feedItemPhotoModuleView = new FeedItemPhotoModuleView(this.f123547u);
                            feedItemPhotoModuleView.mo43705j0(this.f123547u, 1);
                            map3.put(Integer.valueOf(i11), feedItemPhotoModuleView);
                            this.f123536A.put(3, map3);
                        }
                        FeedItemPhotoModuleView feedItemPhotoModuleView2 = feedItemPhotoModuleView;
                        feedItemPhotoModuleView2.m43696Y(this.f123537B, i11, this.f123538C, this.f123548v, this.f123550x);
                        feedItemPhotoModuleView2.mo43698b0(this.f123537B, i11, this.f123547u, this.f123548v, this.f123550x, false, null, this.f123538C);
                        feedItemPhotoModuleView2.m43936W0(this.f123537B, i11, i11, this.f123546K, this.f123538C, null, this.f123548v);
                        feedItemPhotoModuleView2.m43695X(this.f123537B, i11, this.f123538C, this.f123548v);
                        feedItemPhotoModuleView2.setOnProfileClickListener(this.f123549w.m133501J(this.f123537B, i11));
                        feedItemPhotoModuleView2.setOnAvatarClickListener(this.f123549w.m133503L(this.f123537B, m133575N, i11, this.f123544I));
                        feedItemPhotoModuleView2.setOnFooterClickListener(m133567R(i11));
                        feedItemPhotoModuleView2.setOnGroupPhotoClickListener(new C16719g.c() { // from class: rn.g0
                            @Override // com.zing.zalo.uidrawing.C16719g.c
                            /* renamed from: y */
                            public final void mo929y(C16719g c16719g) {
                                C25897n0.this.m133568S(i11, viewGroup, m133575N, c16719g);
                            }
                        });
                        feedItemPhotoModuleView2.setOnFeedMenuClickListener(this.f123549w.m133497D(this.f123537B, m133575N));
                        feedItemPhotoModuleView2.setOnRecentlyLikeClickListener(this.f123549w.m133507P(m133575N));
                        feedItemPhotoModuleView2.setPhotoLongClickListener(this.f123549w.m133511x());
                        feedItemPhotoModuleView2.setOnItemClickListener(this.f123549w.m133495B(this.f123537B, i11, true, null));
                        mo133443w(i11, feedItemPhotoModuleView2);
                        viewGroup.addView(feedItemPhotoModuleView2);
                        return feedItemPhotoModuleView2;
                    }
                    if (this.f123543H.get(3) == null) {
                        view2 = this.f123551y.inflate(AbstractC7409c0.loading_layout_feed, viewGroup, false);
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.add(view2);
                        this.f123543H.put(3, arrayList5);
                    } else {
                        ArrayList arrayList6 = (ArrayList) this.f123543H.get(3);
                        if (i11 < arrayList6.size() && arrayList6.get(i11) != null) {
                            view2 = (View) arrayList6.get(i11);
                        } else {
                            View inflate3 = this.f123551y.inflate(AbstractC7409c0.loading_layout_feed, viewGroup, false);
                            arrayList6.add(inflate3);
                            this.f123543H.put(3, arrayList6);
                            view2 = inflate3;
                        }
                    }
                    mo133443w(i11, view2);
                    viewGroup.addView(view2);
                    return view2;
                }
                if (i13 == 3) {
                    if (m133574K(i11)) {
                        Map map4 = (Map) this.f123536A.get(5);
                        if (map4 == null) {
                            HashMap hashMap4 = new HashMap();
                            feedItemPhotoMultiModuleView = new FeedItemPhotoMultiModuleView(this.f123547u);
                            feedItemPhotoMultiModuleView.mo43705j0(this.f123547u, 1);
                            hashMap4.put(Integer.valueOf(i11), feedItemPhotoMultiModuleView);
                            this.f123536A.put(5, hashMap4);
                        } else if (map4.containsKey(Integer.valueOf(i11)) && map4.get(Integer.valueOf(i11)) != null) {
                            feedItemPhotoMultiModuleView = (FeedItemPhotoMultiModuleView) mo133439A(map4, i11);
                        } else {
                            feedItemPhotoMultiModuleView = new FeedItemPhotoMultiModuleView(this.f123547u);
                            feedItemPhotoMultiModuleView.mo43705j0(this.f123547u, 1);
                            map4.put(Integer.valueOf(i11), feedItemPhotoMultiModuleView);
                            this.f123536A.put(5, map4);
                        }
                        FeedItemPhotoMultiModuleView feedItemPhotoMultiModuleView2 = feedItemPhotoMultiModuleView;
                        feedItemPhotoMultiModuleView2.mo43698b0(this.f123537B, i11, this.f123547u, this.f123548v, this.f123550x, false, null, this.f123538C);
                        int i14 = 0;
                        while (i12 < i11) {
                            i14 += ((C3020p0) this.f123539D.get(i12)).f12023C.f12118i.size();
                            i12++;
                        }
                        feedItemPhotoMultiModuleView2.m43696Y(this.f123537B, i11, this.f123538C, this.f123548v, this.f123550x);
                        feedItemPhotoMultiModuleView2.m43984n1(3, i11, this.f123537B, i11, this.f123546K, this.f123538C, i14, null, this.f123548v);
                        feedItemPhotoMultiModuleView2.m43881y0(this.f123537B, Integer.valueOf(i11));
                        feedItemPhotoMultiModuleView2.m43695X(this.f123537B, i11, this.f123538C, this.f123548v);
                        feedItemPhotoMultiModuleView2.setOnProfileClickListener(this.f123549w.m133501J(this.f123537B, i11));
                        feedItemPhotoMultiModuleView2.setOnAvatarClickListener(this.f123549w.m133503L(this.f123537B, m133575N, i11, this.f123544I));
                        feedItemPhotoMultiModuleView2.setOnFooterClickListener(m133567R(i11));
                        feedItemPhotoMultiModuleView2.setOnGroupItemClickListener(new FeedGridView.InterfaceC8858a() { // from class: rn.h0
                        });
                        feedItemPhotoMultiModuleView2.setOnHorFeedGrListener(new c() { // from class: rn.i0
                            @Override // p489rn.C25897n0.c
                            /* renamed from: a */
                            public final void mo133514a(AnimationTarget animationTarget, int i15) {
                                C25897n0.this.m133569T(i11, viewGroup, m133575N, animationTarget, i15);
                            }
                        });
                        feedItemPhotoMultiModuleView2.setOnFeedMenuClickListener(this.f123549w.m133497D(this.f123537B, m133575N));
                        feedItemPhotoMultiModuleView2.setOnRecentlyLikeClickListener(this.f123549w.m133507P(m133575N));
                        feedItemPhotoMultiModuleView2.setPhotoLongClickListener(this.f123549w.m133511x());
                        feedItemPhotoMultiModuleView2.setOnItemClickListener(this.f123549w.m133495B(this.f123537B, i11, true, null));
                        mo133443w(i11, feedItemPhotoMultiModuleView2);
                        viewGroup.addView(feedItemPhotoMultiModuleView2);
                        return feedItemPhotoMultiModuleView2;
                    }
                    if (this.f123543H.get(5) == null) {
                        view3 = this.f123551y.inflate(AbstractC7409c0.loading_layout_feed, viewGroup, false);
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.add(view3);
                        this.f123543H.put(5, arrayList7);
                    } else {
                        ArrayList arrayList8 = (ArrayList) this.f123543H.get(5);
                        if (i11 < arrayList8.size() && arrayList8.get(i11) != null) {
                            view3 = (View) arrayList8.get(i11);
                        } else {
                            View inflate4 = this.f123551y.inflate(AbstractC7409c0.loading_layout_feed, viewGroup, false);
                            arrayList8.add(inflate4);
                            this.f123543H.put(5, arrayList8);
                            view3 = inflate4;
                        }
                    }
                    mo133443w(i11, view3);
                    viewGroup.addView(view3);
                    return view3;
                }
                if (i13 != 6) {
                    if (i13 != 7) {
                        if (i13 == 17) {
                            if (m133574K(i11)) {
                                Map map5 = (Map) this.f123536A.get(49);
                                if (map5 == null) {
                                    HashMap hashMap5 = new HashMap();
                                    feedItemVideo = new FeedItemVideo(this.f123547u);
                                    feedItemVideo.mo43688p(this.f123547u, 1);
                                    hashMap5.put(Integer.valueOf(i11), feedItemVideo);
                                    this.f123536A.put(49, hashMap5);
                                } else if (i11 < map5.size() && map5.get(Integer.valueOf(i11)) != null) {
                                    feedItemVideo = (FeedItemVideo) mo133439A(map5, i11);
                                } else {
                                    feedItemVideo = new FeedItemVideo(this.f123547u);
                                    feedItemVideo.mo43688p(this.f123547u, 1);
                                    map5.put(Integer.valueOf(i11), feedItemVideo);
                                    this.f123536A.put(49, map5);
                                }
                                final FeedItemVideo feedItemVideo2 = feedItemVideo;
                                FeedItemBase.m43679x(feedItemVideo2, this.f123537B);
                                FeedItemBase.m43657B(feedItemVideo2, this.f123537B, i11, this.f123538C, this.f123550x);
                                feedItemVideo2.mo43897w0(this.f123537B, i11, this.f123538C, this.f123547u, this.f123550x, this.f123548v);
                                FeedItemBase.m43680z(this.f123547u, feedItemVideo2, this.f123537B, i11, this.f123538C, this.f123548v);
                                FeedItemBase.m43664J(feedItemVideo2, this.f123549w.m133500I(this.f123537B, i11));
                                FeedItemBase.m43661G(feedItemVideo2, this.f123549w.m133502K(this.f123537B, m133575N, i11, this.f123544I));
                                FeedItemBase.m43663I(feedItemVideo2, m133565P(i11, m133575N));
                                FeedItemBase.m43662H(feedItemVideo2, this.f123549w.m133496C(this.f123537B, m133575N));
                                FeedItemBase.m43665K(feedItemVideo2, this.f123549w.m133506O(m133575N));
                                final C17391z m108789V = AbstractC20826v0.m108789V(m133575N);
                                feedItemVideo2.setOnVideoViewClickListener(new View.OnClickListener() { // from class: rn.j0
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view11) {
                                        C25897n0.this.m133570U(i11, m108789V, feedItemVideo2, view11);
                                    }
                                });
                                feedItemVideo2.setOnItemClickListener(this.f123549w.m133494A(this.f123537B, i11, true, null));
                                mo133443w(i11, feedItemVideo2);
                                viewGroup.addView(feedItemVideo2);
                                return feedItemVideo2;
                            }
                            if (this.f123543H.get(49) == null) {
                                view6 = this.f123551y.inflate(AbstractC7409c0.loading_layout_feed, viewGroup, false);
                                ArrayList arrayList9 = new ArrayList();
                                arrayList9.add(view6);
                                this.f123543H.put(49, arrayList9);
                            } else {
                                ArrayList arrayList10 = (ArrayList) this.f123543H.get(49);
                                if (i11 < arrayList10.size() && arrayList10.get(i11) != null) {
                                    view6 = (View) arrayList10.get(i11);
                                } else {
                                    View inflate5 = this.f123551y.inflate(AbstractC7409c0.loading_layout_feed, viewGroup, false);
                                    arrayList10.add(inflate5);
                                    this.f123543H.put(49, arrayList10);
                                    view6 = inflate5;
                                }
                            }
                            mo133443w(i11, view6);
                            viewGroup.addView(view6);
                            return view6;
                        }
                        if (i13 == 21) {
                            if (m133574K(i11)) {
                                Map map6 = (Map) this.f123536A.get(59);
                                if (map6 == null) {
                                    HashMap hashMap6 = new HashMap();
                                    feedItemBiography = new FeedItemBiography(this.f123547u);
                                    feedItemBiography.mo43688p(this.f123547u, 1);
                                    hashMap6.put(Integer.valueOf(i11), feedItemBiography);
                                    this.f123536A.put(59, hashMap6);
                                } else if (map6.containsKey(Integer.valueOf(i11)) && map6.get(Integer.valueOf(i11)) != null) {
                                    feedItemBiography = (FeedItemBiography) mo133439A(map6, i11);
                                } else {
                                    feedItemBiography = new FeedItemBiography(this.f123547u);
                                    feedItemBiography.mo43688p(this.f123547u, 1);
                                    map6.put(Integer.valueOf(i11), feedItemBiography);
                                    this.f123536A.put(59, map6);
                                }
                                FeedItemBiography feedItemBiography2 = feedItemBiography;
                                FeedItemBase.m43679x(feedItemBiography2, this.f123537B);
                                FeedItemBase.m43657B(feedItemBiography2, this.f123537B, i11, this.f123538C, this.f123550x);
                                FeedItemBase.m43660F(feedItemBiography2, this.f123537B, i11, this.f123547u, this.f123548v, this.f123550x, false, null);
                                FeedItemBase.m43680z(this.f123547u, feedItemBiography2, this.f123537B, i11, this.f123538C, this.f123548v);
                                FeedItemBase.m43664J(feedItemBiography2, this.f123549w.m133500I(this.f123537B, i11));
                                FeedItemBase.m43663I(feedItemBiography2, m133564O(i11));
                                FeedItemBase.m43662H(feedItemBiography2, this.f123549w.m133496C(this.f123537B, m133575N));
                                FeedItemBase.m43665K(feedItemBiography2, this.f123549w.m133506O(m133575N));
                                feedItemBiography2.m43711S(this.f123537B, i11, this.f123538C);
                                feedItemBiography2.setOnItemClickListener(this.f123549w.m133494A(this.f123537B, i11, true, null));
                                mo133443w(i11, feedItemBiography2);
                                viewGroup.addView(feedItemBiography2);
                                return feedItemBiography2;
                            }
                            if (this.f123543H.get(59) == null) {
                                view7 = this.f123551y.inflate(AbstractC7409c0.loading_layout_feed, viewGroup, false);
                                ArrayList arrayList11 = new ArrayList();
                                arrayList11.add(view7);
                                this.f123543H.put(59, arrayList11);
                            } else {
                                ArrayList arrayList12 = (ArrayList) this.f123543H.get(59);
                                if (i11 < arrayList12.size() && arrayList12.get(i11) != null) {
                                    view7 = (View) arrayList12.get(i11);
                                } else {
                                    View inflate6 = this.f123551y.inflate(AbstractC7409c0.loading_layout_feed, viewGroup, false);
                                    arrayList12.add(inflate6);
                                    this.f123543H.put(59, arrayList12);
                                    view7 = inflate6;
                                }
                            }
                            mo133443w(i11, view7);
                            viewGroup.addView(view7);
                            return view7;
                        }
                        if (i13 == 100) {
                            if (m133574K(i11)) {
                                Map map7 = (Map) this.f123536A.get(38);
                                if (map7 == null) {
                                    HashMap hashMap7 = new HashMap();
                                    feedItemSuggestBanner = new FeedItemSuggestBanner(this.f123547u);
                                    feedItemSuggestBanner.mo43688p(this.f123547u, 1);
                                    hashMap7.put(Integer.valueOf(i11), feedItemSuggestBanner);
                                    this.f123536A.put(38, hashMap7);
                                } else if (map7.containsKey(Integer.valueOf(i11)) && map7.get(Integer.valueOf(i11)) != null) {
                                    feedItemSuggestBanner = (FeedItemSuggestBanner) mo133439A(map7, i11);
                                } else {
                                    feedItemSuggestBanner = new FeedItemSuggestBanner(this.f123547u);
                                    feedItemSuggestBanner.mo43688p(this.f123547u, 1);
                                    map7.put(Integer.valueOf(i11), feedItemSuggestBanner);
                                    this.f123536A.put(38, map7);
                                }
                                feedItemSuggestBanner.setFeedContent(this.f123537B);
                                feedItemSuggestBanner.m44109b0(this.f123537B, i11, this.f123548v, this.f123538C);
                                viewGroup.addView(feedItemSuggestBanner);
                                return feedItemSuggestBanner;
                            }
                            if (this.f123543H.get(38) == null) {
                                view8 = this.f123551y.inflate(AbstractC7409c0.loading_layout_feed, viewGroup, false);
                                ArrayList arrayList13 = new ArrayList();
                                arrayList13.add(view8);
                                this.f123543H.put(38, arrayList13);
                            } else {
                                ArrayList arrayList14 = (ArrayList) this.f123543H.get(38);
                                if (i11 < arrayList14.size() && arrayList14.get(i11) != null) {
                                    view8 = (View) arrayList14.get(i11);
                                } else {
                                    View inflate7 = this.f123551y.inflate(AbstractC7409c0.loading_layout_feed, viewGroup, false);
                                    arrayList14.add(inflate7);
                                    this.f123543H.put(38, arrayList14);
                                    view8 = inflate7;
                                }
                            }
                            viewGroup.addView(view8);
                            return view8;
                        }
                        if (i13 == 23) {
                            if (m133574K(i11)) {
                                Map map8 = (Map) this.f123536A.get(88);
                                if (map8 == null) {
                                    HashMap hashMap8 = new HashMap();
                                    feedItemSocialAlbum = new FeedItemSocialAlbum(this.f123547u);
                                    feedItemSocialAlbum.mo43688p(this.f123547u, 1);
                                    hashMap8.put(Integer.valueOf(i11), feedItemSocialAlbum);
                                    this.f123536A.put(88, hashMap8);
                                } else if (i11 < map8.size() && map8.get(Integer.valueOf(i11)) != null) {
                                    feedItemSocialAlbum = (FeedItemSocialAlbum) mo133439A(map8, i11);
                                } else {
                                    feedItemSocialAlbum = new FeedItemSocialAlbum(this.f123547u);
                                    feedItemSocialAlbum.mo43688p(this.f123547u, 1);
                                    map8.put(Integer.valueOf(i11), feedItemSocialAlbum);
                                    this.f123536A.put(88, map8);
                                }
                                final FeedItemSocialAlbum feedItemSocialAlbum2 = feedItemSocialAlbum;
                                int i15 = 0;
                                while (i12 < i11) {
                                    i15 += ((C3020p0) this.f123539D.get(i12)).f12023C.f12118i.size();
                                    i12++;
                                }
                                FeedItemBase.m43679x(feedItemSocialAlbum2, this.f123537B);
                                feedItemSocialAlbum2.setScrolling(this.f123538C);
                                feedItemSocialAlbum2.setDataType(23);
                                feedItemSocialAlbum2.setDataPosition(i11);
                                feedItemSocialAlbum2.setCurrentPosition(i15);
                                feedItemSocialAlbum2.setParentView(this.f123546K);
                                feedItemSocialAlbum2.m44010R(i11, this.f123548v, this.f123550x, null);
                                FeedItemBase.m43680z(this.f123547u, feedItemSocialAlbum2, this.f123537B, i11, this.f123538C, this.f123548v);
                                FeedItemBase.m43664J(feedItemSocialAlbum2, this.f123549w.m133500I(this.f123537B, i11));
                                FeedItemBase.m43661G(feedItemSocialAlbum2, this.f123549w.m133502K(this.f123537B, m133575N, i11, this.f123544I));
                                FeedItemBase.m43663I(feedItemSocialAlbum2, m133565P(i11, m133575N));
                                FeedItemBase.m43662H(feedItemSocialAlbum2, this.f123549w.m133496C(this.f123537B, m133575N));
                                FeedItemBase.m43665K(feedItemSocialAlbum2, this.f123549w.m133506O(m133575N));
                                feedItemSocialAlbum2.setOnItemClickListener(this.f123549w.m133494A(this.f123537B, i11, true, null));
                                feedItemSocialAlbum2.m44017Z(this.f123537B, i11);
                                feedItemSocialAlbum2.setOnVideoViewClickListener(new View.OnClickListener() { // from class: rn.k0
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view11) {
                                        C25897n0.this.m133571V(i11, m133575N, feedItemSocialAlbum2, view11);
                                    }
                                });
                                feedItemSocialAlbum2.setVideoMixClickListener(new FeedItemSocialAlbumPhoto.InterfaceC8127a() { // from class: rn.l0
                                    @Override // com.zing.zalo.feed.components.FeedItemSocialAlbumPhoto.InterfaceC8127a
                                    /* renamed from: a */
                                    public final void mo44050a(int i16) {
                                        C25897n0.this.m133572W(i11, i16);
                                    }
                                });
                                feedItemSocialAlbum2.setOnHorFeedGrListener(new c() { // from class: rn.m0
                                    @Override // p489rn.C25897n0.c
                                    /* renamed from: a */
                                    public final void mo133514a(AnimationTarget animationTarget, int i16) {
                                        C25897n0.this.m133573X(i11, viewGroup, m133575N, animationTarget, i16);
                                    }
                                });
                                mo133443w(i11, feedItemSocialAlbum2);
                                viewGroup.addView(feedItemSocialAlbum2);
                                return feedItemSocialAlbum2;
                            }
                            if (this.f123543H.get(88) == null) {
                                view9 = this.f123551y.inflate(AbstractC7409c0.loading_layout_feed, viewGroup, false);
                                ArrayList arrayList15 = new ArrayList();
                                arrayList15.add(view9);
                                this.f123543H.put(88, arrayList15);
                            } else {
                                ArrayList arrayList16 = (ArrayList) this.f123543H.get(88);
                                if (i11 < arrayList16.size() && arrayList16.get(i11) != null) {
                                    view9 = (View) arrayList16.get(i11);
                                } else {
                                    View inflate8 = this.f123551y.inflate(AbstractC7409c0.loading_layout_feed, viewGroup, false);
                                    arrayList16.add(inflate8);
                                    this.f123543H.put(88, arrayList16);
                                    view9 = inflate8;
                                }
                            }
                            mo133443w(i11, view9);
                            viewGroup.addView(view9);
                            return view9;
                        }
                        if (i13 != 24) {
                        }
                    }
                    if (m133574K(i11)) {
                        Map map9 = (Map) this.f123536A.get(9);
                        if (map9 == null) {
                            HashMap hashMap9 = new HashMap();
                            feedItemLinkModulesView = new FeedItemLinkModulesView(this.f123547u);
                            feedItemLinkModulesView.mo43705j0(this.f123547u, 1);
                            hashMap9.put(Integer.valueOf(i11), feedItemLinkModulesView);
                            this.f123536A.put(9, hashMap9);
                        } else if (map9.containsKey(Integer.valueOf(i11)) && map9.get(Integer.valueOf(i11)) != null) {
                            feedItemLinkModulesView = (FeedItemLinkModulesView) mo133439A(map9, i11);
                        } else {
                            feedItemLinkModulesView = new FeedItemLinkModulesView(this.f123547u);
                            feedItemLinkModulesView.mo43705j0(this.f123547u, 1);
                            map9.put(Integer.valueOf(i11), feedItemLinkModulesView);
                            this.f123536A.put(9, map9);
                        }
                        FeedItemLinkModulesView feedItemLinkModulesView2 = feedItemLinkModulesView;
                        feedItemLinkModulesView2.m43696Y(this.f123537B, i11, this.f123538C, this.f123548v, this.f123550x);
                        feedItemLinkModulesView2.m43800B0(this.f123537B, i11, this.f123547u, this.f123538C, this.f123548v, this.f123550x);
                        feedItemLinkModulesView2.m43695X(this.f123537B, i11, this.f123538C, this.f123548v);
                        feedItemLinkModulesView2.setOnProfileClickListener(this.f123549w.m133501J(this.f123537B, i11));
                        feedItemLinkModulesView2.setOnAvatarClickListener(this.f123549w.m133503L(this.f123537B, m133575N, i11, this.f123544I));
                        feedItemLinkModulesView2.setOnFooterClickListener(m133566Q(i11, m133575N));
                        feedItemLinkModulesView2.setOnFeedMenuClickListener(this.f123549w.m133497D(this.f123537B, m133575N));
                        feedItemLinkModulesView2.setOnRecentlyLikeClickListener(this.f123549w.m133507P(m133575N));
                        mo133443w(i11, feedItemLinkModulesView2);
                        viewGroup.addView(feedItemLinkModulesView2);
                        return feedItemLinkModulesView2;
                    }
                    if (this.f123543H.get(9) == null) {
                        view5 = this.f123551y.inflate(AbstractC7409c0.loading_layout_feed, viewGroup, false);
                        ArrayList arrayList17 = new ArrayList();
                        arrayList17.add(view5);
                        this.f123543H.put(9, arrayList17);
                    } else {
                        ArrayList arrayList18 = (ArrayList) this.f123543H.get(9);
                        if (i11 < arrayList18.size() && arrayList18.get(i11) != null) {
                            view5 = (View) arrayList18.get(i11);
                        } else {
                            View inflate9 = this.f123551y.inflate(AbstractC7409c0.loading_layout_feed, viewGroup, false);
                            arrayList18.add(inflate9);
                            this.f123543H.put(9, arrayList18);
                            view5 = inflate9;
                        }
                    }
                    mo133443w(i11, view5);
                    viewGroup.addView(view5);
                    return view5;
                }
                if (m133574K(i11)) {
                    Map map10 = (Map) this.f123536A.get(8);
                    if (map10 == null) {
                        HashMap hashMap10 = new HashMap();
                        feedItemStickerModulesView = new FeedItemStickerModulesView(this.f123547u);
                        feedItemStickerModulesView.mo43705j0(this.f123547u, 1);
                        hashMap10.put(Integer.valueOf(i11), feedItemStickerModulesView);
                        this.f123536A.put(8, hashMap10);
                    } else if (map10.containsKey(Integer.valueOf(i11)) && map10.get(Integer.valueOf(i11)) != null) {
                        feedItemStickerModulesView = (FeedItemStickerModulesView) mo133439A(map10, i11);
                    } else {
                        feedItemStickerModulesView = new FeedItemStickerModulesView(this.f123547u);
                        feedItemStickerModulesView.mo43705j0(this.f123547u, 1);
                        map10.put(Integer.valueOf(i11), feedItemStickerModulesView);
                        this.f123536A.put(8, map10);
                    }
                    FeedItemStickerModulesView feedItemStickerModulesView2 = feedItemStickerModulesView;
                    feedItemStickerModulesView2.m43696Y(this.f123537B, i11, this.f123538C, this.f123548v, this.f123550x);
                    feedItemStickerModulesView2.mo43698b0(this.f123537B, i11, this.f123547u, this.f123548v, this.f123550x, false, null, this.f123538C);
                    feedItemStickerModulesView2.m44092o0(this.f123537B, i11, this.f123538C, this.f123548v, "TIMELINE_");
                    feedItemStickerModulesView2.m43695X(this.f123537B, i11, this.f123538C, this.f123548v);
                    feedItemStickerModulesView2.setOnProfileClickListener(this.f123549w.m133501J(this.f123537B, i11));
                    feedItemStickerModulesView2.setOnAvatarClickListener(this.f123549w.m133503L(this.f123537B, m133575N, i11, this.f123544I));
                    feedItemStickerModulesView2.setOnFooterClickListener(m133567R(i11));
                    feedItemStickerModulesView2.setOnFeedMenuClickListener(this.f123549w.m133497D(this.f123537B, m133575N));
                    feedItemStickerModulesView2.setOnRecentlyLikeClickListener(this.f123549w.m133507P(m133575N));
                    feedItemStickerModulesView2.setOnItemClickListener(this.f123549w.m133495B(this.f123537B, i11, true, null));
                    mo133443w(i11, feedItemStickerModulesView2);
                    viewGroup.addView(feedItemStickerModulesView2);
                    return feedItemStickerModulesView2;
                }
                if (this.f123543H.get(8) == null) {
                    view4 = this.f123551y.inflate(AbstractC7409c0.loading_layout_feed, viewGroup, false);
                    ArrayList arrayList19 = new ArrayList();
                    arrayList19.add(view4);
                    this.f123543H.put(8, arrayList19);
                } else {
                    ArrayList arrayList20 = (ArrayList) this.f123543H.get(8);
                    if (i11 < arrayList20.size() && arrayList20.get(i11) != null) {
                        view4 = (View) arrayList20.get(i11);
                    } else {
                        View inflate10 = this.f123551y.inflate(AbstractC7409c0.loading_layout_feed, viewGroup, false);
                        arrayList20.add(inflate10);
                        this.f123543H.put(8, arrayList20);
                        view4 = inflate10;
                    }
                }
                mo133443w(i11, view4);
                viewGroup.addView(view4);
                return view4;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return this.f123551y.inflate(AbstractC7409c0.feed_item_unsupport, (ViewGroup) null);
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: l */
    public boolean mo35340l(View view, Object obj) {
        return view == obj;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: u */
    public void mo35349u(ViewGroup viewGroup) {
        super.mo35349u(viewGroup);
        this.f123546K = viewGroup;
    }
}
