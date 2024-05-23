package p489rn;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import ao.InterfaceC2259a;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3025q0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.feed.components.suggestitems.SuggestItemOAGif;
import com.zing.zalo.feed.components.suggestitems.SuggestItemOAPhotoModulesView;
import com.zing.zalo.feed.components.suggestitems.SuggestItemOAVideoModulesView;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zview.AbstractC17466e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import p354n3.C23528a;

/* renamed from: rn.y0 */
/* loaded from: classes4.dex */
public class C25930y0 extends AbstractC25856c2 {

    /* renamed from: A */
    private ArrayList f123648A;

    /* renamed from: B */
    public boolean[] f123649B;

    /* renamed from: C */
    private final HashMap f123650C;

    /* renamed from: D */
    private final HashMap f123651D;

    /* renamed from: E */
    private int f123652E;

    /* renamed from: u */
    private final Context f123653u;

    /* renamed from: v */
    private final LayoutInflater f123654v;

    /* renamed from: w */
    InterfaceC2259a f123655w;

    /* renamed from: x */
    C3000l0 f123656x;

    /* renamed from: y */
    private final C23528a f123657y;

    /* renamed from: z */
    private boolean f123658z = false;

    /* renamed from: rn.y0$a */
    /* loaded from: classes4.dex */
    class a implements SuggestItemOAVideoModulesView.InterfaceC8387a {

        /* renamed from: a */
        final /* synthetic */ int f123659a;

        a(int i11) {
            this.f123659a = i11;
        }

