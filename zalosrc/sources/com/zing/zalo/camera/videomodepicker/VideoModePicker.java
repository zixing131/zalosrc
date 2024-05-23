package com.zing.zalo.camera.videomodepicker;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.AbstractC1906a0;
import androidx.recyclerview.widget.C1924q;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.camera.videomodepicker.C7758a;
import com.zing.zalo.uicontrol.SmoothScrollLinearLayoutManager;
import com.zing.zalo.uicontrol.recyclerview.ZRecyclerView;
import com.zing.zalo.utils.ToastUtils;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import p207he.C20024r;
import p322lf.AbstractC22463d;
import p322lf.AbstractC22470k;
import p348mi.AbstractC23309i;
import th.AbstractC26689j;

/* loaded from: classes3.dex */
public final class VideoModePicker extends FrameLayout {

    /* renamed from: A */
    private RecyclerView.AbstractC1892s f41595A;

    /* renamed from: p */
    private final CameraInputParams f41596p;

    /* renamed from: q */
    private final boolean f41597q;

    /* renamed from: r */
    private final InterfaceC7755a f41598r;

    /* renamed from: s */
    private C7758a f41599s;

    /* renamed from: t */
    private ZRecyclerView f41600t;

    /* renamed from: u */
    private SmoothScrollLinearLayoutManager f41601u;

    /* renamed from: v */
    private AbstractC1906a0 f41602v;

    /* renamed from: w */
    private final SparseIntArray f41603w;

    /* renamed from: x */
    private int f41604x;

    /* renamed from: y */
    private boolean f41605y;

    /* renamed from: z */
    private final C7758a.a f41606z;

    /* renamed from: com.zing.zalo.camera.videomodepicker.VideoModePicker$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC7755a {
        /* renamed from: a */
        void mo38634a(int i11);

        /* renamed from: b */
        boolean mo38635b();

        /* renamed from: c */
        boolean mo38636c();

        /* renamed from: d */
        boolean mo38637d();

