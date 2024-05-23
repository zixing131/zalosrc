package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.util.AbstractC1487i;

/* renamed from: androidx.appcompat.widget.t */
/* loaded from: classes.dex */
final class C1209t {

    /* renamed from: a */
    private TextView f4720a;

    /* renamed from: b */
    private TextClassifier f4721b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1209t(TextView textView) {
        this.f4720a = (TextView) AbstractC1487i.m7492g(textView);
    }

    /* renamed from: a */
    public TextClassifier m5711a() {
        Object systemService;
        TextClassifier textClassifier;
        TextClassifier textClassifier2;
        TextClassifier textClassifier3 = this.f4721b;
        if (textClassifier3 == null) {
            systemService = this.f4720a.getContext().getSystemService((Class<Object>) AbstractC1194o.m5622a());
            TextClassificationManager m5684a = AbstractC1200q.m5684a(systemService);
            if (m5684a != null) {
                textClassifier2 = m5684a.getTextClassifier();
                return textClassifier2;
            }
            textClassifier = TextClassifier.NO_OP;
            return textClassifier;
        }
        return textClassifier3;
    }

    /* renamed from: b */
    public void m5712b(TextClassifier textClassifier) {
        this.f4721b = textClassifier;
    }
}
