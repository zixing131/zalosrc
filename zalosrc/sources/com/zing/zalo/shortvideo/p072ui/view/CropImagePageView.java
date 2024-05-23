package com.zing.zalo.shortvideo.p072ui.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.core.os.AbstractC1438d;
import androidx.lifecycle.AbstractC1785o;
import com.zing.zalo.shortvideo.p072ui.view.CropImagePageView;
import com.zing.zalo.shortvideo.p072ui.widget.crop.CropView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import en0.InterfaceC18505l;
import en0.InterfaceC18510q;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import h20.InterfaceC19720d;
import java.io.IOException;
import java.io.InputStream;
import m20.InterfaceC22821z;
import me0.AbstractC23254w8;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import pm0.C24860q;
import q10.C24994c2;
import q20.C25097t;
import s20.AbstractC26112n;
import v00.AbstractC27413h;
import w00.AbstractC28684a;

/* loaded from: classes5.dex */
public class CropImagePageView extends AbstractC10623a implements InterfaceC22821z {
    public static final C10203b Companion = new C10203b(null);

    /* renamed from: B0 */
    private InterfaceC19720d f52744B0;

    /* renamed from: C0 */
    private float f52745C0;

    /* renamed from: com.zing.zalo.shortvideo.ui.view.CropImagePageView$a */
    /* loaded from: classes5.dex */
    /* synthetic */ class C10202a extends C19071q implements InterfaceC18510q {

        /* renamed from: y */
        public static final C10202a f52746y = new C10202a();

        C10202a() {
            super(3, C24994c2.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zing/zalo/shortvideo/databinding/ZchPageCropImageBinding;", 0);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m54234h((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        /* renamed from: h */
        public final C24994c2 m54234h(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
            AbstractC19074t.m100208f(layoutInflater, "p0");
            return C24994c2.m129779c(layoutInflater, viewGroup, z11);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.CropImagePageView$b */
    /* loaded from: classes5.dex */
    public static final class C10203b {
        private C10203b() {
        }

        public /* synthetic */ C10203b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ Bundle m54235b(C10203b c10203b, Uri uri, float f11, boolean z11, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f11 = 1.0f;
            }
            if ((i11 & 4) != 0) {
                z11 = false;
            }
            return c10203b.m54236a(uri, f11, z11);
        }

        /* renamed from: a */
        public final Bundle m54236a(Uri uri, float f11, boolean z11) {
            return AbstractC1438d.m7341b(AbstractC24866w.m129235a("xImageUri", uri), AbstractC24866w.m129235a("xOutputRatio", Float.valueOf(f11)), AbstractC24866w.m129235a("xCircleCrop", Boolean.valueOf(z11)));
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.CropImagePageView$c */
    /* loaded from: classes5.dex */
    static final class C10204c extends AbstractC19075u implements InterfaceC18505l {
        C10204c() {
            super(1);
        }

        /* renamed from: a */
        public final void m54237a(View view) {
            AbstractC19074t.m100208f(view, "it");
            CropImagePageView.this.finish();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54237a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.CropImagePageView$d */
    /* loaded from: classes5.dex */
    static final class C10205d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ C24994c2 f52749r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.view.CropImagePageView$d$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ CropImagePageView f52750q;

            /* renamed from: r */
            final /* synthetic */ C24994c2 f52751r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(CropImagePageView cropImagePageView, C24994c2 c24994c2) {
                super(1);
                this.f52750q = cropImagePageView;
                this.f52751r = c24994c2;
            }

            /* renamed from: a */
            public final void m54239a(boolean z11) {
                C24860q m129235a;
                if (z11) {
                    float f11 = this.f52750q.f52745C0;
                    if (f11 == 1.0f) {
                        m129235a = AbstractC24866w.m129235a(Integer.valueOf(IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING), Integer.valueOf(IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING));
                    } else if (f11 == 0.5625f) {
                        m129235a = AbstractC24866w.m129235a(720, 1280);
                    } else if (this.f52750q.f52745C0 > 1.0f) {
                        m129235a = AbstractC24866w.m129235a(1200, Integer.valueOf((int) (1200 / this.f52750q.f52745C0)));
                    } else {
                        m129235a = AbstractC24866w.m129235a(Integer.valueOf((int) (1200 * this.f52750q.f52745C0)), 1200);
                    }
                    int intValue = ((Number) m129235a.m129213a()).intValue();
                    int intValue2 = ((Number) m129235a.m129214b()).intValue();
                    Bitmap croppedBitmap = this.f52751r.f119825y.getCroppedBitmap();
                    if (croppedBitmap != null) {
                        InterfaceC19720d interfaceC19720d = this.f52750q.f52744B0;
                        if (interfaceC19720d == null) {
                            AbstractC19074t.m100223u("presenter");
                            interfaceC19720d = null;
                        }
                        interfaceC19720d.mo53162Ku(croppedBitmap, intValue, intValue2);
                    }
                }
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m54239a(((Boolean) obj).booleanValue());
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10205d(C24994c2 c24994c2) {
            super(1);
            this.f52749r = c24994c2;
        }

        /* renamed from: a */
        public final void m54238a(View view) {
            AbstractC19074t.m100208f(view, "it");
            CropImagePageView cropImagePageView = CropImagePageView.this;
            cropImagePageView.mo54231WK(new a(cropImagePageView, this.f52749r));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54238a((View) obj);
            return C24848g0.f119245a;
        }
    }

    public CropImagePageView() {
        super(C10202a.f52746y);
        this.f52745C0 = 1.0f;
    }

    /* renamed from: XK */
    private final int m54224XK(BitmapFactory.Options options, int i11, int i12) {
        C24860q m129235a = AbstractC24866w.m129235a(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
        int intValue = ((Number) m129235a.m129213a()).intValue();
        int intValue2 = ((Number) m129235a.m129214b()).intValue();
        int i13 = 1;
        if (intValue > i12 || intValue2 > i11) {
            int i14 = intValue / 2;
            int i15 = intValue2 / 2;
            while (i14 / i13 >= i12 && i15 / i13 >= i11) {
                i13 *= 2;
            }
        }
        return i13;
    }

    /* renamed from: YK */
    private final Bitmap m54225YK(Context context, Uri uri, float f11) {
        int m54224XK;
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                return null;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(openInputStream, null, options);
            options.inJustDecodeBounds = false;
            int i11 = Resources.getSystem().getDisplayMetrics().widthPixels;
            float f12 = i11;
            int i12 = (int) (f12 / f11);
            int i13 = options.outWidth;
            int i14 = options.outHeight;
            if (i13 / i14 > f12 / i12) {
                m54224XK = m54224XK(options, (i13 * i12) / i14, i12);
            } else {
                m54224XK = m54224XK(options, i11, (i14 * i11) / i13);
            }
            options.inSampleSize = m54224XK;
            InputStream openInputStream2 = context.getContentResolver().openInputStream(uri);
            if (openInputStream2 == null) {
                return null;
            }
            return BitmapFactory.decodeStream(openInputStream2, null, options);
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: aL */
    private final int m54226aL(Uri uri) {
        try {
            String m119855c = AbstractC23254w8.m119855c(m92689tK(), uri);
            if (m119855c == null) {
                return 0;
            }
            int attributeInt = new ExifInterface(m119855c).getAttributeInt("Orientation", 1);
            if (attributeInt != 3) {
                if (attributeInt != 6) {
                    if (attributeInt != 8) {
                        return 0;
                    }
                    return 270;
                }
                return 90;
            }
            return 180;
        } catch (IOException e11) {
            e11.printStackTrace();
            return 0;
        }
    }

    /* renamed from: bL */
    private final void m54227bL() {
        Uri uri;
        CropView cropView;
        CropView cropView2;
        Bundle m92642L3 = m92642L3();
        C24848g0 c24848g0 = null;
        if (m92642L3 != null && (uri = (Uri) m92642L3.getParcelable("xImageUri")) != null) {
            Context m92689tK = m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            Bitmap m54225YK = m54225YK(m92689tK, uri, this.f52745C0);
            if (m54225YK != null) {
                int m54226aL = m54226aL(uri);
                int width = m54225YK.getWidth();
                int height = m54225YK.getHeight();
                Matrix matrix = new Matrix();
                matrix.postRotate(m54226aL);
                C24848g0 c24848g02 = C24848g0.f119245a;
                Bitmap createBitmap = Bitmap.createBitmap(m54225YK, 0, 0, width, height, matrix, true);
                AbstractC19074t.m100207e(createBitmap, "createBitmap(...)");
                if (this.f52745C0 == 0.0f) {
                    this.f52745C0 = createBitmap.getWidth() / createBitmap.getHeight();
                    C24994c2 c24994c2 = (C24994c2) m55556SK();
                    if (c24994c2 != null && (cropView2 = c24994c2.f119825y) != null) {
                        cropView2.m55830a(createBitmap.getWidth(), createBitmap.getHeight());
                    }
                }
                C24994c2 c24994c22 = (C24994c2) m55556SK();
                if (c24994c22 != null && (cropView = c24994c22.f119825y) != null) {
                    cropView.setBitmap(createBitmap);
                    c24848g0 = C24848g0.f119245a;
                }
            }
            if (c24848g0 == null) {
                finish();
            }
            c24848g0 = C24848g0.f119245a;
        }
        if (c24848g0 == null) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dL */
    public static final void m54228dL(C24994c2 c24994c2, CropImagePageView cropImagePageView) {
        AbstractC19074t.m100208f(c24994c2, "$this_run");
        AbstractC19074t.m100208f(cropImagePageView, "this$0");
        CropView cropView = c24994c2.f119825y;
        AbstractC19074t.m100207e(cropView, "vieCrop");
        ViewGroup.LayoutParams layoutParams = cropView.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (c24994c2.f119825y.getWidth() / c24994c2.f119825y.getHeight() > cropImagePageView.f52745C0) {
                layoutParams2.width = (int) (c24994c2.f119825y.getHeight() * cropImagePageView.f52745C0);
                layoutParams2.height = c24994c2.f119825y.getHeight();
            } else {
                layoutParams2.width = c24994c2.f119825y.getWidth();
                layoutParams2.height = (int) (c24994c2.f119825y.getWidth() / cropImagePageView.f52745C0);
            }
            cropView.setLayoutParams(layoutParams2);
            float f11 = cropImagePageView.f52745C0;
            if (f11 == 1.0f) {
                Bundle m92642L3 = cropImagePageView.m92642L3();
                if (m92642L3 != null && m92642L3.getBoolean("xCircleCrop")) {
                    c24994c2.f119825y.m55831b(-1089334766);
                    return;
                }
                return;
            }
            if (f11 == 0.5625f) {
                c24994c2.f119825y.m55830a(9, 16);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        float f11;
        super.mo37111CJ(bundle);
        this.f52744B0 = AbstractC28684a.Companion.m143684r();
        AbstractC1785o lifecycle = getLifecycle();
        InterfaceC19720d interfaceC19720d = this.f52744B0;
        InterfaceC19720d interfaceC19720d2 = null;
        if (interfaceC19720d == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19720d = null;
        }
        lifecycle.mo9335a(interfaceC19720d);
        InterfaceC19720d interfaceC19720d3 = this.f52744B0;
        if (interfaceC19720d3 == null) {
            AbstractC19074t.m100223u("presenter");
        } else {
            interfaceC19720d2 = interfaceC19720d3;
        }
        interfaceC19720d2.mo52965Lb(this);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            f11 = m92642L3.getFloat("xOutputRatio");
        } else {
            f11 = 1.0f;
        }
        this.f52745C0 = f11;
    }

    @Override // m20.InterfaceC22821z
    /* renamed from: Ui */
    public void mo54229Ui(Uri uri, int i11, int i12) {
        ProgressBar progressBar;
        SimpleShadowTextView simpleShadowTextView;
        C24994c2 c24994c2 = (C24994c2) m55556SK();
        if (c24994c2 != null && (simpleShadowTextView = c24994c2.f119819s) != null) {
            AbstractC26112n.m134431w0(simpleShadowTextView);
        }
        C24994c2 c24994c22 = (C24994c2) m55556SK();
        if (c24994c22 != null && (progressBar = c24994c22.f119817q) != null) {
            AbstractC26112n.m134367H(progressBar);
        }
        if (uri != null && i11 != 0 && i12 != 0) {
            if (!mo54233cL(uri)) {
                Intent intent = new Intent();
                intent.putExtra("xCroppedImgUri", uri);
                intent.putExtra("xRatio", i11 / i12);
                C24848g0 c24848g0 = C24848g0.f119245a;
                mo50035CK(-1, intent);
                finish();
                return;
            }
            return;
        }
        C25097t.f120556a.m130153n(getContext(), AbstractC27413h.zch_error_unknown);
    }

    @Override // m20.InterfaceC22821z
    /* renamed from: W2 */
    public void mo54230W2() {
        ProgressBar progressBar;
        SimpleShadowTextView simpleShadowTextView;
        C24994c2 c24994c2 = (C24994c2) m55556SK();
        if (c24994c2 != null && (simpleShadowTextView = c24994c2.f119819s) != null) {
            AbstractC26112n.m134367H(simpleShadowTextView);
        }
        C24994c2 c24994c22 = (C24994c2) m55556SK();
        if (c24994c22 != null && (progressBar = c24994c22.f119817q) != null) {
            AbstractC26112n.m134431w0(progressBar);
        }
    }

    /* renamed from: WK */
    public void mo54231WK(InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC18505l, "action");
        interfaceC18505l.mo205i9(Boolean.TRUE);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        final C24994c2 c24994c2 = (C24994c2) m55556SK();
        if (c24994c2 != null) {
            LinearLayout linearLayout = c24994c2.f119820t;
            AbstractC19074t.m100207e(linearLayout, "lytContainer");
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                FrameLayout root = c24994c2.getRoot();
                AbstractC19074t.m100207e(root, "getRoot(...)");
                layoutParams2.topMargin = AbstractC26112n.m134365F(root);
                linearLayout.setLayoutParams(layoutParams2);
                ImageView imageView = c24994c2.f119818r;
                AbstractC19074t.m100207e(imageView, "btnClose");
                AbstractC26112n.m134407k0(imageView, new C10204c());
                c24994c2.f119821u.post(new Runnable() { // from class: m20.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        CropImagePageView.m54228dL(C24994c2.this, this);
                    }
                });
                m54227bL();
                c24994c2.f119819s.setText(m54232ZK());
                SimpleShadowTextView simpleShadowTextView = c24994c2.f119819s;
                AbstractC19074t.m100207e(simpleShadowTextView, "btnDone");
                AbstractC26112n.m134407k0(simpleShadowTextView, new C10205d(c24994c2));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    /* renamed from: ZK */
    public String m54232ZK() {
        String m92652XI = m92652XI(AbstractC27413h.zch_page_crop_image_done);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        return m92652XI;
    }

    /* renamed from: cL */
    public boolean mo54233cL(Uri uri) {
        AbstractC19074t.m100208f(uri, "result");
        return false;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        ImageView imageView;
        if (super.onKeyUp(i11, keyEvent)) {
            return true;
        }
        if (i11 == 4) {
            C24994c2 c24994c2 = (C24994c2) m55556SK();
            if (c24994c2 != null && (imageView = c24994c2.f119818r) != null) {
                imageView.callOnClick();
            }
            return true;
        }
        return false;
    }
}
