package zm.voip.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.zing.zalo.AbstractC16802y;

/* loaded from: classes7.dex */
public class VoIPButton extends AppCompatImageView {
    public VoIPButton(Context context) {
        super(context);
        m157415f();
    }

    /* renamed from: f */
    void m157415f() {
        setAdjustViewBounds(true);
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        setMinimumWidth((int) getResources().getDimension(AbstractC16802y.button_min_w));
        setMinimumHeight((int) getResources().getDimension(AbstractC16802y.button_min_h));
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return true;
    }

    public VoIPButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m157415f();
    }
}
