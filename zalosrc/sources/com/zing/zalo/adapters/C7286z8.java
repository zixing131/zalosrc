package com.zing.zalo.adapters;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.p058v4.view.AbstractC6881a;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7286z8;
import com.zing.zalo.p077ui.zviews.StoryDetailsView;
import com.zing.zalo.uicontrol.BaseStoryItemView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalocore.CoreUtility;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.List;
import l30.C22021e0;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p304ks.AbstractC21935u;
import p716zh.C31980jc;
import p716zh.C32123ta;
import vg.AbstractC28065f8;
import vg.C28195t7;

/* renamed from: com.zing.zalo.adapters.z8 */
/* loaded from: classes3.dex */
public class C7286z8 extends AbstractC6881a {

    /* renamed from: B */
    c f39927B;

    /* renamed from: C */
    b f39928C;

    /* renamed from: D */
    d f39929D;

    /* renamed from: u */
    StoryDetailsView f39933u;

    /* renamed from: v */
    int f39934v;

    /* renamed from: w */
    C28195t7 f39935w;

    /* renamed from: z */
    public View f39938z;

    /* renamed from: r */
    List f39930r = new ArrayList();

    /* renamed from: s */
    int f39931s = 0;

    /* renamed from: t */
    boolean f39932t = false;

    /* renamed from: x */
    public SparseArray f39936x = new SparseArray();

    /* renamed from: y */
    private final Handler f39937y = new Handler(Looper.getMainLooper());

    /* renamed from: A */
    boolean f39926A = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.adapters.z8$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f39939a;

        /* renamed from: b */
        final /* synthetic */ BaseStoryItemView f39940b;

        /* renamed from: c */
        final /* synthetic */ C31980jc f39941c;

