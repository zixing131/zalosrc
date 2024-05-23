package p649xl;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.databinding.InterfaceC1672f;
import androidx.databinding.ViewDataBinding;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.feed.components.EmptyContentView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.imageview.RoundCornerImageView;
import com.zing.zalo.zdesign.component.TrackingTextView;
import com.zing.zalo.zdesign.component.slider.ZdsSlider;

/* renamed from: xl.q8 */
/* loaded from: classes3.dex */
public class C29998q8 extends AbstractC29980p8 {

    /* renamed from: o0 */
    private static final SparseIntArray f139102o0;

    /* renamed from: n0 */
    private long f139103n0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f139102o0 = sparseIntArray;
        sparseIntArray.put(AbstractC6918a0.icn_slide_hint, 1);
        sparseIntArray.put(AbstractC6918a0.layout_music_detail, 2);
        sparseIntArray.put(AbstractC6918a0.song_info_container, 3);
        sparseIntArray.put(AbstractC6918a0.song_thumb, 4);
        sparseIntArray.put(AbstractC6918a0.song_detail, 5);
        sparseIntArray.put(AbstractC6918a0.song_name, 6);
        sparseIntArray.put(AbstractC6918a0.artist_name, 7);
        sparseIntArray.put(AbstractC6918a0.zing_mp3_button, 8);
        sparseIntArray.put(AbstractC6918a0.zing_mp3_icon, 9);
        sparseIntArray.put(AbstractC6918a0.progress_container, 10);
        sparseIntArray.put(AbstractC6918a0.song_slider, 11);
        sparseIntArray.put(AbstractC6918a0.button_container, 12);
        sparseIntArray.put(AbstractC6918a0.playback_button, 13);
        sparseIntArray.put(AbstractC6918a0.loading_button, 14);
        sparseIntArray.put(AbstractC6918a0.divider, 15);
        sparseIntArray.put(AbstractC6918a0.post_feed_button, 16);
        sparseIntArray.put(AbstractC6918a0.layout_error_empty, 17);
        sparseIntArray.put(AbstractC6918a0.layout_empty_content_no_network, 18);
        sparseIntArray.put(AbstractC6918a0.layout_error_can_not_stream, 19);
        sparseIntArray.put(AbstractC6918a0.song_thumb_error_can_not_stream, 20);
        sparseIntArray.put(AbstractC6918a0.song_name_error_can_not_stream, 21);
        sparseIntArray.put(AbstractC6918a0.artist_name_error_can_not_stream, 22);
        sparseIntArray.put(AbstractC6918a0.description_error_can_not_stream, 23);
    }

    public C29998q8(InterfaceC1672f interfaceC1672f, View view) {
        this(interfaceC1672f, view, ViewDataBinding.m8484B(interfaceC1672f, view, 24, null, f139102o0));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: C */
    protected boolean mo8500C(int i11, Object obj, int i12) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: l */
    protected void mo8508l() {
        synchronized (this) {
            this.f139103n0 = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo8512u() {
        synchronized (this) {
            try {
                if (this.f139103n0 != 0) {
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: x */
    public void mo8513x() {
        synchronized (this) {
            this.f139103n0 = 1L;
        }
        m8502I();
    }

    private C29998q8(InterfaceC1672f interfaceC1672f, View view, Object[] objArr) {
        super(interfaceC1672f, view, 0, (RobotoTextView) objArr[7], (RobotoTextView) objArr[22], (FrameLayout) objArr[12], (RelativeLayout) objArr[23], (View) objArr[15], (RecyclingImageView) objArr[1], (EmptyContentView) objArr[18], (RelativeLayout) objArr[19], (RelativeLayout) objArr[17], (RelativeLayout) objArr[2], (ProgressBar) objArr[14], (RelativeLayout) objArr[0], (RecyclingImageView) objArr[13], (TrackingTextView) objArr[16], (RelativeLayout) objArr[10], (RelativeLayout) objArr[5], (RelativeLayout) objArr[3], (RobotoTextView) objArr[6], (RobotoTextView) objArr[21], (ZdsSlider) objArr[11], (RoundCornerImageView) objArr[4], (RoundCornerImageView) objArr[20], (LinearLayout) objArr[8], (RecyclingImageView) objArr[9]);
        this.f139103n0 = -1L;
        this.f138987a0.setTag(null);
        m8504K(view);
        mo8513x();
    }
}
