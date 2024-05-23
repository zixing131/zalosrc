package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.w2 */
/* loaded from: classes2.dex */
abstract class AbstractC5859w2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m30548a(AbstractC5803n0 abstractC5803n0) {
        StringBuilder sb2 = new StringBuilder(abstractC5803n0.mo30241g());
        for (int i11 = 0; i11 < abstractC5803n0.mo30241g(); i11++) {
            byte mo30239d = abstractC5803n0.mo30239d(i11);
            if (mo30239d != 34) {
                if (mo30239d != 39) {
                    if (mo30239d != 92) {
                        switch (mo30239d) {
                            case 7:
                                sb2.append("\\a");
                                break;
                            case 8:
                                sb2.append("\\b");
                                break;
                            case 9:
                                sb2.append("\\t");
                                break;
                            case 10:
                                sb2.append("\\n");
                                break;
                            case 11:
                                sb2.append("\\v");
                                break;
                            case 12:
                                sb2.append("\\f");
                                break;
                            case 13:
                                sb2.append("\\r");
                                break;
                            default:
                                if (mo30239d >= 32 && mo30239d <= 126) {
                                    sb2.append((char) mo30239d);
                                    break;
                                } else {
                                    sb2.append('\\');
                                    sb2.append((char) (((mo30239d >>> 6) & 3) + 48));
                                    sb2.append((char) (((mo30239d >>> 3) & 7) + 48));
                                    sb2.append((char) ((mo30239d & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb2.append("\\\\");
                    }
                } else {
                    sb2.append("\\'");
                }
            } else {
                sb2.append("\\\"");
            }
        }
        return sb2.toString();
    }
}
