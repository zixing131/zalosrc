package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.kb */
/* loaded from: classes2.dex */
abstract class AbstractC5461kb {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m29368a(AbstractC5679x8 abstractC5679x8) {
        StringBuilder sb2 = new StringBuilder(abstractC5679x8.mo29551g());
        for (int i11 = 0; i11 < abstractC5679x8.mo29551g(); i11++) {
            byte mo29549d = abstractC5679x8.mo29549d(i11);
            if (mo29549d != 34) {
                if (mo29549d != 39) {
                    if (mo29549d != 92) {
                        switch (mo29549d) {
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
                                if (mo29549d >= 32 && mo29549d <= 126) {
                                    sb2.append((char) mo29549d);
                                    break;
                                } else {
                                    sb2.append('\\');
                                    sb2.append((char) (((mo29549d >>> 6) & 3) + 48));
                                    sb2.append((char) (((mo29549d >>> 3) & 7) + 48));
                                    sb2.append((char) ((mo29549d & 7) + 48));
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