        /* renamed from: e */
        int mo38638e();
    }

    /* renamed from: com.zing.zalo.camera.videomodepicker.VideoModePicker$b */
    /* loaded from: classes3.dex */
    public static final class C7756b extends RecyclerView.AbstractC1892s {
        C7756b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo952b(recyclerView, i11);
            if (i11 == 0) {
                try {
                    if (VideoModePicker.this.m39502k()) {
                        recyclerView.m9837K1(VideoModePicker.this.f41604x);
                        VideoModePicker.this.f41605y = false;
                        return;
                    }
                    if (recyclerView.getVisibility() != 0) {
                        VideoModePicker.this.f41605y = false;
                        return;
                    }
                    AbstractC1906a0 abstractC1906a0 = VideoModePicker.this.f41602v;
                    C7758a c7758a = null;
                    if (abstractC1906a0 == null) {
                        AbstractC19074t.m100223u("snapHelper");
                        abstractC1906a0 = null;
                    }
                    SmoothScrollLinearLayoutManager smoothScrollLinearLayoutManager = VideoModePicker.this.f41601u;
                    if (smoothScrollLinearLayoutManager == null) {
                        AbstractC19074t.m100223u("layoutManager");
                        smoothScrollLinearLayoutManager = null;
                    }
                    View mo10402h = abstractC1906a0.mo10402h(smoothScrollLinearLayoutManager);
                    if (mo10402h != null) {
                        int m9817A0 = recyclerView.m9817A0(mo10402h);
                        if (VideoModePicker.this.f41604x == m9817A0) {
                            VideoModePicker.this.f41605y = false;
                            return;
                        }
                        VideoModePicker.this.f41604x = m9817A0;
                        if (!C20024r.m103941j()) {
                            C7758a c7758a2 = VideoModePicker.this.f41599s;
                            if (c7758a2 == null) {
                                AbstractC19074t.m100223u("adapter");
                            } else {
                                c7758a = c7758a2;
                            }
                            c7758a.m39512R(VideoModePicker.this.f41604x);
                            VideoModePicker.this.f41598r.mo38634a(VideoModePicker.this.f41603w.get(VideoModePicker.this.f41604x));
                            VideoModePicker.this.f41605y = false;
                            return;
                        }
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_can_not_record_video_in_call));
                        VideoModePicker.this.f41604x = 0;
                        recyclerView.mo9854S1(VideoModePicker.this.f41604x);
                        VideoModePicker.this.f41605y = false;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            if (i11 != 0) {
                VideoModePicker.this.f41605y = true;
            }
            super.mo10176d(recyclerView, i11, i12);
        }
    }

    /* renamed from: com.zing.zalo.camera.videomodepicker.VideoModePicker$c */
    /* loaded from: classes3.dex */
    public static final class C7757c implements C7758a.a {
        C7757c() {
        }

        @Override // com.zing.zalo.camera.videomodepicker.C7758a.a
        /* renamed from: a */
        public void mo39505a(int i11) {
            ZRecyclerView zRecyclerView = null;
            C7758a c7758a = null;
            if (VideoModePicker.this.m39502k()) {
                ZRecyclerView zRecyclerView2 = VideoModePicker.this.f41600t;
                if (zRecyclerView2 == null) {
                    AbstractC19074t.m100223u("recyclerView");
                    zRecyclerView2 = null;
                }
                zRecyclerView2.m9837K1(VideoModePicker.this.f41604x);
                C7758a c7758a2 = VideoModePicker.this.f41599s;
                if (c7758a2 == null) {
                    AbstractC19074t.m100223u("adapter");
                } else {
                    c7758a = c7758a2;
                }
                c7758a.m39512R(VideoModePicker.this.f41604x);
                VideoModePicker.this.f41605y = false;
                return;
            }
            VideoModePicker.this.f41605y = true;
            if (VideoModePicker.this.f41604x != i11) {
                VideoModePicker.this.f41604x = i11;
                VideoModePicker.this.f41598r.mo38634a(VideoModePicker.this.f41603w.get(VideoModePicker.this.f41604x));
                ZRecyclerView zRecyclerView3 = VideoModePicker.this.f41600t;
                if (zRecyclerView3 == null) {
                    AbstractC19074t.m100223u("recyclerView");
                } else {
                    zRecyclerView = zRecyclerView3;
                }
                zRecyclerView.mo9854S1(VideoModePicker.this.f41604x);
                return;
            }
            VideoModePicker.this.f41605y = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoModePicker(Context context, CameraInputParams cameraInputParams, boolean z11, InterfaceC7755a interfaceC7755a) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(cameraInputParams, "inputParams");
        AbstractC19074t.m100208f(interfaceC7755a, "listener");
        this.f41596p = cameraInputParams;
        this.f41597q = z11;
        this.f41598r = interfaceC7755a;
        this.f41603w = new SparseIntArray();
        C7757c c7757c = new C7757c();
        this.f41606z = c7757c;
        this.f41595A = new C7756b();
        setId(AbstractC6918a0.video_mode_picker_fl_content);
        setBackgroundColor(0);
        ZRecyclerView zRecyclerView = new ZRecyclerView(context);
        this.f41600t = zRecyclerView;
        zRecyclerView.setMaxVelocity(100);
        ZRecyclerView zRecyclerView2 = this.f41600t;
        View view = null;
        if (zRecyclerView2 == null) {
            AbstractC19074t.m100223u("recyclerView");
            zRecyclerView2 = null;
        }
        zRecyclerView2.setEnableScaleX(true);
        SmoothScrollLinearLayoutManager smoothScrollLinearLayoutManager = new SmoothScrollLinearLayoutManager(context, 0, false);
        this.f41601u = smoothScrollLinearLayoutManager;
        smoothScrollLinearLayoutManager.m88005N2(400.0f);
        this.f41599s = new C7758a(c7757c, m39501j());
        ZRecyclerView zRecyclerView3 = this.f41600t;
        if (zRecyclerView3 == null) {
            AbstractC19074t.m100223u("recyclerView");
            zRecyclerView3 = null;
        }
        SmoothScrollLinearLayoutManager smoothScrollLinearLayoutManager2 = this.f41601u;
        if (smoothScrollLinearLayoutManager2 == null) {
            AbstractC19074t.m100223u("layoutManager");
            smoothScrollLinearLayoutManager2 = null;
        }
        zRecyclerView3.setLayoutManager(smoothScrollLinearLayoutManager2);
        ZRecyclerView zRecyclerView4 = this.f41600t;
        if (zRecyclerView4 == null) {
            AbstractC19074t.m100223u("recyclerView");
            zRecyclerView4 = null;
        }
        C7758a c7758a = this.f41599s;
        if (c7758a == null) {
            AbstractC19074t.m100223u("adapter");
            c7758a = null;
        }
        zRecyclerView4.setAdapter(c7758a);
        ZRecyclerView zRecyclerView5 = this.f41600t;
        if (zRecyclerView5 == null) {
            AbstractC19074t.m100223u("recyclerView");
            zRecyclerView5 = null;
        }
        zRecyclerView5.m9826E(this.f41595A);
        ZRecyclerView zRecyclerView6 = this.f41600t;
        if (zRecyclerView6 == null) {
            AbstractC19074t.m100223u("recyclerView");
            zRecyclerView6 = null;
        }
        zRecyclerView6.setClipToPadding(false);
        C1924q c1924q = new C1924q();
        this.f41602v = c1924q;
        ZRecyclerView zRecyclerView7 = this.f41600t;
        if (zRecyclerView7 == null) {
            AbstractC19074t.m100223u("recyclerView");
            zRecyclerView7 = null;
        }
        c1924q.mo10397b(zRecyclerView7);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(AbstractC16803z.icn_story_arrow_up);
        addView(imageView, new FrameLayout.LayoutParams(AbstractC23222t7.f112582r, AbstractC23222t7.f112564i, 81));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = AbstractC23222t7.f112564i;
        View view2 = this.f41600t;
        if (view2 == null) {
            AbstractC19074t.m100223u("recyclerView");
        } else {
            view = view2;
        }
        addView(view, layoutParams);
    }

    /* renamed from: j */
    private final List m39501j() {
        int i11;
        ArrayList arrayList = new ArrayList();
        if (this.f41597q && this.f41596p.f41129s == 7) {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_video_mode_picker_mood);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            arrayList.add(m118743r0);
            this.f41603w.put(arrayList.size() - 1, 1);
        }
        if (AbstractC22470k.m116156h(this.f41596p)) {
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_camera_mode_picker_document);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            arrayList.add(m118743r02);
            this.f41603w.put(arrayList.size() - 1, 5);
        }
        if (!this.f41596p.f41104W) {
            if (AbstractC26689j.f126436b) {
                i11 = AbstractC8020f0.str_video_mode_picker_photo;
            } else {
                i11 = AbstractC8020f0.str_video_mode_picker_camera;
            }
            String m118743r03 = AbstractC23136l9.m118743r0(i11);
            AbstractC19074t.m100207e(m118743r03, "getString(...)");
            arrayList.add(m118743r03);
            this.f41603w.put(arrayList.size() - 1, 2);
            if (!this.f41596p.f41101T) {
                if (AbstractC26689j.f126436b) {
                    String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_video_mode_picker_video);
                    AbstractC19074t.m100207e(m118743r04, "getString(...)");
                    arrayList.add(m118743r04);
                    this.f41603w.put(arrayList.size() - 1, 3);
                }
                String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_video_mode_picker_loop);
                AbstractC19074t.m100207e(m118743r05, "getString(...)");
                arrayList.add(m118743r05);
                this.f41603w.put(arrayList.size() - 1, 4);
            }
        }
        return arrayList;
    }

    public final View getFirstChildView() {
        ZRecyclerView zRecyclerView = this.f41600t;
        if (zRecyclerView == null) {
            AbstractC19074t.m100223u("recyclerView");
            zRecyclerView = null;
        }
        return zRecyclerView.getChildAt(0);
    }

    /* renamed from: k */
    public final boolean m39502k() {
        boolean z11;
        if (this.f41598r.mo38636c() || this.f41598r.mo38637d() || this.f41598r.mo38635b()) {
            return true;
        }
        int mo38638e = this.f41598r.mo38638e();
        if (this.f41596p.f41129s == 7 && AbstractC23309i.m121196Mf()) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean m116126a = AbstractC22463d.m116126a(getContext(), mo38638e);
        if (z11 && m116126a) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final boolean m39503l() {
        return this.f41605y;
    }

    /* renamed from: m */
    public final void m39504m(int i11) {
        this.f41604x = this.f41603w.indexOfValue(i11);
        ZRecyclerView zRecyclerView = this.f41600t;
        C7758a c7758a = null;
        if (zRecyclerView == null) {
            AbstractC19074t.m100223u("recyclerView");
            zRecyclerView = null;
        }
        zRecyclerView.m9837K1(this.f41604x);
        C7758a c7758a2 = this.f41599s;
        if (c7758a2 == null) {
            AbstractC19074t.m100223u("adapter");
        } else {
            c7758a = c7758a2;
        }
        c7758a.m39512R(this.f41604x);
    }

    public final void setAllowInteract(boolean z11) {
        C7758a c7758a = this.f41599s;
        SmoothScrollLinearLayoutManager smoothScrollLinearLayoutManager = null;
        if (c7758a == null) {
            AbstractC19074t.m100223u("adapter");
            c7758a = null;
        }
        c7758a.m39511Q(z11);
        SmoothScrollLinearLayoutManager smoothScrollLinearLayoutManager2 = this.f41601u;
        if (smoothScrollLinearLayoutManager2 == null) {
            AbstractC19074t.m100223u("layoutManager");
        } else {
            smoothScrollLinearLayoutManager = smoothScrollLinearLayoutManager2;
        }
        smoothScrollLinearLayoutManager.m88006O2(z11);
    }

    public final void setDefaultMode(int i11) {
        try {
            int indexOfValue = this.f41603w.indexOfValue(i11);
            ZRecyclerView zRecyclerView = this.f41600t;
            if (zRecyclerView == null) {
                AbstractC19074t.m100223u("recyclerView");
                zRecyclerView = null;
            }
            zRecyclerView.mo9854S1(indexOfValue);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    public final void setVideoMode(int i11) {
        int size = this.f41603w.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (this.f41603w.valueAt(i12) == i11) {
                C7758a c7758a = this.f41599s;
                if (c7758a == null) {
                    AbstractC19074t.m100223u("adapter");
                    c7758a = null;
                }
                c7758a.m39508M(i12);
                return;
            }
        }
    }
}
