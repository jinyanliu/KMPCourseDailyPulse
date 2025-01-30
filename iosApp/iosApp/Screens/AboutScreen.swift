//
//  AboutScreen.swift
//  iosApp
//
//  Created by Jinyan Liu on 2024-10-19.
//  Copyright © 2024 orgName. All rights reserved.
//

import SwiftUI

struct AboutScreen: View {
  
  @Environment(\.dismiss)
  private var dismiss
  
  var body: some View {
    NavigationStack{
      AboutListView()
        .navigationTitle("About Device")
        .toolbar{
          ToolbarItem(placement: .primaryAction){
            Button{
              dismiss()
            } label: {
              Text("Done").bold()
            }
          }
        }
    }
  }
}

#Preview {
  AboutScreen()
}