        @Override // com.zing.zalo.feed.components.suggestitems.SuggestItemOAVideoModulesView.InterfaceC8387a
        /* renamed from: a */
        public void mo44874a(C17391z c17391z) {
            try {
                C25930y0 c25930y0 = C25930y0.this;
                InterfaceC2259a interfaceC2259a = c25930y0.f123655w;
                if (interfaceC2259a != null) {
                    interfaceC2259a.mo11957ig(c25930y0.f123656x, this.f123659a, c17391z, 1, null, null);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.feed.components.suggestitems.SuggestItemOAVideoModulesView.InterfaceC8387a
        /* renamed from: b */
        public void mo44875b(String str) {
            InterfaceC2259a interfaceC2259a = C25930y0.this.f123655w;
            if (interfaceC2259a != null) {
                interfaceC2259a.mo11970tq(str);
            }
        }
    }

    public C25930y0(Context context, HashMap hashMap, HashMap hashMap2, boolean[] zArr) {
        this.f123653u = context;
        this.f123654v = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f123651D = hashMap;
        this.f123657y = new C23528a(context);
        this.f123650C = hashMap2;
        this.f123649B = zArr;
    }

    /* renamed from: E */
    private boolean m133593E(int i11) {
        boolean[] zArr = this.f123649B;
        if (zArr != null && i11 >= 0 && i11 < zArr.length) {
            return zArr[i11];
        }
        AbstractC23350e.m122774d("FEEDGROUPHORIZONTAL", "VIEWPAGER PAGE INDEX IS OUT OF BOUND");
        return true;
    }

    @Override // p489rn.AbstractC25856c2
    /* renamed from: A */
    public View mo133439A(Map map, int i11) {
        View view = (View) map.get(Integer.valueOf(i11));
        if (view != null) {
            if ((i11 > 0 && i11 != mo35335g() - 1) || (i11 == 0 && mo35335g() == 1)) {
                view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            } else if (i11 == 0 || i11 == mo35335g() - 1) {
                view.setLayoutParams(new RelativeLayout.LayoutParams((int) Math.floor(m133446z()), -1));
            }
        }
        return view;
    }

    /* renamed from: F */
    public C3025q0.d m133594F(int i11) {
        ArrayList arrayList = this.f123648A;
        if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
            return (C3025q0.d) this.f123648A.get(i11);
        }
        return null;
    }

    /* renamed from: G */
    public boolean m133595G() {
        ArrayList arrayList = this.f123648A;
        if (arrayList != null && arrayList.size() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public void m133596H(int i11) {
        this.f123652E = i11;
    }

    /* renamed from: I */
    public void m133597I(ArrayList arrayList, C3000l0 c3000l0) {
        this.f123648A = new ArrayList(arrayList);
        this.f123656x = c3000l0;
    }

    /* renamed from: J */
    public void m133598J(InterfaceC2259a interfaceC2259a) {
        this.f123655w = interfaceC2259a;
    }

    /* renamed from: K */
    public void m133599K(boolean z11) {
        this.f123658z = z11;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: d */
    public void mo35332d(ViewGroup viewGroup, int i11, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p489rn.AbstractC25856c2, com.zing.p058v4.view.AbstractC6881a
    /* renamed from: g */
    public int mo35335g() {
        ArrayList arrayList = this.f123648A;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // p489rn.AbstractC25856c2, com.zing.p058v4.view.AbstractC6881a
    /* renamed from: j */
    public float mo35338j(int i11) {
        if ((i11 == 0 || i11 == mo35335g() - 1) && mo35335g() > 1) {
            return m133446z();
        }
        return 1.0f;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: k */
    public Object mo35339k(ViewGroup viewGroup, int i11) {
        View view;
        SuggestItemOAVideoModulesView suggestItemOAVideoModulesView;
        View view2;
        SuggestItemOAGif suggestItemOAGif;
        int m118742r;
        View view3;
        SuggestItemOAPhotoModulesView suggestItemOAPhotoModulesView;
        C3025q0.d m133594F = m133594F(i11);
        C3020p0 m14322a0 = this.f123656x.m14322a0();
        if (m133594F != null && m14322a0 != null) {
            try {
                if (m14322a0.f12058q == 108) {
                    int i12 = m133594F.f12175f;
                    if (i12 == 1) {
                        if (m133593E(i11)) {
                            Map map = (Map) this.f123651D.get(1);
                            if (map == null) {
                                HashMap hashMap = new HashMap();
                                suggestItemOAPhotoModulesView = new SuggestItemOAPhotoModulesView(this.f123653u);
                                suggestItemOAPhotoModulesView.mo43705j0(this.f123653u, 0);
                                hashMap.put(Integer.valueOf(i11), suggestItemOAPhotoModulesView);
                                this.f123651D.put(1, hashMap);
                            } else if (map.containsKey(Integer.valueOf(i11)) && map.get(Integer.valueOf(i11)) != null) {
                                suggestItemOAPhotoModulesView = (SuggestItemOAPhotoModulesView) mo133439A(map, i11);
                            } else {
                                suggestItemOAPhotoModulesView = new SuggestItemOAPhotoModulesView(this.f123653u);
                                suggestItemOAPhotoModulesView.mo43705j0(this.f123653u, 0);
                                map.put(Integer.valueOf(i11), suggestItemOAPhotoModulesView);
                                this.f123651D.put(1, map);
                            }
                            SuggestItemOAPhotoModulesView suggestItemOAPhotoModulesView2 = suggestItemOAPhotoModulesView;
                            suggestItemOAPhotoModulesView2.m44869t0(this.f123656x, m133594F, this.f123658z, this.f123655w, m133595G());
                            if (this.f123648A.size() == 1) {
                                suggestItemOAPhotoModulesView2.setSuggestBackground(AbstractC23136l9.m118665N(suggestItemOAPhotoModulesView2.getContext(), AbstractC17466e.white));
                            }
                            mo133443w(i11, suggestItemOAPhotoModulesView2);
                            viewGroup.addView(suggestItemOAPhotoModulesView2);
                            return suggestItemOAPhotoModulesView2;
                        }
                        if (this.f123650C.get(1) == null) {
                            view3 = this.f123654v.inflate(AbstractC7409c0.loading_layout_feed, viewGroup, false);
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(view3);
                            this.f123650C.put(1, arrayList);
                        } else {
                            ArrayList arrayList2 = (ArrayList) this.f123650C.get(1);
                            if (i11 < arrayList2.size() && arrayList2.get(i11) != null) {
                                view3 = (View) arrayList2.get(i11);
                            } else {
                                View inflate = this.f123654v.inflate(AbstractC7409c0.loading_layout_feed, viewGroup, false);
                                arrayList2.add(inflate);
                                this.f123650C.put(1, arrayList2);
                                view3 = inflate;
                            }
                        }
                        mo133443w(i11, view3);
                        viewGroup.addView(view3);
                        return view3;
                    }
                    if (i12 == 2) {
                        if (m133593E(i11)) {
                            Map map2 = (Map) this.f123651D.get(2);
                            if (map2 == null) {
                                HashMap hashMap2 = new HashMap();
                                suggestItemOAGif = new SuggestItemOAGif(this.f123653u);
                                suggestItemOAGif.mo43688p(this.f123653u, 0);
                                hashMap2.put(Integer.valueOf(i11), suggestItemOAGif);
                                this.f123651D.put(2, hashMap2);
                            } else if (map2.containsKey(Integer.valueOf(i11)) && map2.get(Integer.valueOf(i11)) != null) {
                                suggestItemOAGif = (SuggestItemOAGif) mo133439A(map2, i11);
                            } else {
                                suggestItemOAGif = new SuggestItemOAGif(this.f123653u);
                                suggestItemOAGif.mo43688p(this.f123653u, 0);
                                map2.put(Integer.valueOf(i11), suggestItemOAGif);
                                this.f123651D.put(2, map2);
                            }
                            SuggestItemOAGif suggestItemOAGif2 = suggestItemOAGif;
                            suggestItemOAGif2.setPosition(i11);
                            C3000l0 c3000l0 = this.f123656x;
                            boolean z11 = this.f123658z;
                            InterfaceC2259a interfaceC2259a = this.f123655w;
                            if (this.f123648A.size() == 1) {
                                m118742r = this.f123652E;
                            } else {
                                m118742r = this.f123652E - AbstractC23136l9.m118742r(4.0f);
                            }
                            suggestItemOAGif2.m44860O(c3000l0, m133594F, z11, interfaceC2259a, m118742r);
                            if (this.f123648A.size() == 1) {
                                suggestItemOAGif2.setSuggestBackground(AbstractC23136l9.m118665N(suggestItemOAGif2.getContext(), AbstractC17466e.white));
                            }
                            mo133443w(i11, suggestItemOAGif2);
                            viewGroup.addView(suggestItemOAGif2);
                            return suggestItemOAGif2;
                        }
                        if (this.f123650C.get(2) == null) {
                            view2 = this.f123654v.inflate(AbstractC7409c0.loading_layout_feed, viewGroup, false);
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(view2);
                            this.f123650C.put(2, arrayList3);
                        } else {
                            ArrayList arrayList4 = (ArrayList) this.f123650C.get(2);
                            if (i11 < arrayList4.size() && arrayList4.get(i11) != null) {
                                view2 = (View) arrayList4.get(i11);
                            } else {
                                View inflate2 = this.f123654v.inflate(AbstractC7409c0.loading_layout_feed, viewGroup, false);
                                arrayList4.add(inflate2);
                                this.f123650C.put(2, arrayList4);
                                view2 = inflate2;
                            }
                        }
                        mo133443w(i11, view2);
                        viewGroup.addView(view2);
                        return view2;
                    }
                    if (i12 == 3) {
                        if (m133593E(i11)) {
                            Map map3 = (Map) this.f123651D.get(3);
                            if (map3 == null) {
                                HashMap hashMap3 = new HashMap();
                                suggestItemOAVideoModulesView = new SuggestItemOAVideoModulesView(this.f123653u);
                                suggestItemOAVideoModulesView.mo43705j0(this.f123653u, 0);
                                hashMap3.put(Integer.valueOf(i11), suggestItemOAVideoModulesView);
                                this.f123651D.put(3, hashMap3);
                            } else if (map3.containsKey(Integer.valueOf(i11)) && map3.get(Integer.valueOf(i11)) != null) {
                                suggestItemOAVideoModulesView = (SuggestItemOAVideoModulesView) mo133439A(map3, i11);
                            } else {
                                suggestItemOAVideoModulesView = new SuggestItemOAVideoModulesView(this.f123653u);
                                suggestItemOAVideoModulesView.mo43705j0(this.f123653u, 0);
                                map3.put(Integer.valueOf(i11), suggestItemOAVideoModulesView);
                                this.f123651D.put(3, map3);
                            }
                            suggestItemOAVideoModulesView.m44873o0(this.f123656x, m133594F, this.f123658z, this.f123655w);
                            suggestItemOAVideoModulesView.setOnVideoViewClickListener(new a(i11));
                            if (this.f123648A.size() == 1) {
                                suggestItemOAVideoModulesView.setSuggestBackground(AbstractC23136l9.m118665N(suggestItemOAVideoModulesView.getContext(), AbstractC17466e.white));
                            }
                            mo133443w(i11, suggestItemOAVideoModulesView);
                            viewGroup.addView(suggestItemOAVideoModulesView);
                            return suggestItemOAVideoModulesView;
                        }
                        if (this.f123650C.get(3) == null) {
                            view = this.f123654v.inflate(AbstractC7409c0.loading_layout_feed, viewGroup, false);
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(view);
                            this.f123650C.put(3, arrayList5);
                        } else {
                            ArrayList arrayList6 = (ArrayList) this.f123650C.get(3);
                            if (i11 < arrayList6.size() && arrayList6.get(i11) != null) {
                                view = (View) arrayList6.get(i11);
                            } else {
                                View inflate3 = this.f123654v.inflate(AbstractC7409c0.loading_layout_feed, viewGroup, false);
                                arrayList6.add(inflate3);
                                this.f123650C.put(3, arrayList6);
                                view = inflate3;
                            }
                        }
                        mo133443w(i11, view);
                        viewGroup.addView(view);
                        return view;
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return this.f123654v.inflate(AbstractC7409c0.feed_item_unsupport, (ViewGroup) null);
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: l */
    public boolean mo35340l(View view, Object obj) {
        return view == obj;
    }

    @Override // p489rn.AbstractC25856c2
    /* renamed from: w */
    public void mo133443w(int i11, View view) {
        if (i11 == 0 && mo35335g() == 1) {
            view.setPadding(0, 0, 0, 0);
            return;
        }
        if (i11 == 0) {
            view.setPadding(m133445y(), 0, m133444x(), 0);
        } else if (i11 == mo35335g() - 1) {
            view.setPadding(m133444x(), 0, m133445y(), 0);
        } else {
            view.setPadding(m133444x(), 0, m133444x(), 0);
        }
    }
}