        a(int i11, BaseStoryItemView baseStoryItemView, C31980jc c31980jc) {
            this.f39939a = i11;
            this.f39940b = baseStoryItemView;
            this.f39941c = c31980jc;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m37065e(BaseStoryItemView baseStoryItemView, int i11, String str) {
            if (baseStoryItemView != null) {
                try {
                    C7286z8.this.m37058z(baseStoryItemView, i11, str);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static /* synthetic */ void m37066f(BaseStoryItemView baseStoryItemView, C31980jc c31980jc, C20096c c20096c) {
            if (baseStoryItemView != null) {
                try {
                    if (c31980jc.f147031x.isEmpty()) {
                        baseStoryItemView.mo87709q(c31980jc);
                        baseStoryItemView.setShowLoading(false);
                        baseStoryItemView.mo87702a0(1, null, c20096c);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            Handler handler = C7286z8.this.f39937y;
            final BaseStoryItemView baseStoryItemView = this.f39940b;
            final C31980jc c31980jc = this.f39941c;
            handler.post(new Runnable() { // from class: com.zing.zalo.adapters.x8
                @Override // java.lang.Runnable
                public final void run() {
                    C7286z8.a.m37066f(BaseStoryItemView.this, c31980jc, c20096c);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                final String optString = ((JSONObject) obj).optString("uid");
                if (C7286z8.this.f39934v == 5) {
                    optString = optString + this.f39939a;
                }
                Handler handler = C7286z8.this.f39937y;
                final BaseStoryItemView baseStoryItemView = this.f39940b;
                final int i11 = this.f39939a;
                handler.post(new Runnable() { // from class: com.zing.zalo.adapters.y8
                    @Override // java.lang.Runnable
                    public final void run() {
                        C7286z8.a.this.m37065e(baseStoryItemView, i11, optString);
                    }
                });
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.z8$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: a */
        void mo37067a(BaseStoryItemView baseStoryItemView, C32123ta c32123ta);

        /* renamed from: b */
        void mo37068b(BaseStoryItemView baseStoryItemView, C31980jc c31980jc);
    }

    /* renamed from: com.zing.zalo.adapters.z8$c */
    /* loaded from: classes3.dex */
    public interface c extends BaseStoryItemView.InterfaceC16456f {
        /* renamed from: N */
        boolean mo37069N();

        /* renamed from: z */
        void mo37070z();
    }

    /* renamed from: com.zing.zalo.adapters.z8$d */
    /* loaded from: classes3.dex */
    public interface d {
        /* renamed from: a */
        void mo37071a(C32123ta c32123ta, BaseStoryItemView baseStoryItemView);

        void onStop();
    }

    public C7286z8(StoryDetailsView storyDetailsView, c cVar, int i11, C28195t7 c28195t7) {
        this.f39933u = storyDetailsView;
        this.f39927B = cVar;
        this.f39934v = i11;
        this.f39935w = c28195t7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public void m37058z(BaseStoryItemView baseStoryItemView, int i11, String str) {
        int i12;
        try {
            List list = this.f39930r;
            if (list != null && (i12 = this.f39931s) >= 0 && i12 <= list.size() && this.f39928C != null) {
                C31980jc c31980jc = (C31980jc) this.f39930r.get(this.f39931s);
                if (c31980jc.f147023p.equals(str)) {
                    this.f39928C.mo37068b(baseStoryItemView, c31980jc);
                    if (!c31980jc.m153831x()) {
                        if (c31980jc.m153825r() == null) {
                            c31980jc.f147017B = 0;
                        }
                        this.f39928C.mo37067a(baseStoryItemView, c31980jc.m153825r());
                        d dVar = this.f39929D;
                        if (dVar != null) {
                            dVar.mo37071a(c31980jc.m153825r(), baseStoryItemView);
                            return;
                        }
                        return;
                    }
                    int i13 = this.f39934v;
                    if (i13 != 0 && i13 != 4 && c31980jc.f147031x.size() == 0) {
                        StoryDetailsView storyDetailsView = this.f39933u;
                        if (storyDetailsView != null) {
                            storyDetailsView.finish();
                        }
                        if (!CoreUtility.f89233i.equals(c31980jc.f147023p)) {
                            ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_story_error_deleted_new, AbstractC21935u.m114542i(c31980jc.f147023p, c31980jc.f147024q)));
                            return;
                        } else {
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_error_deleted));
                            return;
                        }
                    }
                    baseStoryItemView.setShowLoading(false);
                    baseStoryItemView.mo87702a0(3, c31980jc.m153825r(), null);
                    return;
                }
                C31980jc c31980jc2 = (C31980jc) this.f39930r.get(i11);
                if (c31980jc2.f147031x.size() > 0) {
                    if (c31980jc2.m153825r() == null) {
                        c31980jc2.f147017B = 0;
                    }
                    b bVar = this.f39928C;
                    if (bVar != null) {
                        bVar.mo37068b(baseStoryItemView, c31980jc2);
                        this.f39928C.mo37067a(baseStoryItemView, c31980jc2.m153825r());
                    }
                    baseStoryItemView.mo87709q(c31980jc2);
                    baseStoryItemView.mo87710r(c31980jc2.m153825r());
                    return;
                }
                baseStoryItemView.setShowLoading(false);
                baseStoryItemView.mo87702a0(3, c31980jc2.m153825r(), null);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: A */
    public void m37059A(List list) {
        this.f39930r = new ArrayList(list);
        mo35341m();
    }

    /* renamed from: B */
    public void m37060B(b bVar) {
        this.f39928C = bVar;
    }

    /* renamed from: C */
    public void m37061C(d dVar) {
        this.f39929D = dVar;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: d */
    public void mo35332d(ViewGroup viewGroup, int i11, Object obj) {
        viewGroup.removeView((View) obj);
        if (this.f39936x.get(i11) == obj) {
            BaseStoryItemView baseStoryItemView = (BaseStoryItemView) obj;
            if (baseStoryItemView != null) {
                baseStoryItemView.m87700Y();
            }
            this.f39936x.delete(i11);
            C28195t7 c28195t7 = this.f39935w;
            if (c28195t7 != null && c28195t7.m141781g() == baseStoryItemView) {
                this.f39929D.onStop();
            }
        }
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: f */
    public void mo35334f(ViewGroup viewGroup) {
        super.mo35334f(viewGroup);
        if (!this.f39926A) {
            this.f39926A = true;
            c cVar = this.f39927B;
            if (cVar != null) {
                cVar.mo37070z();
            }
        }
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: g */
    public int mo35335g() {
        return this.f39930r.size();
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: h */
    public int mo35336h(Object obj) {
        try {
            if (obj instanceof BaseStoryItemView) {
                BaseStoryItemView baseStoryItemView = (BaseStoryItemView) obj;
                int keyAt = this.f39936x.keyAt(this.f39936x.indexOfValue(baseStoryItemView));
                C31980jc c31980jc = baseStoryItemView.f83110a0;
                if (keyAt < this.f39930r.size() && this.f39930r.get(keyAt) == baseStoryItemView.f83110a0 && this.f39930r.contains(c31980jc)) {
                    if (this.f39930r.get(keyAt) == c31980jc) {
                        return -1;
                    }
                }
                return -2;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (this.f39932t) {
            return -2;
        }
        return super.mo35336h(obj);
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: k */
    public Object mo35339k(ViewGroup viewGroup, int i11) {
        BaseStoryItemView baseStoryItemView;
        KeyEvent.Callback view = new View(viewGroup.getContext());
        C31980jc c31980jc = (C31980jc) this.f39930r.get(i11);
        KeyEvent.Callback callback = view;
        if (c31980jc != null) {
            if (c31980jc.f147023p.equals(CoreUtility.f89233i)) {
                baseStoryItemView = (BaseStoryItemView) LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.story_details_item_view_mine, viewGroup, false);
            } else {
                int i12 = c31980jc.f147029v;
                if (i12 == -1) {
                    baseStoryItemView = (BaseStoryItemView) LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.story_details_item_view_intro, viewGroup, false);
                } else if (i12 == 1) {
                    baseStoryItemView = (BaseStoryItemView) LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.story_details_item_view_oa, viewGroup, false);
                } else if (i12 == 2) {
                    baseStoryItemView = (BaseStoryItemView) LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.story_details_item_view_ads, viewGroup, false);
                } else {
                    baseStoryItemView = (BaseStoryItemView) LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.story_details_item_view_friend, viewGroup, false);
                }
            }
            StoryDetailsView storyDetailsView = this.f39933u;
            if (storyDetailsView != null) {
                baseStoryItemView.setInChatHead(storyDetailsView.m92676n2().mo35576n3());
            }
            baseStoryItemView.mo87709q(c31980jc);
            baseStoryItemView.setOnStoryItemViewInteractListener(this.f39927B);
            viewGroup.addView(baseStoryItemView);
            this.f39936x.put(i11, baseStoryItemView);
            m37062y(c31980jc, baseStoryItemView, i11);
            callback = baseStoryItemView;
        }
        return callback;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: l */
    public boolean mo35340l(View view, Object obj) {
        return view == obj;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: r */
    public void mo35346r(ViewGroup viewGroup, int i11, Object obj) {
        boolean z11;
        super.mo35346r(viewGroup, i11, obj);
        if (i11 == this.f39931s) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f39932t = z11;
        this.f39931s = i11;
        this.f39938z = (View) obj;
    }

    /* renamed from: y */
    public void m37062y(C31980jc c31980jc, BaseStoryItemView baseStoryItemView, int i11) {
        if (!c31980jc.f147031x.isEmpty() && c31980jc.f147020E != 0 && !c31980jc.f147019D) {
            AbstractC28065f8.m141534d(c31980jc);
            if (c31980jc.m153825r() != null) {
                baseStoryItemView.mo87710r(c31980jc.m153825r());
                return;
            }
            return;
        }
        a aVar = new a(i11, baseStoryItemView, c31980jc);
        c cVar = this.f39927B;
        if ((cVar != null && !cVar.mo37069N()) || c31980jc.f147029v == 2) {
            String str = c31980jc.f147023p;
            if (this.f39934v == 5) {
                str = str + i11;
            }
            m37058z(baseStoryItemView, i11, str);
            return;
        }
        int i12 = this.f39934v;
        if (i12 != 0 && i12 != 4) {
            C22021e0.m114963p().m114991n(c31980jc.f147023p, this.f39934v, aVar);
        } else {
            C22021e0.m114963p().m114989l(c31980jc.f147023p, aVar);
        }
    }
}
