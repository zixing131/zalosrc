package com.zing.zalo.camera.gallerypicker;

import ag0.AbstractC0837p0;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import cg.AbstractC3460h;
import com.zing.zalo.MainApplication;
import com.zing.zalo.camera.filterpicker.customviews.FilterPickerRoundedCornerImageView;
import com.zing.zalo.camera.gallerypicker.C7639a;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.data.mediapicker.model.VideoItem;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.utils.ToastUtils;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23222t7;
import me0.AbstractC23280z4;
import me0.C23278z2;
import p649xl.C29919m1;
import th.AbstractC26689j;

/* renamed from: com.zing.zalo.camera.gallerypicker.a */
/* loaded from: classes3.dex */
public class C7639a extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private final a f41286r;

    /* renamed from: s */
    private boolean f41287s = false;

    /* renamed from: t */
    private final List f41288t = new ArrayList();

    /* renamed from: u */
    private final int f41289u;

    /* renamed from: com.zing.zalo.camera.gallerypicker.a$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo39336a(Intent intent);
    }

    /* renamed from: com.zing.zalo.camera.gallerypicker.a$b */
    /* loaded from: classes3.dex */
    public static class b extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        C29919m1 f41290I;

        b(C29919m1 c29919m1) {
            super(c29919m1.getRoot());
            this.f41290I = c29919m1;
            FilterPickerRoundedCornerImageView filterPickerRoundedCornerImageView = c29919m1.f138639s;
            int i11 = AbstractC23222t7.f112567j0;
            filterPickerRoundedCornerImageView.m39320e(i11, i11, AbstractC23222t7.f112556e);
        }

        /* renamed from: j0 */
        static b m39362j0(ViewGroup viewGroup) {
            return new b(C29919m1.m148227c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
        }

        /* renamed from: i0 */
        void m39363i0(MediaItem mediaItem, int i11, boolean z11) {
            int i12 = AbstractC23222t7.f112552c;
            int i13 = AbstractC23222t7.f112584s;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f7784p.getLayoutParams();
            if (i11 != 0) {
                i13 = i12;
            }
            marginLayoutParams.leftMargin = i13;
            marginLayoutParams.rightMargin = i12;
            this.f7784p.setLayoutParams(marginLayoutParams);
            if (mediaItem == null) {
                this.f41290I.f138639s.setVisibility(8);
                this.f41290I.f138637q.setVisibility(8);
                this.f41290I.f138638r.setVisibility(8);
                return;
            }
            int i14 = 0;
            this.f41290I.f138639s.setVisibility(0);
            this.f41290I.f138639s.setDrawBorder(false);
            this.f41290I.f138639s.m39316a(AbstractC23280z4.m120364z(mediaItem), C23278z2.m120134j0(), z11);
            if (mediaItem instanceof VideoItem) {
                this.f41290I.f138638r.setVisibility(8);
                this.f41290I.f138637q.setVisibility(0);
                this.f41290I.f138637q.setText(AbstractC3460h.m17440h(((VideoItem) mediaItem).m41213t1()));
                return;
            }
            RobotoTextView robotoTextView = this.f41290I.f138638r;
            if (!mediaItem.m41163p0()) {
                i14 = 8;
            }
            robotoTextView.setVisibility(i14);
            this.f41290I.f138637q.setVisibility(8);
        }
    }

    public C7639a(a aVar, int i11) {
        this.f41286r = aVar;
        this.f41289u = i11;
        m9999J(true);
    }

    /* renamed from: O */
    private void m39353O(MediaItem mediaItem) {
        if (mediaItem == null) {
            return;
        }
        if (mediaItem.m41163p0()) {
            ToastUtils.m89273u();
        } else {
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: ye.b

                /* renamed from: q */
                public final /* synthetic */ MediaItem f142583q;

                public /* synthetic */ RunnableC30916b(MediaItem mediaItem2) {
                    r2 = mediaItem2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C7639a.this.m39355Q(r2);
                }
            });
        }
    }

    /* renamed from: P */
    public /* synthetic */ void m39354P(Intent intent) {
        a aVar = this.f41286r;
        if (aVar != null) {
            aVar.mo39336a(intent);
        }
    }

    /* renamed from: Q */
    public /* synthetic */ void m39355Q(MediaItem mediaItem) {
        try {
            ArrayList arrayList = new ArrayList();
            if (mediaItem.m41159n0()) {
                arrayList.add(mediaItem);
            }
            MediaItem[] mediaItemArr = (MediaItem[]) arrayList.toArray(new MediaItem[arrayList.size()]);
            if (mediaItemArr.length > 0) {
                Intent intent = new Intent();
                intent.putExtra("result_selected_items", mediaItemArr);
                intent.setExtrasClassLoader(MainApplication.getAppContext().getClassLoader());
                AbstractC19444a.m101695c(new Runnable() { // from class: ye.c

                    /* renamed from: q */
                    public final /* synthetic */ Intent f142585q;

                    public /* synthetic */ RunnableC30917c(Intent intent2) {
                        r2 = intent2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C7639a.this.m39354P(r2);
                    }
                });
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: R */
    public /* synthetic */ void m39356R(MediaItem mediaItem, b bVar, View view) {
        if (mediaItem instanceof VideoItem) {
            m39357U(mediaItem);
        } else if (bVar.f41290I.f138639s.getRoundView().m76474m()) {
            m39357U(mediaItem);
        } else {
            ToastUtils.m89273u();
        }
    }

    /* renamed from: U */
    private void m39357U(MediaItem mediaItem) {
        try {
            if (AbstractC26689j.f126436b && (mediaItem instanceof VideoItem)) {
                VideoItem videoItem = (VideoItem) mediaItem;
                if (AbstractC3460h.m17437e(videoItem.getWidth(), videoItem.getHeight(), videoItem.m41213t1(), this.f41289u) > AbstractC26689j.m137108q(this.f41289u)) {
                    videoItem.m41209E1(true);
                }
            }
            m39353O(mediaItem);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: S */
    public void mo9990A(b bVar, int i11) {
        try {
            MediaItem mediaItem = (MediaItem) this.f41288t.get(i11);
            bVar.m39363i0(mediaItem, i11, this.f41287s);
            bVar.f7784p.setOnClickListener(new View.OnClickListener() { // from class: ye.a

                /* renamed from: q */
                public final /* synthetic */ MediaItem f142580q;

                /* renamed from: r */
                public final /* synthetic */ C7639a.b f142581r;

                public /* synthetic */ ViewOnClickListenerC30915a(MediaItem mediaItem2, C7639a.b bVar2) {
                    r2 = mediaItem2;
                    r3 = bVar2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C7639a.this.m39356R(r2, r3, view);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: T */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        return b.m39362j0(viewGroup);
    }

    /* renamed from: V */
    public void m39360V(List list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList(list);
        } else {
            arrayList = new ArrayList();
        }
        this.f41288t.clear();
        this.f41288t.addAll(arrayList);
        m10008p();
    }

    /* renamed from: W */
    public void m39361W(boolean z11) {
        this.f41287s = z11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f41288t.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        if (i11 < this.f41288t.size()) {
            return ((MediaItem) this.f41288t.get(i11)).mo41090x();
        }
        return super.mo10004l(i11);
    }
}
